package _6_classes_abstratas_e_metodos_abstratos._3_exercicio.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import _6_classes_abstratas_e_metodos_abstratos._3_exercicio.entities.Company;
import _6_classes_abstratas_e_metodos_abstratos._3_exercicio.entities.Individual;
import _6_classes_abstratas_e_metodos_abstratos._3_exercicio.entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		List<TaxPayer> taxPayers = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers:");
		int n = scanner.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Tax payer #" + i + " data:");
			
			System.out.print("Individual or company (i/c)? ");
			char response = scanner.next().charAt(0);
			
			System.out.print("Name: ");
			scanner.nextLine();
			String name = scanner.nextLine();
			
			System.out.print("Anual income: ");
			double anualIncome = scanner.nextDouble();
			
			if (response == 'i') {
				System.out.print("Health expenditures: ");
				double healthExpenditures = scanner.nextDouble();
				
				taxPayers.add(new Individual(name, anualIncome, healthExpenditures));
			} else {
				System.out.print("Number of employees: ");
				int numberOfEmployees = scanner.nextInt();
				
				taxPayers.add(new Company(name, anualIncome, numberOfEmployees));
			}
		}
		
		System.out.println();
		
		System.out.println("TAXES PAID:");

		double sum = 0.0;
		
		for (TaxPayer taxPayer : taxPayers) {
			System.out.println(taxPayer);
			sum += taxPayer.tax();
		}
		
		System.out.println();
		
		System.out.printf("TOTAL TAXES: $ %.2f", sum);
		
		scanner.close();
	}
	
}
