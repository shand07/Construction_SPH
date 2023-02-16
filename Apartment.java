
public class Apartment extends Residential
{
	/**
	 * Our primitive data type is listed here.
	 */
	
	
	private int numRentableUnits;
	
	private double avgUnitSize;
	
	private boolean parkingAvailable;
	
	/**
	 * Our default constructor, our getters and setters for out variables, our toString,
	 * display data and our preferred constructor methods are all listed below.
	 */
	
	public Apartment()
	{
		
	}
	
	public Apartment(String projectName, String completeAddress, 
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
		System.out.println("Drawing code for <<Apartment>> " );
	}
	
	public String displayData()
	{
		StringBuilder sb = new StringBuilder();
		
		sb.append("Project Name: " +projectName +"\n");
		sb.append("Address: " +completeAddress +"\n");
		sb.append("Square Feet: " +totalSquareFeet +"\n");
		sb.append("Occupancy Group: " +occupancyGroup +"\n");
		sb.append("Sub Group: " +subGroup +"\n");
		sb.append("Number of Bathrooms: " +numBathrooms+ "\n");
		sb.append("Number of Bedrooms: " +numBedrooms+ "\n");
		sb.append("Laundry Room?: " +laundryRoom+ "\n");
		sb.append("Number of Rentable Units: " +numRentableUnits +"\n");
		sb.append("Median Unit Size: " +avgUnitSize +"\n");
		sb.append("Parking?: " +parkingAvailable +"\n");
		
		return sb.toString();
	}

	@Override
	public String toString() {
		return "Apartment [numRentableUnits=" + numRentableUnits + ", avgUnitSize=" + avgUnitSize
				+ ", parkingAvailable=" + parkingAvailable + ", numBedrooms=" + numBedrooms + ", numBathrooms="
				+ numBathrooms + ", laundryRoom=" + laundryRoom + ", projectName=" + projectName + ", completeAddress="
				+ completeAddress + ", totalSquareFeet=" + totalSquareFeet + ", occupancyGroup=" + occupancyGroup
				+ ", subGroup=" + subGroup + "]";
	}

	public int getNumRentableUnits() {
		return numRentableUnits;
	}

	public void setNumRentableUnits(int numRentableUnits) {
		this.numRentableUnits = numRentableUnits;
	}

	public double getAvgUnitSize() {
		return avgUnitSize;
	}

	public void setAvgUnitSize(double avgUnitSize) {
		this.avgUnitSize = avgUnitSize;
	}

	public boolean isParkingAvailable() {
		return parkingAvailable;
	}

	public void setParkingAvailable(boolean parkingAvailable) {
		this.parkingAvailable = parkingAvailable;
	}
}
