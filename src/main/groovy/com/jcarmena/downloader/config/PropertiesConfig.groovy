package com.jcarmena.downloader.config

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Configuration
import org.springframework.core.env.Environment
import org.springframework.stereotype.Component
import org.springframework.stereotype.Service

import java.lang.annotation.Annotation
@Component
class PropertiesConfig {

    @Autowired
    Environment env;

    String getPath() {

        return env.getProperty('downloader.output')
    }

}
