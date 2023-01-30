package strategy;

import models.ParkingSlot;
import models.Vehicle;

public interface AssignParkingSpot {

    public ParkingSlot assignParkingSlot(Vehicle vehicle);
}
