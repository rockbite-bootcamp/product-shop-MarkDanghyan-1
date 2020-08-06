import java.util.HashMap;

public class User {
    int id;
    String name;
    double balance;
    HashMap<Thing, Integer> things;

    public User(int id, String name, double balance, HashMap<Thing, Integer> things) {
        this.id = id;
        this.name = name;
        this.balance = balance;
        this.things = things;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public HashMap<Thing, Integer> getThings() {
        return things;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                ", things=" + things +
                '}';
    }
}
