package Entities;

public final class ImportedProduct extends Product{
	
	private static final String Total = null;
	private Double customsFee;
	
	private ImportedProduct( ) {
		
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
	
	public void CustomsFee() {
		System.out.println("(Customs Fee: " + customsFee);
	}
	
	public double totalPrice() {
		return price =+ customsFee;
	}
	

	@Override
	public String priceTag() {
		return getName() 
				+ " $ " 
				+ String.format("%.2f", totalPrice())
				+ " (Customs fee: $ " 
				+ String.format("%.2f", customsFee)
				+ ")";
	}
}