package _6_classes_abstratas_e_metodos_abstratos._2_metodos_abstratos._1_exemplo.entities;

import _6_classes_abstratas_e_metodos_abstratos._2_metodos_abstratos._1_exemplo.entities.enums.Color;

public abstract class Shape {

	private Color color;

	public Shape() {
	}

	public Shape(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public abstract double area();

}
