package pl.coderslab.model;

import org.mindrot.jbcrypt.BCrypt;

public class user {
    private int id;
    private String userName;
    private String email;
    private String password;

    public user(String userName, String email, String password) {
        this.userName = userName;
        this.email = email;
        hashPassword(password);
    }

    public user() {
    }
    public void hashPassword(String password) {
        this.password = BCrypt.hashpw(password, BCrypt.gensalt());
    }

    public int getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
