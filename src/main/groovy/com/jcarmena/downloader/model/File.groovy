package com.jcarmena.downloader.model

import org.springframework.beans.factory.annotation.Value

import javax.annotation.PostConstruct

abstract class File {
    String vId

    abstract String downloadAsMp3(String vId);
    abstract String downloadAsVideo();

}
