package Hotel.RoomFactory.Rooms;

public class Suite extends Room {

    private final int numJacuzzi = 1;

    public Suite(int capacity, String roomID) {
        super(capacity, roomID);
    }


    @Override
    public void description() {

        System.out.println("Cuarto grande con una cama matrimonial, dos camas pequeñas y un jacuzzi");

    }

    @Override
    public void functionability() {
        System.out.println("Acá ya se pueden hacer fiestas");
    }
}
