package entity;

import java.time.LocalDate;
import java.util.Arrays;

public class Group {
	public int id;
	public String name;
	public Account [] creator ;
	public  String[] usernames;
	public LocalDate createDate;
	
	public Group() {
		super();
	}
	public Group(int id, String name, Account[] creator, LocalDate createDate) {
		super();
		this.id = id;
		this.name = name;
		this.creator = creator;
		this.createDate = createDate;
	}
	public Group(int id, String name, Account[] creator, String[] usernames, LocalDate createDate) {
		super();
		this.id = id;
		this.name = name;
		this.creator = creator;
		this.usernames = usernames;
		this.createDate = createDate;
	}
	
	
	


	public Group(String name, Account[] creator, String[] usernames, LocalDate createDate) {
		super();
		this.name = name;
		this.creator = creator;
		this.usernames = usernames;
		this.createDate = createDate;
		Account[] accounts = new Account[usernames.length];
		for (int i = 0; i < usernames.length; i++) {
			accounts[i] = new Account(usernames[i]);
			}
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Account[] getCreator() {
		return creator;
	}
	public void setCreator(Account[] creator) {
		this.creator = creator;
	}
	public String[] getUsernames() {
		return usernames;
	}
	public void setUsernames(String[] usernames) {
		this.usernames = usernames;
	}
	public LocalDate getCreateDate() {
		return createDate;
	}
	public void setCreateDate(LocalDate createDate) {
		this.createDate = createDate;
	}
	@Override
	public String toString() {
		return "Group [id=" + id + ", name=" + name + ", creator=" + Arrays.toString(creator) + ", usernames="
				+ Arrays.toString(usernames) + ", createDate=" + createDate + "]";
	}
	
		
	
	
	
	

	

}
