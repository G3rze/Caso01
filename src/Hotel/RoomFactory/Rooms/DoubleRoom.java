package Hotel.RoomFactory.Rooms;

public class DoubleRoom extends Room {


    public DoubleRoom(int capacity, String roomID) {
        super(capacity, roomID);
    }

    @Override
    public void description() {

    }

    @Override
    public void functionability() {
        System.out.println("Cabe más gente, puede ser una familia");
    }
}
