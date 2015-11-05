package Chapter5.Builder;

/**
 * This class User will discribe some user and his functionality.
 *
 * @autor Vitalii Nedzelskyi
 * @version 1.0
 */
public class User {
    private String name = "Admin";
    private String password = "Password1!";

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
}
