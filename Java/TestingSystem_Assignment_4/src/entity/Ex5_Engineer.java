package entity;

public class Ex5_Engineer extends Ex5_Staff{
	private String specialized;

	public Ex5_Engineer(String name, int age, Gender gender, String address, String specialized) {
		super(name, age, gender, address);
		this.specialized = specialized;
	}

	@Override
	public String toString() {
		return super.toString()+ "Ex5_Engineer [specialized=" + specialized + "]";
	}
	

}
