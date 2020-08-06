import java.util.ArrayList;
import java.util.List;

public class ShopImplementation extends AbstractShop {
    private Product product = new Product();

    public ShopImplementation(List<Product> products) {
        super(products);
    }

    @Override
    public List<Product> getProducts(String category) {
        List<Product> productsByCategory = new ArrayList<>();
        for (Product product: products) {
            if(product.getCategory().equals(category)) productsByCategory.add(product);
        }
        return productsByCategory;
    }

    @Override
    public void purchaseProduct(int id, User user) {
        for (Product each : products) {
            if(each.getId() == id){
                product = each;
                break;
            }
        }

        if(product == null) return;
        if(product.getCost().getPrice() > user.getBalance()) return;
        for(Thing thing : product.getCost().getThings().keySet()){
            if(!user.getThings().containsKey(thing) || user.getThings().get(thing) < product.getCost().getThings().get(thing)) return;
        }
        user.setBalance(user.getBalance()-product.getCost().getPrice());
        for(Thing thing : product.getPayload().getThings().keySet()){
            if(!user.getThings().containsKey(thing)) {
                user.getThings().put(thing, product.getPayload().getThings().get(thing));
                continue;
            }
            user.getThings().put(thing, user.getThings().get(product) + product.getPayload().getThings().get(thing));
        }
    }
}
