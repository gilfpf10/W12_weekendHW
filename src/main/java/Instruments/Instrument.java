package Instruments;

public abstract class Instrument {

    private String name;
    private String maker;
    private String colour;
    private int buyPrice;
    private int sellPrice;

    public Instrument(String name, String maker, String colour, int buyPrice, int sellPrice) {
        this.name = name;
        this.maker = maker;
        this.colour = colour;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String getName() {
        return name;
    }

    public String getMaker() {
        return maker;
    }

    public String getColour() {
        return colour;
    }

    public int getBuyPrice() {
        return buyPrice;
    }

    public int getSellPrice(){
        return sellPrice;

    }
}
