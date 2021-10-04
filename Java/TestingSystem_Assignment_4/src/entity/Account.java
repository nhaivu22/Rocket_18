package entity;

import java.time.LocalDate;

public class Account {
	private int id;
	private String email;
	private String userName;
	private String firstName;
	private String lastName;
	private String fullName;
	private Position position;
	private Department department;
	private Group[]groups;
	private LocalDate createDate;
	
	
	public Account() {
		super();
	}
	public Account(int id, String email, String userName, String fullName) {
		super();
		this.id = id;
		this.email = email;
		this.userName = userName;
		this.fullName = fullName;
	}
	
	public Account(int id, String email, String userName, String fullName, Position position, LocalDate createDate) {
		super();
		this.id = id;
		this.email = email;
		this.userName = userName;
		this.fullName = fullName;
		this.position = position;
		this.createDate = createDate;
	}
	

	public Account(String userName) {
		super();
		this.userName = userName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public Position getPosition() {
		return position;
	}
	public void setPosition(Position position) {
		this.position = position;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public LocalDate getCreateDate() {
		return createDate;
	}
	public void setCreateDate(LocalDate createDate) {
		this.createDate = createDate;
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", email=" + email + ", userName=" + userName + ", fullName=" + fullName
				+ ", position=" + position + ", createDate=" + createDate + "]";
	}
	
	
	
	
	

}
