package com.jcarmena.downloader.service

import groovy.json.JsonSlurper

class Youtube {

    Object getFileInfo(String url) {
        String youtube = "http://www.youtube.com/oembed?url=$url&format=json";
        String response = new URL(youtube).getText()

        def jsonSlurper = new JsonSlurper()

        Object userJson = jsonSlurper.parseText(response)

        return userJson
    }
}
