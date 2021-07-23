package Product;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import GUI.GUI;

public class Product {
	private String productType;
	private Icon icnPlaceHolder = new ImageIcon(GUI.class.getResource("placeholder.png"));
	
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
	
	public Icon getIcon() {
		return icnPlaceHolder;
	}
}
