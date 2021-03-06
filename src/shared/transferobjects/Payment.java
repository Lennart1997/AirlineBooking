package shared.transferobjects;

import java.io.Serializable;

public class Payment implements Serializable {

    private int PaymentID;
    private String CardholderName, CardNumber, CVV, ExpirationDate;
    private Flights flights;

    public Payment(int paymentID, String cardholderName, String cardNumber, String CVV, String expirationDate) {
        this.PaymentID = paymentID;
        this.CardholderName = cardholderName;
        this.CardNumber = cardNumber;
        this.CVV = CVV;
        this.ExpirationDate = expirationDate;
    }

    public Payment(Flights flights) {
        this.flights = flights;
    }

    //payment
    public int getPaymentID() {
        return PaymentID;
    }
    public String getCardholderName() {
        return CardholderName;
    }
    public String getCardNumber() {
        return CardNumber;
    }
    public String getCVV() {
        return CVV;
    }
    public String getExpirationDate() {
        return ExpirationDate;
    }

    //flight
    public String getPrice(){
        return flights.getPrice();
    }

    @Override
    public String toString() {
        return "Payment{" +
                "PaymentID=" + PaymentID +
                ", CardholderName='" + CardholderName + '\'' +
                ", CardNumber='" + CardNumber + '\'' +
                ", CVV='" + CVV + '\'' +
                ", ExpirationDate='" + ExpirationDate + '\'' +
                ", flights=" + flights +
                '}';
    }
}
