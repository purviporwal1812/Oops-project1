package myUser;

import java.util.ArrayList;

public class Authentication {
    public boolean authenticateUser(ArrayList<UserDetails> users, String userName, String userEmail, String userPass) {
        for (UserDetails user : users) {
            if (userName.equalsIgnoreCase(user.getName()) && userEmail.equals(user.getEmail())
                    && userPass.equals(user.getPassword())) {
                return true;
            }
        }
        return false;
    }

}
