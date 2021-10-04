package fontend;

import java.util.Scanner;

import entity.Ex2_qs4_MyMath;

public class Ex2_qs4 {
	private Scanner sc = new Scanner(System.in);
	private Ex2_qs4_MyMath myMath = new Ex2_qs4_MyMath();

	public void Question4() {
		menu();
	}

	private void menu() {
		// TODO Auto-generated method stub
		while (true) {
			System.out.println("||===========================================================||");
			System.out.println("||======		Lựa chọn chức năng bạn muốn sử dụng		=====||");
			System.out.println("||=== 			1. Tính tổng 2 số kiểu int. 			=====||");
			System.out.println("||=== 			2. Tính tổng 2 số kiểu byte.			 ====||");
			System.out.println("||=== 			3. Tính tổng 2 số kiểu Float.			 ====||");
			System.out.println("||=== 			4. Tính tổng 2 số kiểu int và byte.	 	=====||");
			System.out.println("||=== 			5. Tính tổng 2 số kiểu int và float. 	=====||");
			System.out.println("||=== 			6. Tính tổng 2 số kiểu byte và float. 	=====||");
			System.out.println("||=== 			7. Exit. 								=====||");
			System.out.println("||===========================================================||");
			int chon=sc.nextInt();
			switch (chon) {
			case 1:
				System.out.print("Nhập số int1: ");
				int int1=sc.nextInt();
				System.out.print("Nhập số int2: ");
				int int2=sc.nextInt();
				System.out.println("2 Số int vừa nhập là : "+int1+" ,"+int2);
				System.out.println("Tổng 2 số int: "+myMath.getSum(int1, int2));
				break;
				
			case 2:
				System.out.print("Nhập số byte1: ");
				int byte1=sc.nextInt();
				System.out.print("Nhập số byte2: ");
				byte byte2=sc.nextByte();
				System.out.println("2 Số byte vừa nhập là : "+byte1+" ,"+ byte2);
				System.out.println("Tổng 2 số byte: "+myMath.getSum(byte1, byte2));
				break;
				
			case 3:
				System.out.print("Nhập số float a: ");
				float float1=sc.nextFloat();
				System.out.print("Nhập số float b: ");
				float float2=sc.nextFloat();
				System.out.println("2 Số flaot vừa nhập là : "+float1+" ,"+ float2);
				System.out.println("Tổng 2 số float: "+myMath.getSum(float1, float2));
				break;
				
			case 4:
				System.out.print("Nhập số  int: ");
				int int3=sc.nextInt();
				System.out.print("Nhập số byte: ");
				byte byte3=sc.nextByte();
				System.out.println("2 Số vừa nhập là : "+int3+" ,"+ byte3);
				System.out.println("Tổng 2 số int và byte là : "+myMath.getSum(int3, byte3));
			
				break;
				
			case 5:
				System.out.print("Nhập số  int: ");
				int int4=sc.nextInt();
				System.out.print("Nhập số float: ");
				float float4=sc.nextFloat();
				System.out.println("2 Số vừa nhập là : "+int4+" ,"+ float4);
				System.out.println("Tổng 2 số int và float là : "+myMath.getSum(int4, float4));
			
				break;
				
				
			case 6:
				System.out.print("Nhập số  byte: ");
				byte byte5=sc.nextByte();
				System.out.print("Nhập số float: ");
				float float5=sc.nextFloat();
				System.out.println("2 Số vừa nhập là : "+byte5+" ,"+ float5);
				System.out.println("Tổng 2 số byte và float là : "+myMath.getSum(byte5, float5));
				
				break;

			default:
				System.out.println("Nhập đúng số trên menu");
				break;
			}
			
			
			
			
			
			
			
		}

	}

}
