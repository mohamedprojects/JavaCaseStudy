package manager;

public abstract class Person {
	private String firstn;
	private String lastn;
	private float baseSalary;
	private String entreprise;
	
	public abstract double calculateSalary();
	public abstract void display();

	
	public String getFirstn() {
		return firstn;
	}
	public void setFirstn(String firstn) {
		this.firstn = firstn;
	}
	public String getLastn() {
		return lastn;
	}
	public void setLastn(String lastn) {
		this.lastn = lastn;
	}
	public float getBaseSalary() {
		return baseSalary;
	}
	public void setBaseSalary(float baseSalary) {
		this.baseSalary = baseSalary;
	}
	public String getEntreprise() {
		return entreprise;
	}
	public void setEntreprise(String entreprise) {
		this.entreprise = entreprise;
	}
	
}
