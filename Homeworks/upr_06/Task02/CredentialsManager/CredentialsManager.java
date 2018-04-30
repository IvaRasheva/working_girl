package Task02.CredentialsManager;

import java.util.ArrayList;
import java.util.List;

public class CredentialsManager {

    private List<Credentials> db = new ArrayList<Credentials>(200);

    public boolean enroll(String username, String password) {
        if (findByUsername(username) > -1)
            return false;
        else
            db.add(new Credentials(username, password));
        return true;
    }

    public boolean chpass(String username, String currentPass, String newPass) {
            if (findByUsername(username) > -1)
                return db.get(findByUsername(username)).changePass(currentPass, newPass);
        return false;
    }

    public boolean auth(String username, String currentPass) {
            if (findByUsername(username) > -1)
                return db.get(findByUsername(username)).passMatch(currentPass);
        return false;
    }

    private int findByUsername(String username) {
        for (int i = 0; i < db.size(); i++) {
            if (db.get(i).getUsername().equals(username))
                return i;
        }
        return -1;
    }
}
