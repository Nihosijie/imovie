package com.genius.beans;

import java.io.Serializable;

public class Categroymovetable implements Serializable {
    private Integer numid;
    private String category;
    private String url;
    private String title;
    private String source;

    public Integer getNumid() {
        return numid;
    }

    public void setNumid(Integer numid) {
        this.numid = numid;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }
}
