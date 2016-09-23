package model;
import java.util.Date;

public class member_reward {
	
	private int member_rewardID;
	private int memberID;
	private int amount;
	private Date date;
	public member_reward() {
		super();
		// TODO Auto-generated constructor stub
	}
	public member_reward(int member_rewardID, int memberID, int amount, Date date) {
		super();
		this.member_rewardID = member_rewardID;
		this.memberID = memberID;
		this.amount = amount;
		this.date = date;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getMember_rewardID() {
		return member_rewardID;
	}
	public void setMember_rewardID(int member_rewardID) {
		this.member_rewardID = member_rewardID;
	}
	public int getMemberID() {
		return memberID;
	}
	public void setMemberID(int memberID) {
		this.memberID = memberID;
	}
	
	
	

}
