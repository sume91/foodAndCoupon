package model;

public class food {
	
	private int foodID;
	private String categoryID;
	private String foodName;
	private int price;
	private int quantity;
	
	
	public food() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public food(int foodID, String categoryID, String foodName, int price, int quantity) {
		super();
		this.foodID = foodID;
		this.categoryID = categoryID;
		this.foodName = foodName;
		this.price = price;
		this.quantity = quantity;
	}



	public int getFoodID() {
		return foodID;
	}



	public void setFoodID(int foodID) {
		this.foodID = foodID;
	}



	public String getCategoryID() {
		return categoryID;
	}



	public void setCategoryID(String categoryID) {
		this.categoryID = categoryID;
	}



	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
		
	
		
	}


