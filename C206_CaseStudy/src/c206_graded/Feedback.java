package c206_graded;

public class Feedback extends Item {
	private String description;
	private boolean isAvailable;
	
	public Feedback(String id, String name, String description, boolean isAvailable) {
		super(id, name);
		this.description = description;
		this.isAvailable = isAvailable;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	
	

	
	

	


}