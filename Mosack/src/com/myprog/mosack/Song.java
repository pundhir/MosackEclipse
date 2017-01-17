package com.myprog.mosack;

import java.io.Serializable;


/**
 * Created by S711256 on 17/12/2016.
 */

public class Song implements Serializable {
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long id;
    private String title;
    private String artist;

    public Song(long songID, String songTitle, String songArtist) {
        id = songID;
        title = songTitle;
        artist = songArtist;
    }

    public long getID() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }
}
