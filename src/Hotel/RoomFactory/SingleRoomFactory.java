package Hotel.RoomFactory;

import Hotel.RoomFactory.Rooms.Room;
import Hotel.RoomFactory.Rooms.SingleRoom;

import java.net.IDN;

public class SingleRoomFactory implements RoomFactory {
    @Override
    public Room createRoom(int capacity, String ID) {
        return new SingleRoom(capacity, ID);
    }
}
