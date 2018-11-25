package Accessories;

import Interfaces.ISell;

public class MusicSheet extends Accessories implements ISell {
    private String song;

    public MusicSheet(String type, int buyPrice, int sellPrice, String song) {
        super(type, buyPrice, sellPrice);
        this.song = song;
    }
    public String getSong(){
        return song;

    }
}
