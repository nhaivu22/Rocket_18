package entity;

public class Ex6_qs1_Contacts {
	private String infnumber;
	private String name;
	public Ex6_qs1_Contacts(String infnumber, String name) {
		super();
		this.infnumber = infnumber;
		this.name = name;
	}
	public String getInfnumber() {
		return infnumber;
	}
	public void setInfnumber(String infnumber) {
		this.infnumber = infnumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Ex6_qs1_Contacts [infnumber=" + infnumber + ", name=" + name + "]";
	}
	
	
	
	

}
