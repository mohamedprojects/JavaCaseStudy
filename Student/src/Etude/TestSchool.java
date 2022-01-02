package Etude;

import java.time.LocalDate;
import java.util.ArrayList;

public class TestSchool {

	public static void main(String[] args) {
		ArrayList<Absence> list1 = new ArrayList<Absence>();
		ArrayList<Absence> list2= new ArrayList<Absence>();
		ArrayList<Absence> list3 = new ArrayList<Absence>();

		Student m = new Student('A',"Youssef", 'A', list1);
		Student l = new Student('A',"Mohammad", 'B', list2);
		Student n = new Student('A',"Mouna", 'A', list3);
		Professor e = new Professor('B',"Ahmmed", 12, 60, "computer science");
		Professor f = new Professor('A',"Imane", 32, 80, "communication");
		LocalDate d = LocalDate.of(03,12,18);
		LocalDate dd = LocalDate.of(28,11,18);
		LocalDate ddd = LocalDate.of(26,11,18);

		Absence q = new Absence(d, false);
		Absence w = new Absence(dd, false);
		Absence ww = new Absence(ddd, false);
		System.out.println(e.trackSituation());
		e.display();

		m.addAbsence(q);
		m.addAbsence(w);
		n.addAbsence(ww);
		try {
			n.justify(ww, "Participation à une journée sportive");
		} catch (AbsenceException e1) {
			System.out.println(e1.toString());
		}
		n.display();
		System.out.println(m.trackSituation());

		int a1 = list1.size();
		int a2 = list2.size();
		int a3 = list3.size();
		if(a1 <= a2 && a2 <= a1 ) {
			System.out.println(n.getFirstn()+" "+n.getLastn());
		}
		if(a1 <= a2 && a3 <= a2 ) {
			System.out.println(l.getFirstn()+" "+l.getLastn());
		}
		if(a2 <= a1 && a3 <= a1 ) {
			System.out.println(m.getFirstn()+" "+m.getLastn());
		}


	}




}
