package com.jcarmena.downloader.restapi

class FileResponse {

    private String author_name

    String getAuthor_name() {
        return author_name
    }

    void setAuthor_name(String author_name) {
        this.author_name = author_name
    }

    String getAuthor_url() {
        return author_url
    }

    void setAuthor_url(String author_url) {
        this.author_url = author_url
    }

    String getFilename() {
        return filename
    }

    void setFilename(String filename) {
        this.filename = filename
    }

    int getHeight() {
        return height
    }

    void setHeight(int height) {
        this.height = height
    }

    String getHtml() {
        return html
    }

    void setHtml(String html) {
        this.html = html
    }

    String getId() {
        return id
    }

    void setId(String id) {
        this.id = id
    }

    String getProvider_name() {
        return provider_name
    }

    void setProvider_name(String provider_name) {
        this.provider_name = provider_name
    }

    String getProvider_url() {
        return provider_url
    }

    void setProvider_url(String provider_url) {
        this.provider_url = provider_url
    }

    int getThumbnail_height() {
        return thumbnail_height
    }

    void setThumbnail_height(int thumbnail_height) {
        this.thumbnail_height = thumbnail_height
    }

    String getThumbnail_url() {
        return thumbnail_url
    }

    void setThumbnail_url(String thumbnail_url) {
        this.thumbnail_url = thumbnail_url
    }

    int getThumbnail_width() {
        return thumbnail_width
    }

    void setThumbnail_width(int thumbnail_width) {
        this.thumbnail_width = thumbnail_width
    }

    String getTitle() {
        return title
    }

    void setTitle(String title) {
        this.title = title
    }

    String getType() {
        return type
    }

    void setType(String type) {
        this.type = type
    }

    String getVersion() {
        return version
    }

    void setVersion(String version) {
        this.version = version
    }

    int getWidth() {
        return width
    }

    void setWidth(int width) {
        this.width = width
    }
    private String author_url
    private String filename
    private int height
    private String html
    private String id
    private String  provider_name
    private String provider_url
    private int thumbnail_height
    private String thumbnail_url
    private int thumbnail_width
    private String title
    private String type
    private String version
    private int width

    FileResponse(Object response) {
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
