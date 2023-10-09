package _6_classes_abstratas_e_metodos_abstratos._2_metodos_abstratos._1_exemplo.entities;

import _6_classes_abstratas_e_metodos_abstratos._2_metodos_abstratos._1_exemplo.entities.enums.Color;

public class Circle extends Shape {

	private Double radius;

	public Circle() {
		super();
	}

	public Circle(Color color, Double radius) {
		super(color);
		this.radius = radius;
	}

	public Double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		return Math.PI * radius * radius;
	}

}
