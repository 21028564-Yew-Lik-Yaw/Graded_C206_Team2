package c206_graded;
/**
 * 
 */

import java.util.ArrayList;

public class BikeLoverCommunity {

	private static final int OPTION_DELETE = 4;
	private static final int OPTION_UPDATE = 3;
	private static final int OPTION_ADD = 2;
	private static final int OPTION_VIEW = 1;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1 ArrayList for visitor registration
		ArrayList<Visitor> visitorList = new ArrayList<Visitor>();

		// 2 ArrayList for bikeListing
		ArrayList<BikeListing> bikeListingList = new ArrayList<BikeListing>();

		// 3 ArrayList of bike part listing
		ArrayList<BikePartListing> bikePartListingList = new ArrayList<BikePartListing>();

		// 4 ArrayList for appointment
		ArrayList<Appointment> AppointmentList = new ArrayList<Appointment>();

		// 5 ArrayList for feedback
		ArrayList<Feedback> feedbackList = new ArrayList<Feedback>();

		// 1 Adding Visitor items
		visitorList.add(new Visitor("V01", "Elon Musk", 85478633, "emusk123@gmail.com", true));
		visitorList.add(new Visitor("V02", "Zhong Shan", 99701102, "shiso321@gmail.com", true));
		visitorList.add(new Visitor("V03", "Mary Teo", 89685433, "maryt3o1@gmail.com", true));
		visitorList.add(new Visitor("V04", "Minny Narghese", 88888888, "luckyminny@gmail.com", true));

		// 2 Adding BikeListing items
		bikeListingList.add(new BikeListing("B001", "Trek Sport Bike", 199.00, true));
		bikeListingList.add(new BikeListing("B002", "Connondale Mountain Bike", 299.50, true));
		bikeListingList.add(new BikeListing("B003", "Kona Road Bike", 399.50, true));
		bikeListingList.add(new BikeListing("B004", "Colnago Sports Bike", 409.50, true));
		bikeListingList.add(new BikeListing("B005", "Bianch BMX", 500.50, true));

		// 3 Adding BikePartListing items
		bikePartListingList.add(new BikePartListing("BP001", "Fixie", "Wheel", 250.80, true));
		bikePartListingList
				.add(new BikePartListing("BP002", "Nukeproof Horizon V2 Carbon Riser", "Handlebar", 45.90, true));
		bikePartListingList.add(new BikePartListing("BP003", "Shimano Deore M6100", "Brakes", 165.50, true));
		bikePartListingList.add(new BikePartListing("BP004", "Bontrager Arvada Elite", "Seats", 409.50, true));

		// 4 Adding Appointment items
		AppointmentList.add(new Appointment("21026413", "Evzzo", "10/02/2004"));
		AppointmentList.add(new Appointment("21026414", "John", "10/02/2004"));
		AppointmentList.add(new Appointment("21026415", "Mary", "10/02/2004"));
		AppointmentList.add(new Appointment("21026416", "Jack", "10/02/2004"));
		AppointmentList.add(new Appointment("21026417", "Leo", "10/02/2004"));

		// 5 Adding Feedback items
		feedbackList.add(new Feedback("B001", "Adam", "Very patient service staff", true));
		feedbackList.add(new Feedback("B002", "Bob", "Something was not returned back to me", true));
		feedbackList.add(new Feedback("B003", "Charlie", "Product not received", true));
		feedbackList.add(new Feedback("B004", "Daniel", "Colour was not up to expectations", true));
		feedbackList.add(new Feedback("B005", "Emma", "Website is user-friendly", true));

