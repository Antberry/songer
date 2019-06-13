package com.yadayada1z2a.firstWebApp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Album {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String title;
    String artist;
    Integer songCount;
    Integer lengthInSecs;
    String imgUrl;

    public Album () {}

    public Album(String title, String artist, Integer songCount, Integer lengthInSecs, String imgUrl) {
        this.title = title;
        this.artist = artist;
        this.songCount = songCount;
        this.lengthInSecs = lengthInSecs;
        this.imgUrl = imgUrl;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public Integer getSongCount() {
        return songCount;
    }

    public void setSongCount(Integer songCount) {
        this.songCount = songCount;
    }

    public Integer getLengthInSecs() {
        return lengthInSecs;
    }

    public void setLengthInSecs(Integer lengthInSecs) {
        this.lengthInSecs = lengthInSecs;
    }

}

