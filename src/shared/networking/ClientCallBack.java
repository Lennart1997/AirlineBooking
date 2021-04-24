package shared.networking;

import shared.transferobjects.InputChat;
import shared.transferobjects.InputUser;
import shared.transferobjects.Passenger;
import shared.transferobjects.myFlightTicket;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ClientCallBack extends Remote {

    void updateChat(InputChat entry) throws RemoteException;
    void updateUser(InputUser entry2) throws RemoteException;
    void updateTicket(myFlightTicket myflightticket) throws RemoteException;
    //void updatePassenger(Passenger passenger) throws RemoteException;


}
