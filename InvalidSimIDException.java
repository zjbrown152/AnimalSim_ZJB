/**
 * This is an exception class that will print the statement when the exception is caught.
 * @author  Zane Brown 
 * 
 *@version Programming Project 3
 *@
 *
 *
 */
public class InvalidSimIDException extends RuntimeException{
	public InvalidSimIDException()
	{
		System.out.print("Invalid, SimID must be greater than 0.");
	}

}
