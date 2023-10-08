package _5_introducao_ao_polimorfismo._2_exercicio.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsedProduct extends Product {

	private LocalDate manufactureDate;

	public UsedProduct() {
		super();
	}

	public UsedProduct(String name, Double price, LocalDate manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	public LocalDate getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(LocalDate manufactureDate) {
		this.manufactureDate = manufactureDate;
	}

	@Override
	public String priceTag() {
		StringBuilder stringBuilder = new StringBuilder();

		stringBuilder.append(getName());
		stringBuilder.append(" (used) $ ");
		stringBuilder.append(String.format("%.2f", getPrice()));
		stringBuilder.append(" (Manufacture date: ");
		stringBuilder.append(manufactureDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		stringBuilder.append(")");
		
		return stringBuilder.toString();
	}

}
