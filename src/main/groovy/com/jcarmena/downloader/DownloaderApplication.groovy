package com.jcarmena.downloader

import com.jcarmena.downloader.config.IConfig
import com.jcarmena.downloader.config.PropertiesConfig
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.core.env.Environment
import springfox.documentation.swagger2.annotations.EnableSwagger2

@SpringBootApplication
@EnableSwagger2
class DownloaderApplication implements CommandLineRunner{

	static void main(String[] args) {
		SpringApplication.run(DownloaderApplication, args)
	}

	@Override
	void run(String... args) throws Exception {
		//println "---------2 ${env.getPath()}"
	}
}
