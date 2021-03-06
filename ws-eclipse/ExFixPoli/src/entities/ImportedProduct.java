package entities;

public class ImportedProduct extends Product {
	
	private Double customFee;
	
	
	public ImportedProduct () {}

	public ImportedProduct(String name, Double price, Double customFee) {
		super(name, price);
		this.customFee = customFee;
	}


	@Override
	public String priceTag() {
		return super.getName() + " - $ " + super.getPrice() + "(Customs fee: " + this.customFee + ")";
	}

}
