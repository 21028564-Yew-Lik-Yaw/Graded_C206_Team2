

import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import c206_graded.BikeListing;
import c206_graded.BikeLoverCommunity;

public class BikeListingTest {

	// Initialize variables

	private BikeListing bike1;
	private BikeListing bike2;
	private BikeListing bike3;
	private BikeListing bike4;
	private BikeListing bike5;
	ArrayList<BikeListing> bikeList = new ArrayList<BikeListing>();

	@Before
	public void setUp() throws Exception {

		// Sample data
		bike1 = new BikeListing("B001", "Trek Sport Bike", 199.00, true);
		bike1 = new BikeListing("B002", "Connondale Mountain Bike", 299.50, true);
		bike1 = new BikeListing("B003", "Kona Road Bike", 399.50, true);
		bike1 = new BikeListing("B004", "Colnago Sports Bike", 409.50, true);
		bike1 = new BikeListing("B005", "Bianch BMX", 500.50, true);
	}

	@Test
	public void testCreateBike() {
		// Item list is not null, so that we can add a new item
		assertNotNull("Test if there is a valid Bike arraylist to add to", bikeList);

		// Adding 1 item, should increase the size of the list to 1
		BikeLoverCommunity.addBikeListing(bikeList, bike1);
		assertEquals("Test if that Bike arraylist size is 1?", 1, bikeList.size());

		// The item added is same as the first item of the list
		assertSame("Test that the Bike added is the same as the 1st item of the list?", bike1, bikeList.get(0));

		// Add another 4 items. test The size of the list is 5?
		// The last item added is the same as the last item of the list?
		BikeLoverCommunity.addBikeListing(bikeList, bike2);
		BikeLoverCommunity.addBikeListing(bikeList, bike3);
		BikeLoverCommunity.addBikeListing(bikeList, bike4);
		BikeLoverCommunity.addBikeListing(bikeList, bike5);
		assertEquals("Test that Bike arraylist size is 5?", 5, bikeList.size());
		assertSame("Test that the Bike last added is the same as 4th item of the list?", bike5, bikeList.get(4));
	}

	@Test
	public void testViewAllBikes() {
		// Item list is not null, so that we can add a new item
		assertNotNull("Test if there is a valid Bike arraylist to add to", bikeList);

		// Test if the list of Bike retrieved from the AppMain is empty
		assertEquals("Check that bikeList is empty at the start", 0, bikeList.size());

		// Given an empty list, after adding 5 items, test if the size of the list is 5
		BikeLoverCommunity.addBikeListing(bikeList, bike1);
		BikeLoverCommunity.addBikeListing(bikeList, bike2);
		BikeLoverCommunity.addBikeListing(bikeList, bike3);
		BikeLoverCommunity.addBikeListing(bikeList, bike4);
		BikeLoverCommunity.addBikeListing(bikeList, bike5);
		assertEquals("Test if that Bike arraylist size is 5?", 5, bikeList.size());
	}

	@Test
	public void testDeleteBike() {
		// Item list is not null, so that we can delete a new item
		assertNotNull("Test if there is a valid Bike arraylist to delete from", bikeList);

		// After adding 1 item, test if the size of the list is 1
		BikeLoverCommunity.addBikeListing(bikeList, bike1);
		assertEquals("Test if that Bike arraylist size is 1?", 1, bikeList.size());

		// Delete the item, and test if the size of the list is 0
		BikeLoverCommunity.deleteBikeListing(bikeList); // Requires user input (B001) in console
		assertEquals("Test if that Bike arraylist size is 0?", 0, bikeList.size());
	}

	@Test
	public void testUpdateBikeInformation() {

		assertNotNull("Test if the bike information has been updated from", bikeList.size());
	}

	@After
	public void tearDown() throws Exception {
		bike1 = null;
		bike2 = null;
		bike3 = null;
		bike4 = null;
		bike5 = null;

	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

	public BikeListing getBike1() {
		return bike1;
	}

	public void setBike1(BikeListing bike1) {
		this.bike1 = bike1;
	}

	public BikeListing getBike2() {
		return bike2;
	}

	public void setBike2(BikeListing bike2) {
		this.bike2 = bike2;
	}

	public BikeListing getBike3() {
		return bike3;
	}

	public void setBike3(BikeListing bike3) {
		this.bike3 = bike3;
	}

	public BikeListing getBike4() {
		return bike4;
	}

	public void setBike4(BikeListing bike4) {
		this.bike4 = bike4;
	}

	public BikeListing getBike5() {
		return bike5;
	}

	public void setBike5(BikeListing bike5) {
		this.bike5 = bike5;
	}

}
