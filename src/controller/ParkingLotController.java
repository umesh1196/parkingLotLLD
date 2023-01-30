package controller;

import dto.CreateParkingLotRequestDTO;
import dto.CreateParkingLotResponseDTO;
import dto.Status;
import models.ParkingLot;
import service.ParkingLotService;

public class ParkingLotController {

    private ParkingLotService parkingLotService;

    public ParkingLotController(ParkingLotService parkingLotService) {
        this.parkingLotService = parkingLotService;
    }

    public CreateParkingLotResponseDTO createParkingLot(CreateParkingLotRequestDTO createParkingLotRequestDTO)
    {
        ParkingLot parkingLot = parkingLotService.createParkingLot(createParkingLotRequestDTO.getName(),createParkingLotRequestDTO.getAddress(),createParkingLotRequestDTO.getNoOfFloors());
        CreateParkingLotResponseDTO createParkingLotResponseDTO = new CreateParkingLotResponseDTO();
        createParkingLotResponseDTO.setStatus(Status.SUCCESS);
        createParkingLotResponseDTO.setParkingLot(parkingLot);
        return createParkingLotResponseDTO;
    }

}
