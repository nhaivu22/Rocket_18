package entity;

public class Ex5_qs4_Book extends Ex5_qs4_Library {
	private String authorName;
	private int numPage;

	public Ex5_qs4_Book(int id, String imprint, String releaseNumber, String authorName, int numPage) {
		super(id, imprint, releaseNumber);
		this.authorName = authorName;
		this.numPage = numPage;
	}
	

	public String getAuthorName() {
		return authorName;
	}


	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}


	public int getNumPage() {
		return numPage;
	}


	public void setNumPage(int numPage) {
		this.numPage = numPage;
	}


	@Override
	public String toString() {
		return super.toString() + " Category: Book [authorName=" + authorName + ", numPage=" + numPage + "]";
	}

}
