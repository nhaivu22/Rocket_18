package entity;

public class Ex5_qs4_Library {
	private int id;
	private String imprint;
	private String  releaseNumber;
	public Ex5_qs4_Library(int id, String imprint, String releaseNumber) {
		super();
		this.id = id;
		this.imprint = imprint;
		this.releaseNumber = releaseNumber;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getImprint() {
		return imprint;
	}
	public void setImprint(String imprint) {
		this.imprint = imprint;
	}
	public String getReleaseNumber() {
		return releaseNumber;
	}
	public void setReleaseNumber(String releaseNumber) {
		this.releaseNumber = releaseNumber;
	}
	@Override
	public String toString() {
		return "Ex5_qs4_Library [id=" + id + ", imprint=" + imprint + ", releaseNumber=" + releaseNumber + "]";
	}
	
	

}
