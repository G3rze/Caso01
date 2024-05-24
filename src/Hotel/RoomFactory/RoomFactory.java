package Hotel.RoomFactory;

import Hotel.RoomFactory.Rooms.Room;

public interface RoomFactory {
    public Room createRoom(int capacity, String ID);
}
