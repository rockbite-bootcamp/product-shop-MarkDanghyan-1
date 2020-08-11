package myShop;

public class Product {
    int SKU;
    String category;
    Cost cost;
    Payload payload;

    public Product() {}

    public Product(int SKU){
        this.SKU = SKU;
    }

    public Product(int SKU, String category, Cost cost, Payload payload) {
        this.SKU = SKU;
        this.category = category;
        this.cost = cost;
        this.payload = payload;
    }

    public int getSKU() {
        return SKU;
    }

    public String getCategory() {
        return category;
    }

    public Cost getCost() {
        return cost;
    }

    public Payload getPayload() {
        return payload;
    }

}