		int option = 0;
		while (option != 6) {
			BikeLoverCommunity.mainMenu();

			option = Helper.readInt("Enter option > ");

			if (option == 1) {

				int visitorOption = 0;
				while (visitorOption != 3) {
					BikeLoverCommunity.menuVisitor();
					visitorOption = Helper.readInt("Enter an option > ");

					if (visitorOption == 1) {
						BikeLoverCommunity.viewAllVisitorRegistration(visitorList);

					} else if (visitorOption == 2) {
						Visitor vl = inputVisitorRegistration();
						BikeLoverCommunity.addVisitorRegistration(visitorList, vl);
						System.out.println("Visitor registered!");

					} else if (visitorOption == 3) {
						BikeLoverCommunity.setHeader("DELETE VISITOR REGISTRATION");
						BikeLoverCommunity.deleteVisitorRegistration(visitorList);
						System.out.println("Visitor deleted!");

					} else {
						System.out.println("Invalid option");
					}

				}

			} else if (option == 2) {

				int bikeListingOption = 0;
				while (option != 4) {
					BikeLoverCommunity.menuBikeListing();
					bikeListingOption = Helper.readInt("Enter an option > ");

					if (bikeListingOption == 1) {
						BikeLoverCommunity.viewAllBikeListing(bikeListingList);

					} else if (bikeListingOption == 2) {
						BikeListing bl = inputBikeListing();
						BikeLoverCommunity.addBikeListing(bikeListingList, bl);
						System.out.println("Bike Listing added!");

					} else if (bikeListingOption == 3) {
						BikeLoverCommunity.setHeader("UPDATE BIKE LISTINGS");
						BikeLoverCommunity.updateBikeListing(bikeListingList);

					} else if (bikeListingOption == 4) {
						BikeLoverCommunity.setHeader("DELETE BIKE LISTINGS");
						BikeLoverCommunity.deleteBikeListing(bikeListingList);

					} else {
						System.out.println("Invalid option");
					}
				}
			} else if (option == 3) {
				int bikePartListingOption = 0;
				while (bikePartListingOption != OPTION_DELETE) {
					BikeLoverCommunity.menuBikePartListing();

					bikePartListingOption = Helper.readInt("Enter an option > ");

					if (bikePartListingOption == OPTION_VIEW) {
						BikeLoverCommunity.viewAllBikePartListing(bikePartListingList);

					} else if (bikePartListingOption == OPTION_ADD) {
						BikePartListing bpl = inputBikePartListing();
						BikeLoverCommunity.addBikePartListing(bikePartListingList, bpl);
						System.out.println("Bike Listing added!");

					} else if (bikePartListingOption == OPTION_UPDATE) {
						BikeLoverCommunity.setHeader("UPDATE BIKE LISTINGS");
						BikeLoverCommunity.updateBikePartListing(bikePartListingList);

					} else if (bikePartListingOption == OPTION_DELETE) {
						BikeLoverCommunity.setHeader("DELETE BIKE LISTINGS");
						BikeLoverCommunity.doDeleteBikePartListing(bikePartListingList,
								doDeleteBikePartListing(bikePartListingList));

					} else {
						System.out.println("Invalid option");
					}
				}

			} else if (option == 4) {
				int ManageAppointmentOption = -1;
				while (ManageAppointmentOption != 4) {
					Apptmenu();
					ManageAppointmentOption = Helper.readInt("Enter option: ");

					if (ManageAppointmentOption == 1) {

						Appointment appt = inputAppt();
						makeAppt(AppointmentList, appt);

					} else if (ManageAppointmentOption == 2) {
						viewAllAppt(AppointmentList);

					} else if (ManageAppointmentOption == 3) {
						String deleteId = ApptToDelete();
						deleteAppt(AppointmentList, deleteId);
					}
				}

			} else if (option == 5) {
				int feedbackOption = 0;

				while (feedbackOption != 4) {
					BikeLoverCommunity.feedbackMenu();

					feedbackOption = Helper.readInt("Enter an option > ");

					if (feedbackOption == 1) {
						BikeLoverCommunity.viewAllFeedback(feedbackList);

					} else if (feedbackOption == 2) {
						Feedback feedback1 = inputFeedback();
						BikeLoverCommunity.addFeedback(feedbackList, feedback1);
						System.out.println("Feedback added!");

					} else if (feedbackOption == 3) {
						BikeLoverCommunity.setHeader("UPDATE FEEDBACK");
						BikeLoverCommunity.updateFeedbackStatus(feedbackList);

					} else if (feedbackOption == 4) {
						BikeLoverCommunity.setHeader("DELETE FEEDBACK");
						BikeLoverCommunity.deleteFeedback(feedbackList);
					}
				}
			} else if (option == 6) {
				System.out.println("Thank you for using Bike Lover Community app");
				
			} else {
				System.out.println("Invalid option!");
			}
		}

	}

	public static void mainMenu() {
		BikeLoverCommunity.setHeader("Bike Lover's Community (BLC)");
		System.out.println("1. Visitor Registration");
		System.out.println("2. Bike Listing and Features");
		System.out.println("3. Bike Part Listng and Features");
		System.out.println("4. Book appointment");
		System.out.println("5. Feedback");
		System.out.println("6. Quit");

	}

	public static void setHeader(String header) {
		Helper.line(80, "-");
		System.out.println(header);
		Helper.line(80, "-");
	}

	public static void menuVisitor() {
		BikeLoverCommunity.setHeader("Bike Lover's Community (BLC)");
		System.out.println("1. Display All Visitor Registrations");
		System.out.println("2. Add Visitor Registration");
		System.out.println("3. Remove Visitor Registration");

	}

	public static void menuBikeListing() {

		BikeLoverCommunity.setHeader("Manage Bike Listings");
		System.out.println("1. Display Bike Listings");
		System.out.println("2. Add Bike Listings");
		System.out.println("3. Update Bike Listings");
		System.out.println("4. Remove Bike Listings");

	}

	public static void menuBikePartListing() {
		BikeLoverCommunity.setHeader("MENU FOR BIKE PART LISTING");
		System.out.println("1. Display Bike Part Listings");
		System.out.println("2. Add Bike Part Listings");
		System.out.println("3. Update Bike Part Listings");
		System.out.println("4. Remove Bike Part Listings");

	}

	public static void Apptmenu() {
		BikeLoverCommunity.setHeader("Appointment Menu");
		System.out.println("1. Make Appointment");
		System.out.println("2. View Appointments");
		System.out.println("3. Delete Appointments");

	}

	public static void feedbackMenu() {
		BikeLoverCommunity.setHeader("Manage Feedbacks");
		System.out.println("1. View Feedbacks");
		System.out.println("2. Create Feedbacks");
		System.out.println("3. Update Feedbacks");
		System.out.println("4. Delete Feedbacks");
	}
	
	public static String showVisitorAvailability(boolean isAvailable) {
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
		public static String retrieveAllVisitorRegistration(ArrayList<Visitor> visitorList) {
			String output = "";
			for (int i = 0; i < visitorList.size(); i++) {
				output += String.format("%-10s %-20s %-15s %-20s %-10s\n", visitorList.get(i).getId(),
						visitorList.get(i).getName(), visitorList.get(i).getHpno(), visitorList.get(i).getEmail(),
						BikeLoverCommunity.showVisitorAvailability(visitorList.get(i).isAvailable()));

			}
			return output;
		}

		public static void viewAllVisitorRegistration(ArrayList<Visitor> visitorList) {
			BikeLoverCommunity.setHeader("VISITOR REGISTRATION");
			String output = String.format("%-10s %-20s %-15s %-20s %-10s\n", "ID", "VISITOR NAME", "MOBILE NUMBER", "EMAIL",
					"AVAILABILITY");
			output += retrieveAllVisitorRegistration(visitorList);
			System.out.println(output);
		}

		// ================================= Option 2 Add an Visitor Registration item
		// (CRUD -
		// Create) =================================
		public static Visitor inputVisitorRegistration() {
			String id = Helper.readString("Enter id > ");
			String name = Helper.readString("Enter name > ");
			int hpno = Helper.readInt("Enter mobile number > " + "");
			String email = Helper.readString("Enter email > ");
			boolean isAvailable = Helper.readBoolean("Enter availability (Y/N) > ");

			Visitor vl = new Visitor(id, name, hpno, email, isAvailable);
			return vl;

		}

		public static void addVisitorRegistration(ArrayList<Visitor> visitorList, Visitor vl) {
			visitorList.add(vl);
		}

		// ================================= Option 3 Delete a Registered Visitor (CRUD
		// -Delete)=================================
		public static Visitor deleteVisitorRegistration(ArrayList<Visitor> visitorList) {
			BikeLoverCommunity.viewAllVisitorRegistration(visitorList);

			String id = Helper.readString("Enter Visitor ID to delete > ");
			Visitor v1 = null;
			Boolean isDeleted = false;

			for (int i = 0; i < visitorList.size(); i++) {
				if (visitorList.get(i).getId().equalsIgnoreCase(id)) {
					isDeleted = true;
					// doDeleteVisitorRegistration(visitorList, v1);
					visitorList.remove(i);
					break;
				}
			}

			if (isDeleted == false) {
				System.out.println("Invalid Visitor ID!");
			}
			return v1;
		}

		public static void doDeleteVisitorRegistration(ArrayList<Visitor> visitorList, Visitor v1) {
			visitorList.remove(v1);
		}
		
		public static String showBikeAvailability(boolean isAvailable) {
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
						BikeLoverCommunity.showBikeAvailability(bikeListingList.get(i).getIsAvailable()));

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

		// ================================= Option 4 Delete a Bike listing (CRUD - Delete)=================================
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
		
		public static String showAvailability(boolean isAvailable) {
			String avail;

			if (isAvailable == true) {
				avail = "Yes";
			} else {
				avail = "No";
			}
			return avail;
		}

	//================================= Option 1 View (CRUD - Read) =================================

		public static String retrieveAllBikePartListing(ArrayList<BikePartListing> bikePartListingList) {
			String output = "";
			for (int i = 0; i < bikePartListingList.size(); i++) {
				output += String.format("%-10s %-40s %-20s %-10.2f %-10s\n", bikePartListingList.get(i).getId(),
						bikePartListingList.get(i).getName(), bikePartListingList.get(i).getBikePartType(),
						bikePartListingList.get(i).getPrice(),
						BikeLoverCommunity.showAvailability(bikePartListingList.get(i).getIsAvailable()));

			}
			return output;

		}

		public static void viewAllBikePartListing(ArrayList<BikePartListing> bikePartListingList) {
			BikeLoverCommunity.setHeader("BIKE PART LISTING");
			String output = String.format("%-10s %-40s %-20s %-10s %-10s\n", "ID", "BIKE NAME", "BIKE PART TYPE", "PRICE",
					"AVAILABILITY");
			output += retrieveAllBikePartListing(bikePartListingList);
			System.out.println(output);
		}

	//================================= Option 2 Add an Bike Part Listing item (CRUD - Create) =================================
		public static BikePartListing inputBikePartListing() {
			String id = Helper.readString("Enter id > ");
			String name = Helper.readString("Enter name > ");
			String bikePartType = Helper.readString("Enter bike part type > ");
			double price = Helper.readDouble("Enter price > $");
			boolean isAvailable = Helper.readBoolean("Enter availability (Y/N) > ");

			BikePartListing bpl = new BikePartListing(id, name, bikePartType, price, isAvailable);
			return bpl;

		}

		public static void addBikePartListing(ArrayList<BikePartListing> bikePartListingList, BikePartListing bpl) {
			bikePartListingList.add(bpl);
		}

	//================================= Option 3 Update an Bike Part Listing item (CRUD - Update) =================================

		public static boolean doUpdateBikePartlisting(ArrayList<BikePartListing> bikePartListingList, String id) {

			boolean isUpdated = false;

			for (int i = 0; i < bikePartListingList.size(); i++) {

				if (id.equalsIgnoreCase(bikePartListingList.get(i).getId())
						&& bikePartListingList.get(i).getIsAvailable() == true) {
					bikePartListingList.get(i).setIsAvailable(false);
					isUpdated = true;

				}

			}
			return isUpdated;
		}

		public static void updateBikePartListing(ArrayList<BikePartListing> bikePartListingList) {
			BikeLoverCommunity.viewAllBikePartListing(bikePartListingList);
			String id = Helper.readString("Enter Bike ID > ");
			Boolean isUpdated = doUpdateBikePartlisting(bikePartListingList, id);

			if (isUpdated == false) {
				System.out.println("Invalid Bike Part ID!");

			} else {
				System.out.println("BikePartListing " + id + "is updated");
			}
		}

	//================================= Option 4 Delete a Bike Part listing (CRUD - Delete)=================================
		public static BikePartListing doDeleteBikePartListing(ArrayList<BikePartListing> bikePartListingList) {
			BikeLoverCommunity.viewAllBikePartListing(bikePartListingList);
			String idDelete = Helper.readString("Enter Bike ID > ");
			BikePartListing bpl = null;
			boolean isDeleted = false;
			for (BikePartListing bp : bikePartListingList) {
				if (bp.getId().equalsIgnoreCase(idDelete)) {
					bpl = bp;
					isDeleted = true;

				}
			}
			if (isDeleted == false) {
				System.out.println("Invalid Bike Part ID!");

			}
			return bpl;

		}

		public static void doDeleteBikePartListing(ArrayList<BikePartListing> bikePartListingList, BikePartListing bpl) {
			bikePartListingList.remove(bpl);
			System.out.println("BikePartListing deleted");

		}
		
		//=============================== Create Appointment ===============================//
		public static Appointment inputAppt() { // Get input for the appointment
			String id = Helper.readString("Enter id: ");
			String name = Helper.readString("Enter name: ");
			String date = Helper.readString("Enter date: ");

			Appointment appt = new Appointment(id, name, date);
			return appt;
		}

		private static void makeAppt(ArrayList<Appointment> AppointmentList, Appointment appt) {
			// TODO Auto-generated method stub
			boolean confirm = true;
			for (int i = 0; i < AppointmentList.size(); i++) {
				if (appt.getId().equalsIgnoreCase(AppointmentList.get(i).getId())) {
					confirm = false;
					break;
				}
			}
			if (confirm == true) {
				AppointmentList.add(new Appointment(appt.getId(), appt.getName(), appt.getDate()));
			} else if (confirm == false) {
				System.out.println("Name already registered/No name entered");
			}

		}

	//=============================== View Appointment ===============================//	
		private static void viewAllAppt(ArrayList<Appointment> AppointmentList) {
			// TODO Auto-generated method stub
			String output = String.format("%-15s %-15s %-15s\n", "ID", "NAME", "DATE");
			for (int i = 0; i < AppointmentList.size(); i++) {
				output += String.format("%-15s %-15s %-15s\n", AppointmentList.get(i).getId(),
						AppointmentList.get(i).getName(), AppointmentList.get(i).getDate());
			}
			System.out.println(output);
		}

	//=============================== Delete Appointment ===============================//
		public static String ApptToDelete() {
			String deleteId = Helper.readString("Enter your ID: ");
			return deleteId;

		}

		private static void deleteAppt(ArrayList<Appointment> AppointmentList, String deleteId) {
			for (int i = 0; i < AppointmentList.size(); i++) {
				if (deleteId.equals(AppointmentList.get(i).getId())) {
					AppointmentList.remove(i);
					break;
				}
			}
		
		}
		// Methods========================================================================================================================================

		// Create Feedback
		public static Feedback inputFeedback() {
			String id = Helper.readString("enter id: ");
			String name = Helper.readString("enter name: ");
			String description = Helper.readString("enter feedback desc: ");

			Feedback newFeedback = new Feedback(id, name, description, true);
			return newFeedback;
		}

		public static void addFeedback(ArrayList<Feedback> feedbackList, Feedback newFeedback) {
			feedbackList.add(newFeedback);
			System.out.println("feedback successfully added");
		}

		// View Feedback
		public static void viewAllFeedback(ArrayList<Feedback> feedbackList) {
			setHeader("feedback list:");
			String output = String.format("%-5s %-10s %-30s\n", "ID", "NAME", "FEEDBACK");

			for (int i = 0; i < feedbackList.size(); i++) {
				output += String.format("%-5s %-10s %-30s\n", feedbackList.get(i).getId(), feedbackList.get(i).getName(), feedbackList.get(i).getDescription());
			
			}	
			System.out.println(output);
		}


//				Update feedback 
		public static void updateFeedbackStatus(ArrayList<Feedback> feedbackList) {
			String id = Helper.readString("enter id to update: ");

			boolean noResult = true; //
			for (int i = 0; i < feedbackList.size(); i++) {
				if (feedbackList.get(i).getId().equals(id)) {
					noResult = false;
				}
			}

			if (noResult == false) { //
				char status = Helper.readChar("enter new status: ");

				for (int i = 0; i < feedbackList.size(); i++) {

					if (feedbackList.get(i).getId().equals(id)) {

						if (status == 's' || status == 'S') {
							feedbackList.get(i).isAvailable();
						} else {
							feedbackList.get(i).isAvailable();
						}
					}
				}
				System.out.println("feedback list updated");
			} else { //
				System.out.println("id entered was not found");
			}
		}

//				Delete Feedback 
		public static String showFeedbackAvailability(boolean isAvail) {
			String avail;

			if (isAvail == true) {
				avail = "yes";
			} else {
				avail = "no";
			}
			return avail;
		}

		public static void deleteFeedback(ArrayList<Feedback> feedbackList) {
			String id = Helper.readString("enter id to delete > ");
			for (int i = 0; i < feedbackList.size(); i++) {
				if (feedbackList.get(i).getId().equals(id)) {
					String deleted = Helper.readString("confirm delete feedback?: " + id + " > ");
					if (deleted.equalsIgnoreCase("yes")) {
						feedbackList.remove(i);
						System.out.println(id + " has been deleted.");
					} else {

						System.out.println(id + " cannot be deleted");
					}
				}
			}
		}

}
