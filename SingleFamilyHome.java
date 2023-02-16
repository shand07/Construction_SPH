
public class SingleFamilyHome extends Residential
{
	/**
	 * Our primitive data type is listed here.
	 */
	
	
	private boolean garage;
	
	/**
	 * Our default constructor, our getters and setters for out variables, our toString,
	 * display data and our preferred constructor methods are all listed below.
	 */
	
	public SingleFamilyHome()
	{
		
	}
	
	public SingleFamilyHome(String projectName, String completeAddress, 
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
		return "SingleFamilyHome [garage=" + garage + ", numBedrooms=" + numBedrooms + ", numBathrooms=" + numBathrooms
				+ ", laundryRoom=" + laundryRoom + ", projectName=" + projectName + ", completeAddress="
				+ completeAddress + ", totalSquareFeet=" + totalSquareFeet + ", occupancyGroup=" + occupancyGroup
				+ ", subGroup=" + subGroup + "]";
	}

	public void draw()
	{
		System.out.println("Drawing code for <<SingleFamilyHome>> " );
	}
	
	public String displayData()
	{
		StringBuilder sb = new StringBuilder();
		
		sb.append("Project Name: " +projectName +"\n");
		sb.append("Address: " +completeAddress +"\n");
		sb.append("Square Feet: " +totalSquareFeet +"\n");
		sb.append("Occupancy Group: " +occupancyGroup +"\n");
		sb.append("Sub Group: " +subGroup +"\n");
		sb.append("Number of Bedrooms: " +numBedrooms+ "\n");
		sb.append("Number of Bathrooms: " +numBathrooms+ "\n");
		sb.append("Laundry Room?: " +laundryRoom+ "\n");
		sb.append("Garage?: " );
		
		return sb.toString();
	}


	public void setGarage(boolean garage) {
		this.garage = garage;
	}
	public boolean isGarage() {
		return garage;
	}
}
