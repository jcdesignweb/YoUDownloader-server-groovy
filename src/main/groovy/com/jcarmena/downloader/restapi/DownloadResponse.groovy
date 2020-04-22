package com.jcarmena.downloader.restapi

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
class DownloadResponse {

    @JsonProperty("status")
    private String status;

    @JsonProperty("data")
    private FileResponse data;

    DownloadResponse(String status, FileResponse data) {
        this.status = status;
        this.data = data;
    }

}
