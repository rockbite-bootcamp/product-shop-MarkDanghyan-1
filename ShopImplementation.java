package myShop;

import java.util.HashMap;


public class ShopImplementation extends AbstractShop {
    private int SKU;
    private User user;

    private static ShopImplementation shop;
    private Product product;

    public static ShopImplementation getInstance(){
        if (shop == null) return new ShopImplementation();
        return shop;
    }

    @Override
    public Product getProduct(int SKU) {
        return products.get(SKU);
    }

    @Override
    public HashMap<Integer, Product> getProducts(String category) {
        HashMap<Integer, Product> productsByCategory = new HashMap<>();
        products.values().stream().filter(each -> each.getCategory().equals(category)).forEach(each -> productsByCategory.put(each.getSKU(), each));
        return productsByCategory;
    }

    @Override
    public void purchaseProduct(int SKU, User user) {
        product = products.get(SKU);
        if(product == null) return;
        if(product.getCost().getPrice() > user.getBalance()) return;

        for(Thing thing : product.getCost().getThings().keySet()){
            if(!user.getThings().containsKey(thing) || user.getThings().get(thing) < product.getCost().getThings().get(thing)) return;
        }

        user.setBalance(user.getBalance()-product.getCost().getPrice());

        for(Thing item : product.getPayload().getThings().keySet()){
            if(!user.getThings().containsKey(item)) {
                user.getThings().put(item, product.getPayload().getThings().get(item));
                continue;
            }
            user.getThings().put(item, user.getThings().get(product) + product.getPayload().getThings().get(item));
        }
        this.SKU = SKU;
        this.user = user;
    }

    @Override
    public void undoPurchase() {
        product = products.get(SKU);
        user.setBalance(user.getBalance()+product.getCost().getPrice());
        for(Thing item : product.getPayload().getThings().keySet()){
            if(user.getThings().get(item) == product.getPayload().getThings().get(item)) {
                user.getThings().remove(item);
                continue;
            }
            user.getThings().put(item, user.getThings().get(product) - product.getPayload().getThings().get(item));
        }
    }
}
