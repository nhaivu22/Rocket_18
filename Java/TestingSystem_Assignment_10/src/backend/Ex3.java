package backend;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import entity.JDBCutil;
import ultis.jdbcutil;

public class Ex3 {
	private jdbcutil jdbc;

	public Ex3() throws FileNotFoundException, IOException {
		jdbc = new jdbcutil();
	}
	public boolean DepartmentcheckId(int id) throws ClassNotFoundException, SQLException {
		String databaseURL = "jdbc:mysql://localhost:3306/TestingSystem_2?autoReconnect=true&useSSL=false&characterEncoding=latin1";
		String username = "root";
		String password = "root";
		JDBCutil jdbc = new JDBCutil();
		Connection con = jdbc.getConnecttion(databaseURL, username, password);
		String sql = "SELECT * FROM department WHERE DepartmentID =?";
		PreparedStatement preparedStatement = con.prepareStatement(sql);
		preparedStatement.setInt(1, id);
		ResultSet resultSet = preparedStatement.executeQuery();
		if (resultSet.next() == true) {
			
			return true;
		} else {
			
			return false;
		}
		

	}

	public void Question1(int id) throws ClassNotFoundException, SQLException {
		jdbc.getConnection();
		Connection connection=jdbc.getConnection();
		String sql="{call Pr_Delete_Department(?)}";
		CallableStatement call=connection.prepareCall(sql);
		call.setInt(1, id);
		int effectedRecordAmoutn=call.executeUpdate();
		System.out.println(effectedRecordAmoutn);

		
		
		
	}

}
