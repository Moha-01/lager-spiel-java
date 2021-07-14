package Product;


public class Product {
	private String productType;
	
	public void setProductType(String PT) {
		try {
			productType = PT;
		} catch (Exception e) {
			System.out.println("Error: " + e);
		};
	}
	
	public String getProduktType() {
		return productType;
	}
}
