package Task04.Market;

import java.util.Scanner;

public class MarketMainTask4 {
    private static MarketManager market = new MarketManager();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String persons = sc.nextLine();
        String[] personAndBalance = persons.split(";");
        for (String splitP : personAndBalance ) {
            String[] pbArr = splitP.split("=");
            if (pbArr.length != 2) {
                System.out.println("You entered wrong request.");
                System.exit(1);
            }
            if (pbArr[0].isEmpty()){
                System.out.println("Name can’t be empty.");
                System.exit(1);
            }
            double balance = Double.parseDouble(pbArr[1]);
            if (balance < 0){
                System.out.println("Balance can’t be negative. ");
                System.exit(1);
            }
            market.addBuyer(pbArr[0], balance);
        }

        String products = sc.nextLine();
        String[] productAndPrice = products.split(";");
        for (String splitPr : productAndPrice) {
            String[] ppArr = splitPr.split("=");
            if (ppArr.length != 2) {
                System.out.println("You entered wrong request.");
                System.exit(1);
            }
            if (ppArr[0].isEmpty()){
                System.out.println("Name can’t be empty.");
                System.exit(1);
            }
            double price = Double.parseDouble(ppArr[1]);
            if (price < 0){
                System.out.println("Price can’t be negative. ");
                System.exit(1);
            }
            market.addProduct(ppArr[0], price);
        }

        mainLoop:
        while(true){
            String task = sc.next();

            switch (task){
                case "END":
                    market.printNAP();
                    break mainLoop;
                default:
                    String personPurchases = sc.next();
                    market.purchases(task, personPurchases);
            }
        }
    }
}
