package backend;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import ultis.jdbcutil;

public class Ex4_Transaction {
	
	public static Connection getConnecttion() throws ClassNotFoundException, SQLException {
		String databaseURL = "jdbc:mysql://localhost:3306/TestingSystem_2?autoReconnect=true&useSSL=false&characterEncoding=latin1";
		String username = "root";
		String password = "root";
		Class.forName("com.mysql.cj.jdbc..Driver");
		return DriverManager.getConnection(databaseURL,username,password);
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection con=getConnecttion();
		con.setAutoCommit(false);
		try {
			deleteAccount(con);
			deleteDepartment(con);
			con.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			con.rollback();
			System.out.println("Transaction Rollback!");
		
		}
		con.setAutoCommit(true);
		con.close();
	}
	private static void deleteAccount(Connection con ) throws SQLException, ClassNotFoundException {
		
		String sql = "DELETE FROM `Account` WHERE DepartmentID=?";
	
		PreparedStatement preparedStatement = con.prepareStatement(sql);
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhập DepartmentID của Accoutn cần xóa ");
		int idAc=sc.nextInt();

		
		preparedStatement.setInt(1, idAc);

		
		int effectedRecordAmount = preparedStatement.executeUpdate();
		System.out.println("Effected Record Amount (Create Group): " + effectedRecordAmount);
	}

	private static void deleteDepartment(Connection con ) throws SQLException, ClassNotFoundException {
		
		String sql = "DELETE FROM Department WHERE DepartmentID=?";
					
		PreparedStatement preparedStatement = con.prepareStatement(sql);

		Scanner sc=new Scanner(System.in);
		System.out.println("Nhập departmentID cần xóa ");
		int id=sc.nextInt();

	
		preparedStatement.setInt(1, id);



		int effectedRecordAmount = preparedStatement.executeUpdate();

		System.out.println("Effected Record Amount (Create User): " + effectedRecordAmount);
	}


}
