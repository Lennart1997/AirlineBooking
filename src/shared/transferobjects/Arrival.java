package shared.transferobjects;

import java.io.Serializable;
import java.sql.Timestamp;

public class Arrival implements Serializable {

    public int arrivalID;
    public String arrival;
    public Timestamp arrivalDate;

    public Arrival(int arrivalID, String arrival, Timestamp arrivalDate) {
        this.arrivalID = arrivalID;
        this.arrival = arrival;
        this.arrivalDate = arrivalDate;
    }

    public int getArrivalID() {
        return arrivalID;
    }

    public String getArrival() {
        return arrival;
    }

    public Timestamp getArrivalDate() {
        return arrivalDate;
    }

    @Override
    public String toString() {
        return "Arrival{" +
                "arrivalID=" + arrivalID +
                ", arrival='" + arrival + '\'' +
                ", arrivalDate=" + arrivalDate +
                '}';
    }
}
