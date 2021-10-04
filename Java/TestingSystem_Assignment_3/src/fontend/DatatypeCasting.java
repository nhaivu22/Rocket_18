package fontend;

import java.util.Random;
import java.util.Scanner;

public class DatatypeCasting {
	 public static void main(String[] args) {
		 
//		 Question 1:--------
		 
//		float luongAccount1=5240.5f;
//		float luongAccount2= 10970.055f;
//		int casting1=(int) luongAccount1;
//		int casting2=(int) luongAccount2;
//		System.out.println(casting1);
//		System.out.println(casting2);
		
//		-------Question 2+3

//		 Random random= new Random();
//			int x= random.nextInt(9999-0+1)+0;
//			 while (x<10000) {
//				 x=x*10;
//			}
//			 System.out.println("Số ngẫu nhiên: "+x);
//			 String b =String.valueOf(x);
//			System.out.println("hai số cuối: "+b.substring(3));
			 

		
//		thuong();
	
//	}

//	private static void thuong() {
//		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
			System.out.println("Nhập hai số Nguyên a và b");
			System.out.println("Nhập số Nguyên a: ");
			int a=sc.nextInt();
			System.out.println("Nhập số b: ");
			int b=sc.nextInt();
			if(b<=0) {
				System.out.println("Mời bạn nhập lại b>0");
				return;
			}
			float c=(float)a/b;
			System.out.println("Thương của a và b là: "+c);
			sc.close();
	 
	 }
	 

}
