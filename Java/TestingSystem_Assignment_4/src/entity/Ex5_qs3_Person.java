package entity;

public class Ex5_qs3_Person {
	
	private String name;

	public Ex5_qs3_Person(String name) {
		super();
		this.name = name;
	}
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Ex5_qs3_Person [name=" + name + "]";
	}
	

}
