package Instruments;

import Interfaces.IPlay;
import Interfaces.ISell;

public class Trumpet extends Instrument implements IPlay, ISell {

    private int valves;

    public Trumpet(String name, String maker, String colour, int valves, int buyPrice, int sellPrice) {
        super(name, maker, colour, buyPrice, sellPrice);
        this.valves = valves;
    }

    public String play() {
        return "trumpet noise";
    }

    public int getValves() {
        return this.valves;
    }


    public int getBuyPrice() {
        return super.getBuyPrice();
    }

    public int getSellPrice() {
        return super.getSellPrice();
    }
}
