
/**
 * This class is the child class of Animal and implements 
 * @author  Zane Brown 
 * 
 *@version Programming Project 3
 *@
 *
 *
 */
public class GoldFinch extends Animal implements Flyable, Walkable 
{
	double wingSpan;
	//Empty constructor calls Animals constructor and sets Wingspan within the parameters.
	public GoldFinch()
	{
		super();
		setWingSpan(9.0);
		
		
	}
	//Perferred constructor allows the parameters to be passed into it.
	public GoldFinch(int simID, Location location, double wingSpan)
	{
		super(simID, location);
		setWingSpan(wingSpan);
		
		
	}

	//Getter for Winspan
	public double getWingSpan() {
		return this.wingSpan;
	}

	//Setter for Wingspan
	public void setWingSpan(double wingSpan) {
		if(wingSpan < 5.0 || wingSpan>11.0) {
			throw new InvalidWingspanException();
		}else 
		{
			
		this.wingSpan = wingSpan;
		}
	
	}
	//Method that is implemented from the Walkable interface. Updates position when GoldFinch walks.
	public void walk(int direction) {
		int currentX=super.location.getCoordinates()[0];
		int currentY=super.location.getCoordinates()[1];
		if(direction %2==0) {
			currentX += 1;
		}else 
		{
			currentY += 1;
		}
		super.getLocation().update(currentX, currentY);
	}
	//Method that is implemented from the Flyable interface. Updates position when GolfFinch flys.
	public void fly(Location location)
	{
		super.setLocation(location);
	}
}
