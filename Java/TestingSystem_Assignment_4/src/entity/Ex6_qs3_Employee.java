package entity;

public class Ex6_qs3_Employee extends Ex6_qs2_User {

	public Ex6_qs3_Employee(String name, double salaryRatio) {
		super(name, salaryRatio);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Double calculatePay() {
		// TODO Auto-generated method stub
		return salaryRatio*420;
	}
	

}
