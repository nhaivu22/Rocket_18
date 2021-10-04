package entity;

import java.time.LocalDate;

public class Exam {
	public int id;
	public String code;
	public String title;
	public CategoryQuestion categoryQuestion;
	public Account account;
	public	LocalDate createDate;
	public Question[] questions;
	public Duration duration;
	public enum Duration{
		MINUTE_30(30),MINUTE_60(60),MINUTE_120(120),MINUTE_180(180);
		Duration(int value){
	}
	}
}
