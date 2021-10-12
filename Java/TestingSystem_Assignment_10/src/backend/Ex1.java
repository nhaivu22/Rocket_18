package backend;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


import entity.JDBCutil;
import ultis.ScannerUltis;



public class Ex1 {
	public void Question2() throws ClassNotFoundException, SQLException {
		String databaseURL="jdbc:mysql://localhost:3306/TestingSystem_2?autoReconnect=true&useSSL=false&characterEncoding=latin1";
		String username="root";
		String password="root";
		JDBCutil jdbc= new JDBCutil();
		Connection con=jdbc.getConnecttion(databaseURL, username, password);
		String sql="SELECT PositionID,PositionName FROM `position`";
		Statement statement=con.createStatement();
		
		ResultSet resultSet=statement.executeQuery(sql);
		while (resultSet.next()) {
			System.out.println(resultSet.getInt("PositionID"));
			System.out.println(resultSet.getString("PositionName")+"\n");
			
		}
		con.close();
	}
	
	public void Question3() throws ClassNotFoundException, SQLException {
		String databaseURL="jdbc:mysql://localhost:3306/TestingSystem_2?autoReconnect=true&useSSL=false&characterEncoding=latin1";
		String username="root";
		String password="root";
		JDBCutil jdbc= new JDBCutil();
		Connection con=jdbc.getConnecttion(databaseURL, username, password);
		String sql1="INSERT INTO `Position`(PositionName) VALUES (?)";
		PreparedStatement preparedStatement=con.prepareStatement(sql1);
		System.out.println("Nhập PositionName 1-Dev, 2-Test, 3-Scrum Master, 4-PM ");
		ScannerUltis sc=new ScannerUltis();

		int chon=sc.inputInt();
		switch (chon) {
		case 1:
			preparedStatement.setString(1, "Dev");
			break;
		case 2:
			preparedStatement.setString(1, "Test");
			break;
		case 3:
			preparedStatement.setString(1, "Scrum Master");
			break;
		case 4:
			preparedStatement.setString(1, "PM");
			break;

		default:
		System.out.println("Điền đúng số trên menu");
		}
		int effectedRecordAmoutn=preparedStatement.executeUpdate();
		System.out.println(effectedRecordAmoutn);
		
	}
	public void Question4() throws ClassNotFoundException, SQLException {
		String databaseURL="jdbc:mysql://localhost:3306/TestingSystem_2?autoReconnect=true&useSSL=false&characterEncoding=latin1";
		String username="root";
		String password="root";
		JDBCutil jdbc= new JDBCutil();
		Connection con=jdbc.getConnecttion(databaseURL, username, password);
		
		String sql4="UPDATE `Position`"
				+ "SET PositionName='Dev'"
				+ "WHERE PositionID=5";
		PreparedStatement preparedStatement=con.prepareStatement(sql4);
		int effectedRecordAmoutn=preparedStatement.executeUpdate();
		System.out.println(effectedRecordAmoutn);
		con.close();
		
	}
	public void delete() throws ClassNotFoundException, SQLException {
		String databaseURL="jdbc:mysql://localhost:3306/TestingSystem_2?autoReconnect=true&useSSL=false&characterEncoding=latin1";
		String username="root";
		String password="root";
		JDBCutil jdbc= new JDBCutil();
		Connection con=jdbc.getConnecttion(databaseURL, username, password);
		
		String sql5="DELETE FROM `Position` WHERE PositionID=8";
				
		PreparedStatement preparedStatement=con.prepareStatement(sql5);
		int effectedRecordAmoutn=preparedStatement.executeUpdate();
		System.out.println(effectedRecordAmoutn);
		con.close();
		
	}
	public void Question5() throws ClassNotFoundException, SQLException {
		String databaseURL="jdbc:mysql://localhost:3306/TestingSystem_2?autoReconnect=true&useSSL=false&characterEncoding=latin1";
		String username="root";
		String password="root";
		JDBCutil jdbc= new JDBCutil();
		Connection con=jdbc.getConnecttion(databaseURL, username, password);
		
		String sql6="INSERT INTO `Position`(PositionID,PositionName) VALUES (?,?)";
		PreparedStatement preparedStatement=con.prepareStatement(sql6);
		ScannerUltis sc=new ScannerUltis();
		
		System.out.println("Nhập PositionID ");
		int id=sc.inputInt();
		preparedStatement.setInt(1, id);
		System.out.println("Nhập PositionName 1-Dev, 2-Test, 3-Scrum Master, 4-PM ");
		int chon=sc.inputInt();
		switch (chon) {
		case 1:
			preparedStatement.setString(2, "Dev");
			break;
		case 2:
			preparedStatement.setString(2, "Test");
			break;
		case 3:
			preparedStatement.setString(2, "Scrum Master");
			break;
		case 4:
			preparedStatement.setString(2, "PM");
			break;

		default:
		System.out.println("Điền đúng số trên menu");
	
		}
		int effectedRecordAmoutn=preparedStatement.executeUpdate();
		System.out.println(effectedRecordAmoutn);
		con.close();
	}
	

}
