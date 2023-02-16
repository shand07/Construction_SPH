
public class Mall extends Business
{
	/**
	 * Our primitive data type is listed here.
	 */
	
	
	private int numRentedUnits;
	
	private double medianUnitSize;
	
	private int numParkingSpace;
	
	/**
	 * Our default constructor, our getters and setters for out variables, our toString,
	 * display data and our preferred constructor methods are all listed below.
	 */
	
	public Mall()
	{
		
	}
	
	public Mall(String projectName, String completeAddress, 
	double totalSquareFeet, String occupancyGroup, String subGroup)
	{
		super.projectName = projectName;
		super.completeAddress = completeAddress;
		super.totalSquareFeet = totalSquareFeet;
		super.occupancyGroup = occupancyGroup;
		super.subGroup = subGroup;
	}
	
	public void draw()
	{
		System.out.println("Drawing code for <<Mall>> ");
	}
	
	public String displayData()
	{
		StringBuilder sb = new StringBuilder();
		
		sb.append("Project Name: " +projectName +"\n");
		sb.append("Address: " +completeAddress +"\n");
		sb.append("Square Feet: " +totalSquareFeet +"\n");
		sb.append("Occupancy Group: " +occupancyGroup +"\n");
		sb.append("Sub Group: " +subGroup +"\n");
		sb.append("Number of Rental Units: " +numRentalUnits+ "\n");
		sb.append("Rented Units: " +numRentedUnits +"\n");
		sb.append("Median Unit Size: " +medianUnitSize +"\n");
		sb.append("Number of Parking Spaces: " +numParkingSpace +"\n");
		
		return sb.toString();
	}

	@Override
	public String toString() {
		return "Mall [numRentedUnits=" + numRentedUnits + ", medianUnitSize=" + medianUnitSize + ", numParkingSpace="
				+ numParkingSpace + ", numRentalUnits=" + numRentalUnits + ", projectName=" + projectName
				+ ", completeAddress=" + completeAddress + ", totalSquareFeet=" + totalSquareFeet + ", occupancyGroup="
				+ occupancyGroup + ", subGroup=" + subGroup + "]";
	}

	public int getNumRentedUnits() {
		return numRentedUnits;
	}

	public void setNumRentedUnits(int numRentedUnits) {
		this.numRentedUnits = numRentedUnits;
	}

	public double getMedianUnitSize() {
		return medianUnitSize;
	}

	public void setMedianUnitSize(double medianUnitSize) {
		this.medianUnitSize = medianUnitSize;
	}

	public int getNumParkingSpace() {
		return numParkingSpace;
	}

	public void setNumParkingSpace(int numParkingSpace) {
		this.numParkingSpace = numParkingSpace;
	}
}
