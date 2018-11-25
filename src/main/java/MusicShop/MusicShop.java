package MusicShop;

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

    public void addStock(ISell item){
     this.stock.add(item);


    }
    public int countStock() {
        return stock.size();
    }


}
