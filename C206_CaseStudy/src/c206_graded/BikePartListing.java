package c206_graded;

public class BikePartListing extends Item {
	private String BikePartType;
	private double price;
	private boolean isAvailable;
	
	
	public BikePartListing(String id, String name, String bikePartType, double price, boolean isAvailable) {
		super(id, name);
		BikePartType = bikePartType;
		this.price = price;
		this.isAvailable = isAvailable;
	}


	public String getBikePartType() {
		return BikePartType;
	}


	public void setBikePartType(String bikePartType) {
		BikePartType = bikePartType;
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
