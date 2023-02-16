
public class Business extends Building
{
	/**
	 * Our primitive data type is listed here.
	 */
	
	protected int numRentalUnits;
	
	/**
	 * Here is our default constructor, preferred constructor, toString, and
	 * getter/setter methods.
	 */
	
	public Business()
	{
		
	}
	
	public Business(String projectName, String completeAddress, 
	double totalSquareFeet, String occupancyGroup, String subGroup)
	{
		super.projectName = projectName;
		super.completeAddress = completeAddress;
		super.totalSquareFeet = totalSquareFeet;
		super.occupancyGroup = occupancyGroup;
		super.subGroup = subGroup;
	}

	public int getNumRentalUnits() {
		return numRentalUnits;
	}

	public void setNumRentalUnits(int numRentalUnits) {
		this.numRentalUnits = numRentalUnits;
	}

	@Override
	public String toString() {
		return "Business [numRentalUnits=" + numRentalUnits + ", projectName=" + projectName + ", completeAddress="
				+ completeAddress + ", totalSquareFeet=" + totalSquareFeet + ", occupancyGroup=" + occupancyGroup
				+ ", subGroup=" + subGroup + "]";
	}
}
