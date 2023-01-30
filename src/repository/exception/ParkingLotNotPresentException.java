package repository.exception;

public class ParkingLotNotPresentException extends RuntimeException{

    public ParkingLotNotPresentException(String errorMessage)
    {
        super(errorMessage);
    }

}
