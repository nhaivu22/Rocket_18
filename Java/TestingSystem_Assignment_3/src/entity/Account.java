package entity;

import java.time.LocalDate;

public class Account {
	public int id;
	public String email;
	public String userName;
	public String fullName;
	public LocalDate createDate;
	@Override
	public String toString() {
		return "Account id=" + id + ", email=" + email + ", userName=" + userName + ", fullName=" + fullName
				+ ", createDate=" + createDate + " ";
	}
	
	
	

}
