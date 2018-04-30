package Task03.BankManagement;

import Task02.CredentialsManager.Credentials;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Account> account = new ArrayList<Account>(5);
    private double assets;


    public boolean openAccount(String username, String password, String name, String govId){
        if (findByUsername(username) > -1 )
            return false;
        Credentials user = new Credentials(username, password);
        account.add(new Account(name, govId, user));
        return true;
    }

    public boolean closeAccoun(String username, String password){
        if (findByUsername(username) == -1 )
            return false;
        if (!account.get(findByUsername(username)).hasAccess(password))
            return false;
        assets -= account.get(findByUsername(username)).getBalance();
        account.remove(findByUsername(username));
        return true;
    }

    public boolean deposit(String username,double amount){
        if (amount < 0)
            return false;
        if (findByUsername(username) == -1 )
            return false;
        account.get(findByUsername(username)).deposit(amount);
        assets += amount;
        return true;
    }

    public boolean withdraw(String username, String password, double amount){
        if (amount < 0 || amount > account.get(findByUsername(username)).getBalance())
            return false;
        if (findByUsername(username) == -1 )
            return false;
        if (!account.get(findByUsername(username)).hasAccess(password))
            return false;
        account.get(findByUsername(username)).withdraw(amount);
        assets -= amount;
        return true;
    }

    public boolean transfer(String username, String password, double amount, String recipient){
        if (amount < 0 || amount > account.get(findByUsername(username)).getBalance())
            return false;
        if (findByUsername(username) == -1 || findByUsername(recipient) == -1)
            return false;
        if (!account.get(findByUsername(username)).hasAccess(password))
            return false;
        account.get(findByUsername(username)).withdraw(amount);
        account.get(findByUsername(recipient)).deposit(amount);
        return true;
    }


    public int findByUsername(String username){
        for (int i = 0; i < account.size(); i++){
            if (account.get(i).getUsername().equals(username))
                return i;
        }
        return -1;
    }

    public double getAssets() {
        return assets;
    }

    public List<Account> getAccount() {
        return account;
    }
}
