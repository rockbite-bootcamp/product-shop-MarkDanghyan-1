package myShop;

import java.util.HashMap;

public class Payload {
    HashMap<Thing, Integer> things;

    public Payload(HashMap<Thing, Integer> payload) {
        this.things = payload;
    }

    public HashMap<Thing, Integer> getThings() {
        return things;
    }
}
