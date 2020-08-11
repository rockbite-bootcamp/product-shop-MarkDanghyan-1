package myShop;

import java.util.HashMap;

public interface InterfaceShop {

    Product getProduct(int SKU);

    HashMap<Integer, Product> getProducts(String category);

    void purchaseProduct(int SKU, User user);

    void undoPurchase();

}
