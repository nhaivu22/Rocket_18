package fontend;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import entity.Ex2_qs1_Student;

public class Ex2_qs1 {
	private ArrayList<Ex2_qs1_Student> listStudent;
	private Random random;
	private Scanner sc;

	public Ex2_qs1() {
		listStudent = new ArrayList<Ex2_qs1_Student>();
		random = new Random();
		sc = new Scanner(System.in);
	}

	public void Question1() {
		menu();
	}

	private void menu() {
		// TODO Auto-generated method stub
		while (true) {
			System.out.println("||==============================================================||");
			System.out.println("||-------       Lựa chọn trức năng        ----------------------||");
			System.out.println("||--------    1. Hiển thị danh sách sinh viên      -------------||");
			System.out.println("||--------    2.  Điểm danh       			--------------------||");
			System.out.println("||--------    3. Nhóm 1 học bài         ------------------------||");
			System.out.println("||--------    4. Nhóm 2 dọn vệ sinh         --------------------||");
			System.out.println("||--------    5.  Thoát khỏi chương trình    -------------------||");
			System.out.println("||--------    6.  Thoát khỏi chương trình    -------------------||");
			System.out.println("||==============================================================||");
			int chon = sc.nextInt();
			switch (chon) {
			case 1:
				initStudent();
				break;

			case 2:
				System.out.println("Cả lớp điểm danh: ");
				for (Ex2_qs1_Student st : listStudent) {
					st.diemdanh();
				}
				break;
			case 3:
				System.out.println("Nhóm 1 đi học bài: ");
				for (Ex2_qs1_Student st : listStudent) {
					if (st.getGroup() == 1) {
						st.hocbai();
					}
				}
				break;
			case 4:
				System.out.println("Nhóm 2 đi dọn vệ sinh: ");
				for (Ex2_qs1_Student st : listStudent) {
					if (st.getGroup() == 2) {
						st.donvesinh();
						;
					}
				}
				break;
			case 5:
				return;
			default:
				System.out.println("chọn đúng số trên menu");
				break;
			}

		}
	}

	private void initStudent() {
		// TODO Auto-generated method stub
		Ex2_qs1_Student[]st=new Ex2_qs1_Student[10] ;
		 st[0] = new Ex2_qs1_Student("Nhai",1 );
		 st[1] = new Ex2_qs1_Student("hue",2 );
		 st[2] = new Ex2_qs1_Student("Nử",3 );
		 st[3] = new Ex2_qs1_Student("Nag",2 );
		 st[4] = new Ex2_qs1_Student("ett",1 );
		 st[5] = new Ex2_qs1_Student("ửhrym",3 );
		 st[6] = new Ex2_qs1_Student("tien",2 );
		 st[7] = new Ex2_qs1_Student("tig",2 );
		 st[8] = new Ex2_qs1_Student("eti",3 );
		 st[9] = new Ex2_qs1_Student("ẹtk",1 );
		 listStudent.addAll(listStudent);
		 System.out.println("Danh sách Student: ");
		 for (int i = 0; i < st.length; i++) {
			System.out.println("Student thứ  "+(i+1)+", "+"ID: "+st[i].getId()+", "+"Name: "+st[i].getName()+", "+"Group: "+st[i].getGroup());
			
		}
		 
		 
			
		
	}

}
