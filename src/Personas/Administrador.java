package Personas;

public class Administrador extends User {
    private int ID;
    private String cargo;


    public Administrador(String name, int age, String address, String user, String password, int ID, String cargo) {
        super(name, age, address, user, password);
        this.ID = ID;
        this.cargo = cargo;
    }
    public int getID() {
        return ID;
    }
    public void setID(int ID) {
        this.ID = ID;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
