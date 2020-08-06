import java.util.List;

public interface InterfaceShop {
    List<Product> getProducts(String category);
    void purchaseProduct(int id, User user);
}
