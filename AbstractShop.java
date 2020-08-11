package myShop;

import java.util.HashMap;
import java.util.List;

public abstract class AbstractShop implements InterfaceShop {

    HashMap<Integer, Product> products;

    public void setProducts(HashMap<Integer, Product> products) {
        this.products = products;
    }
}


