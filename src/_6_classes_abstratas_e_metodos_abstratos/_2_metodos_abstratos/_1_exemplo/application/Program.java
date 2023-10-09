package _6_classes_abstratas_e_metodos_abstratos._2_metodos_abstratos._1_exemplo.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import _6_classes_abstratas_e_metodos_abstratos._2_metodos_abstratos._1_exemplo.entities.Circle;
import _6_classes_abstratas_e_metodos_abstratos._2_metodos_abstratos._1_exemplo.entities.Rectangle;
import _6_classes_abstratas_e_metodos_abstratos._2_metodos_abstratos._1_exemplo.entities.Shape;
import _6_classes_abstratas_e_metodos_abstratos._2_metodos_abstratos._1_exemplo.entities.enums.Color;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		List<Shape> shapes = new ArrayList<>();
		
		System.out.print("Enter the number of shapes: ");
		int n = scanner.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Shape #" + i + " data:");
			
			System.out.print("Rectangle or Circle (r/c)? ");
			char response = scanner.next().charAt(0);
			
			System.out.print("Color (BLACK/BLUE/RED): ");
			Color color = Color.valueOf(scanner.next());
			
			if (response == 'r') {
				System.out.print("Width: ");
				double width = scanner.nextDouble();
				
				System.out.print("Height: ");
				double height = scanner.nextDouble();
				
				shapes.add(new Rectangle(color, width, height));
			} else {
				System.out.print("Radius: ");
				double radius = scanner.nextDouble();
				
				shapes.add(new Circle(color, radius));
			}
		}
		
		System.out.println();
		
		System.out.println("SHAPE AREAS:");
		
		for (Shape shape : shapes) {
			System.out.println(String.format("%.2f", shape.area()));
		}
		
		scanner.close();
	}
	
}
