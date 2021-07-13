package Product;


public class Paper extends Product{
	
	private String PaperColor;
	private String PaperSize;
	
	public Paper(String pc, String ps) {
		setProductType("Paper");
		PaperColor = pc;
		PaperSize = ps;
	}
	
}
