package Hotel;

import java.time.LocalDate;

public class Reserva {
    private LocalDate registerDate;
    private LocalDate checkInDate;
    private int daysStay;
    private String roomID;

    public Reserva(LocalDate registerDate, LocalDate checkInDate, int daysStay, String roomID) {
        this.registerDate = registerDate;
        this.checkInDate = checkInDate;
        this.daysStay = daysStay;
        this.roomID = roomID;
    }
    public LocalDate getRegisterDate() {
        return registerDate;
    }
    public void setRegisterDate(LocalDate registerDate) {
        this.registerDate = registerDate;
    }
    public LocalDate getCheckInDate() {
        return checkInDate;
    }
    public void setCheckInDate(LocalDate checkInDate) {
        this.checkInDate = checkInDate;
    }
    public int getDaysStay() {
        return daysStay;
    }
    public void setDaysStay(int daysStay) {
        this.daysStay = daysStay;
    }

    public String getRoomID() {
        return roomID;
    }
    public void setRoomID(String roomID) {
        this.roomID = roomID;
    }

}
