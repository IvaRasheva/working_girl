package Task04.Market;

import java.util.ArrayList;
import java.util.List;

public class MarketManager {

    private List<Person> buyer = new ArrayList<>(200);
    private List<Product> product = new ArrayList<>(500);

    public void addBuyer(String name, double balance){
        if (findByNameB(name) == -1)
            buyer.add(new Person (name, balance));
        else
            System.out.println("This person is already defined. ");
    }

    public void addProduct(String name, double price){
        if (findByNameP(name) == -1)
            product.add(new Product(name, price));
        else
            System.out.println("This product is already defined. ");
    }

    public boolean purchases(String nameB, String nameP){
        if (findByNameB(nameB) > -1 && buyer.get(findByNameB(nameB)).getBalance() >= product.get(findByNameP(nameP)).getPrice()) {
            buyer.get(findByNameB(nameB)).buy(product.get(findByNameP(nameP)));
            System.out.printf("%s bought %s%n", nameB, nameP);
            return true;
        } else
            System.out.printf("%s can’t afford %s%n", nameB, nameP);
            return false;
    }

    public void printNAP(){
        for (int i = 0; i < buyer.size(); i++) {
            System.out.printf("%s - ", buyer.get(i).getName());
            if (buyer.get(i).getPurchases().size() == 0)
                System.out.println("Nothing bought ");
            else
                for (int j = 0; j < buyer.get(i).getPurchases().size(); j++) {
                    System.out.print(buyer.get(i).getPurchases().get(j).getName());
                    if (j < buyer.get(i).getPurchases().size() - 1)
                        System.out.print(", ");
                    else
                        System.out.print("\n");

                }
        }
    }

    private int findByNameB(String nameB){
        for (int i = 0; i < buyer.size(); i++){
            if (buyer.get(i).getName().equals(nameB))
                return i;
        }
        return -1;
    }

    private int findByNameP(String nameP){
        for (int i = 0; i < product.size(); i++){
            if (product.get(i).getName().equals(nameP))
                return i;
        }
        return -1;
    }
}
