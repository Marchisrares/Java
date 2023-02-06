package model;

public class Slot {
    private Integer number;
    private boolean isEmpty;
    private Vehicle parkVehicle;

    public Slot(Integer number){
        this.number = number;
    }

    public Vehicle getParkVehicle() {
        return parkVehicle;
    }

    public void setParkVehicle(Vehicle parkVehicle) {
        this.parkVehicle = parkVehicle;
    }

    public void vacateSlot() {
        parkVehicle = null;
        this.isEmpty = true;
    }

    public void occupySlot(Vehicle parkVehicle) {
        this.parkVehicle = parkVehicle;
        this.isEmpty = false;
    }

    public Integer getSlotNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }
}
