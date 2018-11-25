package MusicShop;

import Instruments.Trumpet;
import Interfaces.ISell;

import java.util.ArrayList;

public class MusicShop implements ISell {

    private String name;
    private ArrayList<ISell> stock;

    public MusicShop(String name) {
        this.name = name;
        this.stock = new ArrayList<ISell>();
    }

    public String getName() {
        return name;

    }
    public int countStock() {
        return stock.size();
    }


    public void addStock(Trumpet trumpet) {
        this.stock.add(trumpet);

    }

    public int calculateMarkup() {
        return 0;
    }
}
