
/**
 * This class is the child class of Animal and implements Walkable and Swimmable.
 * @author  Zane Brown 
 * 
 *@version Programming Project 3
 *@
 *
 *
 */
import java.util.Arrays;


public class BrownBear extends Animal implements Walkable, Swimmable {
	final protected String[] ss= {
			"Alaskan", "Asiatic", "European",
			"Grizzly", "Kodiak", "Siberian"};
	//Empty constructor 
	protected String subSpecies;
	
	public BrownBear() {
		super();
		setSubSpecies("Alaskan");
		
	}
	//Preferred constructor allows parameters to be passed into it.
	public BrownBear(int simID, Location location, String subSpecies)
	{
		super(simID, location);
		setSubSpecies("Alaskan");
		
	}
//Getter for Subspecies
	public String getSubSpecies() {
		return subSpecies;
	}
//Setter for Subspecies, includes exception for if subspecies doesn't exist in our list.
	public void setSubSpecies(String subSpecies) {
		if(!Arrays.asList(ss).contains(subSpecies)) {
			throw new InvalidSubspeciesException();
		}
		this.subSpecies = subSpecies;
	}
	// Method implemented from the Swimmable interface. Updates position when BrownBear swims.
	public void swim(int direction) {
		int currentX=super.location.getCoordinates()[0];
		int currentY=super.location.getCoordinates()[1];
		if(direction%2==0) {
			currentX += 2;
		}else {
	
			currentY += 2;
		}
		super.location.update(currentX, currentY);
	}
	// Method implemented from the Walkable interface. Updates postion when BrownBear walks.
	public void walk(int direction)
	{
		int currentX=super.location.getCoordinates()[0];
		int currentY= super.location.getCoordinates()[1];
		if(direction %2==0) {
			currentX += 3;
		}else {
			currentY += 3;
		}
		super.location.update(currentX, currentY);
	}
	

}
