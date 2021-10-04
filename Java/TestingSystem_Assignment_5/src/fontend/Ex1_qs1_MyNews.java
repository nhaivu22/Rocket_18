package fontend;

import java.util.ArrayList;
import java.util.Scanner;

import entity.Ex1_qs1_News;

public class Ex1_qs1_MyNews {
	public void Question1() {
		menu();
	}
	private void menu() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ArrayList<Ex1_qs1_News>list=new ArrayList<Ex1_qs1_News>();
		while (true) {
			System.out.println("||============================================================||");
			System.out.println("||-------       Lựa chọn trức năng      ----------------------||");
			System.out.println("||--------    1.  Insert news             --------------------||");
			System.out.println("||--------    2.  TView list news         --------------------||");
			System.out.println("||--------    3.  Average rate            --------------------||");
			System.out.println("||--------    4.  Exit                     -------------------||");
			System.out.println("||============================================================||");
			int chon=sc.nextInt();
			 switch (chon) {
			case 1:
				System.out.println("Nhập vào ID");
				int id=sc.nextInt();
				System.out.println("Nhập vào Title");
				String title = sc.next();
				System.out.println("Nhập vào PublishDate");
				String publishDate = sc.next();
				System.out.println("Nhập vào Author");
				String author = sc.next();
				System.out.println("Nhập vào Content");
				String content = sc.next();
				System.out.println("Nhập vào đánh giá 1");
				int rate1 = sc.nextInt();
				System.out.println("Nhập vào đánh giá 2");
				int rate2 = sc.nextInt();
				System.out.println("Nhập vào đánh giá 3");
				int rate3 = sc.nextInt();
				int[] rates = { rate1, rate2, rate3 };

				Ex1_qs1_News qs1=new Ex1_qs1_News(id, title, publishDate, author, content, rate3, rates);
				list.add(qs1);
				break;
			case 2:
				for (Ex1_qs1_News nw : list) {
					nw.display();	
				}
				break;
			case 3:
				System.out.println("Đánh giá trung bình: ");
				for (Ex1_qs1_News nw2 : list) {
					
					System.out.println("Rates:"+nw2.calculate());
				}
				break;
			case 4:
				return;

			default:
				System.out.println("Chọn đúng số trên menu");
				break;
			}
			
		}
		
	}
	

}
