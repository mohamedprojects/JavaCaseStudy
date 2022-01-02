package Etude;

import java.time.LocalDate;
import java.util.ArrayList;

public class Absence {

	private LocalDate dateAbsence;
	private boolean justification;

	public Absence(LocalDate a, boolean b) {
		this.dateAbsence = a;

		this.justification = b;


	}
	public void setJustification(boolean c) {
		this.justification = c;
	}
	public boolean getJustification() {
		return justification;
	}

}
