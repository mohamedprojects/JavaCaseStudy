package manager;

import java.util.ArrayList;

public class TestEnreprise {

	public static void main(String[] args) {
		ArrayList<Employee> liste1 = new ArrayList<Employee>();
		ArrayList<Employee> liste2 = new ArrayList<Employee>();

		Manager m=null;
		try {
			m = new Manager("B","Ahmed",18000,3000,liste1);
		} catch (ManagerException e) {
			System.out.println(e.toString());
		}
		Manager n=null;
		try {
			n = new Manager("A","Imane",15000,5000,liste2);
		} catch (ManagerException e) {
			System.out.println(e.toString());
		}

		Employee a = new Employee("A","Youssef",11000,3000,300,m);
		Employee b = new Employee("A","Mohameed",10000,3000,200,n);
		Employee c = new Employee("A","Mouna",11000,3000,100,m);

		liste1.add(a);
		liste1.add(c);
		liste2.add(b);
		System.out.println(m.bestEmployee().getFirstn());
		m.worstEmployee();
		System.out.println(m.calculateSalary());
		m.display();
		System.out.println(a.calculateSalary());
		a.display();
	}

}
