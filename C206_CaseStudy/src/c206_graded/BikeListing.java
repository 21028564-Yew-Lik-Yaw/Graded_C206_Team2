package c206_graded;

public class BikeListing {
	private String id;
	private String Name;
	private double price;
	private boolean isAvailable;

	public BikeListing(String id, String name, double price, boolean isAvailable) {
		this.id = id;
		Name = name;
		this.price = price;
		this.isAvailable = isAvailable;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return Name;
	}
	
	public void setName(String name) {
		Name = name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}

	public boolean getIsAvailable() {
		return isAvailable;
	}
	
	public void setIsAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	
	
	
	

}
