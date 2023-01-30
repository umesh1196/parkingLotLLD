package models;

import java.sql.Time;

public class ParkingTicket extends BaseModel{

    private Vehicle vehicle;

    private Gate entryGate;

    private Time entryTime;

    private ParkingSlot parkingSpot;

    private Operator operator;


}
