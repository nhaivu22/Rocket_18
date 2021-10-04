package entity;

public class Ex5_Employee extends Ex5_Staff {
	private String task;
	public Ex5_Employee(String name, int age, Gender gender, String address, String task) {
		super(name, age, gender, address);
		this.task = task;
	}
	@Override
	public String toString() {
		return super.toString()+"Ex5_Employee [task=" + task + "]";
	}
	

}
