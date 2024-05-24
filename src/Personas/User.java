package Personas;

public class User extends Persona {

    private String user;
    private String password;

    public User(String name, int age, String address,String user, String password) {
        super(name, age, address);
        this.user = user;
        this.password = password;
    }
    public String getUser() {
        return user;
    }
    public void setUser(String user) {
        this.user = user;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

}
