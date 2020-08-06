import java.util.List;

public abstract class AbstractShop implements InterfaceShop {
    List<Product> products;

    public AbstractShop(List<Product> products) {
        this.products = products;
    }
}
