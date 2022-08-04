package c206_graded;

import java.util.ArrayList;

public class BikeLoverCommunity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
        //ArrayList for visitor registration
		ArrayList<Visitor> visitorList = new ArrayList<Visitor>();
		
		//ArrayList for bikeListing
		ArrayList<BikeListing> bikeListingList = new ArrayList<BikeListing>();
		
		// ArrayList of bike part listing
		ArrayList<BikePartListing> bikePartListingList = new ArrayList<BikePartListing>();
		
		//ArrayList for appointment
		ArrayList<Appointment> AppointmentList = new ArrayList<Appointment>();
		
		//ArrayList for feedback
		ArrayList<Feedback> feedbackList = new ArrayList<Feedback>();

        //Adding BikeListing items
		bikeListingList.add(new BikeListing("B001", "Trek Sport Bike", 199.00, true));
		bikeListingList.add(new BikeListing("B002", "Connondale Mountain Bike", 299.50, true));
		bikeListingList.add(new BikeListing("B003", "Kona Road Bike", 399.50, true));
		bikeListingList.add(new BikeListing("B004", "Colnago Sports Bike", 409.50, true));
		bikeListingList.add(new BikeListing("B005", "Bianch BMX", 500.50, true));
		
		// Adding bikePartListing items
		bikePartListingList.add(new BikePartListing("BP001", "Fixie", "Wheel", 250.80, true));
		bikePartListingList.add(new BikePartListing("BP002", "Nukeproof Horizon V2 Carbon Riser", "Handlebar", 45.90, true));
		bikePartListingList.add(new BikePartListing("BP003", "Shimano Deore M6100", "Brakes", 165.50, true));
		bikePartListingList.add(new BikePartListing("BP004", "Bontrager Arvada Elite", "Seats", 409.50, true));
		
		//Adding feedback items
		feedbackList.add(new Feedback("B001", "Minny", "Very patient service staff"));
		feedbackList.add(new Feedback("B002", "Tim", "Something was not returned back to me"));
		feedbackList.add(new Feedback("B003", "Sam", "Product not received"));
		feedbackList.add(new Feedback("B004", "Tom", "Colour was not up to expectations"));
		feedbackList.add(new Feedback("B005", "Ah Ming", "Website is user-friendly"));
			
	  
		// 2. Manage Bike Listings Option
        int MainMenuOption = 0;
		int ManageBikeListingsOption = 0;
		
		while (MainMenuOption != 5) {
			BikeLoverCommunity.submenu();

			ManageBikeListingsOption = Helper.readInt("Enter an option > ");

			if (ManageBikeListingsOption == 1) {
				BikeLoverCommunity.viewAllBikeListing(bikeListingList);

			} else if (ManageBikeListingsOption == 2) {
				BikeListing bl = inputBikeListing();
				BikeLoverCommunity.addBikeListing(bikeListingList, bl);
				System.out.println("Bike Listing added!");

			} else if (ManageBikeListingsOption == 3) {
				BikeLoverCommunity.setHeader("UPDATE BIKE LISTINGS");
				BikeLoverCommunity.updateBikeListing(bikeListingList);

			} else if (ManageBikeListingsOption == 4) {
				BikeLoverCommunity.setHeader("DELETE BIKE LISTINGS");
				BikeLoverCommunity.deleteBikeListing(bikeListingList);
			} else if (ManageBikeListingsOption == 5) {
				System.out.println("Thank you for using Bike Lover Community app");
			} else {
				System.out.println("Invalid option");
			}
		}
}

	public static void submenu() {

		BikeLoverCommunity.setHeader("Manage Bike Listings");
		System.out.println("1. Display Bike Listings");
		System.out.println("2. Add Bike Listings");
		System.out.println("3. Update Bike Listings");
		System.out.println("4. Remove Bike Listings");
		System.out.println("5. Quit");

	}

	public static void setHeader(String header) {
		Helper.line(80, "-");
		System.out.println(header);
		Helper.line(80, "-");
	}

	public static String showAvailability(boolean isAvailable) {
		String avail;

		if (isAvailable == true) {
			avail = "Yes";
		} else {
			avail = "No";
		}
		return avail;
	}

	// ================================= Option 1 View (CRUD - Read)
	// =================================

	public static String retrieveAllBikeListing(ArrayList<BikeListing> bikeListingList) {
		String output = "";
		for (int i = 0; i < bikeListingList.size(); i++) {
			output += String.format("%-10s %-25s %-10s %-10s\n", bikeListingList.get(i).getId(),
					bikeListingList.get(i).getName(), bikeListingList.get(i).getPrice(),
					BikeLoverCommunity.showAvailability(bikeListingList.get(i).getIsAvailable()));

		}
		return output;

	}

	public static void viewAllBikeListing(ArrayList<BikeListing> bikeListingList) {
		BikeLoverCommunity.setHeader("BIKE LISTING");
		String output = String.format("%-10s %-25s %-10s %-10s\n", "ID", "BIKE NAME", "PRICE", "AVAILABILITY");
		output += retrieveAllBikeListing(bikeListingList);
		System.out.println(output);
	}

	// ================================= Option 2 Add an Bike Listing item (CRUD -
	// Create) =================================
	public static BikeListing inputBikeListing() {
		String id = Helper.readString("Enter id > ");
		String name = Helper.readString("Enter name > ");
		double price = Helper.readDouble("Enter price > $");
		boolean isAvailable = Helper.readBoolean("Enter Availability (yes/no) > ");

		BikeListing bl = new BikeListing(id, name, price, isAvailable);
		return bl;

	}

	public static void addBikeListing(ArrayList<BikeListing> bikeListingList, BikeListing bl) {
		bikeListingList.add(bl);
	}

	// ================================= Option 3 Update an Bike Listing item (CRUD
	// - Update) =================================

	public static boolean doUpdateBikelisting(ArrayList<BikeListing> bikeListingList, String id) {

		boolean isUpdated = false;

		for (int i = 0; i < bikeListingList.size(); i++) {

			if (id.equalsIgnoreCase(bikeListingList.get(i).getId())
					&& bikeListingList.get(i).getIsAvailable() == true) {

				bikeListingList.get(i).setIsAvailable(false);

				isUpdated = true;

			}

		}
		return isUpdated;
	}

	public static void updateBikeListing(ArrayList<BikeListing> bikeListingList) {
		BikeLoverCommunity.viewAllBikeListing(bikeListingList);
		String id = Helper.readString("Enter Bike ID > ");
		Boolean isUpdated = doUpdateBikelisting(bikeListingList, id);

		if (isUpdated == false) {
			System.out.println("Invalid Bike ID!");

		} else {
			System.out.println("BikeListing " + id + "is updated");
		}
	}

	// ================================= Option 4 Delete a Bike listing (CRUD -
	// Delete)=================================
	public static boolean doDeleteBikeListing(ArrayList<BikeListing> bikeListingList, String id) {
		boolean isDeleted = false;

		for (int i = 0; i < bikeListingList.size(); i++) {
			if (id.equalsIgnoreCase(bikeListingList.get(i).getId())
					&& bikeListingList.get(i).getIsAvailable() == true) {

				bikeListingList.get(i).setIsAvailable(false);

				isDeleted = true;
			}
		}
		return isDeleted;
	}

	public static void deleteBikeListing(ArrayList<BikeListing> bikeListingList) {
		BikeLoverCommunity.viewAllBikeListing(bikeListingList);
		String id = Helper.readString("Enter Bike ID > ");
		Boolean isDeleted = doDeleteBikeListing(bikeListingList, id);

		if (isDeleted == false) {
			System.out.println("Invalid Bike ID!");

		} else {
			System.out.println("BikeListing " + id + "is deleted");
		}
	}
}
