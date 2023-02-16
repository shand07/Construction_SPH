
public class Residential extends Building
{
	/**
	 * Here we have our primitive data types both integer and boolean that
	 * will be used for our programs.
	 */
	
	protected int numBedrooms;
	
	protected int numBathrooms;
	
	protected boolean laundryRoom;
	
	/**
	 * Our methods for Default constructor, preferred constructor, toString method,
	 * getters and setters.
	 */
	
	public Residential()
	{
		
	}
	
	public Residential(String projectName, String completeAddress, 
	double totalSquareFeet, String occupancyGroup, String subGroup)
	{
		super.projectName = projectName;
		super.completeAddress = completeAddress;
		super.totalSquareFeet = totalSquareFeet;
		super.occupancyGroup = occupancyGroup;
		super.subGroup = subGroup;
	}

	@Override
	public String toString() {
		return "Residential [numBedrooms=" + numBedrooms + ", numBathrooms=" + numBathrooms + ", laundryRoom="
				+ laundryRoom + ", projectName=" + projectName + ", completeAddress=" + completeAddress
				+ ", totalSquareFeet=" + totalSquareFeet + ", occupancyGroup=" + occupancyGroup + ", subGroup="
				+ subGroup + "]";
	}

	public int getNumBedrooms() {
		return numBedrooms;
	}

	public void setNumBedrooms(int numBedrooms) {
		this.numBedrooms = numBedrooms;
	}

	public int getNumBathrooms() {
		return numBathrooms;
	}

	public void setNumBathrooms(int numBathrooms) {
		this.numBathrooms = numBathrooms;
	}

	public boolean isLaundryRoom() {
		return laundryRoom;
	}

	public void setLaundryRoom(boolean laundryRoom) {
		this.laundryRoom = laundryRoom;
	}
}
