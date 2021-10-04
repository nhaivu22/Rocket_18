package entity;

public class Ex2_qs1_Student implements Ex2_qs1_IStudent {
	public static int COUNT;
	private int id;
	private String name;
	private int group;
	
	
	public Ex2_qs1_Student( String name, int group) {
		super();
		COUNT++;
		this.id = COUNT;
		this.name = name;
		this.group = group;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getGroup() {
		return group;
	}


	public void setGroup(int group) {
		this.group = group;
	}


	@Override
	public void diemdanh() {
		// TODO Auto-generated method stub
		System.out.println(name +" "+"Điểm danh");
	}


	@Override
	public void hocbai() {
		// TODO Auto-generated method stub
		System.out.println(name +" "+ "Học Bài");
	}


	@Override
	public void donvesinh() {
		// TODO Auto-generated method stub
		System.out.println(name+" "+"Dọn vệ cinh ");
	}
	
	public void danhsachsv() {
		Ex2_qs1_Student[]student=new Ex2_qs1_Student[10];
		student[0]=new Ex2_qs1_Student("nhai", 1);
		student[1]=new Ex2_qs1_Student("hoa", 2);
		student[2]=new Ex2_qs1_Student("hư", 3);
		student[3]=new Ex2_qs1_Student("ni", 1);
		student[4]=new Ex2_qs1_Student("nu", 2);
		student[5]=new Ex2_qs1_Student("nanh", 3);
		student[6]=new Ex2_qs1_Student("nthui", 2);
		student[7]=new Ex2_qs1_Student("niw",3);
		student[8]=new Ex2_qs1_Student("nải", 1);
		student[9]=new Ex2_qs1_Student("nai", 2);
		 for (int i = 0; i < student.length; i++) {
			 System.out.println(" Student thứ: "+(i+1)+", "+"ID: "+student[i].getId()+", "+"Name: "+student[i].getName()+" ,"+"Group: "+student[i].getGroup());

		}
	}
	
	
	
	
	
	
	

}
