package fontend;

import java.util.Scanner;

import entity.Ex2_qs2_Person;
import entity.Ex2_qs2_Student;

public class Ex2_qs2 {
	private Scanner sc=new Scanner(System.in);

	public void question2() {
		menu();
	}

	private void menu() {
		// TODO Auto-generated method stub
		while (true) {
					System.out.println("||========================================||");
					System.out.println("||====	     Lựa chọn chức năng     ======||");
					System.out.println("||=== 			1.  Person.			 =====||");
					System.out.println("||===			2. 	Stusent.		   ===||");
					System.out.println("||=== 			3. 	Exit. 				==||");
					System.out.println("||========================================||");
					int chon=sc.nextInt();
					switch (chon) {
								case 1:
									Ex2_qs2_Person person=new Ex2_qs2_Person();
									System.out.println("Nhập Thông tin");
									person.inputInfo();
									System.out.println("Thông tin vừa nhập ");
									System.out.println(person.toString());
									break;
									
									
							
								case 2:
									Ex2_qs2_Student student=new Ex2_qs2_Student();
									 System.out.println("Nhập thông tin Student ");
									 student.inputInfo();
									 System.out.println("Thông tin Studen ");
									 System.out.println(student.toString());
									 if(student.Scholarship()) {
										 System.out.println("Sinh viên này được học bổng");
									 }else {
										 System.out.println("Sinh viên không dược học bổng");
									 }
			
									break;
							
									
									
								case 3:
									return;
			
								default:
									System.out.println("Chọn đúng số trên menu");
									break;
								}

			
		}
	}
	
	

}
