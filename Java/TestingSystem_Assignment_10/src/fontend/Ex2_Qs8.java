package fontend;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import backend.AccountCRUD;

public class Ex2_Qs8 {
	 public static void main(String[] args) throws Exception {
		 AccountCRUD ac=new AccountCRUD();
		 Scanner sc=new Scanner(System.in);
//----------- Question1 lấy ra thông tin của bảng Account
//		 ac.Account();
		 
		 
//		 Question 2:lấy ra thông tin  của Account vs accountid=5
//		ac.Account_Id();
		 
		 
//		 Question 3:Nhập accountId lấy ra thông tin của account 
//		 ac.Account_Id(15);
		 
//		 Question 4:check userNameaccount có tồn tại hay k 
//		 System.out.println(ac.AccountUserName("Nhài"));
		 
//		 Question 5:check UserNameAccount có tồn tại hay k rồi insert  
//		 System.out.println("Nhập Username");
		 
//		 String userName1=sc.next();
//		 if(ac.AccountUserName(userName1)==true) {
//			 throw new Exception ("userName đã có trên hệ thống");
//		 }else {
//			 ac.checkNameAccount(userName1);
//		 }
		 
//		 Question 6 update Account
//		chek id có tồn tại hay k và kiểm tra id update có trùng vs id trong bảng hay k
//		 System.out.println(ac.AccountId(5));
//		 System.out.println("Nhập id muốn upDate");
//		 int id1=sc.nextInt();
//		 System.out.println("Nhập userName upDate");
//		 String name1=sc.next();
//		 if(ac.AccountId(id1)==true && ac.AccountUserName(name1)==false) {
//			 ac.updateNameAccount(name1, id1);
//		 }else {
//			 throw new Exception ("userName đã có trên hệ thống or id không có trên hệ thống");
//		 }
		 
		 
//		 Question 7 delete Account check id delete có trong bảng hay k rồi xóa
//		 
//		 System.out.println("Nhập id cần xóa ");
//		 int idDelete=sc.nextInt();
//		 if(ac.AccountId(idDelete)==true) {
//			 ac.deleteAccountId(idDelete);
//		 }else {
//			 throw new Exception("Id delete không có trong hệ thống");
//		 }
//		 
	}

}
