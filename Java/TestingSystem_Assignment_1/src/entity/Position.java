package entity;

public class Position {
	public int id;
	public PositionName positionName;
	
	public enum PositionName{
	DEV, TEST, SCRCRUMMASTER, PM;
 }
}