package service;


import exception.InvalidVehicleNumberException;
import exception.ParkingFullException;
import model.Ticket;
import model.Vehicle;
import strategy.ParkingChargeStrategy;


public interface Parking {

    public Ticket park(Vehicle vehicle) throws ParkingFullException;

    public int unPark(Ticket ticket, ParkingChargeStrategy parkingChargeStrategy)throws InvalidVehicleNumberException;

}
