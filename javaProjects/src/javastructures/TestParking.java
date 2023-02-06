package javastructures;


import exception.InvalidVehicleNumberException;
import exception.ParkingFullException;
import model.Ticket;
import model.Vehicle;
import model.VehicleSize;
import service.ParkingLot;
import strategy.FourWheelerWeekDayChargeStrategy;
import strategy.TwoWheelerWeekDayChargeStrategy;

public class TestParking {

    public static void main(String[] args) throws ParkingFullException, InvalidVehicleNumberException {

        ParkingLot parkingLot = ParkingLot.getParkingLot();

        parkingLot.initializeParkingSlots(10,10);

        Vehicle vehicle = new Vehicle("Mh12", VehicleSize.TWOWHEELER);

        Ticket ticket = parkingLot.park(vehicle);
        System.out.println(ticket);

        Vehicle vehicle2 = new Vehicle("Mh13",VehicleSize.FOURWHEELER);

        Ticket ticket2 = parkingLot.park(vehicle2);
        System.out.println(ticket2);

        int cost1 = parkingLot.unPark(ticket2,new TwoWheelerWeekDayChargeStrategy());
        System.out.println(cost1);

        int cost2 = parkingLot.unPark(ticket2,new FourWheelerWeekDayChargeStrategy());
        System.out.println(cost2);

    }
}
