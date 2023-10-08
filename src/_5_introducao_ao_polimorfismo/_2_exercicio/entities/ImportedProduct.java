package _5_introducao_ao_polimorfismo._2_exercicio.entities;

public class ImportedProduct extends Product {

	private Double customsFee;
	
	public ImportedProduct() {
		super();
	}

	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}
	
	public double totalPrice() {
		return getPrice() + customsFee;
	}
	
	@Override
	public String priceTag() {
		StringBuilder stringBuilder = new StringBuilder();
		
		stringBuilder.append(getName());
		stringBuilder.append(" $ ");
		stringBuilder.append(String.format("%.2f", totalPrice()));
		stringBuilder.append(" (Customs fee: $ ");
		stringBuilder.append(String.format("%.2f", customsFee));
		stringBuilder.append(")");

		return stringBuilder.toString();
	}
	
}
