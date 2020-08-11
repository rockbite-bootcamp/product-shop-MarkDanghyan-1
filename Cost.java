package myShop;

import java.util.HashMap;

public class Cost {
    double price;
    HashMap<Thing, Integer> things;

    public Cost(double price, HashMap<Thing, Integer> things) {
        this.price = price;
        this.things = things;
    }

    public double getPrice() {
        return price;
    }

    public HashMap<Thing, Integer> getThings() {
        return things;
    }
}
