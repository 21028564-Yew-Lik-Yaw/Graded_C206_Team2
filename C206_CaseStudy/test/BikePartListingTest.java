

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import c206_graded.BikeLoverCommunity;
import c206_graded.BikePartListing;

public class BikePartListingTest {
	private BikePartListing bpl1;
	private BikePartListing bpl2;
	private BikePartListing bpl3;
	private BikePartListing bpl4;

	private ArrayList<BikePartListing> bikePartListingList;

	public BikePartListingTest() {
		super();
	}

	@Before
	public void setUp() throws Exception {
		bpl1 = new BikePartListing("BP001", "Fixie", "Wheel", 250.80, true);
		bpl2 = new BikePartListing("BP002", "Nukeproof Horizon V2 Carbon Riser", "Handlebar", 45.90, true);
		bpl3 = new BikePartListing("BP003", "Shimano Deore M6100", "Brakes", 165.50, true);
		bpl4 = new BikePartListing("BP004", "Bontrager Arvada Elite", "Seats", 409.50, true);

		bikePartListingList = new ArrayList<BikePartListing>();

	}
	
	@After
	public void tearDown() throws Exception {
		bpl1 = null;
		bpl2 = null;
		bpl3 = null;
		bpl4 = null;
		bikePartListingList = null;
	}

	public static void menuBikePartListing() {
		BikeLoverCommunity.setHeader("Bike Lover’s Community (BLC)");
		System.out.println("1. Display Bike Part Listings");
		System.out.println("2. Add Bike Part Listings");
		System.out.println("3. Update Bike Part Listings");
		System.out.println("4. Remove Bike Part Listings");
		System.out.println("5. Quit");

	}

	public void testAddBikePartListing() {
		// Item list is not null, so that can add a new item - boundary
		assertNotNull("Test if there is valid BikePartListing arraylist to add to", bikePartListingList);

		// Given an empty list, after adding 1 item, the size of the list is 1 - normal
		Bike_Lover_Community.addBikePartListing(bikePartListingList, bpl1);
		assertEquals("Test if that BikePartListing arraylist size is 1?", 1, bikePartListingList.size());

		// The item just added is as same as the first item of the list - normal
		assertSame("Test that BikePartListing is added same as 1st item of the list?", 1, bikePartListingList.get(0));

		// Add another item. test The size of the list is 2?
		Bike_Lover_Community.addBikePartListing(bikePartListingList, bpl2);
	

		assertEquals("Test that BikePartListing arraylist size is 2?", 2, bikePartListingList.size());
		assertSame("Test that BikePartListing is added?", bpl2, bikePartListingList.get(1));

	}

	public void testViewAllBikePartListing() {
		// Test if Item list is not null but empty -boundary
		assertNotNull("Test if there is valid BikePartListing arraylist to retrieve item", bikePartListingList);

		// test if the list of BikePartListing retrieved from the BikeLoverCommunity is
		// empty -
		// boundary
		String allBikePartListing = BikeLoverCommunity.retrieveAllBikePartListing(bikePartListingList);
		String testOutput = "";
		assertEquals("Check that ViewAllBikePartListingList", testOutput, allBikePartListing);

		// Given an empty list, after adding 4 items, test if the size of the list is 4
		// - normal
		BikeLoverCommunity.addBikePartListing(bikePartListingList, bpl1);
		BikeLoverCommunity.addBikePartListing(bikePartListingList, bpl2);
		BikeLoverCommunity.addBikePartListing(bikePartListingList, bpl3);
		BikeLoverCommunity.addBikePartListing(bikePartListingList, bpl4);

		assertEquals("Test that BikePartListing arraylist size is 4", 4, bikePartListingList.size());

		// test if the expected output string same as the list of BikePartListing
		// retrieved
		// from the SourceCentre
		allBikePartListing = Bike_Lover_Community.retrieveAllBikePartListing(bikePartListingList);
		testOutput = String.format("%-10s %-40s %-20s %-10.2f %-10s\n", "BP001", "Fixie", "Wheel", 250.80, true);
		testOutput = String.format("%-10s %-40s %-20s %-10.2f %-10s\n", "BP002", "Nukeproof Horizon V2 Carbon Riser",
				"Handlebar", 45.90, true);
		testOutput = String.format("%-10s %-40s %-20s %-10.2f %-10s\n", "BP003", "Shimano Deore M6100", "Brakes",
				165.50, true);
		testOutput += String.format("%-10s %-40s %-20s %-10.2f %-10s\n", "BP004", "Bontrager Arvada Elite", "Seats",
				409.50, true);

		assertEquals("Test that ViewAllbikePartListingList", testOutput, allBikePartListing);

	}

	@Test
	public void testDoUpdateBikePartListing() {
		// boundary
		assertNotNull("test if there is valid BikePartListing arraylist to loan from", bikePartListingList);

		BikeLoverCommunity.addBikePartListing(bikePartListingList, bpl1);
		// normal
		Boolean ok = BikeLoverCommunity.doUpdateBikePartlisting(bikePartListingList, "BP001");
		assertTrue("Test if an available item is ok to loan?", ok);
		// error condition
		ok = BikeLoverCommunity.doUpdateBikePartlisting(bikePartListingList, "BP001");
		assertFalse("Test if an same item is NOT ok to loan again?", ok);
		// error condition
		BikeLoverCommunity.addBikePartListing(bikePartListingList, bpl2);
		bpl2.setIsAvailable(false);
		ok = BikeLoverCommunity.doUpdateBikePartlisting(bikePartListingList, "BP002");
		assertFalse("Test that un-available item is NOT ok to loan?", ok);
		// error condition
		ok = BikeLoverCommunity.doUpdateBikePartlisting(bikePartListingList, "BP002");
		assertFalse("Test that non-esiting item is NOT ok to loan?", ok);

	}

	public void testDoDeleteBikePartListing() {
		// Given an empty list, after adding 2 items, test if the size of the list is 2.
		// After removing an item , then the size of the list become 1
		BikeLoverCommunity.addBikePartListing(bikePartListingList, bpl1);
		BikeLoverCommunity.addBikePartListing(bikePartListingList, bpl2);
		BikeLoverCommunity.doDeleteBikePartListing(bikePartListingList, bpl1);
		assertEquals("Test if that Appointment arraylist size is 1?", 2, bikePartListingList.size());
		

		// The item just added is as same as the first item of the list
		assertSame("Test that appointment is added same as the 1st appointment of the list?", bpl1,
				bikePartListingList.get(0));

		// Test if bike list is not null but empty, so that can add new item
		assertNotNull("test if there is valid Bike arraylist to delete to", bikePartListingList);

		// Delete the bikePartListingList , test the size of the list is 1
		BikeLoverCommunity.doDeleteBikePartListing(bikePartListingList);
		assertEquals("Test that appointment arrayList is 0?", 1, bikePartListingList.size());
		assertSame("Test that Appointment is added same as 3rd item of the list?", bpl2, bikePartListingList.get(0));

	}

	

}
