package fontend;

import java.time.LocalDate;

import entity.Account;
import entity.Department;
import entity.Group;
import entity.Position;
import entity.Position.PositionName;

public class FlowControl {
	public static void main(String[] args) {
		
		Department department1= new Department();
		department1.id=1;
		department1.name="Sale";
		
		Department department2= new Department();
		department2.id=2;
		department2.name="Marketting";
		
		Department department3= new Department();
		department3.id=3;
		department3.name="Nhân sự";
		
		Department department4= new Department();
		department4.id=4;
		department4.name="Bảo vệ ";
		
		Department department5= new Department();
		department5.id=5;
		department5.name="Kinh doanh ";
		
		
		
		Position position1= new Position();
		position1.id=1;
		position1.positionName=PositionName.DEV;
		
		
		Position position2= new Position();
		position2.id=2;
		position2.positionName=PositionName.PM;
		
		Position position3= new Position();
		position3.id=3;
		position3.positionName=PositionName.TEST;
		
		Position position4= new Position();
		position4.id=4;
		position4.positionName=PositionName.SCRCRUMMASTER;
		
		
		Position position5= new Position();
		position5.id=5;
		position5.positionName=PositionName.DEV;
		
		
		
		Group group1=new Group();
		group1.id=1;
		group1.name="nhóm 1";
		group1.createDate= LocalDate.of(2021,05,05);
		
		
		Group group2=new Group();
		group2.id=2;
		group2.name="nhóm 2";
		group2.createDate= LocalDate.of(2020,07,1);
		
		
		Group group3=new Group();
		group3.id=3;
		group3.name="nhóm 3";
		group3.createDate= LocalDate.of(2019,04,03);
		
		
		
		
		
		Account account1=new Account();
		account1.id=1;
		account1.email = "nhai1@gmail.com";
		account1.position = position1;
		account1.department = department1;
		account1.userName = "Nhai";
		account1.fullName = "Vũ Thị Nhài";
		account1.createDate=LocalDate.now();
		account1.groups=new Group[] { group1, group2 };
		
		Account account2 = new Account();
		account2.id = 2;
		account2.email = "honghoa@gmail.com";
		account2.position = position2;
		account2.department = department2;
		account2.userName = "Hồng";
		account2.fullName = "Vũ Thị Hồng";
		account2.groups = new Group[] { group2, group3 };
		account2.createDate = LocalDate.now();
		
		
		Account account3 = new Account();
		account3.id = 3;
		account3.email = "hue@gmail.com";
		account3.position = position3;
		account3.department = department3;
		account3.userName = "Huệ Huệ ";
		account3.fullName = "Đào Phương huệ ";
		account3.groups = new Group[] { group1, group2,group3 };
		account3.createDate = LocalDate.now();
		
		
		Account account4 = new Account();
		account4.id = 4;
		account4.email = "trang@gmail.com";
		account4.position = position4;
		account4.department = department4;
		account4.userName = "Thùy Trang ";
		account4.fullName = "Vũ Thùy Trang";
		account4.groups = new Group[] { group1, group2 };
		account4.createDate = LocalDate.now();
		
		Account account5 = new Account();
		account5.id = 5;
		account5.email = "loan@gmail.com";
		account5.position = position5;
		account5.department = department5;
		account5.userName = "Đỗ Loan ";
		account5.fullName = "Đỗ Ngọc Loan";
		account5.groups = new Group[] { group2, group3 };
		account5.createDate = LocalDate.now();
		
		Account account[]= {account1,account2,account3,account4,account5};
		Department departments[]= {department1,department2,department3,department4,department5};

		
		
		
//		-----------IF-----//
		
//		Question 1
		
//		if(account2.department==null) {
//			System.out.println("Nhân viên này chưa có phòng ban ");
//			
//		}else {
//			System.out.println("phòng ban của nhân viên này là: "+account2.department.name);
//		}
		
		
		
//		Question 2:
		
//		if(account2.groups==null) {
//			System.out.println("nhân viên này chưa có group");
//		}else if(account2.groups.length==1) {
//			System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
//		}else if(account2.groups.length==2) {
//			System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
//
//		}else if(account2.groups.length==3) {
//			System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
//		}else {
//			System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
//		}
		
		
		
//		Question 3
		
		
//		System.out.println(account2.department==null?"nhân viên chưa có phòng ban ": "Phòng ban của nhân viên là: "+account2.department.name);
		
//		--Question 4:
//		System.out.println(account1.position.positionName==PositionName.DEV?"Đây là Developer": "Người này không phải là Developer");
		
		
		
//------------SWITCH CASE -------------		//
		
		
//		-------Question 5
//		group1.accounts=new Account[] {account1,account2,account3};
//		
//		switch (group1.accounts.length) {
//		case 1:
//			System.out.println("Nhóm có một thành viên");
//			break;
//		case 2:
//			System.out.println( "Nhóm có hai thành viên");
//		case 3:
//			System.out.println("Nhóm có ba thành viên");
//			break;
//		default:
//			System.out.println("Nhóm có nhiều thành viên");
//		}
		
//		Question 6----- Question 2
		
//		switch (account2.groups.length) {
//		case 0:
//			System.out.println("Nhân viên này chưa có group");
//			break;
//		case 1:
//			System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
//			break;
//		case 2:
//			System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
//			break;
//		case 3:
//			System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
//			break;
//		default:
//			System.out.println( "Nhân viên này là người hóng chuyện, tham gia tất cả các group");
//		break;
//		}
		
		
		
//		Question 7: -Question 4

//		 switch (account1.position.positionName) {
//		case DEV:
//			System.out.println("Đây là Developer");
//			break;
//		default:
//			System.out.println("Người này không phải là Developer");
//			break;
//		}
//		
		
//	-----------FOREACH------------//
		
//		Question 8:
//		Account accounts[]= {account1,account2,account3,account4,account5};
//		System.out.println("Thông tin của Account là: "+"\n");
//		for (Account account : accounts) {
//			 System.out.println("Email: "+account.email);
//			 System.out.println("Fullname: "+account.fullName);
//			 System.out.println("Tên Phòng ban: "+account.department.name+"\n");
//		}
			 
//		 Question 9: 
			 
//		Department departments[]= {department1,department2,department3,department4,department5};
//		System.out.println("Thông tin của các Department là :  "+"\n");
//		for (Department department : departments) {
//			System.out.println("ID: "+department.id);
//			System.out.println("Name: "+ department.name+"\n");
//		}
		
//------------	FOR--------------
//		Question 10
		
//		 Account accounts[]= {account1,account2,account3,account4,account5};
//		 for (int i = 0; i < accounts.length; i++) {
//			System.out.println("Thông tin của Account thứ :"+(i+1));
//			System.out.println("Email: "+accounts[i].email);
//			 System.out.println("Fullname: "+accounts[i].fullName);
//			 System.out.println("Tên Phòng ban: "+accounts[i].department.name+"\n");
//		}
		
		 Account accounts[]= {account1,account2,account3,account4,account5};
		 for (int i = 0; i < accounts.length; i++) {
			System.out.println("Thông tin của Account thứ :"+(i+1));
			System.out.println("Email: "+accounts[i].email);
			 System.out.println("Fullname: "+accounts[i].fullName);
			 System.out.println("Tên Phòng ban: "+accounts[i].department.name); 
			 System.out.println("Group: "+accounts[i].groups[0].name+" ,"+accounts[i].groups[1].name+accounts[i].groups[2].name);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Question 11:
		
//		Department departments[]= {department1,department2,department3,department4,department5};
//		for (int i = 0; i < departments.length; i++) {
//			System.out.println("Thông tin của Department thứ :  "+(i+1));
//			System.out.println("Id: "+departments[i].id);
//			System.out.println("Name: "+departments[i].name+"\n");
//		}
		
//		Question 12:
//		Department departments[]= {department1,department2,department3,department4,department5};
//		int i=departments.length;
//		for ( i = 0; i < 2; i++) {
//			System.out.println("Thông tin của Department thứ :  "+(i+1));
//			System.out.println("Id: "+departments[i].id);
//			System.out.println("Name: "+departments[i].name+"\n");
//		}
		
//		Question 13
//		 Account accounts[]= {account1,account2,account3,account4,account5};
//		 int i=accounts.length;
//		 for (i = 0; i< 5; i++) {
//			 if((i != 1)) {
//				 System.out.println("thông tin của account thứ "+(i+1));
//					System.out.println("ID: " +accounts[i].id);
//					System.out.println("Email: "+accounts[i].email);
//					System.out.println("fullName: "+accounts[i].fullName);
//					System.out.println("useName: "+accounts[i].userName+"\n");
//				 
//			 }
//			
//			
//		}

//		Question 14
//		 Account accounts[]= {account1,account2,account3,account4,account5};
//		 int i=accounts.length;
//		 for (i = 0;  i< 3; i++) {
//			 System.out.println("thông tin của account thứ "+(i+1));
//				System.out.println("ID: " +accounts[i].id);
//				System.out.println("Email: "+accounts[i].email);
//				System.out.println("fullName: "+accounts[i].fullName);
//				System.out.println("useName: "+accounts[i].userName+"\n"); 
//			
//		}
//		Question 15: 
//		for (int i = 0; i <=20; i=i+2) {
//			System.out.println(i);
//			
//		}

//	-----------	WHILE------------
		
//		Question 16--Question 10--
//		Account account[]= {account1,account2,account3,account4,account5};
//		int i=0;
//		System.out.println("Thông tin của các Account: "+"\n");
//		while (i<account.length) {
//			System.out.println("ID: " +account[i].id);
//			System.out.println("Email: "+account[i].email);
//			System.out.println("fullName: "+account[i].fullName);
//			System.out.println("useName: "+account[i].userName+"\n");
//			i++;
//		}
		
		
//		Question 16--Question 11--
//		Department departments[]= {department1,department2,department3,department4,department5};
//		int i=0;
//		System.out.println("Thông tin của các Department: "+"\n" );
//		while (i<departments.length) {
//			System.out.println("Thông tin của Department thứ :  "+(i+1));
//			System.out.println("Id: "+departments[i].id);
//			System.out.println("Name: "+departments[i].name+"\n");
//			i++;
//		}
		
//		Question 16--Question 12--
//		Department departments[]= {department1,department2,department3,department4,department5};
//		int i=0;
//		while (i<2) {
//			System.out.println("Thông tin của Department thứ :  "+(i+1));
//			System.out.println("Id: "+departments[i].id);
//			System.out.println("Name: "+departments[i].name+"\n");
//			i++;
//			
//		}

//		Question 16--Question 13--
//		int i=0;
//		while (i<departments.length) {
//			if(i!=1) {
//				System.out.println("Thông tin của Department thứ :  "+(i+1));
//				System.out.println("Id: "+departments[i].id);
//				System.out.println("Name: "+departments[i].name+"\n");
//				
//				
//			}i++;
//			
//		}
		
//		Question 16--Question 14--

//		int i=0;
//		System.out.println("Thong tin cua cac Account la: ");
//		while (i<3) {
//			System.out.println("Thong tin Account thu: "+(i+1));
//			System.out.println("ID: " +account[i].id);
//			System.out.println("Email: "+account[i].email);
//			System.out.println("fullName: "+account[i].fullName);
//			System.out.println("useName: "+account[i].userName+"\n");
//			i++;
//			
//			
//		}
		
//		Question 16--Question 15--
		
//		int i=0;
//		System.out.println("Cac so chan la: ");
//		while (i<=20) {
//			System.out.println(i);
//			i=i+2;
//		}

//	------------	DO-WHILE	-------------
//		Question 17-Question 10
//		int i=0;
//		do {
//			System.out.println("Thong tin Account thu: "+(i+1));
//			System.out.println("ID: " +account[i].id);
//			System.out.println("Email: "+account[i].email);
//			System.out.println("fullName: "+account[i].fullName);
//			System.out.println("useName: "+account[i].userName+"\n");
//			i++;
//			
//		} while (i<account.length);
//		
		
		

		
//		Question 17-Question 11

//		int i=0;
//		do {
//			System.out.println("Thông tin của Department thứ :  "+(i+1));
//			System.out.println("Id: "+departments[i].id);
//			System.out.println("Name: "+departments[i].name+"\n");
//			i++;
//		} while (i<departments.length);
//		
//		Question 17-Question 12
//		int i=0;
//		do {
//			System.out.println("Thông tin của Department thứ :  "+(i+1));
//			System.out.println("Id: "+departments[i].id);
//			System.out.println("Name: "+departments[i].name+"\n");
//			i++;
//		} while (i<2);

//		Question 17-Question 14
//		int i=0;
//		do {
//			System.out.println("Thong tin Account thu: "+(i+1));
//			System.out.println("ID: " +account[i].id);
//			System.out.println("Email: "+account[i].email);
//			System.out.println("fullName: "+account[i].fullName);
//			System.out.println("useName: "+account[i].userName+"\n");
//			i++;
//		} while (i<3);

		
//		Question 17-Question 15
//
//		int i=0;
//		 do {
//			System.out.println(i);
//			i=i+2;
//		} while (i<=20);
//		
//		
	}

}
