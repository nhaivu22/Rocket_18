package fontend;

import java.util.ArrayList;
import java.util.Scanner;

import entity.Ex5_Employee;
import entity.Ex5_Engineer;
import entity.Ex5_Staff;

import entity.Ex5_Staff.Gender;
import entity.Ex5_Worker;
import entity.Ex5_qs3_HighSchoolStudent;
import ultis.ScannerUltis;

public class Ex5_Inheritance {
	private Scanner sc;
	private ArrayList<Ex5_Staff> staffList;
	
	public Ex5_Inheritance() {
		staffList = new ArrayList<Ex5_Staff>();
		sc = new Scanner(System.in);
	}
			
	public void Question12() {
		menu();
	}

	private void menu() {
		// TODO Auto-generated method stub
		while(true) {
			System.out.println("||==============================================================||");
			System.out.println("||-------       Lựa chọn trức năng        ----------------------||");
			System.out.println("||--------    1.  Thêm mới cán bộ           --------------------||");
			System.out.println("||--------    2.  Tìm kiến theo họ tên      --------------------||");
			System.out.println("||--------    3.  Hiển thị danh sách        --------------------||");
			System.out.println("||--------    4.  Nhập và xóa cán bộ         -------------------||");
			System.out.println("||--------    5.  Thoát khỏi chương trình    -------------------||");
			System.out.println("||==============================================================||");
			int menuChoose=sc.nextInt();
			switch (menuChoose) {
			case 1:
				addStaff();
				break;
			case 2:
				findByName();
				break;
			case 3:
				printStaff();
				break;
			case 4:
				deleteByName();

			default:
				System.out.println("Chọn số đúng trên menu");
				break;
			}
			
		}
	}

	private void deleteByName() {
		// TODO Auto-generated method stub
		System.out.println("Nhập tên cần xóa thông tin: ");
		String delName = sc.next();
		staffList.removeIf(staff -> staff.getName().equals(delName));
		printStaff();
	}

	private void findByName() {
		// TODO Auto-generated method stub
		System.out.println("Nhập vào tên muốn tìm kiếm: ");
		String findName = sc.next();
		for (Ex5_Staff ex5_Staff : staffList) {
		if (ex5_Staff.getName().equals(findName)) {
		System.out.println(ex5_Staff);
			}

		}
	}

	private void printStaff() {
		// TODO Auto-generated method stub
		for (Ex5_Staff ex5_Staff : staffList) {
			System.out.println(ex5_Staff);
		}
	}

	private void addStaff() {
		// TODO Auto-generated method stub
		System.out.println("||==============================================================||");
		System.out.println("||--------    1.  Thêm mới Employee         --------------------||");
		System.out.println("||--------    2.  Thêm mới Engineer         --------------------||");
		System.out.println("||--------    3.  Thêm mới Worker           --------------------||");
		System.out.println("||==============================================================||");
		
		int menu2=ScannerUltis.inputInt();
		switch (menu2) {
		case 1:
					System.out.println("Nhập vào tên Employee  ");
					String nameEmployee=sc.next();
					System.out.println("nhập vào tuổi ");
					int ageEmployee=sc.nextInt();
					System.out.println("Nhập giới tính Employee 1.Male  2.Female  3.Unknow ");
					int flagEmployee=sc.nextInt();
					Gender genderEmoloyee=null;
					switch (flagEmployee) {
							case 1:
								genderEmoloyee=Gender.MALE;
								break;
							case 2:
								genderEmoloyee=Gender.FEMALE;
								break;
							case 3:
								genderEmoloyee=Gender.UNKNOWN;
								break;
											}
					System.out.println("Nhập địa chỉ Employee");
					String addEmployee=sc.next();
					System.out.println("Nhập nhiệm vụ Employee");
					String taksEmployee=sc.next();
					Ex5_Staff st1=new Ex5_Employee(nameEmployee, flagEmployee, genderEmoloyee, addEmployee, taksEmployee);
					staffList.add(st1);	
				break;
				
		case 2:
				System.out.println("Nhập tên Engineer");
				String nameEngineer=sc.next();
				System.out.println("Nhập tuổi Engineer");
				int ageEngineer=sc.nextInt();
				System.out.println("Nhập giới tính Engineer 1.Male  2.Female  3.Unknow ");
				int flaEngineer=sc.nextInt();
				Gender genderEngineer=null;
					switch (flaEngineer) {
					case 1:
						genderEngineer=Gender.MALE;
						break;
					case 2:
						genderEngineer=Gender.FEMALE;
					case 3:
						genderEngineer=Gender.UNKNOWN;
						break;
					}
					System.out.println("Nhập vào địa chỉ ");
					String addEngineer =sc.next();
					System.out.println("Nhập nhiệm vụ Engineer");
					String pecializedEngineer=sc.next();
					Ex5_Staff st2=new Ex5_Engineer(nameEngineer, ageEngineer, genderEngineer, addEngineer, pecializedEngineer);
					staffList.add(st2);
					break;

		case 3:
				System.out.println("Nhập tên Worker");
				String nameWorker=sc.next();
				System.out.println("Nhập tuổi Worker");
				int ageWorker=sc.nextInt();
				System.out.println("nhập vào giới tính 1.Male  2.Female  3.Unknow ");
				int flaWorker=sc.nextInt();
				Gender genderWorker=null;
					switch (flaWorker) {
					case 1:
						genderWorker=Gender.MALE;
						break;
					case 2:
						genderWorker=Gender.FEMALE;
						break;
					case 3:
						genderWorker=Gender.UNKNOWN;
						break;
					}
				System.out.println("Nhập địa chỉ Worker");
				String addWorker=sc.next();
				System.out.println("Nhập cấp bậc Worker");
				String rankWorker=sc.next();
				
				Ex5_Staff	st3=new Ex5_Worker(nameWorker, ageWorker, genderWorker, rankWorker, flaWorker);
				
				staffList.add(st3);
				break;
				default:
			break;
		}
		
	}
	public void Question3() {
		Ex5_qs3_HighSchoolStudent st1=new Ex5_qs3_HighSchoolStudent("nhài", 1, "chuyên văn", "Đh công nghệ");
		System.out.println(st1);
	}
	

}
