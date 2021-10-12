package fontend;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import backend.Ex3;

public class Demo_Ex3 {
	public static void main(String[] args) throws Exception {
		Ex3 e3=new Ex3();
		System.out.println(e3.DepartmentcheckId(5));
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhập id ");	
		int idCallProcedure=sc.nextInt();
		if(e3.DepartmentcheckId(idCallProcedure)==true) {
			e3.Question1(idCallProcedure);
		}else {
			throw new Exception(" Id không có trong hệ thống ");
		}
	}

}
