package dao.foodorder;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import connection.connection;
import model.order;
import model.orderdetail;

public  class foodorderDataAccess implements foodorderDAO{
	
	private static Connection sqlconnection ;
	private static Statement statement;
	private static PreparedStatement preparestatement;
	private ResultSet rs;
	
	connection con = new connection();

	
	
	public static void main(String[] args) throws SQLException {
		
		
		orderdetail orderD = new orderdetail();
	
		orderD.setFoodID(1);
		orderD.setFoodpackagesetID(3);
		orderD.setOrderID('2');
		orderD.setFoodQty(33);
		orderD.setFoodpackagesetQty(52);
		
		foodorderDataAccess data = new foodorderDataAccess();
		
		data.insertOrderdetail(orderD);
		//data.deleteOrderdetail(orderD);
		
		System.out.println(data.insertOrderdetail(orderD));
		//System.out.println("done" + orderD.getFoodID() + orderD.getFoodpackagesetID());
	
	}
	
	
	@Override
	public int insertOrderdetail( orderdetail order_detail) throws SQLException{
		
			
		String sql = "INSERT INTO orderdetail(OrderID,FoodID,FoodPackageSetID,FoodQuantity,PackageQuantity)VALUES(?,?,?,?,?)";
	
		con.openConnection();
		
		preparestatement = con.getConnection().prepareStatement(sql);
		
	
		preparestatement.setInt(1, order_detail.getOrderID());
		preparestatement.setInt(2, order_detail.getFoodID());
		preparestatement.setInt(3, order_detail.getFoodpackagesetID());
		preparestatement.setInt(4, order_detail.getFoodQty());
		preparestatement.setInt(5, order_detail.getFoodpackagesetQty());
		
		int result = preparestatement.executeUpdate();
		con.closeConnection();
		return result;
	}
		
	@Override
	public int updateOrderdetail( orderdetail order_detail)throws SQLException{
		
		String sql = "UPDATE orderdetail SET OrderID = ?,FoodID = ?,FoodPackageSetID = ? ,FoodQuantity = ? ,PackageQuantity = ? WHERE OrderDetailID=?";
		con.openConnection();
		preparestatement = sqlconnection.prepareStatement(sql);
		preparestatement.setInt(1, order_detail.getOrderID());
		preparestatement.setInt(2, order_detail.getFoodID());
		preparestatement.setInt(3, order_detail.getFoodpackagesetID());
		preparestatement.setInt(4, order_detail.getFoodQty());
		preparestatement.setInt(5, order_detail.getFoodpackagesetQty());
		preparestatement.setInt(5, order_detail.getOrderdetailID());
		
		int result = preparestatement.executeUpdate();
		con.closeConnection();
		return result;
	}
	
	@Override
	public int deleteOrderdetail( orderdetail order_detail)throws SQLException{
		
		String sql = "DELETE from orderdetail WHERE OrderDetailID=?";
		con.openConnection();
		preparestatement = sqlconnection.prepareStatement(sql);
		
		preparestatement.setInt(1, order_detail.getOrderdetailID());
		
		int result = preparestatement.executeUpdate();
		con.closeConnection();
		return result;
		
	}
	
	@Override
	public order  getOrderByID( int orderID){
		
		return null;
	}
	
	@Override
	public orderdetail getOrderdetailByID( int orderdetailID){
		
		return null;
	}
		
	}


