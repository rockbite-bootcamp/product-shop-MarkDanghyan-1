package myShop.command;

import myShop.User;
import myShop.pool.Poolable;

public interface Command extends Poolable {
    void execute(int SKU, User user);
    void undo();
}
