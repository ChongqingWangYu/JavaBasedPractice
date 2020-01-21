package cqut.设计模式实训.第五次实验.Observer11;

import java.util.ArrayList;

public class EmployeeList {
	private ArrayList<Employee> arrayList=new ArrayList<>();
	
	public void addEmployye(Employee employee){
		arrayList.add(employee);
	}
	
	public void accept(Department handler) {
		for (Employee emp : arrayList) {
			emp.accept(handler);
		}
	}
}
