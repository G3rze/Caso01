package Personas;

import Hotel.Reserva;
import Observer.Subscriber;

import java.util.Vector;

public class Cliente extends User implements Subscriber {
    private double income;
    private String creditStatus;
    private int companions;
    private String specialNeeds;
    private String specialRequierments;
    private Vector<Reserva> reserva;

    public Cliente(String name, int age, String address, String user, String password,double income, String creditStatus, int companions, String specialNeeds, String specialRequierments) {
        super(name, age, address, user, password);
        this.income = income;
        this.creditStatus = creditStatus;
        this.companions = companions;
        this.specialNeeds = specialNeeds;
        this.specialRequierments = specialRequierments;
        reserva = new Vector<>();

    }
    public double getIncome() {
        return income;
    }
    public void setIncome(double income) {
        this.income = income;
    }
    public String getCreditStatus() {
        return creditStatus;
    }
    public void setCreditStatus(String creditStatus) {
        this.creditStatus = creditStatus;
    }
    public int getCompanions() {
        return companions;
    }
    public void setCompanions(int companions) {
        this.companions = companions;
    }
    public String getSpecialNeeds() {
        return specialNeeds;
    }
    public void setSpecialNeeds(String specialNeeds) {
        this.specialNeeds = specialNeeds;
    }
    public String getSpecialRequierments() {
        return specialRequierments;
    }
    public void setSpecialRequierments(String specialRequierments) {
        this.specialRequierments = specialRequierments;
    }
    public Vector<Reserva> getReserva() {
        return reserva;
    }
    public void setReserva(Vector<Reserva> reserva) {
        this.reserva = reserva;
    }

    @Override
    public void update(String message) {

        System.out.println(message);

    }
}
