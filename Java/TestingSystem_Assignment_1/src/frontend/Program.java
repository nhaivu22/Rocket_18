package frontend;

import java.time.LocalDate;

import entity.Account;
import entity.Answer;
import entity.CategoryQuestion;
import entity.Department;
import entity.Exam;
import entity.Group;
import entity.Position;
import entity.Question;
import entity.TypeQuestion;
import entity.CategoryQuestion.CategoryName;
import entity.Exam.Duration;
import entity.Position.PositionName;
import entity.TypeQuestion.TypeName;

public class Program {
	public static void main(String[] args) {
		
		
//	--------	Department-------
		Department department1= new Department();
		department1.id=1;
		department1.name="Sale";
		
		Department department2= new Department();
		department2.id=2;
		department2.name="Marketting";
		
		Department department3= new Department();
		department3.id=3;
		department3.name="Nhân sự";
		
		Department department4= new Department();
		department4.id=4;
		department4.name="Bảo vệ ";
		
		Department department5= new Department();
		department5.id=5;
		department5.name="Kinh doanh ";
		
		
		
//	----------	Position------
		Position position1= new Position();
		position1.id=1;
		position1.positionName=PositionName.DEV;
		
		
		Position position2= new Position();
		position2.id=2;
		position2.positionName=PositionName.PM;
		
		Position position3= new Position();
		position3.id=3;
		position3.positionName=PositionName.TEST;
		
		Position position4= new Position();
		position4.id=4;
		position4.positionName=PositionName.SCRCRUMMASTER;
		
		
		Position position5= new Position();
		position5.id=5;
		position5.positionName=PositionName.DEV;
		
		
		
		//			Group			//
		
		Group group1=new Group();
		group1.id=1;
		group1.name="nhóm 1";
		group1.createDate= LocalDate.of(2021,05,05);
		
		
		Group group2=new Group();
		group2.id=2;
		group2.name="nhóm 2";
		group2.createDate= LocalDate.of(2020,07,1);
		
		
		Group group3=new Group();
		group3.id=3;
		group3.name="nhóm 3";
		group3.createDate= LocalDate.of(2019,04,03);
		
		
		
//	---------	Account------
		
		Account account1=new Account();
		account1.id=1;
		account1.email = "nhai1@gmail.com";
		account1.position = position1;
		account1.department = department1;
		account1.userName = "Nhai";
		account1.fullName = "Vũ Thị Nhài";
		account1.createDate=LocalDate.now();
		account1.groups=new Group[] { group1, group2 };
		
		Account account2 = new Account();
		account2.id = 2;
		account2.email = "honghoa@gmail.com";
		account2.position = position2;
		account2.department = department2;
		account2.userName = "Hồng";
		account2.fullName = "Vũ Thị Hồng";
		account2.groups = new Group[] { group2, group3 };
		account2.createDate = LocalDate.now();
		
		
		Account account3 = new Account();
		account3.id = 3;
		account3.email = "hue@gmail.com";
		account3.position = position3;
		account3.department = department3;
		account3.userName = "Huệ Huệ ";
		account3.fullName = "Đào Phương huệ ";
		account3.groups = new Group[] { group1, group2,group3 };
		account3.createDate = LocalDate.now();
		
		
		Account account4 = new Account();
		account4.id = 4;
		account4.email = "trang@gmail.com";
		account4.position = position4;
		account4.department = department4;
		account4.userName = "Thùy Trang ";
		account4.fullName = "Vũ Thùy Trang";
		account4.groups = new Group[] { group1, group2 };
		account4.createDate = LocalDate.now();
		
		Account account5 = new Account();
		account5.id = 5;
		account5.email = "loan@gmail.com";
		account5.position = position5;
		account5.department = department5;
		account5.userName = "Đỗ Loan ";
		account5.fullName = "Đỗ Ngọc Loan";
		account5.groups = new Group[] { group2, group3 };
		account5.createDate = LocalDate.now();
		
		
		
		// 		TypeQuestion		//
		
		TypeQuestion typeQuestion1= new TypeQuestion();
		typeQuestion1.id=1;
		typeQuestion1.typeName=TypeName.ESSAY;
		
		
		TypeQuestion typeQuestion2= new TypeQuestion();
		typeQuestion2.id=2;
		typeQuestion2.typeName=TypeName.MULTIPLECHOICE;
		
		
		TypeQuestion typeQuestion3= new TypeQuestion();
		typeQuestion3.id=3;
		typeQuestion3.typeName=TypeName.ESSAY;
		
		TypeQuestion typeQuestion4= new TypeQuestion();
		typeQuestion4.id=4;
		typeQuestion4.typeName=TypeName.MULTIPLECHOICE;
		
		
		//			CategoryQuestion		//
		
		CategoryQuestion categoryQuestion1= new CategoryQuestion();
		categoryQuestion1.id=1;
		categoryQuestion1.categoryName=CategoryName.JAVA;
		
		
		CategoryQuestion categoryQuestion2= new CategoryQuestion();
		categoryQuestion2.id=2;
		categoryQuestion2.categoryName=CategoryName.NET;
		
		
		CategoryQuestion categoryQuestion3= new CategoryQuestion();
		categoryQuestion3.id=3;
		categoryQuestion3.categoryName=CategoryName.POSTMAN;
		
		
		CategoryQuestion categoryQuestion4= new CategoryQuestion();
		categoryQuestion4.id=4;
		categoryQuestion4.categoryName=CategoryName.SQL;
		
		CategoryQuestion categoryQuestion5= new CategoryQuestion();
		categoryQuestion5.id=5;
		categoryQuestion5.categoryName=CategoryName.RUBY;
		
		
		///			Question			///
		
		Question  question1= new Question();
		question1.id=1;
		question1.content="Câu hỏi về java";
		question1.categoryQuestion=categoryQuestion1;
		question1.typeQuestion=typeQuestion1;
		question1.account=account1;
		question1.createDate= LocalDate.now();
		
		Question  question2= new Question();
		question2.id=2;
		question2.content="Câu hỏi về C";
		question2.categoryQuestion=categoryQuestion2;
		question2.typeQuestion=typeQuestion2;
		question2.account=account2;
		question2.createDate= LocalDate.now();
		
		
		Question  question3= new Question();
		question3.id=3;
		question3.content="Câu hỏi về C#";
		question3.categoryQuestion=categoryQuestion3;
		question3.typeQuestion=typeQuestion3;
		question3.account=account3;
		question3.createDate= LocalDate.now();
		
		
		Question  question4= new Question();
		question4.id=4;
		question4.content="Câu hỏi về PHP";
		question4.categoryQuestion=categoryQuestion4;
		question4.typeQuestion=typeQuestion4;
		question4.account=account4;
		question4.createDate= LocalDate.now();
		
		
		Question  question5= new Question();
		question5.id=5;
		question5.content="Câu hỏi về .NET";
		question5.categoryQuestion=categoryQuestion5;
		question5.typeQuestion=typeQuestion1;
		question5.account=account5;
		question5.createDate= LocalDate.now();
		
		
		
		
		
		
		
		
		// 	Answer		//
		
		Answer answer1= new Answer();
		answer1.id=1;
		answer1.content="Câu trả lời số 1";
		answer1.question=question1;
		answer1.isCorrect=true;
		
		Answer answer2= new Answer();
		answer2.id=2;
		answer2.content="Câu trả lời số 2";
		answer2.question=question2;
		answer2.isCorrect=false;
		
		
		
		
		Answer answer3= new Answer();
		answer3.id=3;
		answer3.content="Câu trả lời số 3";
		answer3.question=question3;
		answer3.isCorrect=false;
		
		Answer answer4= new Answer();
		answer4.id=1;
		answer4.content="Câu trả lời số 4";
		answer4.question=question4;
		answer4.isCorrect=true;
		
		
		Answer answer5= new Answer();
		answer5.id=5;
		answer5.content="Câu trả lời số 5";
		answer5.question=question5;
		answer5.isCorrect=true;
		
		
		//		Exam		//
		
		Exam exam1=new  Exam();
		exam1.id=1;
		exam1.code="AB4568";
		exam1.title="Bài thi số 1";
		exam1.categoryQuestion=categoryQuestion1;
		exam1.duration=Duration.MINUTE_30;
		exam1.account=account1;
		exam1.createDate=LocalDate.now();
		exam1.questions = new Question[] { question1, question2 };
		
		
		Exam exam2=new  Exam();
		exam2.id=2;
		exam2.code="AA89";
		exam2.title="Bài thi số 2";
		exam2.categoryQuestion=categoryQuestion2;
		exam2.duration=Duration.MINUTE_60;
		exam2.account=account2;
		exam2.createDate=LocalDate.now();
		exam2.questions = new Question[] { question1, question2, question3};
		
		Exam exam3=new  Exam();
		exam3.id=3;
		exam3.code="UY94";
		exam3.title="Bài thi số 3";
		exam3.categoryQuestion=categoryQuestion3;
		exam3.duration=Duration.MINUTE_180;
		exam3.account=account2;
		exam3.createDate=LocalDate.now();
		exam3.questions = new Question[] { question2, question3};
		
		
		Exam exam4=new  Exam();
		exam4.id=4;
		exam4.code="TRF";
		exam4.title="Bài thi số 4";
		exam4.categoryQuestion=categoryQuestion3;
		exam4.duration=Duration.MINUTE_120;
		exam4.account=account4;
		exam4.createDate=LocalDate.now();
		exam4.questions = new Question[] { question2, question3,question4};
		
		
		Exam exam5=new  Exam();
		exam5.id=5;
		exam5.code="VGKTG";
		exam5.title="Bài thi số 5";
		exam5.categoryQuestion=categoryQuestion3;
		exam5.duration=Duration.MINUTE_120;
		exam5.account=account4;
		exam5.createDate=LocalDate.now();
		exam5.questions = new Question[] { question2, question3,question4};
		
		
//		System.out.println("thông ton "+exam5.createDate);
		
		

		System.out.println("Thông tin của phòng ban thứ nhất là: " +"\n"+"id: "+department1.id+ "\n"+"name: " +department1.name);
//		System.out.println("Thông tin của Position thứ nhất là: "+"\n"+"id: "+position1.positionName+"\n"+"positionName: "+position1.positionName);
//		System.out.println("Thông tin của Group thứ nhất là: "+"\n" +"id: "+group1.id+"\n"+"Name: "+group1.name+"\n"+"Createdate: "+group1.createDate);
		
		
	}

}
