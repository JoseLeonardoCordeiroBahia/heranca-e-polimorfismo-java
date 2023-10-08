package _5_introducao_ao_polimorfismo._2_exercicio.application;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import _5_introducao_ao_polimorfismo._2_exercicio.entities.ImportedProduct;
import _5_introducao_ao_polimorfismo._2_exercicio.entities.Product;
import _5_introducao_ao_polimorfismo._2_exercicio.entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		List<Product> products = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int n = scanner.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Product #" + i + " data:");
			
			System.out.print("Common, used or imported (c/u/i)? ");
			char response = scanner.next().charAt(0);
			
			System.out.print("Name: ");
			scanner.nextLine();
			String name = scanner.nextLine();
			
			System.out.print("Price: ");
			double price = scanner.nextDouble();
			
			if (response == 'c') {
				products.add(new Product(name, price));
			} else if (response == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				LocalDate manufactureDate = LocalDate
						.parse(scanner.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				
				products.add(new UsedProduct(name, price, manufactureDate));
			} else {
				System.out.print("Customs fee: ");
				double customsFee = scanner.nextDouble();
				
				products.add(new ImportedProduct(name, price, customsFee));
			}
		}
		
		System.out.println();
		
		System.out.println("PRICE TAGS:");
		
		for (Product product : products) {
			System.out.println(product.priceTag());
		}
		
		scanner.close();
	}
	
}
