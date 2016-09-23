package model;

public class order {
	
	private int orderID;
	private int memberID;
	private String remark;
	public order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public order(int orderID, int memberID, String remark) {
		super();
		this.orderID = orderID;
		this.memberID = memberID;
		this.remark = remark;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public int getOrderID() {
		return orderID;
	}
	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}
	public int getMemberID() {
		return memberID;
	}
	public void setMemberID(int memberID) {
		this.memberID = memberID;
	}
	
	

}
