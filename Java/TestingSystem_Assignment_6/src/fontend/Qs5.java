package fontend;

import java.util.InputMismatchException;
import java.util.Scanner;

import ultis.ScannerUltis;

public class Qs5 {
	public static void main(String[] args) {
		inputAge();
	}

	private static void inputAge() {
		ScannerUltis sc=new ScannerUltis();
		try {
			
			System.out.println("Nhập vào một số ");
			int so=sc.inputInt();
			System.out.println("Số vừa nhập là : "+so);
		} catch (InputMismatchException e) {
			System.out.println("\"wrong inputing! Please input an age as input, input again ");
	
		}
	}

}
