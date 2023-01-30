package service;

import models.ParkingFloor;
import models.ParkingLot;
import repository.ParkingLotRepository;

import java.util.ArrayList;

public class ParkingLotService {

    private ParkingLotRepository parkingLotRepository;

    public ParkingLotService(ParkingLotRepository parkingLotRepository)
    {
        this.parkingLotRepository = parkingLotRepository;
    }

    public ParkingLot createParkingLot(String name,String address,int noOfFloors)
    {
        ParkingLot parkingLot = new ParkingLot();
        parkingLot.setAddress(address);
        parkingLot.setName(name);
        parkingLot.setParkingFloorList(new ArrayList<>());
        for(int i = 0;i< noOfFloors;i++)
        {
            ParkingFloor parkingFloor = new ParkingFloor(i);
            parkingLot.getParkingFloorList().add(parkingFloor);
        }
        return parkingLotRepository.save(parkingLot);
    }
}
