package com.yadayada1z2a.firstWebApp;

import javax.persistence.*;

@Entity
public class Song {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String title;
    int lengthInSecs;
    int trackNumebr;

    @ManyToOne
    Album album;

    public Song(String title, int lengthInSecs, int trackNumebr, Album album) {
        this.title = title;
        this.lengthInSecs = lengthInSecs;
        this.trackNumebr = trackNumebr;
        this.album = album;
    }

    public Album getAlbum() {
        return album;
    }

    public int getLengthInSecs() {
        return lengthInSecs;
    }

    public int getTrackNumebr() {
        return trackNumebr;
    }

    public String getTitle() {
        return title;
    }
}
