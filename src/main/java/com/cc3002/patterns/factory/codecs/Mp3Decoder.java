package com.cc3002.patterns.factory.codecs;

import com.cc3002.patterns.factory.music.Song;

public class Mp3Decoder implements Codec {
    private Song song;

    public Mp3Decoder(Song song) {
        this.song = song;
    }

    @Override
    public DecodedSong getDecodedSong() {
        return new DecodedSong(song.getName());
    }

    @Override
    public String toString() {
        return "Mp3Decoder{" +
                "song=" + song +
                '}';
    }
}
