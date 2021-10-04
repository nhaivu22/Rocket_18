package entity;

public class Ex5_Worker extends Ex5_Staff{
	private int rank;

	public Ex5_Worker(String name, int age, Gender gender, String address, int rank) {
		super(name, age, gender, address);
		this.rank = rank;
	}

	@Override
	public String toString() {
		return super.toString()+" Ex5_Worker [rank=" + rank + "]";
	}
	

}
