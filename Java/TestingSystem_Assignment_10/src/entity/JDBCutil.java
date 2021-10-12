package entity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCutil {
	private Connection con;
	public Connection getConnecttion(String databaseURL,String username,String password) throws SQLException, ClassNotFoundException {
		if(con==null|| con.isClosed()) {
			con=DriverManager.getConnection(databaseURL,username,password);
			
		}
		return con;
	
	}
	public void disconnect()throws SQLException{
		if(con!=null && !con.isClosed()) {
			con.close();
		}
	}

}
