package com.techinicalclicks.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaComparatorExample {

	public static void main(String[] args) {
		List<Employee> employeeList1 = getEmployees();
		System.out.println("-----------Before sorting list-------------- \n" + employeeList1);

		// Using Anonymous class (Old way)
		Collections.sort(employeeList1, new Comparator<Employee>() {
			@Override
			public int compare(Employee e1, Employee e2) {
				return new Integer(e1.getAge()).compareTo(new Integer(e2.getAge()));
			}
		});
		System.out.println("-------------After sorting list using anonymous class-------------");
		System.out.println(employeeList1);

		// Using Lambda expression
		List<Employee> employeeList2 = getEmployees();
		System.out.println("-----------Before sorting list-------------- \n" + employeeList2);
		// Anonymous Inner class replaced with Lambda expression
		Collections.sort(employeeList2, (e1, e2) -> {
			return new Integer(e1.getAge()).compareTo(new Integer(e2.getAge()));
		});
		System.out.println("---------------After sorting list using Lambda expression--------------");
		System.out.println(employeeList2);
	}

	private static List<Employee> getEmployees() {
		List<Employee> employee = new ArrayList<>();
		employee.add(new Employee(5, "George", 28));
		employee.add(new Employee(8, "Mike", 35));
		employee.add(new Employee(10, "sathish", 30));
		employee.add(new Employee(2, "John", 22));
		employee.add(new Employee(4, "Manish", 17));
		employee.add(new Employee(7, "Tony", 27));
		return employee;
	}

}
