package com.genius.beans;

import java.io.Serializable;

public class Movieurl implements Serializable {
    private Integer id;
    private String movieurl;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMovieurl() {
        return movieurl;
    }

    public void setMovieurl(String movieurl) {
        this.movieurl = movieurl;
    }
}
