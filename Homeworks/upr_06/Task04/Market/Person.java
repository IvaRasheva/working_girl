package Task04.Market;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private double balance;
    private List<Product> purchases = new ArrayList<>(500);

    public Person(String name, double balance){
        this.name = name;
        this.balance = balance;
    }

    public boolean buy(Product product){
        if (product.getPrice() > balance)
            return false;
        balance -= product.getPrice();
        purchases.add(product);
        return true;
    }

    public List<Product> getPurchases() {
        return purchases;
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }
}
