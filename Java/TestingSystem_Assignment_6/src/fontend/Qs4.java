package fontend;

import entity.Department;

public class Qs4 {
	public static void main(String[] args) {
		Department department1=new Department(1, "nhai") ;
		Department department2=new Department(2, "hoa") ;
		Department department3=new Department(3, "hue") ;
		Department [] departmentArr= {department1,department2,department3};
		
		try {
			System.out.println(departmentArr[5]);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Cannot find departmentArr[5]");
		}

	}

}
