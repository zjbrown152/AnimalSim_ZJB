
/**
 * This is an exception class that will print the statement when the exception is caught.
 * @author  Zane Brown 
 * 
 *@version Programming Project 3
 *@
 *
 *
 */
public class InvalidCoordinateException extends RuntimeException{
	public InvalidCoordinateException()
	{
		System.out.println("Invalid, x and y must be greater than 0.");
	}
	

}
