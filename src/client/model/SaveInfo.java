package client.model;

import shared.transferobjects.flights;
import shared.transferobjects.passenger;
import shared.transferobjects.seat;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SaveInfo {

    private static SaveInfo instance;
    private static Lock lock = new ReentrantLock();
    private flights flights;
    private seat seat;
    private passenger passenger;

    public static SaveInfo getInstance() {

        if (instance == null) {
            synchronized (lock) {
               if (instance == null)
                   instance = new SaveInfo();
            }
        }
        return instance;
    }

    public flights getFlights() {
        return flights;
    }

    public void setFlights(flights flights) {
        this.flights = flights;
    }


    public seat getSeat() {
        return seat;
    }

    public void setSeat(seat seat) {
        this.seat = seat;
    }

    public passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(passenger passenger) {
        this.passenger = passenger;
    }

    @Override
    public String toString() {
        return "SaveInfo{" +
                "flights=" + flights +
                ", seat=" + seat +
                ", passenger=" + passenger +
                '}';
    }


}