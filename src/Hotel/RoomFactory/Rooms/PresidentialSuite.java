package Hotel.RoomFactory.Rooms;

public class PresidentialSuite extends Room {

    private final int numJacuzzi = 2;

    private final int numBaths = 3;

    private final int numSauna = 1;

    public int getNumSauna() {
        return numSauna;
    }
    public int getNumJacuzzi() {
        return numJacuzzi;
    }
    public int getNumBaths() {
        return numBaths;
    }

    public PresidentialSuite(int capacity, String roomID) {
        super(capacity, roomID);
    }

    @Override
    public void description() {

    }

    @Override
    public void functionability() {

    }
}
