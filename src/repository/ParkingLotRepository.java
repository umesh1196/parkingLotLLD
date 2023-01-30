package repository;
import models.ParkingLot;
import repository.exception.ParkingLotNotPresentException;

import java.util.HashMap;

public class ParkingLotRepository{

    private HashMap<Long,ParkingLot> parkingLots  = new HashMap<>();
    private long id = 0l;

    public ParkingLot save(ParkingLot parkingLot)
    {
        id += 1;
        parkingLot.setId(id);
        parkingLots.put(id,parkingLot);
        return parkingLot;
    }

    public ParkingLot getParkingLot(long id) throws ParkingLotNotPresentException
    {
        if(parkingLots.containsKey(id))
        {
            return parkingLots.get(id);
        }
        throw new ParkingLotNotPresentException("Parking Lot with Id + " + id + " is not present. ");
    }
}
