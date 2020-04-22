package com.jcarmena.downloader.restapi

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import groovy.transform.ToString

@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
class GetListResponse {


    @JsonProperty("author_name")
    String author_name

    @JsonProperty("author_url")
    String author_url

    @JsonProperty("filename")
    String filename

    @JsonProperty("height")
    int height

    @JsonProperty("html")
    String html

    @JsonProperty("id")
    String id

    @JsonProperty("provider_name")
    String provider_name

    @JsonProperty("provider_url")
    String provider_url

    @JsonProperty("thumbnail_height")
    int thumbnail_height

    @JsonProperty("thumbnail_url")
    String thumbnail_url

    @JsonProperty("thumbnail_width")
    int thumbnail_width

    @JsonProperty("title")
    String title

    @JsonProperty("type")
    String type

    @JsonProperty("version")
    String version

    @JsonProperty("width")
    int width

    GetListResponse(Object response) {
        println "RESPONSEEEEEEEEEEEE ${response}"
        this.author_name = response.getAt("author_name")
        this.author_url = response.getAt("author_url")
        this.filename = response.getAt("filename")
        this.height = (int) response.getAt("height")
        this.html = response.getAt("html")
        this.id = response.getAt("id")
        this.provider_name = response.getAt("provider_name")
        this.provider_url = response.getAt("provider_url")
        this.thumbnail_height = (int)response.getAt("thumbnail_height")
        this.thumbnail_url = response.getAt("thumbnail_url")
        this.thumbnail_width = (int)response.getAt("thumbnail_width")
        this.title = response.getAt("title")
        this.type = response.getAt("type")
        this.version = response.getAt("version")
        this.width = (int)response.getAt("width")
    }

}