package ultis;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;



public class jdbcutil {
	public Connection connection;
	
	public  Connection getConnection() throws ClassNotFoundException, SQLException {
		if(connection==null|| connection.isClosed()) {
			String databaseURL="jdbc:mysql://localhost:3306/TestingSystem_2?autoReconnect=true&useSSL=false&characterEncoding=latin1";
			String username="root";
			String password="root";
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection= DriverManager.getConnection(databaseURL, username, password);
			

		}			
		return connection;
	}
	public void disconnect()throws SQLException{
		if(connection!=null && !connection.isClosed()) {
			connection.close();
		}
	}
	
}
