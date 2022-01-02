package Etude;

public abstract class Person implements Trackable{
	private String firstn;
	private char lastn;
	private String school;
	
	public abstract int trackSituation();
	
	public abstract void display();

	public char getLastn() {
		return lastn;
	}

	public void setLastn(char lastn) {
		this.lastn = lastn;
	}

	public String getFirstn() {
		return firstn;
	}

	public void setFirstn(String firstn) {
		this.firstn = firstn;
	}

	public String getSchool() {
		return school;
	}
}
