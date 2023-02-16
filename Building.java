
public class Building 
{
	/**
	 * Here we have our variables for the building class consisting of strings and
	 * a double.
	 */
	
	protected String projectName;
	
	protected String completeAddress;
	
	protected double totalSquareFeet;
	
	protected String occupancyGroup;
	
	protected String subGroup;
	
	/**
	 * Our default constructor, our getters and setters for out variables, our toString,
	 *  and our preferred constructor methods are all listed below.
	 */
	
	public Building()
	{
		
	}
	
	@Override
	public String toString() {
		return "Building [projectName=" + projectName + ", completeAddress=" + completeAddress + ", totalSquareFeet="
				+ totalSquareFeet + ", occupancyGroup=" + occupancyGroup + ", subGroup=" + subGroup + "]";
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getCompleteAddress() {
		return completeAddress;
	}

	public void setCompleteAddress(String completeAddress) {
		this.completeAddress = completeAddress;
	}

	public double getTotalSquareFeet() {
		return totalSquareFeet;
	}

	public void setTotalSquareFeet(double totalSquareFeet) {
		this.totalSquareFeet = totalSquareFeet;
	}

	public String getOccupancyGroup() {
		return occupancyGroup;
	}

	public void setOccupancyGroup(String occupancyGroup) {
		this.occupancyGroup = occupancyGroup;
	}

	public String getSubGroup() {
		return subGroup;
	}

	public void setSubGroup(String subGroup) {
		this.subGroup = subGroup;
	}

	public Building(String projectName, String completeAddress, 
	double totalSquareFeet, String occupancyGroup, String subGroup)
	{
		this.projectName = projectName;
		this.completeAddress = completeAddress;
		this.totalSquareFeet = totalSquareFeet;
		this.occupancyGroup = occupancyGroup;
		this.subGroup = subGroup;
	}
	
	/**
	 * Below is our draw method and our display data method which will print
	 * all of our variables current settings.
	 */
	
	public void draw()
	{
		System.out.println("Drawing code for <<Building>>  " );
	}
	
	public String displayData()
	{
		StringBuilder sb = new StringBuilder();
		
		sb.append("Project Name: " +projectName +"\n");
		sb.append("Address: " +completeAddress +"\n");
		sb.append("Square Feet: " +totalSquareFeet +"\n");
		sb.append("Occupancy Group: " +occupancyGroup +"\n");
		sb.append("SubGroup: " +subGroup +"\n");
		
		return sb.toString();
	}
}
