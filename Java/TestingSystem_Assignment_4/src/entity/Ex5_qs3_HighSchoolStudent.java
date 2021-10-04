package entity;

public class Ex5_qs3_HighSchoolStudent extends Ex5_qs3_Student{
	private String clazz;
	private String desiredUniversity;
	public Ex5_qs3_HighSchoolStudent(String name, int id, String clazz, String desiredUniversity) {
		super(name, id);
		this.clazz = clazz;
		this.desiredUniversity = desiredUniversity;
	}
	public String getClazz() {
		return clazz;
	}
	public void setClazz(String clazz) {
		this.clazz = clazz;
	}
	public String getDesiredUniversity() {
		return desiredUniversity;
	}
	public void setDesiredUniversity(String desiredUniversity) {
		this.desiredUniversity = desiredUniversity;
	}
	@Override
	public String toString() {
		return super.toString()+"Ex5_qs3_HighSchoolStudent [clazz=" + clazz + ", desiredUniversity=" + desiredUniversity + "]";
	}
	
	
	

}
