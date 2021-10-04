package fontend;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

import entity.Account;
import entity.Department;
import entity.Group;
import entity.Position;
import entity.Position.PositionName;

public class Input_from_console {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		------Question 1: 
//		 System.out.print("Nhập số nguyên thứ nhất : ");
//		 int a=sc.nextInt();
//		 System.out.print("Nhập số nguyên thứ hai : ");
//		 int b=sc.nextInt();
//		 System.out.print("Nhập số nguyên thứ ba : ");
//		 int c=sc.nextInt();
//		 System.out.println("Ba số nguyên bạn vừa nhập là : "+a+" "+b+" "+c);

//		--------Question 2: 
//		System.out.print("Nhập số thực thứ nhất : ");
//		float a=sc.nextFloat();
//		System.out.print("Nhập số thực thứ hai : ");
//		float b=sc.nextFloat();
//		System.out.println("Hai số thực bạn vừa nhập là: "+a + " "+"và"+" "+ b);

//		---------Question 3
//		System.out.print("Nhập họ : ");
//		String a=sc.next();
//		System.out.print("Nhập tên : ");
//		String b=sc.next();
//		System.out.println("Họ tên bạn vừa nhập là: "+a+" "+b);

//		Question 4:
//		SimpleDateFormat df=new SimpleDateFormat("dd-MM-yyyy");
//		System.out.print("Nhap ngay thang nam sinh: ");
//		try {
//			Date date=df.parse(sc.nextLine());
//			System.out.println("Ngay thang nam sinh cua ban la: "+df.format(date));
//
//		} catch (ParseException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

//		--- Question 5 + Question 6 +Question 7 + Question 8 + Question9 + Question10+ Question11 
		Taoaccount();
	    TaoDepartment();
//		Nhapsochan();
		Menu();
		AddgroupinAccount();
		Question10();
		Question11();
		

	}

	private static void Question11() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
//		Group			//

		Group group1 = new Group();
		group1.id = 1;
		group1.name = "nhóm1";
		group1.createDate = LocalDate.of(2021, 05, 05);

		Group group2 = new Group();
		group2.id = 2;
		group2.name = "nhóm2";
		group2.createDate = LocalDate.of(2020, 07, 1);

		Group group3 = new Group();
		group3.id = 3;
		group3.name = "nhóm3";
		group3.createDate = LocalDate.of(2019, 04, 03);

////---------	Account------

		Account account1 = new Account();
		account1.id = 1;
		account1.email = "nhai1@gmail.com";
//		account1.position = position1;
//		account1.department = department1;
		account1.userName = "Nhai";
		account1.fullName = "Vũ Thị Nhài";
		account1.createDate = LocalDate.now();
		account1.groups = new Group[] { group1, group2 };

		Account account2 = new Account();
		account2.id = 2;
		account2.email = "honghoa@gmail.com";
//		account2.position = position2;
////		account2.department = department2;
		account2.userName = "Hồng";
		account2.fullName = "Vũ Thị Hồng";
		account2.groups = new Group[] { group2, group3 };
		account2.createDate = LocalDate.now();

		Account account3 = new Account();
		account3.id = 3;
		account3.email = "hue@gmail.com";
////		account3.position = position3;
////		account3.department = department3;
		account3.userName = "Huệ Huệ ";
		account3.fullName = "Đào Phương huệ ";
		account3.groups = new Group[] { group1, group2, group3 };
		account3.createDate = LocalDate.now();

		Account account4 = new Account();
		account4.id = 4;
		account4.email = "trang@gmail.com";
////		account4.position = position4;
////		account4.department = department4;
		account4.userName = "Thùy Trang ";
		account4.fullName = "Vũ Thùy Trang";
		account4.groups = new Group[] { group1, group2 };
		account4.createDate = LocalDate.now();

		Account account5 = new Account();
		account5.id = 5;
		account5.email = "loan@gmail.com";
