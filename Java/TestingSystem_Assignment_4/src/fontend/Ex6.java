package fontend;

import java.util.ArrayList;
import java.util.Scanner;

import entity.Ex5_qs4_Library;
import entity.Ex6_qs3_Employee;
import entity.Ex6_qs3_Manager;
import entity.Ex6_qs3_Waiter;

public class Ex6 {
	private Scanner sc;
	public Ex6() {
		sc=new Scanner(System.in);
		
	}
	
	public void Question3() {
		menu();
		
	}

	private void menu() {
		// TODO Auto-generated method stub
		while (true) {
			System.out.println("||==============================================================================||");
			System.out.println("||-------       		Lựa chọn trức năng        	----------------------------||");
			System.out.println("||--------   		 1.  Thêm  Employee.           -----------------------------||");
			System.out.println("||--------  		 2.  Thêm Manager   			----------------------------||");
			System.out.println("||--------   		 3.  Thêm Waiter .              ----------------------------||");
			System.out.println("||--------   		 4.  Thoát khỏi chương trình                     -----------||");
			System.out.println("||==============================================================================||");
			int chon=sc.nextInt();
			switch (chon) {
					case 1:
							System.out.print("nhập vào tên Employee: ");
							String nameEmployee=sc.next();
							System.out.print("nhập vào lương : ");
							double salaryRatioEmployee=sc.nextDouble();
							Ex6_qs3_Employee employee=new Ex6_qs3_Employee(nameEmployee, salaryRatioEmployee) ;
							employee.displayInfor();
						break;
					case 2:
							System.out.print("Nhập vào tên Manager: ");
							String nameManager=sc.next();
							System.out.println("Nhập vào lương: ");
							double salaryRatioManager=sc.nextDouble();
							Ex6_qs3_Manager manager=new Ex6_qs3_Manager(nameManager, salaryRatioManager);
							manager.displayInfor();
							break;
					case 3:
							System.out.print("Nhập vào tên Waiter: ");
							String nameWaiter=sc.next();
							System.out.println("Nhập vào lương: ");
							double salaryRatioWaiter=sc.nextDouble();
							Ex6_qs3_Waiter waiter=new Ex6_qs3_Waiter(nameWaiter, salaryRatioWaiter);
							waiter.displayInfor();
							break;
					case 4:
						return;
					default:
						System.out.println("chọn đúng số trên menu");
						break;
			}

			
		}
	}

}
