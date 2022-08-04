package c206_graded;

public class Feedback extends Item {
	private String description;

	
	public Feedback(String id, String name, String description) {
		super(id, name);
		this.description = description;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	/**
	 * @param string
	 */
	public void setStatus(String string) {
		
	}
	
	




}
