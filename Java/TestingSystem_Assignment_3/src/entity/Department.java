package entity;

public class Department {
	public int id;
	public String name;
	@Override
	public String toString() {
		return "Department id=" + id + ", name=" + name + " ";
	}
	public Department() {
	}
	
	
	public Department(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}


	@Override
	public boolean equals(Object obj) {
		Department department2=(Department)obj;
		if(name.equals(department2.name)) {
			return true;
		}else {
			return false;
		}
	}
	
	

	
	
	
	

}