////		account5.position = position5;
////		account5.department = department5;
		account5.userName = "Đỗ Loan ";
		account5.fullName = "Đỗ Ngọc Loan";
		account5.groups = new Group[] { group2, group3 };
		account5.createDate = LocalDate.now();
		System.out.println("Mời Bạn chọn chức năng 1-Taoaccount  2-TaoDepartment  3-AddgroupinAccount  4-Random_group");
		while (true) {
			int chondi=sc.nextInt();
			if(chondi==1||chondi==2||chondi==3) {
				Question10();
			}else if(chondi==4) {
				System.out.println("Thông tin UserName của Account là : ");
				Account acs[]= {account1,account2,account3,account4,account5};
				for (int i = 0; i < acs.length; i++) {
					System.out.println("Thông tin của Account thứ "+(i+1));
					System.out.println("UserName : "+acs[i].userName+"\n");
				}
				System.out.println("Nhập UsreName của Account cần thêm vào group ");
				String nameAc=sc.next();
				Random random=new Random();
				Group grs[]= {group1,group2,group3};
				int i=random.nextInt(grs.length);
				
			}
			
		}
	}

	private static void Question10() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Bổ sung Question 8");
		System.out.println("Mời bạn chọn chức năng 1-Taoaccount  2-TaoDepartment  3-AddgroupinAccount");
		
		while (true) {
			int chonso=sc.nextInt();
			if(chonso==1) {
				Taoaccount();
			}else if(chonso==2) {
				TaoDepartment();
			}else if(chonso==3) {
				AddgroupinAccount();
				System.out.println("Bạn có muốn thực hiện chức năng khác không 1-có  2-không");
				int chontiep=sc.nextInt();
				if(chontiep==2){
					System.out.println("Nhập lại");
					return;
				}else if(chontiep==1) {
					System.out.println("Mời bạn nhập lại số trên Menu 1-Taoaccount  2-TaoDepartment  3-AddgroupinAccount");
					continue;
					
				}
			}else {
				System.out.println("Mời Bạn nhập lại ");
			}
			
		
			
			
		}
	}

	private static void AddgroupinAccount() {
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
//		Group			//

		Group group1 = new Group();
		group1.id = 1;
		group1.name = "nhóm1";
		group1.createDate = LocalDate.of(2021, 05, 05);

		Group group2 = new Group();
		group2.id = 2;
		group2.name = "nhóm2";
		group2.createDate = LocalDate.of(2020, 07, 1);

		Group group3 = new Group();
		group3.id = 3;
		group3.name = "nhóm3";
		group3.createDate = LocalDate.of(2019, 04, 03);

////---------	Account------

		Account account1 = new Account();
		account1.id = 1;
		account1.email = "nhai1@gmail.com";
//		account1.position = position1;
//		account1.department = department1;
		account1.userName = "Nhai";
		account1.fullName = "Vũ Thị Nhài";
		account1.createDate = LocalDate.now();
		account1.groups = new Group[] { group1, group2 };

		Account account2 = new Account();
		account2.id = 2;
		account2.email = "honghoa@gmail.com";
//		account2.position = position2;
////		account2.department = department2;
		account2.userName = "Hồng";
		account2.fullName = "Vũ Thị Hồng";
		account2.groups = new Group[] { group2, group3 };
		account2.createDate = LocalDate.now();

		Account account3 = new Account();
		account3.id = 3;
		account3.email = "hue@gmail.com";
////		account3.position = position3;
////		account3.department = department3;
		account3.userName = "Huệ Huệ ";
		account3.fullName = "Đào Phương huệ ";
		account3.groups = new Group[] { group1, group2, group3 };
		account3.createDate = LocalDate.now();

		Account account4 = new Account();
		account4.id = 4;
		account4.email = "trang@gmail.com";
////		account4.position = position4;
////		account4.department = department4;
		account4.userName = "Thùy Trang ";
		account4.fullName = "Vũ Thùy Trang";
		account4.groups = new Group[] { group1, group2 };
		account4.createDate = LocalDate.now();

		Account account5 = new Account();
		account5.id = 5;
		account5.email = "loan@gmail.com";
////		account5.position = position5;
////		account5.department = department5;
		account5.userName = "Đỗ Loan ";
		account5.fullName = "Đỗ Ngọc Loan";
		account5.groups = new Group[] { group2, group3 };
		account5.createDate = LocalDate.now();
		
		
		Account acc[]= { account1,account2,account3,account4,account5};
		System.out.println("Những UseName có trên hệ thống là ");
		for (int i = 0; i < acc.length; i++) {
			System.out.println(" username thứ: "+(i+1));
			System.out.println(acc[i].userName+"\n");
		}
		System.out.print("Nhập vào username của Account: ");
		String nameAc=sc.next();
		Group gr[]= {group1,group2,group3};
		System.out.println("Những group có trên hệ thống là ");
		for (int j = 0; j < gr.length; j++) {
			System.out.println("Name Group thứ: "+(j+1));
			System.out.println(gr[j].name);
		}
		System.out.print("Nhập name của group cần thêm : ");
		String nameGr=sc.next();
		int indexGr=-1;
		for (int i = 0; i < gr.length; i++) {
			if(gr[i].name.equals(nameGr)) {
				indexGr=i;
			}
		}
		int indexAc=-1;
		for (int i = 0; i < acc.length; i++) {
			if(acc[i].userName.equals(nameAc)) {
				indexAc=i;
			}	
		}
		if(indexAc<0||indexGr<0) {
			 System.out.println("Kiểm tra lại thông tin");
		}else {
			 for (int j = 0; j < acc.length; j++) {
				 if(acc[j].userName.equals(nameAc)) {
					 Group[]gradd= {gr[indexGr]};
					 acc[j].groups=gradd;
					 System.out.println("bạn vừa add group: "+acc[indexAc].groups[0].name + " cho Account: " +  acc[indexAc].userName);
				 }
				
			}
		}
		

	}

	private static void Menu() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Mời bạn nhập Chức năng");
		
				while (true) {
					System.out.println("1-Tạo Account   2-Tạo Department");
					int chosse=sc.nextInt();
					if(chosse==1) {
						System.out.println("Nhập thông tin Account: ");
						Account account=new Account();
						System.out.println("Nhập ID: ");
						account.id=sc.nextInt();
						System.out.println("Nhập email: ");
						account.email=sc.next();
						System.out.println("Nhập Name: ");
						account.userName=sc.next();
						System.out.println("Nhập fullName: ");
						account.fullName=sc.next();
						System.out.println("Nhập position với số tương ứng  1.Dev, 2.Test, 3.Scrum_Master, 4.PM ");
						int pos=sc.nextInt();
						switch (pos) {
						case 1:
							Position ps1=new Position();
							ps1.positionName=PositionName.DEV;
							account.position=ps1;
							break;
						case 2:
							Position ps2=new Position();
							ps2.positionName=PositionName.TEST;
							account.position=ps2;
							break;
						case 3:
							Position ps3=new Position();
							ps3.positionName=PositionName.SCRCRUMMASTER;
							account.position=ps3;
							break;
				
						default:
							Position ps4=new Position();
							ps4.positionName=PositionName.PM;
							account.position=ps4;
							break;
							
						}
						System.out.println("Thông tin vừa nhập là : "+"\n "+"ID: "+account.id+" \n"+"name: "+account.userName+"\n "+"Fullname: "+account.fullName+"\n "+"Email: "+account.email+"\n "+"Position: "+account.position.positionName);
				
				
				
						}else if(chosse==2) {
							Department department=new Department();
							System.out.println(" Nhập thông tin Department ");
							System.out.print("Nhập id: ");
							department.id=sc.nextInt();
							System.out.print("Nhập phòng ban : ");
							department.name=sc.next();
							System.out.println("thông tin vừa tạo là: "+"ID: "+department.id+" "+"Name: "+department.name);
							return;
							
						}else {
							 System.out.println("mời bạn nhập lại");
					}
					
				}
	}

	private static void Nhapsochan() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		while (true) {
			System.out.println("Nhập số chẵn");
			int a=sc.nextInt();
			if(a%2==0) {
				System.out.println("Số chẵn bạn vừa nhập là: "+a);
				return;
			}else {
				System.out.println("số bạn nhập kp là số chẵn ");
			}
		}
	}

	private static void TaoDepartment() {
		// TODO Auto-generated method stub
		Department department=new Department();
		Scanner sc=new Scanner(System.in);
		System.out.println(" Nhập thông tin Department ");
		System.out.print("Nhập id: ");
		department.id=sc.nextInt();
		System.out.print("Nhập phòng ban : ");
		department.name=sc.next();
		System.out.println("thông tin vừa tạo là: "+"ID: "+department.id+" "+"Name: "+department.name);
		
		
	}

	private static void Taoaccount() {
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("Nhập thông tin Account: ");
		Account account=new Account();
		System.out.print("Nhập ID: ");
		int id=sc.nextInt();
		System.out.print("Nhập Name: ");
		String name=sc.next();
		System.out.print("Nhập fullName: ");
		String fullName=sc.next();
		System.out.print("Nhập email: ");
		String email=sc.next();
		System.out.println("Nhập position với số tương ứng  1.Dev, 2.Test, 3.Scrum_Master, 4.PM ");
		int pos=sc.nextInt();
		switch (pos) {
		case 1:
			Position ps1=new Position();
			ps1.positionName=PositionName.DEV;
			account.position=ps1;
			break;
		case 2:
			Position ps2=new Position();
			ps2.positionName=PositionName.TEST;
			account.position=ps2;
			break;
		case 3:
			Position ps3=new Position();
			ps3.positionName=PositionName.SCRCRUMMASTER;
			account.position=ps3;
			break;

		default:
			Position ps4=new Position();
			ps4.positionName=PositionName.PM;
			account.position=ps4;
			break;
			
		}
		System.out.println("Thông tin vừa nhập là : "+"\n "+"ID: "+id+" \n"+"name: "+name+"\n "+"Fullname: "+fullName+"\n "+"Email: "+email+"\n "+"Position: "+account.position.positionName);



	}

}
