package Banking_Sector;

public class InvalidAccountNumberException extends RuntimeException {
    public InvalidAccountNumberException (String message){
        super(message);
    }
}
