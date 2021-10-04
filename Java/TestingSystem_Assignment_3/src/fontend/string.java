package fontend;

import java.util.Scanner;
import java.util.Stack;

public class string {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
//		question 1
		
//		System.out.print("nhập chuỗi: ");
//		String a=sc.nextLine();
//		a=a.replaceAll("\\s+",""); // chia nhỏ chuỗi dựa trên khoảng trắng
//		String [] chuoi=a.split("");
//		System.out.println("số kí tự: "+chuoi.length);
//		sc.close();
		
	
		
		
		

		
		
//		question 2
//		System.out.print("Nhập chuỗi thứ nhất: ");
//		String s1=sc.nextLine();
//		System.out.print("nhập chuỗi thứ hai: ");
//		String s2=sc.nextLine();
//		System.out.println("Kết Quả: "+s1.concat(s2));
		
//		question 3
//		System.out.println("Nhập tên của ban: ");
//		String name=sc.nextLine();
//		name = name.toUpperCase();
//		String firstCharacter = name.substring(0, 1).toUpperCase();
//		String leftCharacter = name.substring(1);
//		name = firstCharacter + leftCharacter;
//		System.out.println("Tên viết hoa là: "+name);
//		sc.close();
		
		
		
		
		
		
		
		
		
		
		
		
//		question 4
//		System.out.println("Nhập tên của bạn: ");
//		String name2=sc.nextLine();
//		name2=name2.toUpperCase();
//		name2=name2.replaceAll("\\s+","");
//		for (int i = 0; i < name2.length(); i++) {
//			System.out.println("kí tự thứ: "+(i+1) +" là: "+name2.charAt(i));
//		}
//		sc.close();
		
//		
		
//		question 5
//		System.out.print("Nhập họ: ");
//		String ho=sc.nextLine();
//		System.out.print("Nhập tên: ");
//		String ten=sc.next();
//		System.out.println("Họ tên đầy đủ là: "+ho+" "+ten);
		
		
//		Question 6:
//			Viết chương trình yêu cầu người dùng nhập vào họ và tên đầy đủ và 
//			sau đó hệ thống sẽ tách ra họ, tên , tên đệm
//
//		String fullName;
//		String lastName = "", middleName = "", firstName = "";
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Nhập họ tên đầy đủ:");
//		fullName = scanner.nextLine();
////		// Chuẩn hóa xâu
//		fullName = fullName.trim();
//		String[] words = fullName.split(" ");
//		lastName = words[0];
//		firstName = words[words.length - 1];
//		for (int i = 1; i <= words.length - 2; i++) {
//		middleName += words[i] + " ";
//		}
//		System.out.println("Họ là: " + lastName);
//		System.out.println("Tên đệm là: " + middleName);
//		System.out.println("Tên là: " + firstName);
//		scanner.close();
//		
//		

//		Question 8:
//			In ra tất cả các group có chứa chữ "Java"
		
//		String []gr= {"java","học bài","Học java","Không học java"};
//		 for (String string : gr) {
//			if(string.contains("java")) {
//				System.out.println(string);
//			}
//		 }
		
		
////		Question 9: In ra tất cả các group "Java"
//		String []gr= {"java","học bài","Học java","Không học java"};
//		for (String string : gr) {
//			if(string.equals("java")) {
//				System.out.println(string);
//			}
//		}
		
		
//		Question 10 (Optional):
//			Kiểm tra 2 chuỗi có là đảo ngược của nhau hay không. 
//			Nếu có xuất ra “OK” ngược lại “KO”. 
//			Ví dụ “word” và “drow” là 2 chuỗi đảo ngược nhau.

//		System.out.println("Nhập 2 chuỗi cần so sánh ");
//		System.out.println("Nhập chuỗi thứ nhất : ");
//		String s1=sc.nextLine();
//	   System.out.println("Nhập chuỗi thứ hai : ");
//	   String s2=sc.nextLine();
//	   StringBuffer stringBuffer = new StringBuffer(s2);
//	   if(s1.equals(stringBuffer.reverse().toString())) {
//		   System.out.println("Chuỗi đảo ngược ");
//	   }else {
//		   System.out.println("Không phải chuỗi đảo ngược ");
//	   }
//		
		
//		Question 11 (Optional): Count special Character 
//		Tìm số lần xuất hiện ký tự "a" trong chuỗi
//		
//		System.out.println("Mời bạn nhập chuỗi có chứ chữ a ");
//		String s=sc.nextLine();
//		int count =0;
//		for (int i = 0; i < s.length(); i++) {
//			if(s.charAt(i)=='a') {
//				count++;
//			}
//			
//		}
//		System.out.println("Số lần xuất hiện chữ a trong chuỗi : "+count);
		
//		Question 12 (Optional): Reverse String
//		Đảo ngược chuỗi sử dụng vòng lặp
//		 System.out.println("Nhập chuỗi cần đảo ngược ");
//		String s1=sc.nextLine();
//	       Stack<Character> stack = new Stack<>();
//	       for (int i = 0; i < s1.length(); i++) {
//	           stack.push(s1.charAt(i));
//	       }
//	       StringBuilder str = new StringBuilder();
//	       int size = stack.size();
//	       for (int i = 0; i < size; i++) {
//	           str.append(stack.pop());
//	       }
//	        System.out.println(str.toString());
	        
//		Question 13 (Optional): String not contains digit
//		Kiểm tra một chuỗi có chứa chữ số hay không, nếu có in ra false ngược 
//		lại true.
		
//		System.out.println("Nhập chuỗi cần kiểm tra: ");
//		String s1=sc.nextLine();
//		for (int i = 0; i < s1.length(); i++) {
//			if(isNumeric(s1.charAt(i))) {
//				System.out.println("Chuỗi bạn nhập có chứa số ");
//				return;
//			}
//
//		}
//		System.out.println("Chuỗi nhập không chứa số ");
//	
//	}
//
//	private static boolean isNumeric(char str) {
//		if(str>='0' && str<='9') {
//			return true;
//		}else {
//			return false;
//		}
//	}

//		Question 14 (Optional): Replace character
//		Cho một chuỗi str, chuyển các ký tự được chỉ định sang một ký tự khác 
//		cho trước. 
//		Ví dụ:
//		"VTI Academy" chuyển ký tự 'e' sang '*' kết quả " VTI Acad*my"
		
//		String s1="VTI Academy";
//		System.out.println(s1.replace('e', '*'));
		
//		Question 15 (Optional): Revert string by word
//		Đảo ngược các ký tự của chuỗi cách nhau bởi dấu cách mà không dùng 
//		thư viện. 
//		Ví dụ: " I am developer " => "developer am I". 
//		Các ký tự bên trong chỉ cách nhau đúng một dấu khoảng cách.
//		Gợi ý: Các bạn cần loại bỏ dấu cách ở đầu và cuối câu, thao tác cắt 
//		chuỗi theo dấu cách
		
		String s1=" I am developer ";
		s1.trim();
		StringBuffer stringBuffer = new StringBuffer(s1);
		System.out.println(stringBuffer.reverse().toString());
		
	}

}
