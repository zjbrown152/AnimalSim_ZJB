
/**
 * This class is an Abstract class that is the parent class for GoldFinch and BrownBear.
 * @author  Zane Brown 
 * 
 *@version Programming Project 3
 *@
 *
 *
 */

public abstract class Animal {
	protected int simID;
	protected Location location;
	protected boolean full;
	protected boolean rested;
	//Empty constructor sets variables to default values.
	public Animal() {
		setSimID(0);
		setLocation(new Location(0,0));
		setFull(false);
		setRested(true);
		
	}
	//Preferred constructor sets variables to the parameters passed through it. 
	public Animal(int simID, Location l)
	{
		
		setSimID(simID);
		setLocation(location);
		setFull(false);
		setRested(true);
	}
	//Method that sets full to true if the value "rand" is greater than 0.5 and to false if it is not.
	public void eat() {
		double rand=Math.random();
		if(rand>0.5) 
		{
			this.full=true;
		}else 
		{
			this.full=false;
		}
		
	}
	//Method that sets rested to true if "rand" is greater than 0.5 and to false if it is not.
	public void sleep() 
	{
		double rand=Math.random();
		if(rand>0.5) 
		{
			this.rested=true;
		}else
		{
			this.rested=false;
		}
		
	}
	//Getter for simID
	public int getSimID() {
		return this.simID;
	}
	//Setter for simID, includes exception for if simID is less than 0.
	public void setSimID(int simID) {
		if(simID<0)
		{
			throw new InvalidSimIDException();
			
		}
		this.simID = simID;
	}
	//Getter for Location
	public Location getLocation() {
		return this.location;
	}
	//Setter for Location
	public void setLocation(Location location) {
		this.location = location;
	}
	//Getter for full
	public boolean isFull() {
		return this.full;
	}
	//Setter for full
	public void setFull(boolean full) {
		this.full = full;
	}
	//Getter for rested
	public boolean isRested() {
		return this.rested;
	}
	//Setter for rested
	public void setRested(boolean rested) {
		this.rested = rested;
	}
	

}
