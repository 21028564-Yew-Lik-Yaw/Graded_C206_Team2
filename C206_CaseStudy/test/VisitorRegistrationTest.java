import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import c206_graded.BikeLoverCommunity;
import c206_graded.Visitor;
import c206_graded.VisitorRegistration;

public class VisitorRegistrationTest {
	private Visitor v1;
	private Visitor v2;
	private Visitor v3;
	private Visitor v4;

	private ArrayList<Visitor> visitorList;

	@Before
	public void setUp() throws Exception {
		v1 = new Visitor("V01", "Elon Musk", 85478633, "emusk123@gmail.com", true);
		v2 = new Visitor("V02", "Zhong Shan", 99701102, "shiso321@gmail.com", true);
		v3 = new Visitor("V03", "Mary Teo", 89685433, "maryt3o1@gmail.com", true);
		v4 = new Visitor("V04", "Minny Narghese", 88888888, "luckyminny@gmail.com", true);

		visitorList = new ArrayList<Visitor>();

	}

	public static void menuVisitor() {
		VisitorRegistration.setHeader("Bike Lover’s Community (BLC)");
		System.out.println("1. Display All Visitor Registrations");
		System.out.println("2. Add Visitor Registration");
		System.out.println("3. Remove Visitor Registration");
		System.out.println("4. Quit");

	}
	
    @Test
	public void testAddVisitor() {
		// Item list is not null, so that can add a new item - boundary
		assertNotNull("Test if there is valid Visitor arraylist to add to", visitorList);

		// Given an empty list, after adding 1 item, the size of the list is 1 - normal
		VisitorRegistration.addVisitorRegistration(visitorList, v1);
		assertEquals("Test if that Visitor arraylist size is 1?", 1, visitorList.size());

		// The item just added is as same as the first item of the list - normal
		assertSame("Test that Visitor is added same as 1st item of the list?", 1, visitorList.get(0));

		// Add another item. test The size of the list is 4?
		VisitorRegistration.addVisitorRegistration(visitorList, v2);
		VisitorRegistration.addVisitorRegistration(visitorList, v3);
		VisitorRegistration.addVisitorRegistration(visitorList, v4);

		assertEquals("Test that Visitor arraylist size is 4?", 4, visitorList.size());
		assertSame("Test that Visitor is added same as 4th item of the list?", v4, visitorList.get(3));

	}
    
    @Test
	public void testRetrieveAllVisitorRegistration() {
		// Test if Item list is not null but empty -boundary
		assertNotNull("Test if there is valid Visitor arraylist to retrieve item", visitorList);

		// test if the list of Visitor Registration retrieved from the BikeLoverCommunity is
		// empty -
		// boundary
		String allVisitorRegistration = VisitorRegistration.retrieveAllVisitorRegistration(visitorList);
		String testOutput = "";
		assertEquals("Check that RetrieveAllVisitorRegistration", testOutput, allVisitorRegistration);

		// Given an empty list, after adding 4 items, test if the size of the list is 4
		// - normal
		VisitorRegistration.addVisitorRegistration(visitorList, v1);
		VisitorRegistration.addVisitorRegistration(visitorList, v2);
		VisitorRegistration.addVisitorRegistration(visitorList, v3);
		VisitorRegistration.addVisitorRegistration(visitorList, v4);
		assertEquals("Test that Visitor arraylist size is 4", 4, visitorList.size());

		// test if the expected output string same as the list of Visitor Registration
		// retrieved
		// from the SourceCentre
		allVisitorRegistration = VisitorRegistration.retrieveAllVisitorRegistration(visitorList);
		testOutput = String.format("%-10s %-20s %-15s %-20s %-10s\n", "V01", "Elon Musk", 85478633, "emusk123@gmail.com", true);
		testOutput += String.format("%-10s %-20s %-15s %-20s %-10s\n", "V02", "Zhong Shan", 99701102, "shiso321@gmail.com", true);
		testOutput += String.format("%-10s %-20s %-15s %-20s %-10s\n", "V03", "Mary Teo", 89685433, "maryt3o1@gmail.com", true);
		testOutput += String.format("%-10s %-20s %-15s %-20s %-10s\n", "V04", "Dominic", 88888888, "luckydon669@gmail.com", true);

		assertEquals("Test that ViewAllVisitorRegistration", testOutput, allVisitorRegistration);

	}

	@Test
	public void testdoDeleteVisitorRegistration() {		
		// Item list is not null, so that can add a new item - boundary
		assertNotNull("Test if there is valid Visitor arraylist to add to", visitorList);

		// Given an empty list, after adding 1 item, the size of the list is 1 - normal
		VisitorRegistration.inputVisitorRegistration();
		VisitorRegistration.addVisitorRegistration(visitorList, v1);
		assertEquals("Test if that Visitor arraylist size is 1?", 1, visitorList.size());
		
		VisitorRegistration.deleteVisitorRegistration(visitorList);
		assertEquals("Test if that Visitor arraylist size is 0?", 0, visitorList.size());
		
	}

	@After
	public void tearDown() throws Exception {
		v1 = null;
		v2 = null;
		v3 = null;
		v4 = null;
		visitorList = null;
	}

}
