package model;

public class foodpackagedetail {
	
	private int foodpackageID;
	private int foodID;
	private int quantity;
	
	public foodpackagedetail() {
		super();
		// TODO Auto-generated constructor stub
	}

	public foodpackagedetail(int foodpackageID, int foodID, int quantity) {
		super();
		this.foodpackageID = foodpackageID;
		this.foodID = foodID;
		this.quantity = quantity;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getFoodpackageID() {
		return foodpackageID;
	}

	public void setFoodpackageID(int foodpackageID) {
		this.foodpackageID = foodpackageID;
	}

	public int getFoodID() {
		return foodID;
	}

	public void setFoodID(int foodID) {
		this.foodID = foodID;
	}
	
	

}
