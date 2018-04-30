package Task03.BankManagement;

import java.util.Scanner;

public class BankManagementMainTask3 {

    private static Bank bank = new Bank();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String task;

        mainLoop:
        while (true) {
            task = sc.next();

            switch (task){
                case "END":
                    System.out.printf("%.1f%n", bank.getAssets());
                    for (Account user : bank.getAccount()){
                        System.out.printf("%s, %s, %.2f%n", user.getName(), user.getGovId(),user.getBalance());
                    }
                    break mainLoop;
                case "OPEN":
                    System.out.printf("OPEN %s%n", bank.openAccount(sc.next(), sc.next(),
                            sc.next(), sc.next()) ? "success" : "fail");
                    break;
                case "CLOSE":
                    System.out.printf("CLOSE %s%n", bank.closeAccoun(sc.next(), sc.next())
                            ? "success" : "fail");
                    break;
                case "DEPOSIT":
                    System.out.printf("DEPOSIT %s%n", bank.deposit(sc.next(), sc.nextDouble())
                            ? "success" : "fail");
                    break;
                case "WITHDRAW":
                    System.out.printf("WITHDRAW %s%n", bank.withdraw(sc.next(), sc.next(),sc.nextDouble())
                            ? "success" : "fail");
                    break;
                case "TRANSFER":
                    System.out.printf("TRANSFER %s%n", bank.transfer(sc.next(), sc.next(), sc.nextDouble(),sc.next())
                            ? "success" : "fail");
                    break;
                default:
                    System.out.println("Please enter a valid command.");
                    break;
            }
        }
    }
}
