package entity;

public abstract class Ex6_qs2_User {
	private String name;
	 double salaryRatio;

	public Ex6_qs2_User(String name, double salaryRatio) {
		super();
		this.name = name;
		this.salaryRatio = salaryRatio;
	}
	public abstract Double  calculatePay();
	
	public void displayInfor() {
		System.out.println("Name: "+ name);
		System.out.println("Salary Ratio: "+salaryRatio);
		System.out.println("Trả lương : "+calculatePay());
		
		
	}

}
