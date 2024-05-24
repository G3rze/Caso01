package Hotel.RoomFactory.Rooms;

import Observer.Subscriber;

import java.util.Vector;

public abstract class Room {

    private int capacity;
    private String roomID;
    private String status;
    private Vector<Subscriber> subscribers;

    public Room(int capacity, String roomID, String status) {
        this.capacity = capacity;
        this.roomID = roomID;
        this.status = status;
        subscribers = new Vector<>();
    }

    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void notifySubscribers() {
        for (Subscriber subscriber : subscribers) {
            subscriber.update("Soy el cuarto: " + roomID+ " Ya estoy libre");
        }
    }

    public abstract void description();
    public abstract void functionability();
    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getRoomID() {
        return roomID;
    }

    public void setRoomID(String roomID) {
        this.roomID = roomID;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
        if(status.equals("libre")){
            notifySubscribers();
        }
    }
}
