package entity;

import java.time.LocalDate;

public class Ex5_qs4_Magazine extends Ex5_qs4_Library {
	private int idRelease;
	private LocalDate monthRelease;

	

	public Ex5_qs4_Magazine(int id, String imprint, String releaseNumber, int idRelease, LocalDate monthRelease) {
		super(id, imprint, releaseNumber);
		this.idRelease = idRelease;
		this.monthRelease = monthRelease;
	}



	@Override
	public String toString() {
		return super.toString() + " Category: Magazine [idRelease=" + idRelease + ", monthRelease=" + monthRelease
				+ "]";
	}

}
