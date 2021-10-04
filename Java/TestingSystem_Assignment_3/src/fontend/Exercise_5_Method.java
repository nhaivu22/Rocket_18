package fontend;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import entity.Account;
import entity.Department;


public class Exercise_5_Method {
	public static void main(String[] args) {
//		Question 1+ Question 2+Question 3:
//		
//		Department[] deps =new Department[5];

		
		Department department1= new Department();
		department1.id=1;
		department1.name="Boss of director";
		
		Department department2= new Department();
		department2.id=2;
		department2.name="Accounting";
		
		Department department3= new Department();
		department3.id=3;
		department3.name="Sale";
		
		Department department4= new Department();
		department4.id=4;
		department4.name="Waiting room ";
		
		Department department5= new Department();
		department5.id=5;
		department5.name="Marketing ";
		
//		
//		deps[0]=department1;
//		deps[1]=department2;
//		deps[2]=department3;
//		deps[3]=department4;
//		deps[4]=department5;
//		for (Department department : deps) {
//			System.out.println(department.toString());
//		}
//		System.out.println(department1.toString());
//		System.out.println(department1.hashCode());
		
////		Question 4: Kiểm tra xem phòng ban thứ 1 có tên là "Phòng A" không?
//		if(department1.name.equals("Phòng A")) {
//			System.out.println("Bằng nhau");
//		}else {
//			System.out.println("Không bằng");
//		}
		
//		Question 5: So sánh 2 phòng ban thứ 1 và phòng ban thứ 2 xem có bằng nhau 
//		không (bằng nhau khi tên của 2 phòng ban đó bằng nhau)
//		if(department1.equals(department2)) {
//			System.out.println("Bằng nhau ");
//		}else {
//			System.out.println("Không bằng nhau");
//		}
		
		
//		Question 6: Khởi tạo 1 array phòng ban gồm 5 phòng ban, sau đó in ra danh 
//		sách phòng ban theo thứ tự tăng dần theo tên (sắp xếp theo vần ABCD)

//		 List<Department>deList=new ArrayList();
//		 deList.add(department1);
//		 deList.add(department2);
//		 deList.add(department3);
//		 deList.add(department4);
//		 deList.add(department5);
//		c2 deList.add=(new Department(1,"nhai"));
//		 
//		Collections.sort(deList, new CompareToName());;
//		for (Department department : deList) {
//			System.out.println(department);
//		}
		
		
	}

}
