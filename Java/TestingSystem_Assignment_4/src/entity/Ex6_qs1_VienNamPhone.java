package entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex6_qs1_VienNamPhone extends Ex6_qs1_Phone {
	private List<Ex6_qs1_Contacts> contacts=new ArrayList<Ex6_qs1_Contacts>() ;
	private Scanner sc=new Scanner(System.in);
	Ex6_qs1_VienNamPhone phone=new Ex6_qs1_VienNamPhone();
	@Override
	public void insertContact(String name, String phone) {
		// TODO Auto-generated method stub
		Ex6_qs1_Contacts cta=new Ex6_qs1_Contacts(phone, name);
		contacts.add(cta);
	}
	
	public void println() {
		for (Ex6_qs1_Contacts ex6_qs1_Contacts : contacts) {
			System.out.println(ex6_qs1_Contacts);
		}
		
	}

	@Override
	public void removeContact(String name) {
		// TODO Auto-generated method stub
		
		for (Ex6_qs1_Contacts ex6_qs1_Contacts : contacts) {
			if(ex6_qs1_Contacts.getName().equals(name)) {
				contacts.remove(ex6_qs1_Contacts);
				
			}else {
				System.out.println("Tên cần  xóa k có trong hệ thông ");
			}
		}
			
		
	}

	@Override
	public void updateContact(String name, String newPhone) {
		
		phone.updateContact(name, newPhone);
		 System.out.println("Phone đã được thay đổi ");
		 
		
	}

	@Override
	public void searchContact(String name) {
		// TODO Auto-generated method stub
		for (Ex6_qs1_Contacts ex6_qs1_Contacts : contacts) {
			if(ex6_qs1_Contacts.getName().equals(name)) {
				System.out.println(ex6_qs1_Contacts);
			}
		}
	}

}
