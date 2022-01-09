package manager;

public class Employee extends Person  implements Comparable {
	private int performance;
	private int perfBonus;
	private int objective;
	private Manager manager;
	
	public double calculateSalary() {
		int x =0;
		if (this.getPerformance()>1) {
			x = this.getPerformance();
		}
		return this.getBaseSalary()+x	;
	}
	
	public void display() {
		System.out.println(this.getFirstn()+" "+this.getLastn());
	}
	public int isBetterThan(Employee a) {
		if (this.getPerformance() < a.getPerformance()) {
			return -1;
		}
		else if(this.getPerformance() > a.getPerformance()) {
			return 1;
		}
		else {
			return 0;
		}
	}
	public Employee(String l, String f, float b, int perfBonus, int performance, Manager manager) {
		this.setFirstn(f);
		this.setLastn(l);
		this.setBaseSalary(b);
		this.performance = performance;
		this.perfBonus = perfBonus;
		this.manager = manager;
	}
	public int getPerformance() {
		return performance;
	}
	public void setPerformance(int performance) {
		this.performance = performance;
	}
	public int getPerfBonus() {
		return perfBonus;
	}
	public void setPerfBonus(int perfBonus) {
		this.perfBonus = perfBonus;
	}
	public int getObjective() {
		return objective;
	}
	public void setObjective(int objective) {
		this.objective = objective;
	}
	public Manager getManager() {
		return manager;
	}
	public void setManager(Manager manager) {
		this.manager = manager;
	}
	
}
