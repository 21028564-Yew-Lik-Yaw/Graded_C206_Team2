package c206_graded;

import java.time.LocalDate;

public class Appointment extends Item {
	private String date;

	public Appointment(String id, String name, String date) {
		super(id, name);
		this.date = date;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
	
	
	
	

	
	


	
	
}
