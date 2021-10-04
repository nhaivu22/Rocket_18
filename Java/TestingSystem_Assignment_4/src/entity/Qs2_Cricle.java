package entity;

public class Qs2_Cricle {
	private Double radius;
	private String color;
	public static final Double PI = 3.14;
	
	
	public Qs2_Cricle() {
		super();
	}


	public Qs2_Cricle(Double radius, String color) {
		super();
		this.radius = radius;
		this.color = color;
	}


	public Double getRadius() {
		return radius;
	}


	public void setRadius(Double radius) {
		this.radius = radius;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public Double getArea() {
		return PI * Math.pow(this.radius, 2.0);
		}
	
	
	
	

}
