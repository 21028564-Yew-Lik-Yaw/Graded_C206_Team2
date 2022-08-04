

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import c206_graded.Appointment;

public class AppointmentTest {
	private Appointment appt1;
	private Appointment appt2;
	private Appointment appt3;
	private Appointment appt4;
	private Appointment appt5;
	ArrayList<Appointment> AppointmentList = new ArrayList<Appointment>();
	// Sample Data

	@BeforeEach
	public void setUp() throws Exception {
		appt1 = new Appointment("21026413", "Evzzo", "10/02/2004");
		appt2 = new Appointment("21026414", "John", "10/02/2004");
		appt3 = new Appointment("21026415", "Mary", "10/02/2004");
		appt4 = new Appointment("21026416", "Jack", "10/02/2004");
		appt5 = new Appointment("21026417", "Leo", "10/02/2004");
	}
	
	@Test 
	public void testAdd() {
		//ArrayList exists to add on to
		assertNotNull("Test if there is a valid appointment arraylist to add to", AppointmentList);
		
		//adding 1 appointment should only increase the size of the list by 1
		AppointmentList.add(appt1);
		assertEquals("Test if the AppointmentList size is 1 after adding an appointment to an empty AppointmentList", 1, AppointmentList.size());
	}
	


	@Test 
	public void testView() {

		//Test that the arraylist is empty before adding anything
		assertEquals("Test that the arraylist is empty at the start", 0, AppointmentList.size());
		
		//Test if the size of the list is 5 after adding 5 appointments
		AppointmentList.add(appt1);
		AppointmentList.add(appt2);
		AppointmentList.add(appt3);
		AppointmentList.add(appt4);
		AppointmentList.add(appt5);
		assertEquals("Test that the arraylist contains 5 appointments", 5, AppointmentList.size());
	}


	@Test 
	public void testDelete() {
		//Test that size of arraylist is 1 after adding 1 appointment
		AppointmentList.add(appt1);
		assertEquals("Test that adding 1 appointment results in 1 appointment in the ArrayList", 1, AppointmentList.size());
		
		//Test that size of arraylist is 0 after deleting 1 appointment
		AppointmentList.remove(0);
		assertEquals("Test that removing 1 appointment results in 0 appointments in the ArrayList", 0, AppointmentList.size());
	}
	
	


}
