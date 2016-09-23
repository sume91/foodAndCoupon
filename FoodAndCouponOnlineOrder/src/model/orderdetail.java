package model;

public class orderdetail {
	
	private int orderdetailID;
	private int orderID;
	private int foodID;
	private int foodpackagesetID;
	private int foodQty;
	private int foodpackagesetQty;
	public orderdetail() {
		super();
		// TODO Auto-generated constructor stub
	}
	public orderdetail(int orderdetailID, int orderID, int foodID, int foodpackagesetID, int foodQty,
			int foodpackagesetQty) {
		super();
		this.orderdetailID = orderdetailID;
		this.orderID = orderID;
		this.foodID = foodID;
		this.foodpackagesetID = foodpackagesetID;
		this.foodQty = foodQty;
		this.foodpackagesetQty = foodpackagesetQty;
	}
	public int getFoodQty() {
		return foodQty;
	}
	public void setFoodQty(int foodQty) {
		this.foodQty = foodQty;
	}
	public int getFoodpackagesetQty() {
		return foodpackagesetQty;
	}
	public void setFoodpackagesetQty(int foodpackagesetQty) {
		this.foodpackagesetQty = foodpackagesetQty;
	}
	public int getOrderID() {
		return orderID;
	}
	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}
	public int getFoodID() {
		return foodID;
	}
	public void setFoodID(int foodID) {
		this.foodID = foodID;
	}
	public int getFoodpackagesetID() {
		return foodpackagesetID;
	}
	public void setFoodpackagesetID(int foodpackagesetID) {
		this.foodpackagesetID = foodpackagesetID;
	}
	public int getOrderdetailID() {
		return orderdetailID;
	}
	public void setOrderdetailID(int orderdetailID) {
		this.orderdetailID = orderdetailID;
	}
	
	

}
