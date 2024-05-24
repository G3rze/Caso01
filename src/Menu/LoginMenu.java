package Menu;

public class LoginMenu implements Menu {
    @Override
    public void show() {
        System.out.println("Bienvenido al Hotel Skyloft\n"
                            + "=========================\n"
                            + "1. Login\n"
                            + "2. Salir\n");
    }
}
