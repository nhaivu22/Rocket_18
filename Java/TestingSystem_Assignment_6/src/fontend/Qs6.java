package fontend;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Qs6 {
	public static void main(String[] args) {
		inputAge();
	}

	private static int inputAge() {
		System.out.println("Nhập vào 1 số : ");
		while (true) {
			Scanner sc=new Scanner(System.in);

			try {

				Integer a=sc.nextInt();
				
				System.out.println("Số vừa nhập là : "+a);
				return a.parseInt(sc.next().trim());
				
			} catch (Exception e) {
				System.out.println("Nhập lại ");
				
			}
			sc.close();
		}
	
	}
	
}
