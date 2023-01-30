import controller.ParkingLotController;
import dto.CreateParkingLotRequestDTO;
import dto.CreateParkingLotResponseDTO;
import repository.ParkingLotRepository;
import service.ParkingLotService;

public class Client {

    public static void main(String[] args) {
        ParkingLotRepository parkingLotRepository = new ParkingLotRepository();

        ObjectRegistry.putObject("parkingLotRepository",parkingLotRepository);

        ParkingLotService parkingLotService = new ParkingLotService((ParkingLotRepository) ObjectRegistry.getObject("parkingLotRepository"));
        ObjectRegistry.putObject("parkingLotService",parkingLotService);

        ParkingLotController parkingLotController = new ParkingLotController((ParkingLotService) ObjectRegistry.getObject("parkingLotService"));

        CreateParkingLotRequestDTO createParkingLotRequestDTO =
                new CreateParkingLotRequestDTO("Oberoi Parking Lot","Malad",3);

        CreateParkingLotResponseDTO createParkingLotResponseDTO = parkingLotController.createParkingLot(createParkingLotRequestDTO);

        System.out.println(createParkingLotResponseDTO.getStatus());
        System.out.println(createParkingLotResponseDTO.getParkingLot().getId()+
                "\n" + createParkingLotResponseDTO.getParkingLot().getName() +
                "\n" + createParkingLotResponseDTO.getParkingLot().getAddress() +
                "\n" + createParkingLotResponseDTO.getParkingLot().getParkingFloorList().size());
    }
}
