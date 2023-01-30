package dto;

public class CreateParkingLotRequestDTO {

    private String name;
    private String address;
    private int noOfFloors;

    public CreateParkingLotRequestDTO(String name, String address, int noOfFloors) {
        this.name = name;
        this.address = address;
        this.noOfFloors = noOfFloors;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNoOfFloors() {
        return noOfFloors;
    }

    public void setNoOfFloors(int noOfFloors) {
        this.noOfFloors = noOfFloors;
    }
}
