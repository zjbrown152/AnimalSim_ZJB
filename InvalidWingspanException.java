/**
 * This is an exception class that will print the statement when the exception is caught.
 * @author  Zane Brown 
 * 
 *@version Programming Project 3
 *@
 *
 *
 */
public class InvalidWingspanException extends RuntimeException {
	public InvalidWingspanException() {
		System.out.println("Invalid, Winspan should be between 5.0-11.0");
	}

}
