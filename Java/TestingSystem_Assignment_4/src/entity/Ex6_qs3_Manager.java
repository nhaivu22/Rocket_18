package entity;

public class Ex6_qs3_Manager extends Ex6_qs2_User{

	public Ex6_qs3_Manager(String name, double salaryRatio) {
		super(name, salaryRatio);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Double calculatePay() {
		// TODO Auto-generated method stub
		return salaryRatio*520;
	}
	

}
