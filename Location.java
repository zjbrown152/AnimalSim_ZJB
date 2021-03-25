
/**
 * This class updates the position of the Animals when they move.
 * @author  Zane Brown 
 * 
 *@version Programming Project 3
 *
 *
 *
 */
public class Location {
	protected int xCoord;
	protected int yCoord;
	//Empty constructor sets the coordinates to 0.
	public Location() 
	{
		update(0,0);
		
	}
	// Sets the coordinates to the parameters passed through them.
	public Location(int x, int y)
	{
		update(x,y);
		
	}
	// Setter for x and y, includes an Exception to ensure the coordinates are greater than 0.
	public void update(int x, int y) throws InvalidCoordinateException
	{
		if(x<0 || y<0) {
			throw new InvalidCoordinateException();
		}
		xCoord=x;
		yCoord=y;
		
	}
	//Getter that returns the coordinates of the Animal in question.
	public int[] getCoordinates()
	{
		int[] currentspot= {xCoord, yCoord};
		return currentspot;
		
	}

	
}
