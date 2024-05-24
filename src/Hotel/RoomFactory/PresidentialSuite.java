package Hotel.RoomFactory;

import Hotel.RoomFactory.Rooms.Room;

public class PresidentialSuite implements RoomFactory {
    @Override
    public Room createRoom(int capacity, String ID) {
        return new Hotel.RoomFactory.Rooms.PresidentialSuite(capacity, ID);
    }
}
