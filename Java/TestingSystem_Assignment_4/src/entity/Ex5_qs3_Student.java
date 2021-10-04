package entity;

public class Ex5_qs3_Student extends Ex5_qs3_Person {
	private int id;

	public Ex5_qs3_Student(String name, int id) {
		super(name);
		this.id = id;
	}
	

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	@Override
	public String toString() {
		return super.toString() +"Ex5_qs3_Student [id=" + id + "]";
	}
	

}
