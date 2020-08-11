package myShop.command;

import myShop.User;
import myShop.pool.Pool;
import java.util.LinkedList;
import java.util.List;

public class CommandManager {
    List<Command> history = new LinkedList<>();

    Pool<CommandPurchase> incrementPool =  new Pool<CommandPurchase>() {
        @Override
        protected CommandPurchase newObject() {
            return new CommandPurchase();
        }
    };

    public void executeCommand(int SKU, User user, Command command) {
        command.execute(SKU, user);
        history.add(command);
    }

    public void undo() {
        if(history.size() == 0) return;

        Command command = history.get(history.size()-1);
        command.undo();
    }
}
