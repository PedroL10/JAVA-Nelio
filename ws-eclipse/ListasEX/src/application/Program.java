package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<employee> list = new ArrayList<>();
		
		System.out.print("How many employees will be registered? ");
		int N = sc.nextInt();
		
		for ( int i = 0 ; i < N; i++) {
			
			System.out.println();
			System.out.println("Employee #" + (i+1) + ":");
			System.out.print("ID: ");
			Integer id = sc.nextInt();
			
			while (hasId(list,id)) {
				System.out.println("Id already taken! Try another Id: ");
				id = sc.nextInt();
			}
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			
			employee emp = new employee(id, name, salary);
			
			list.add(emp);
			
		}
		
		System.out.println();
		System.out.print("Enter the employee id that will have the salary raised: ");
		int idsalary = sc.nextInt();
		
		employee emp = list.stream().filter(x -> x.getId() == idsalary).findFirst().orElse(null);
		
		// Integer pos = position(list, idsalary);
		
		if (emp == null) {
			System.out.println("This id does not exists!");
		} else {
			System.out.print("Enter the percentage: ");
			double percent = sc.nextDouble();
			emp.increaseSalary(percent);
		}
		
		System.out.println();
		System.out.println("List of employess: ");
		for (employee e : list) {
			System.out.println(e);
		}
		
		
		sc.close();
	}
	
	static Integer position(List<employee> list, int id ) {
		for (int i = 0; i< list.size(); i++) {
			if(list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
	
	public static boolean hasId(List<employee> list, int id) {
		employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}
	

}
