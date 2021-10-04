package entity;

import java.time.LocalDate;
import java.util.Scanner;

public class Ex2_qs2_Person {
	private String name;
	private Gender gender;
	private LocalDate birthDate;
	private String address;
	private Scanner sc=new Scanner(System.in);
	public enum Gender{
		MALE, FEMALE, UNKNOWN;
	}

	public Ex2_qs2_Person() {
		super();
	}

	public Ex2_qs2_Person(String name, Gender gender, LocalDate birthDate, String address) {
		super();
		this.name = name;
		this.gender = gender;
		this.birthDate = birthDate;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public void inputInfo() {
		System.out.println("Nhập thông tin : ");
		System.out.println("Nhập Name: ");
		this.name=sc.next();
		System.out.println("Nhập giới tính:  1.Male, 2.Female, 3.Unknown:");
		int chon=sc.nextInt();
		switch (chon) {
		case 1:
			this.gender=Gender.MALE;
			break;
		case 2:
			this.gender=Gender.FEMALE;
			break;
		case 3:
			this.gender=Gender.UNKNOWN;
			break;
		}
		System.out.println("Nhập ngày sinh: ");
		this.birthDate=LocalDate.parse(sc.next());
		System.out.println("Nhập địa chỉ");
		this.address=sc.next();	
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", gender=" + gender + ", birthDate=" + birthDate + ", address="+ address + "]";
	}

	
	


}
