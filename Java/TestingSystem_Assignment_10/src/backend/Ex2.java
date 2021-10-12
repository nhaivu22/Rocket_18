package backend;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import entity.JDBCutil;
import ultis.ScannerUltis;
import ultis.jdbcutil;

public class Ex2 {
	public void Question1() throws ClassNotFoundException, SQLException {
		String databaseURL = "jdbc:mysql://localhost:3306/TestingSystem_2?autoReconnect=true&useSSL=false&characterEncoding=latin1";
		String username = "root";
		String password = "root";
		JDBCutil jdbc = new JDBCutil();
		Connection con = jdbc.getConnecttion(databaseURL, username, password);
		String sql = "SELECT * FROM department";
		Statement statement = con.createStatement();

		ResultSet resultSet = statement.executeQuery(sql);
		while (resultSet.next()) {
			System.out.println(resultSet.getInt("DepartmentID"));
			System.out.println(resultSet.getString("DepartmentName") + "\n");

		}
		con.close();
	}

	public Department getDepartment_ID() throws ClassNotFoundException, SQLException {
		String databaseURL = "jdbc:mysql://localhost:3306/TestingSystem_2?autoReconnect=true&useSSL=false&characterEncoding=latin1";
		String username = "root";
		String password = "root";
		JDBCutil jdbc = new JDBCutil();
		Connection con = jdbc.getConnecttion(databaseURL, username, password);
		String sql = "SELECT * FROM department WHERE DepartmentID =?";
		PreparedStatement preparedStatement = con.prepareStatement(sql);

		preparedStatement.setInt(1, 5);
		ResultSet resultSet = preparedStatement.executeQuery();
		if (resultSet.next() == true) {
			System.out.println(resultSet.getInt("DepartmentID"));
			System.out.println(resultSet.getString("DepartmentName") + "\n");

		} else {
			System.out.println("Khong có id=5");

		}
		con.close();
		return null;

	}

	public Department getDepartmentById() throws ClassNotFoundException, SQLException {
		String databaseURL = "jdbc:mysql://localhost:3306/TestingSystem_2?autoReconnect=true&useSSL=false&characterEncoding=latin1";
		String username = "root";
		String password = "root";
		JDBCutil jdbc = new JDBCutil();
		Connection con = jdbc.getConnecttion(databaseURL, username, password);
		String sql = "SELECT * FROM department WHERE DepartmentID =?";
		PreparedStatement preparedStatement = con.prepareStatement(sql);
		ScannerUltis sc = new ScannerUltis();
		System.out.println("Nhập id cần tìm kiếm ");
		int de_Id = sc.inputInt();
		preparedStatement.setInt(1, de_Id);
		ResultSet resultSet = preparedStatement.executeQuery();
		if (resultSet.next() == true) {
			System.out.println(resultSet.getInt("DepartmentID"));
			System.out.println(resultSet.getString("DepartmentName") + "\n");
		} else {
			System.out.println("Không có giá trị bạn nhập vào ");
		}
	

		con.close();
		return null;

	}

	public boolean DepartmentcheckName(String name) throws ClassNotFoundException, SQLException {
		String databaseURL = "jdbc:mysql://localhost:3306/TestingSystem_2?autoReconnect=true&useSSL=false&characterEncoding=latin1";
		String username = "root";
		String password = "root";
		JDBCutil jdbc = new JDBCutil();
		Connection con = jdbc.getConnecttion(databaseURL, username, password);
		String sql = "SELECT * FROM department WHERE DepartmentName =?";
		PreparedStatement preparedStatement = con.prepareStatement(sql);
		preparedStatement.setString(1, name);
		ResultSet resultSet = preparedStatement.executeQuery();
		if (resultSet.next() == true) {
			
			return true;
		} else {
			
			return false;
		}
		

	}

	public void createDepartment (String name) throws ClassNotFoundException, SQLException {
		Department de=new Department();
		
		String databaseURL = "jdbc:mysql://localhost:3306/TestingSystem_2?autoReconnect=true&useSSL=false&characterEncoding=latin1";
		String username = "root";
		String password = "root";
		JDBCutil jdbc = new JDBCutil();
		Connection con = jdbc.getConnecttion(databaseURL, username, password);
		String sql = "INSERT INTO Department(DepartmentName) VALUES	(?)";
		PreparedStatement preparedStatement = con.prepareStatement(sql);

		preparedStatement.setString(1, name);

		int effectedRecordAmoutn = preparedStatement.executeUpdate();
		System.out.println(effectedRecordAmoutn);

		

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
	public void updateDepartmentName() throws ClassNotFoundException, SQLException {
		String databaseURL = "jdbc:mysql://localhost:3306/TestingSystem_2?autoReconnect=true&useSSL=false&characterEncoding=latin1";
		String username = "root";
		String password = "root";
		JDBCutil jdbc = new JDBCutil();
		Connection con = jdbc.getConnecttion(databaseURL, username, password);
		String sql="SELECT * FROM Department";
		Statement statement=con.createStatement();
		
		ResultSet resultSet=statement.executeQuery(sql);
		System.out.println("Danh sách Department ");
		while (resultSet.next()) {
			System.out.println(resultSet.getInt("DepartmentID")+" "+resultSet.getString("DepartmentName"));

		}
		ScannerUltis sc = new ScannerUltis();
		
		String sql1=	"UPDATE Department SET DepartmentName= ? WHERE DepartmentID = ?";
		PreparedStatement preparedStatement=con.prepareStatement(sql1);
		System.out.println("Nhập thông tin bạn muốn update");
		System.out.println("Nhập id");
		int id=sc.inputInt();
		preparedStatement.setInt(2, id);
		System.out.println("Nhập name ");
		String name=sc.inputString();
		preparedStatement.setString(1, name);
		int effectedRecordAmoutn=preparedStatement.executeUpdate();
		System.out.println("Bản ghi dc upate "+effectedRecordAmoutn);
		
		con.close();
		}
	
	public void deleteDepartment() throws ClassNotFoundException, SQLException {
		String databaseURL = "jdbc:mysql://localhost:3306/TestingSystem_2?autoReconnect=true&useSSL=false&characterEncoding=latin1";
		String username = "root";
		String password = "root";
		JDBCutil jdbc = new JDBCutil();
		Connection con = jdbc.getConnecttion(databaseURL, username, password);
		String sql5="DELETE "
				+ "FROM Department"
				+ "WHERE DepartmentID=?;";
		
		PreparedStatement preparedStatement=con.prepareStatement(sql5);
		System.out.println("Nhập id cần xóa ");
		ScannerUltis sc = new ScannerUltis();
		int id=sc.inputInt();
		preparedStatement.setInt(1, id);
		int effectedRecordAmoutn=preparedStatement.executeUpdate();
		System.out.println("Số bản ghi dc xóa "+effectedRecordAmoutn);
		con.close();
	}


}
