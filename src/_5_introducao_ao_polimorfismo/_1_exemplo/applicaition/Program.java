package _5_introducao_ao_polimorfismo._1_exemplo.applicaition;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import _5_introducao_ao_polimorfismo._1_exemplo.entities.Employee;
import _5_introducao_ao_polimorfismo._1_exemplo.entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		List<Employee> employees = new ArrayList<>();
		
		System.out.print("Enter the number of employees: ");
		int n = scanner.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Employee #" + i + " data:");
			
			System.out.print("Outsourced (y/n)? ");
			char response = scanner.next().charAt(0);
			
			System.out.print("Name: ");
			scanner.nextLine();
			String name = scanner.nextLine();
			
			System.out.print("Hours: ");
			int hours = scanner.nextInt();
			
			System.out.print("Value per hour: ");
			double valuePerHour = scanner.nextDouble();
			
			if (response == 'y') {
				System.out.print("Additional charge: ");
				double additionalCharge = scanner.nextDouble();
				
				employees.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
			} else {
				employees.add(new Employee(name, hours, valuePerHour));
			}
		}
		
		System.out.println();
		
		System.out.println("PAYMENTS:");
		
		for (Employee employee : employees) {
			System.out.println(employee);
		}
		
		scanner.close();
	}
	
}
