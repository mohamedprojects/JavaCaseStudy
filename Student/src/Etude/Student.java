package Etude;

import java.util.ArrayList;

public class Student extends Person{
	private char groupe;
	private ArrayList<Absence> allAbsences;
	public Student(char a, String b, char c, ArrayList<Absence> list) {
		this.setLastn(a);
		this.setFirstn(b);
		this.groupe = c;
		this.allAbsences=list;
	}
	public boolean justify(Absence a, String r) throws AbsenceException {
		if( r.equals("") )  {
			throw new AbsenceException();
		}
		else {
			a.setJustification(true);
		    return (true);

		}
		
	}
	public void addAbsence(Absence a) {
		this.allAbsences.add(a);
	}
	public int trackSituation() {
		int x = 0;
		for (int i= 0; i<allAbsences.size();i++) {
			boolean b = allAbsences.get(i).getJustification();
			if( b != true) {
				x = x+1;
			}
		}
		
		int nbra = 10 - x ;
		return nbra;
	}
	public void display() {
		System.out.println(this.getLastn()+" "+this.getFirstn());


	}

 

}
