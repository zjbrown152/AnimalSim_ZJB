/**
 * This is an exception class that will print the statement when the exception is caught.
 * @author  Zane Brown 
 * 
 *@version Programming Project 3
 *@
 *
 *
 */
public class InvalidSubspeciesException extends RuntimeException {
	public InvalidSubspeciesException() {
		System.out.println("Invalid Subspecies");
	}

}
