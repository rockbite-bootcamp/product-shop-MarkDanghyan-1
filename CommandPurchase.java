package myShop.command;

import myShop.InterfaceShop;
import myShop.ShopImplementation;
import myShop.User;
import myShop.pool.Poolable;

public class CommandPurchase implements Command {

    @Override
    public void execute(int SKU, User user) {
        ShopImplementation.getInstance().purchaseProduct(SKU, user);
    }

    @Override
    public void undo() {
        ShopImplementation.getInstance().undoPurchase();
    }

    @Override
    public void reset() {

    }
}
