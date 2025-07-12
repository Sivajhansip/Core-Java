package Day19ExceptionHandlingInJava;


class InvalidDataException extends Exception {
    public InvalidDataException(String message) {
        super(message);
    }
}
public class CustomException {
	// Declare that the method can throw an exception
    void checkSum(int num) throws InvalidDataException {
        if (num < 1) {
            throw new InvalidDataException("Number is negative, cannot calculate square.");
        } else {
            System.out.println("Square of " + num + " is: " + (num * num));
        }
    }
	

	public static void main(String[] args){
		CustomException cus = new CustomException();
        try {
            cus.checkSum(-1); // This will throw an InvalidDataException
        } catch (InvalidDataException e) {
            System.out.println("Data is not valid: " + e.getMessage());
        }
    }
	}


