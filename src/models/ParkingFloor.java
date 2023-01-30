package models;

import java.util.List;

public class ParkingFloor extends BaseModel{
    private int floorNo;
    private List<ParkingSlot> parkingSlotList;

    public ParkingFloor(int floorNo)
    {
        this.floorNo = floorNo;
    }

    public int getFloorNo() {
        return floorNo;
    }

    public void setFloorNo(int floorNo) {
        this.floorNo = floorNo;
    }

    public List<ParkingSlot> getParkingSlotList() {
        return parkingSlotList;
    }

    public void setParkingSlotList(List<ParkingSlot> parkingSlotList) {
        this.parkingSlotList = parkingSlotList;
    }
}
