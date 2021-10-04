package fontend;

import java.time.LocalDate;

import entity.Account;
import entity.Department;
import entity.Group;
import entity.Position;

public class Ex1_Constructor {
	public static void main(String[] args) {
		
	}
	public void Question1() {
		Department department1=new Department();
		Department department2=new Department(0, "nhài");
		System.out.println(department1.toString());
		System.out.println(department2.toString());
	}
	public void Question2() {
		Account account1=new Account();
		Account account2=new Account(1, "nhaivu22@", "vũ nhài", "Vu thi nhai");
		Position ps1 =new Position();
		Account account3=new Account(2, "nhai@", "vũ", "vũ nhài", ps1, LocalDate.now());
		Account account4=new Account(2, "nhai@", "vũ", "vũ nhài", ps1, LocalDate.of(2021, 02, 12));
		System.out.println(account1.toString());;
		System.out.println(account2.toString());;
		System.out.println(account3.toString());;
		System.out.println(account4.toString());;
		
		
	}
	public void Question3() {
		Group gr1=new Group();
		Account account5=new Account();
		Account account6=new Account();
		Account[]ac= {account5,account6};
		Group group2 =new Group(1, "Nhài",ac, LocalDate.now());
		Account account7=new Account("Nhài");
		Account account8=new Account("Hồng");
		
//		Group gr3=new Group("Nhài", ac, , null)
//		System.out.println(gr1.toString());
//		System.out.println(group2.toString());
//		System.out.println(gr3.toString());
	}
	
	
}
