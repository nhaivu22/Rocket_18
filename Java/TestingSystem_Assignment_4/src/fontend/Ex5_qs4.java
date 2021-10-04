package fontend;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

import entity.Ex5_Staff;
import entity.Ex5_qs4_Article;
import entity.Ex5_qs4_Book;
import entity.Ex5_qs4_Library;
import entity.Ex5_qs4_Magazine;

public class Ex5_qs4 {
	public static int ID = 0;
	private ArrayList<Ex5_qs4_Library> LibraryList;
	private Scanner sc;
	
	public Ex5_qs4() {
		sc=new Scanner(System.in);
		LibraryList = new ArrayList<Ex5_qs4_Library>();
			
	}
	public void question4() {
		menu();
	}
	private void menu() {
		// TODO Auto-generated method stub
		while (true) {
			System.out.println("||======================================================================================||");
			System.out.println("||-------       		Lựa chọn trức năng        			----------------------------||");
			System.out.println("||--------   		 1.  Thêm mới Tài Liệu         			-----------------------------||");
			System.out.println("||--------  		 2.  Xóa tài liệu theo mã     			----------------------------||");
			System.out.println("||--------   		 3.  Hiển thị thông tin tài liệu        ----------------------------||");
			System.out.println("||--------   		 4.  Tìm kiếm thài liệu theo loại, sách,báo, tạp chí     -----------||");
			System.out.println("||--------    		 5.  Thoát khỏi chương trình   				------------------------||");
			System.out.println("||======================================================================================||");
			int menu=sc.nextInt();
			switch (menu) 
			{
	case 1:
				System.out.println("||==============================================================||");
				System.out.println("||--------    1.  Thêm mới Book       	    --------------------||");
				System.out.println("||--------    2.  Thêm mới Magazine         --------------------||");
				System.out.println("||--------    3.  Thêm mới Article          --------------------||");
				System.out.println("||==============================================================||");
				int menu1=sc.nextInt();
					switch (menu1) {
				 	case 1:
							System.out.println("Nhập mã tài liệu ");
							int idBook=sc.nextInt();
							System.out.println("Nhập tên nhà xuất bản");
							String imprinBook=sc.next();
							System.out.println("Nhập số bản phát hành");
							String releaseNumberBook=sc.next();
							System.out.println("nhập tên tác giả ");
							String authorNameBook=sc.next();
							System.out.println("Nhập số trang ");
							int numPageBook=sc.nextInt();
							ID++;
							Ex5_qs4_Library book=new Ex5_qs4_Book(ID, imprinBook, releaseNumberBook, authorNameBook, numPageBook);
							LibraryList.add(book);
							break;
				 case 2:
					 	System.out.println("Nhập mã tài liệu ");
						int idMagazine =sc.nextInt();
						System.out.println("Nhập tên nhà xuất bản");
						String imprinMagazine =sc.next();
						System.out.println("Nhập số bản phát hành");
						String releaseNumberMagazine =sc.next();
						System.out.println("Nhập số phát hành ");
						int idReleaseMagazine =sc.nextInt();
						System.out.println("Nhập vào ngày phát hành: ");
						int day1 = sc.nextInt();
						System.out.println("Nhập vào tháng phát hành: ");
						int month1 = sc.nextInt();
						System.out.println("Nhập vào năm phát hành: ");
						int year1 = sc.nextInt();
						LocalDate monthReleaseMagazine = LocalDate.of(year1, month1,day1);
						ID++;
						Ex5_qs4_Library magazine=new Ex5_qs4_Magazine(ID, imprinMagazine, releaseNumberMagazine, idReleaseMagazine, monthReleaseMagazine);
						LibraryList.add(magazine);
						break;
				 case 3:
					 	System.out.println("Nhập mã tài liệu ");
						int idArticle  =sc.nextInt();
						System.out.println("Nhập tên nhà xuất bản");
						String imprinArticle  =sc.next();
						System.out.println("Nhập số bản phát hành");
						String releaseNumberArticle =sc.next();
						System.out.println("Nhập vào ngày phát hành: ");
						int day = sc.nextInt();
						System.out.println("Nhập vào tháng phát hành: ");
						int month = sc.nextInt();
						System.out.println("Nhập vào năm phát hành: ");
						int year = sc.nextInt();
						LocalDate dayReleaseArticle = LocalDate.of(year, month, day);
						ID++;
						Ex5_qs4_Library article=new Ex5_qs4_Article(ID, imprinArticle, releaseNumberArticle, dayReleaseArticle);
						LibraryList.add(article);
					 break;
				 }
				break;
					
	case 2:
				for (Ex5_qs4_Library ex5_qs4_Library : LibraryList) {
					System.out.println(ex5_qs4_Library);
					
				}
				break;
	case 3:
				System.out.println("Nhập vào loại tài liệu 1. Book  2.Magazine   3.Article  ");
				int chon=sc.nextInt();
				switch (chon) {
						case 1:
										for (Ex5_qs4_Library ex5_qs4_Library : LibraryList) {
											if(ex5_qs4_Library instanceof Ex5_qs4_Book) {
												System.out.println(ex5_qs4_Library);
											}
										}
									break;
						case 2:
								for (Ex5_qs4_Library ex5_qs4_Library : LibraryList) {
									if(ex5_qs4_Library instanceof Ex5_qs4_Magazine) {
										System.out.println(ex5_qs4_Library);
									}
								}
								break;
						case 3:
								for (Ex5_qs4_Library ex5_qs4_Library : LibraryList) {
									if(ex5_qs4_Library instanceof Ex5_qs4_Article) {
										System.out.println(ex5_qs4_Library);
									}
								}
								break;
						default:
							System.out.println("Nhập không đúng.!!");
							break;
						}
							break;
	case 4:
	return;

			default:
				 System.out.println("Nhập đúng số trên menu");
				break;
			}
		}
	}

}
