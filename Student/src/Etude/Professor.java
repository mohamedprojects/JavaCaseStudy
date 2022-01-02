package Etude;

public class Professor extends Person implements Trackable{
	private int teachingHours;
	private int object;
	private String speciality;
	public Professor(char a, String b, int c, int d,String e) {
		this.teachingHours = c;
		this.object = d;
		this.speciality = e;
		this.setLastn(a);
		this.setFirstn(b);
	}
	public int trackSituation() {
		int nbrh = object -  teachingHours;
		return nbrh;
	}
	
	public void display() {
		System.out.println(this.getLastn()+" "+this.getFirstn());


	}

}
