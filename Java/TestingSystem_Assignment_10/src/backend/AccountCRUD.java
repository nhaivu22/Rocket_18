package backend;


import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import ultis.jdbcutil;
import java.io.FileNotFoundException;


public class AccountCRUD {
	private jdbcutil jdbc;
	public AccountCRUD() throws FileNotFoundException, IOException {
		jdbc = new jdbcutil();
		}
	public void Account() throws ClassNotFoundException, SQLException {
		jdbc.getConnection();
		System.out.println("kết nối thành công");
		Connection connection=jdbc.getConnection();
		String sql="SELECT * FROM `Account`";
		Statement statement=connection.createStatement();
		
		ResultSet resultSet=statement.executeQuery(sql);
		while (resultSet.next()) {
			System.out.println(resultSet.getInt("AccountID")+" "+resultSet.getString("Email")+" "+resultSet.getString("Username")+" "+resultSet.getString("FullName")+" "+resultSet.getInt("DepartmentID")+" "+resultSet.getInt("PositionID")+" "+resultSet.getDate("CreateDate")+"\n");
			
			
		}
		
		
		
	
		
	}
	
	public void Account_Id() throws ClassNotFoundException, SQLException  {
		jdbc.getConnection();
		System.out.println("Kết nối database thành công ");
		Connection connection=jdbc.getConnection();
		Statement st=connection.createStatement();
		String sql="SELECT *"
				+ "FROM `Account`"
				+ "WHERE AccountID=5";

		ResultSet resultSet=st.executeQuery(sql);
		while (resultSet.next()) {
			System.out.println(resultSet.getInt(1));
			System.out.println(resultSet.getString(2)+"\n");
			
		}
		connection.close();

	}
	
	
	public void Account_Id(int id) throws Exception {
		jdbc.getConnection();
		System.out.println("Kết nối database thành công ");
		Connection connection=jdbc.getConnection();
		Statement st=connection.createStatement();
		String sql="SELECT *"
				+ "FROM `Account`"
				+ "WHERE AccountID=?";
		PreparedStatement preparedStatement=connection.prepareStatement(sql);
		preparedStatement.setInt(1, id);
		ResultSet resultSet = preparedStatement.executeQuery();
		if(resultSet.next()==true) {
			System.out.println(resultSet.getInt(1));
			System.out.println(resultSet.getString(2)+"\n");
			
		}else {
			throw new Exception("Không có id = "+id);
		}
	}
	
	public boolean AccountUserName(String userName) throws ClassNotFoundException, SQLException {
		jdbc.getConnection();
		
		Connection connection=jdbc.getConnection();
		Statement st=connection.createStatement();
		String sql="SELECT *"
				+ "FROM `Account`"
				+ "WHERE Username=?";
		PreparedStatement preparedStatement=connection.prepareStatement(sql);
		preparedStatement.setString(1, userName);
		ResultSet resultSet = preparedStatement.executeQuery();
		if(resultSet.next()==true) {
			return true;
		}else {
			return false;
			
		}

	}
	public void checkNameAccount(String userName) throws ClassNotFoundException, SQLException {
		jdbc.getConnection();
		
		Connection connection=jdbc.getConnection();
		Statement st=connection.createStatement();
		Statement statement=connection.createStatement();
		String sql="INSERT INTO `Account`(	Username) VALUES (?)";
		PreparedStatement preparedStatement=connection.prepareStatement(sql);
		preparedStatement.setString(1, userName);
		int effectedRecordAmoutn = preparedStatement.executeUpdate();
		System.out.println(effectedRecordAmoutn+ " bản ghi được upa date "+" "+"với userName là  "+userName);
		connection.close();
	}
	public void updateNameAccount(String userName,int id) throws ClassNotFoundException, SQLException {
		jdbc.getConnection();
		
		Connection connection=jdbc.getConnection();
		Statement st=connection.createStatement();
		Statement statement=connection.createStatement();
		String sql="UPDATE `Account`"
				+ "SET Username=?"
				+ "WHERE AccountID=?";
		PreparedStatement preparedStatement=connection.prepareStatement(sql);
		preparedStatement.setString(1, userName);
		preparedStatement.setInt(2, id);
		int effectedRecordAmoutn = preparedStatement.executeUpdate();
		System.out.println(effectedRecordAmoutn+" "+"bản ghi dc up date vs Username= "+userName+" "+"Id= "+id);
		connection.close();
	}
	
	public boolean AccountId(int id) throws ClassNotFoundException, SQLException {
		jdbc.getConnection();
		
		Connection connection=jdbc.getConnection();
		Statement st=connection.createStatement();
		Statement statement=connection.createStatement();
		String sql ="SELECT *"
				+ "FROM `Account`"
				+ "WHERE AccountID=?";
		PreparedStatement preparedStatement=connection.prepareStatement(sql);
		preparedStatement.setInt(1, id);
		ResultSet resultSet = preparedStatement.executeQuery();
		if(resultSet.next()==true) {
			return true;
		}else {
		return false;
		}
		
	}
	
	public void deleteAccountId(int id) throws ClassNotFoundException, SQLException {
		jdbc.getConnection();
		Connection connection=jdbc.getConnection();
		Statement st=connection.createStatement();
		Statement statement=connection.createStatement();
		String sql="DELETE "
				+ "FROM `Account`"
				+ "WHERE AccountID=?";
		
		PreparedStatement preparedStatement=connection.prepareStatement(sql);
		preparedStatement.setInt(1, id);
		
		int effectedRecordAmoutn=preparedStatement.executeUpdate();
		System.out.println(effectedRecordAmoutn+ " bản ghi dc xóa "+"với Id= "+id);
		connection.close();
	}

}
