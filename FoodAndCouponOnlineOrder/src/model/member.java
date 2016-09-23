package model;

public class member {
	
	private int memberID;
	private String memberName;
	private String email;
	private String address;
	private int phone;
	public member() {
		super();
		// TODO Auto-generated constructor stub
	}
	public member(int memberID, String memberName, String email, String address, int phone) {
		super();
		this.memberID = memberID;
		this.memberName = memberName;
		this.email = email;
		this.address = address;
		this.phone = phone;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public int getMemberID() {
		return memberID;
	}
	public void setMemberID(int memberID) {
		this.memberID = memberID;
	}
	
	
	

}
