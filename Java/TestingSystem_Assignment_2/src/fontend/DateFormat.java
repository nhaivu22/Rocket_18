package fontend;


import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Locale;

import entity.Account;
import entity.Answer;
import entity.CategoryQuestion;
import entity.Exam;
import entity.Group;
import entity.Question;
import entity.TypeQuestion;
import entity.CategoryQuestion.CategoryName;
import entity.Exam.Duration;
import entity.TypeQuestion.TypeName;

public class DateFormat {
	private static final String DEFAULT = null;

	public static void main(String[] args) {
		
		Account account1=new Account();
		account1.id=1;
		account1.email = "nhai1@gmail.com";
//		account1.position = position1;
//		account1.department = department1;
		account1.userName = "Nhai";
		account1.fullName = "Vũ Thị Nhài";
		account1.createDate=LocalDate.now();
//		account1.groups=new Group[] { group1, group2 };
		
		Account account2 = new Account();
		account2.id = 2;
		account2.email = "honghoa@gmail.com";
//		account2.position = position2;
//		account2.department = department2;
		account2.userName = "Hồng";
		account2.fullName = "Vũ Thị Hồng";
//		account2.groups = new Group[] { group2, group3 };
		account2.createDate =LocalDate.now();
		
		
		
		
		
		Account account3 = new Account();
		account3.id = 3;
		account3.email = "hue@gmail.com";
//		account3.position = position3;
//		account3.department = department3;
		account3.userName = "Huệ Huệ ";
		account3.fullName = "Đào Phương huệ ";
//		account3.groups = new Group[] { group1, group2,group3 };
		account3.createDate = LocalDate.now();
		
		
		Account account4 = new Account();
		account4.id = 4;
		account4.email = "trang@gmail.com";
//		account4.position = position4;
//		account4.department = department4;
		account4.userName = "Thùy Trang ";
		account4.fullName = "Vũ Thùy Trang";
//		account4.groups = new Group[] { group1, group2 };
		account4.createDate = LocalDate.now();
		
		Account account5 = new Account();
		account5.id = 5;
		account5.email = "loan@gmail.com";
//		account5.position = position5;
//		account5.department = department5;
		account5.userName = "Đỗ Loan ";
		account5.fullName = "Đỗ Ngọc Loan";
//		account5.groups = new Group[] { group2, group3 };
		account5.createDate = LocalDate.now();
		
		
		
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
		
//		Question 1: --------- In ra thông tin Exam thứ 1 và property create date
//		sẽ được format theo định 	dạng vietnamese

		System.out.println("Thông tin của Exam thứ 1 là : ");
		System.out.print("ID: "+exam1.id+"\n");
		System.out.print("Code: "+exam1.code+"\n");
		System.out.print("Title: "+exam1.title+"\n");
		System.out.print("CategoryQuestion: "+exam1.categoryQuestion.categoryName+"\n");
		System.out.print("Duration: "+exam1.duration+"\n");
		System.out.print("Account: "+exam1.account.fullName+"\n");
//		Locale locale =new Locale("vi","VN");
//		DateFormat dateformat = DateFormat.getDateInstance(DateFormat.DEFAULT,locale);
//		String date = dateformat.format(exam1.createDate);
//		System.out.println(exam1.code + ": " + date);
		

			
			


		
		
		
		
	}

}
