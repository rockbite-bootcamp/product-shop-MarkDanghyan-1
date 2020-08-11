package myShop;

import java.util.Objects;

public class Thing {
    int SKU;
    String name;
    String description;

    public Thing(int SKU, String name, String description) {
        this.SKU = SKU;
        this.name = name;
        this.description = description;
    }

    public int getSKU() {
        return SKU;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

}
