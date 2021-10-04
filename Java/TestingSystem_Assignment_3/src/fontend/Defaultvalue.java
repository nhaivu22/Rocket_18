package fontend;

import java.time.LocalDate;

import entity.Account;

public class Defaultvalue {
	public static void main(String[] args) {
		System.out.println("Tạo account gồm 5 phần tử");
		Account[] account=new Account[5];
		for (int i = 0; i < account.length; i++) {
			Account acc=new Account();
			acc.email = "Email " + i;
			acc.userName = "User name " + i;
			acc.fullName = "Full name " + i;
			acc.createDate = LocalDate.now();
			account[i] = acc;
			System.out.println(
					"Thông tin Account " + (i+1) + " Email: " + 
							account[i].email + " UserName: " + account[i].userName
					+ " FullName: " + 
					account[i].fullName + " CreateDate: " + account[i].createDate);
		}
//		 for (int i = 0; i < account.length; i++) {
//			 account[i]=new Account();
//			 account[i].id=i;
//			 account[i].fullName="fullName"+i;
//			 account[i].userName="userNAme"+i;
//			 account[i].createDate=LocalDate.now();
//	 
//		}for (Account accounts : account) {
//			System.out.println("Id: "+accounts.id+"||"+"fullName: "+accounts.fullName+"||"+"userNAme: "+accounts.userName+"||"+"createDate: "+accounts.createDate);
//			
//			
//		}
		
		
		
	}

}
