package model;

public class foodpackageset {
	
	private int foodpackagesetID;
	private int foodpackageID;
	private int foodpackagename;
	private int price;
	public foodpackageset() {
		super();
		// TODO Auto-generated constructor stub
	}
	public foodpackageset(int foodpackagesetID, int foodpackageID, int foodpackagename, int price) {
		super();
		this.foodpackagesetID = foodpackagesetID;
		this.foodpackageID = foodpackageID;
		this.foodpackagename = foodpackagename;
		this.price = price;
	}
	public int getFoodpackagename() {
		return foodpackagename;
	}
	public void setFoodpackagename(int foodpackagename) {
		this.foodpackagename = foodpackagename;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getFoodpackagesetID() {
		return foodpackagesetID;
	}
	public void setFoodpackagesetID(int foodpackagesetID) {
		this.foodpackagesetID = foodpackagesetID;
	}
	public int getFoodpackageID() {
		return foodpackageID;
	}
	public void setFoodpackageID(int foodpackageID) {
		this.foodpackageID = foodpackageID;
	}
	
		

}
