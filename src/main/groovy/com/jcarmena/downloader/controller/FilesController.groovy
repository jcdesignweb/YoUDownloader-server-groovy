package com.jcarmena.downloader.controller

import com.fasterxml.jackson.databind.ser.Serializers
import com.jcarmena.downloader.config.PropertiesConfig
import com.jcarmena.downloader.model.Audio
import com.jcarmena.downloader.restapi.DownloadResponse
import com.jcarmena.downloader.restapi.FileResponse
import com.jcarmena.downloader.restapi.GetListResponse
import com.jcarmena.downloader.service.Youtube
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class FilesController extends BaseController {

    @Autowired
    PropertiesConfig properties

    @Autowired
    Audio audio

    GetListResponse index(@RequestParam String method) {
        switch (method) {
            case 'getList':

                return this.getList()
                break;
        }
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/file/download/audio")
    DownloadResponse downloadAsMp3(@RequestParam String vId) {
        try {
            if(audio.downloadAsMp3(vId)) {
                FileResponse data = this.makeFileYoutube(vId)

                DownloadResponse response = new DownloadResponse("success", data)
                return response
            }
        } catch(Exception e) {
            e.printStackTrace()
        }
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/file/all")
    ArrayList<GetListResponse> getList() {
        ArrayList files = new ArrayList<GetListResponse>();

        List<String> soundFiles = new FileNameByRegexFinder().getFileNames(properties.getPath(), /.*\.mp3/)
        for (String file : soundFiles) {
            if (file != '..' && file != '.' && !file.contains('temp.')) {

                String[] fileSplit = file.split('/');
                String[] fileSplit2 = ((String) fileSplit[-1]).split('.mp3')

                def resp = this.makeFileYoutube(fileSplit2[0], file);
                println "RESP1 ${resp}"

                if (resp != null) {
                    files.add(resp)
                }
            }
        }

        return files;
    }

    private FileResponse makeFileYoutube(String vId, def file=false) {
        Youtube youtube = new Youtube()
        try {
            Object ybResponse = youtube.getFileInfo("https://www.youtube.com/watch?v=$vId");
            FileResponse response = new FileResponse(ybResponse)

            response.setId(vId)

            String filename = "${vId}.mp3";
            response.setFilename(filename)

            return response
        } catch(Exception e) {
            e.printStackTrace()
        }
    }
}
