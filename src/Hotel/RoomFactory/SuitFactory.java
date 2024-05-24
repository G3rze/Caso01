package Hotel.RoomFactory;

import Hotel.RoomFactory.Rooms.Room;
import Hotel.RoomFactory.Rooms.Suite;

public class SuitFactory implements RoomFactory {
    @Override
    public Room createRoom(int capacity, String ID) {
        return new Suite(capacity, ID);
    }
}
