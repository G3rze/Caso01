package Hotel;

import Personas.Administrador;
import Personas.Cliente;
import Hotel.RoomFactory.Rooms.Room;

import java.util.Vector;

public class Hotel {

    private String hotelName;
    private Administrador administrador;
    private Vector<Cliente> clientes;
    private Vector<Vector<Room>> rooms;

    private static Hotel instance;

    public static Hotel getInstance() {
        if (instance == null) {
            Administrador admin = new Administrador("Juan Perese", 34,"Perusalen","admin", "1234", 123,"Gerente");
            Vector<Cliente> clientes = new Vector<>();
            clientes.add(new Cliente("Jose", 23, "La Campanera", "cliente01","1234+", 1500,"good",2,"none","3 TVs en la habitación"));
            instance = new Hotel("Skyloft",admin,clientes,5);
        }
        return instance;
    }

    private Hotel(String hotelName, Administrador administrador, Vector<Cliente> clientes, int N) {
        this.hotelName = hotelName;
        this.administrador = administrador;
        this.clientes = clientes;
        rooms = new Vector<>();
        for(int i = 0; i < N; i++){
            rooms.add(new Vector<Room>());
        }
        for(Vector<Room> v:rooms){
            for (int i = 0; i < N; i++) {
                v.add(null);
            }
        }
    }
    public String getHotelName() {
        return hotelName;
    }
    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }
    public Administrador getAdministrador() {
        return administrador;
    }
    public void setAdministrador(Administrador administrador) {
        this.administrador = administrador;
    }
    public Vector<Cliente> getClientes() {
        return clientes;
    }
    public void setClientes(Vector<Cliente> clientes) {
        this.clientes = clientes;
    }
}
