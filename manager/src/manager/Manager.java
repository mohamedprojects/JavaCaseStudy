package manager;

import java.util.ArrayList;

public class Manager extends Person{
	private int respBounus;
	private ArrayList<Employee> employee;
	private ArrayList<Employee> employe;

	public double calculateSalary() {
		return this.getBaseSalary()+ this.getRespBounus();
	}
	public void display() {
		System.out.println(this.getFirstn() +" "+ this.getLastn());
	}	
	
	public Manager(String l, String f, float r,int respBounus, ArrayList<Employee> employee) throws ManagerException {
		this.setFirstn(f);
		this.setLastn(l);
		this.setBaseSalary(r);
		if(respBounus < this.getBaseSalary()*0.01) {
			throw new ManagerException();
		}else {
			this.respBounus = respBounus;
		}
		this.respBounus = respBounus;
		this.employee = employee;
	}
	public int getRespBounus() {
		return respBounus;
	}
	public void setRespBounus(int respBounus) {
		this.respBounus = respBounus;
	}
	public ArrayList<Employee> getEmployee() {
		return employee;
	}
	public void setEmployee(ArrayList<Employee> employee) {
		this.employee = employee;
	}
	public void addEmploye(Employee e) {};
	public void displayEmployee() {
		for (int i=0; i<this.employee.size(); i++) {
			System.out.println(this.employee.get(i).getFirstn());
		}
	}
	public Employee bestEmployee() {
		Employee f = this.employee.get(0);
		for (int i=0; i<this.employee.size(); i++) {
			if(this.employee.get(i).isBetterThan(f) == 1) {
				f = this.employee.get(i);
			}
		}
		return f;
	}
	public ArrayList<Employee> worstEmployee(){
		
		for (int i=0; i<this.employee.size(); i++) {
			if(this.employee.get(i).getPerformance() < this.employee.get(i).getObjective()) {
				Employee e = this.employee.get(i);
				this.employe.add(e);
				System.out.println(this.employee.get(i).getFirstn());
			}
		}
		return employe;
	}

}
