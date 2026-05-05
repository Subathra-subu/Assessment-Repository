package assessment_Q_2;

public class ElectronicProduct extends Product {
	
	private int warrantyPeriod;

	public ElectronicProduct(int productId, String productName, double price, int warrantyPeriod) {
		super(productId, productName, price);
		this.warrantyPeriod = warrantyPeriod;
	}

	public int getWarrantyPeriod() {
		return warrantyPeriod;
	}

	public String displayInfo() {
		return "\nELECTRONIC PRODUCT INFORMATION:"
				+ "\nProduct_Id: "+getProductId()+"\nProduct_Name: "
				+getProductName()+"\nPrice: "+getPrice()+"\nWarranty Period: "+
				getWarrantyPeriod()+" Months";
	}
	

}
