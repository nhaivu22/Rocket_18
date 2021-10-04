package fontend;

import entity.Student;

public class Ex4_Encapsulation {
	public void Question1() {
		
		Student student1=new Student(1, "nhài", "ninh bình", 0);
		Student student2=new Student(2, "thanh", "HN", 7.2f);
		Student student3=new Student(3, "vũ", "HH", 5.0f);
		Student student4=new Student(4, "hiu", "HN", 9.2f);
		student3.plusScore(2f);
		System.out.println(student1);
		System.out.println(student2);
		System.out.println(student3);
		System.out.println(student4);
		
	

	}
	
	
	

}
