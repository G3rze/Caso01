package Menu;

public class MenuAdministrator implements Menu {
    @Override
    public void show() {
        System.out.println("Opciones de Administrador\n"
        + "1. Crear Habitación\n"
        + "2. Ver Habitaciones\n"
        + "3. Mover Habitacion\n"
        + "4. Eliminar Habitacion\n"
        + "0. Salir\n");
    }
}
