package Instruments;

import Interfaces.IPlay;
import Interfaces.ISell;

public class Guitar extends Instrument implements IPlay, ISell {

    private int strings;

    public Guitar(String name, String maker, String coulor, int strings, int buyPrice, int sellPrice) {
        super(name, maker, coulor, buyPrice, sellPrice);
        this.strings = strings;
    }


    public String play() {
        return "guitar noise";
    }

    public int getStrings(){
        return strings;

    }

    public int calculateMarkup() {
        return 0;
    }
}
