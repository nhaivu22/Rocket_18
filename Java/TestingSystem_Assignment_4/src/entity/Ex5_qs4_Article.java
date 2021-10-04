package entity;

import java.time.LocalDate;

public class Ex5_qs4_Article extends Ex5_qs4_Library {
	private LocalDate dayRelease;

	public Ex5_qs4_Article(int id, String imprint, String releaseNumber, LocalDate dayRelease) {
		super(id, imprint, releaseNumber);
		this.dayRelease = dayRelease;
	}

	@Override
	public String toString() {
		return super.toString() + " Category: Article [dayRelease=" + dayRelease + "]";
	}

}
