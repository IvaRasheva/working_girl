package Task02.CredentialsManager;

import java.util.ArrayList;
import java.util.List;

public class Credentials {

    private String username;
    public String password;
    private List<String> dbPass;

    public Credentials(String username, String password) {
        this.username = username;
        this.password = password;
        this.dbPass = new ArrayList<String>(100);
    }

    public String getUsername() {
        return username;
    }

    public boolean changePass(String currentPass, String newPass) {
        if (!passMatch(currentPass) || passMatch(newPass))
            return false;

        for (int i = 0; i < dbPass.size(); i++) {
            if (dbPass.get(i).equals(newPass))
                return false;
        }

        dbPass.add(this.password);
        this.password = newPass;
        return true;
    }

    public boolean passMatch(String samePass) {
        return this.password.equals(samePass);
    }
}
