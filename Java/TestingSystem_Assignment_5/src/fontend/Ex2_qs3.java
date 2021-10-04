package fontend;

import java.util.Scanner;

import entity.Ex2_qs3_HCN;
import entity.Ex2_qs3_HV;

public class Ex2_qs3 {
	private Scanner sc=new Scanner(System.in);
	private Ex2_qs3_HV hinhvuong;
	private Ex2_qs3_HCN hinhchunhat;

	
	public void Question3() {
		menu();
		
	}

	private void menu() {
		// TODO Auto-generated method stub
		while (true) {
			System.out.println("||=============================================||");
			System.out.println("||====	     Lựa chọn chức năng		===========||");
			System.out.println("||=== 			1. Tính Hình vuông       =====||");
			System.out.println("||===			2. Tính Hình chữ nhật	=======||");
			System.out.println("||=== 			3. 	exit		===============||");
			System.out.println("||=============================================||");
			int chon=sc.nextInt();
			switch (chon) {
			case 1:
				System.out.println("Nhập cạnh của hình vuông ");
				float a=sc.nextFloat();
				hinhvuong= new Ex2_qs3_HV(a);
				System.out.println("Cạnh hình vuông là : "+a);
				System.out.println("Chu vi của hình vuông là: "+hinhvuong.chuvi());
				System.out.println("Diện tích của hình vuông là : "+hinhvuong.dientich());
				break;
			case 2:
				System.out.print("Nhập chiều dài HCN: ");
				float chieudai=sc.nextFloat();
				System.out.print("Nhập chiều rộng HCN: ");
				float chieurong=sc.nextFloat();
				System.out.println("Chiều Dài ,chiều rộng vừa nhập là: "+chieudai+"," +chieurong);
				hinhchunhat=new Ex2_qs3_HCN(chieudai, chieurong);
				System.out.println("Chu vi HCN là : "+hinhchunhat.chuvi());
				System.out.println("Diện tíc HCN là : "+hinhchunhat.dientich());
				
				break;	
			case 3:
				return;
		
			default:
				System.out.println("Nhập đúng số trên menu");
				break;
			}
			
			
			
			
		}
	}

}
