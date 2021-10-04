package entity;

import java.util.Scanner;

public class Ex2_qs2_Student extends Ex2_qs2_Person {
	private int id;
	private Float gradeAvg;
	private String email;

	@Override
	public void inputInfo() {
		Scanner sc = new Scanner(System.in);
		super.inputInfo();
		System.out.println("ID: ");
		this.id = sc.nextInt();
		System.out.println("GradeAvg: ");
		this.gradeAvg = sc.nextFloat();
		System.out.println("email: ");
		this.email = sc.next();

	}
	

	

	@Override
	public String toString() {
		return "Ex2_qs2_Student [id=" + id + ", gradeAvg=" + gradeAvg + ", email=" + email + "]";
	}




	public boolean Scholarship() {
		return gradeAvg > 8.0 ? true : false;
	}

}
