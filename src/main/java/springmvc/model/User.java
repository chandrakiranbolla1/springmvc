package springmvc.model;

public class User {
    private String email;
    private String password;
    private String UserName;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        this.UserName = userName;
    }

    @Override
    public String toString() {
        return "model{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", firstName='" + UserName + '\'' +
                '}';
    }
}
