package Task03.BankManagement;
import Task02.CredentialsManager.Credentials;

public class Account {
    private String name;
    private String govId;
    private double balance = 0;
    private Credentials user;

    public Account(String name, String govId, Credentials user){
        this.name = name;
        this.govId = govId;
        this.user = user;
    }

    public void deposit(double amount){
        this.balance+=amount;
    }

    public void withdraw(double amount){
        this.balance-=amount;
    }

    public double getBalance() {
        return balance;
    }

    public boolean hasAccess(String password){
        return user.passMatch(password);
    }

    public String getUsername(){
        return user.getUsername();
    }

    public String getName() {
        return name;
    }

    public String getGovId() {
        return govId;
    }
}
