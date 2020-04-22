package com.jcarmena.downloader.service

import com.jcarmena.downloader.config.IConfig
import com.jcarmena.downloader.config.PropertiesConfig
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class Command {


    @Autowired
    PropertiesConfig properties


    Boolean ytDownload(String vId) {
        println "PROPERTIES: ${properties}"
        String filename = this.properties.getPath() + '/' + vId + '.mp3'
        String youtubeUrl = ''
        println "OUTPUT FILE $filename"


        String command = 'youtube-dl --extract-audio -o '+ filename+ ' --newline --audio-format mp3 ' + vId;

        println command
        def sout = new StringBuilder(), serr = new StringBuilder()
        def proc = command.execute()
        proc.consumeProcessOutput(sout, serr)
        proc.waitForOrKill(10000)
        println "out> $sout err> $serr"

        if(serr) {
            return false
        }

        return true
    }
}
