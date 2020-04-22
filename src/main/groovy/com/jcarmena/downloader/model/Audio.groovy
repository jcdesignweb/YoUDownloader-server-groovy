package com.jcarmena.downloader.model

import com.jcarmena.downloader.service.Command
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class Audio extends File {
    @Autowired
    Command command

    Audio() {
        super()

    }

    @Override
    String downloadAsMp3(String vId) {
        this.vId = vId

        String regex = "\\?v="
        //String[] url = this.url.getPath().split(regex)

        command.ytDownload(this.vId)
        //return Command::ytDownload($this->url, $filename);
    }

    @Override
    String downloadAsVideo() {
        return null
    }
}
