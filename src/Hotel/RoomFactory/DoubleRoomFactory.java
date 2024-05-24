package Hotel.RoomFactory;

import Hotel.RoomFactory.Rooms.DoubleRoom;
import Hotel.RoomFactory.Rooms.Room;

public class DoubleRoomFactory implements RoomFactory {
    @Override
    public Room createRoom(int capacity, String ID) {
        return new DoubleRoom(capacity, ID);
    }
}
