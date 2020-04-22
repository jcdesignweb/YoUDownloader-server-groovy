package com.jcarmena.downloader.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class SwaggerController {

    @RequestMapping("/docs")
    String index() {
          return "redirect:/swagger-ui.html";
    }

}
