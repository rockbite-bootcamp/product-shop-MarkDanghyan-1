public class Product {
    int id;
    String category;
    Cost cost;
    Payload payload;

    public Product() {
    }

    public Product(int id, String category, Cost cost, Payload payload) {
        this.id = id;
        this.category = category;
        this.cost = cost;
        this.payload = payload;
    }

    public int getId() {
        return id;
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
