package dao.foodorder;

import java.sql.SQLException;

import model.order;
import model.orderdetail;


public interface foodorderDAO {

	
	public abstract order getOrderByID(int orderID)throws SQLException;
	
	public abstract orderdetail getOrderdetailByID(int orderdetailID)throws SQLException;
	
	public abstract int insertOrderdetail(orderdetail order_detail)throws SQLException;
	
	public abstract int updateOrderdetail(orderdetail order_detail)throws SQLException;
	
	public abstract int deleteOrderdetail(orderdetail order_detail)throws SQLException;
}
