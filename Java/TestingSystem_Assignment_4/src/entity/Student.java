package entity;

public class Student {
	private int id;
	private String name;
	private String hometown;
	private float scores;
	
	
	public Student(int id, String name, String hometown) {
		super();
		this.id = id;
		this.name = name;
		this.hometown = hometown;
		this.scores = (float) 0;
	}
	public Student(int id, String name, String hometown, float scores) {
		super();
		this.id = id;
		this.name = name;
		this.hometown = hometown;
		this.scores =scores ;
		
	}
	public void setScore(Float score) {
		this.scores = score;
	}
	public void plusScore(Float score) {
		
		this.scores = this.scores +score ;
		}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHometown() {
		return hometown;
	}
	public void setHometown(String hometown) {
		this.hometown = hometown;
	}
	@Override
	public String toString() {
		String rank= null;
		if(this.scores<4.0) {
			rank="yếu ";
		}else if(this.scores<6.0) {
			rank="Trung Bình";
		}else if(this.scores<8.0) {
			rank="khá";
			
		}else {
			rank="giỏi";
		}
		return "Student [id=" + id + ", name=" + name + ", hometown=" + hometown + ", scores=" + scores + ",Xếp loại="+rank+"]";
	}
	

}
