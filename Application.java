
public class Application 
{

	public static void main(String[] args) 
	{
		/**
		 * Here we are testing all of our methods from the building class.
		 */
		
		Building myBuilding = new Building("Gaines House", //Building Object myBuilding Constructor 
		"123 Main Street Louisville KY 40201", 2540.00, 
		"Residential", "R1");
		
		System.out.println(myBuilding.displayData());//Our Data for myBuilding
		
		myBuilding.setProjectName("My Project");//Setter for Project Name
		System.out.println(myBuilding.getProjectName());//Getter/Print for Project Name
		
		myBuilding.setCompleteAddress("My Address");//Setter for Address
		System.out.println(myBuilding.getCompleteAddress());//Getter/Print for Address
		
		myBuilding.setTotalSquareFeet(1000);//Setter for Square Feet
		System.out.println(myBuilding.getTotalSquareFeet());//Getter/Print for Square Feet
		
		myBuilding.setOccupancyGroup("My Occupancy Group");//Setter for Occupancy Group
		System.out.println(myBuilding.getOccupancyGroup());//Getter/Print for Occupancy Group
		
		myBuilding.setSubGroup("My Sub Group");//Setter for Sub Group
		System.out.println(myBuilding.getSubGroup());//Getter/Print for SubGroup
		
		myBuilding.draw();//Draw Method for myBuilding
		
		myBuilding.toString();//ToString Method for myBuilding
		
		System.out.println();//Blank Line
		
		System.out.println(myBuilding.displayData());//Display Data for myBuilding after Setters
		System.out.println();//Blank line to Separate for Next Object
		
		/**
		 * Here we are testing all of our methods from the Business class
		 * which inherits from Building.
		 */
		
		Business myBusiness = new Business("McDonald's", //Business Object myBusiness Constructor
		"456 Main Street Louisville KY 40201", 3000, "Business", "B");
		
		System.out.println(myBusiness.displayData());//Our Data from myBusiness
		
		myBusiness.setNumRentalUnits(2);//Setter for Number of Rentals
		System.out.println(myBusiness.getNumRentalUnits());//Getter/Print for Number of Rentals
		
		myBusiness.setProjectName("My Project");//Setter for Project Name
		System.out.println(myBusiness.getProjectName());//Getter/Print for Project Name
		
		myBusiness.setCompleteAddress("My Address");//Setter for Address
		System.out.println(myBusiness.getCompleteAddress());//Getter/Print for Address
		
		myBusiness.setTotalSquareFeet(1000);//Setter for Square Feet
		System.out.println(myBusiness.getTotalSquareFeet());//Getter/Print for Square Feet
		
		myBusiness.setOccupancyGroup("My Occupancy Group");//Setter for Occupancy Group
		System.out.println(myBusiness.getOccupancyGroup());//Getter/Print for Occupancy Group
		
		myBusiness.setSubGroup("My Sub Group");//Setter for Sub Group
		System.out.println(myBusiness.getSubGroup());//Getter/Print for Sub Group
		
		myBusiness.draw();//Draw Method
		
		myBusiness.toString();//ToString Method for myBusiness
		
		System.out.println();//Blank Line
		
		System.out.println(myBusiness.displayData());//myBusiness Display Data after Setters
		System.out.println();//Blank line to separate for next object
		
		/**
		 * Here we are testing all of our methods from the Residential class
		 * which inherits from Building.
		 */
		
		Residential myResidential = new Residential("John's House", //Residential Object myResidential Constructor
		"789 Main Street Louisville KY 40201", 2000, "Residential", "R1");
		
		System.out.println(myResidential.displayData());//Our Data from myResidential
		
		myResidential.setNumBedrooms(2);//Setter for Number of Bedrooms
		System.out.println(myResidential.getNumBathrooms());//Getter/Print for Number of Bedrooms
		
		myResidential.setNumBathrooms(1);//Setter for Number of Bathrooms
		System.out.println(myResidential.getNumBathrooms());//Getter/Print for Number of Bathrooms
		
		myResidential.setLaundryRoom(true);//Setter for Laundry room
		System.out.println(myResidential.isLaundryRoom());//Getter/Print for Laundry Room
		
		myResidential.setProjectName("My Project");//Setter for Project Name
		System.out.println(myResidential.getProjectName());//Getter/Print for Project Name
		
		myResidential.setCompleteAddress("My Address");//Setter for Address
		System.out.println(myResidential.getCompleteAddress());//Getter/Print for Address
		
		myResidential.setTotalSquareFeet(1000);//Setter for Square Feet
		System.out.println(myResidential.getTotalSquareFeet());//Getter/Print for Square Feet
		
		myResidential.setOccupancyGroup("My Occupancy Group");//Setter for Occupancy Group
		System.out.println(myResidential.getOccupancyGroup());//Getter/Print for Occupancy Group
		
		myResidential.setSubGroup("My Sub Group");//Setter for Sub Group
		System.out.println(myResidential.getSubGroup());//Getter/Print for Sub Group
		
		myResidential.draw();//Draw Method
		
		myResidential.toString();//ToString method for myResidential
		
		System.out.println();//Blank Line
		
		System.out.println(myResidential.displayData());//Display Data method for myResidential after Setters
		System.out.println();//Blank line to separate for next object
		
		
		/**
		 * Here we are testing all of our methods for the SingleFamilyHome class
		 * which inherits from Residential.
		 */
		
		SingleFamilyHome mySingleFamilyHome = new SingleFamilyHome("Dave's House", //SingleFamilyHome Object mySingleFamilyHome Constructor
		"123 Second Street Louisville KY 40201", 2000, "SingleFamilyHome", "R2");
		
		System.out.println(mySingleFamilyHome.displayData());//Our Data for mySingleFamilyHome
		
		mySingleFamilyHome.setGarage(true);//Setter for Garage Boolean
		System.out.println("Garage: " +mySingleFamilyHome.isGarage());//Getter/Print for Garage
		
		mySingleFamilyHome.setNumBedrooms(2);//Setter for Number of Bedrooms
		System.out.println(mySingleFamilyHome.getNumBathrooms());//Getter/Print for Number of Bedrooms
		
		mySingleFamilyHome.setNumBathrooms(1);//Setter for Number of Bathrooms
		System.out.println(mySingleFamilyHome.getNumBathrooms());//Getter/Print for Number of Bathrooms
		
		mySingleFamilyHome.setLaundryRoom(false);//Setter for Laundry room
		System.out.println(mySingleFamilyHome.isLaundryRoom());//Getter/Print for Laundry Room
		
		mySingleFamilyHome.setProjectName("My Project");//Setter for Project Name
		System.out.println(mySingleFamilyHome.getProjectName());//Getter/Print for Project Name
		
		mySingleFamilyHome.setCompleteAddress("My Address");//Setter for Address
		System.out.println(mySingleFamilyHome.getCompleteAddress());//Getter/Print for Address
		
		mySingleFamilyHome.setTotalSquareFeet(1000);//Setter for Square Feet
		System.out.println(mySingleFamilyHome.getTotalSquareFeet());//Getter/Print for Square Feet
		
		mySingleFamilyHome.setOccupancyGroup("My Occupancy Group");//Setter for Occupancy Group
		System.out.println(mySingleFamilyHome.getOccupancyGroup());//Getter/Print for Occupancy Group
		
		mySingleFamilyHome.setSubGroup("My Sub Group");//Setter for Sub Group
		System.out.println(mySingleFamilyHome.getSubGroup());//Getter/Print for Sub Group
		
		mySingleFamilyHome.draw();//Draw Method
		
		mySingleFamilyHome.toString();//ToString Method for mySingleFamilyHome
		
		System.out.println();//Blank Line
		
		System.out.println(mySingleFamilyHome.displayData());//Display Data method after Setters
		System.out.println();//Blank line to separate for next object
		
		
		
		/**
		 * Here we are testing all of our methods from the Apartment class which
		 * inherits from the Residential class.
		 */
		
		Apartment myApartment = new Apartment("Steve's Apartment", //Apartment class myApartment Constructor
		"456 Second Street Louisville KY 40201", 2000, "Apartment", "R3");
		
		System.out.println(myApartment.displayData());//Display Data Method for myApartment
		
		myApartment.setNumRentableUnits(8);//Setter for NumRentable Units
		System.out.println(myApartment.getNumRentableUnits());//Getter/Print for NumRentable Units
		
		myApartment.setAvgUnitSize(25.00);//Setter for Average unit size
		System.out.println(myApartment.getAvgUnitSize());//Getter/Print for Average unit size
		
		myApartment.setParkingAvailable(false);//Setter for Parking
		System.out.println(myApartment.isParkingAvailable());//Getter/Print for Parking
		
		myApartment.setNumBedrooms(2);//Setter for Number of Bedrooms
		System.out.println(myApartment.getNumBathrooms());//Getter/Print for Number of Bedrooms
		
		myApartment.setNumBathrooms(1);//Setter for Number of Bathrooms
		System.out.println(myApartment.getNumBathrooms());//Getter/Print for Number of Bathrooms
		
		myApartment.setLaundryRoom(false);//Setter for Laundry room
		System.out.println(myApartment.isLaundryRoom());//Getter/Print for Laundry Room
		
		myApartment.setProjectName("My Project");//Setter for Project Name
		System.out.println(myApartment.getProjectName());//Getter/Print for Project Name
		
		myApartment.setCompleteAddress("My Address");//Setter for Address
		System.out.println(myApartment.getCompleteAddress());//Getter/Print for Address
		
		myApartment.setTotalSquareFeet(1000);//Setter for Square Feet
		System.out.println(myApartment.getTotalSquareFeet());//Getter/Print for Square Feet
		
		myApartment.setOccupancyGroup("My Occupancy Group");//Setter for Occupancy Group
		System.out.println(myApartment.getOccupancyGroup());//Getter/Print for Occupancy Group
		
		myApartment.setSubGroup("My Sub Group");//Setter for Sub Group
		System.out.println(myApartment.getSubGroup());//Getter/Print for Sub Group
		
		myApartment.draw();//Draw Method
		
		myApartment.toString();//ToString Method for myApartment
		
		System.out.println();//Blank Line
		
		System.out.println(myApartment.displayData());//Display Data Method after Setters
		System.out.println();//Blank line to separate for next object
		
		
		
		/**
		 * Here we are testing all of our methods from the Mall class which inherits
		 *  from Business.
		 */
		
		Mall myMall = new Mall("North Mall", 
		"789 Second Street Louisville KY 40201", 8000, "Mall", "M");
		
		System.out.println(myMall.displayData());//Display Data method for myMall
		
		myMall.setNumRentedUnits(30);//Setter for Number of Rented Units
		System.out.println(myMall.getNumRentedUnits());//Getter/Print for Number of Rented Units
		
		myMall.setMedianUnitSize(50);//Setter for Median Unit Size
		System.out.println(myMall.getMedianUnitSize());//Getter/Print for Median Unit Size
		
		myMall.setNumParkingSpace(3000);//Setter for Parking spaces
		System.out.println(myMall.getNumParkingSpace());//Getter/Print for Parking spaces
		
		myMall.setNumRentalUnits(40);//Setter for Number of Rentals
		System.out.println(myMall.getNumRentalUnits());//Getter/Print for Number of Rentals
		
		myMall.setProjectName("My Project");//Setter for Project Name
		System.out.println(myMall.getProjectName());//Getter/Print for Project Name
		
		myMall.setCompleteAddress("My Address");//Setter for Address
		System.out.println(myMall.getCompleteAddress());//Getter/Print for Address
		
		myMall.setTotalSquareFeet(1000);//Setter for Square Feet
		System.out.println(myMall.getTotalSquareFeet());//Getter/Print for Square Feet
		
		myMall.setOccupancyGroup("My Occupancy Group");//Setter for Occupancy Group
		System.out.println(myMall.getOccupancyGroup());//Getter/Print for Occupancy Group
		
		myMall.setSubGroup("My Sub Group");//Setter for Sub Group
		System.out.println(myMall.getSubGroup());//Getter/Print for Sub Group
		
		myMall.draw();//Draw Method
		
		myMall.toString();//ToString Method for myMall
		
		System.out.println();//Blank Line
		
		System.out.println(myMall.displayData());//Display Data Method
		
	}
	

}
