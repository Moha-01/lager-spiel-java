package Product;

public class Holz extends Product{
	
	private String Art;		//Art (Kiefer, Buche, Eiche)
	private String Form;	//Form (Bretter, Balken, Scheit)
	
	//Besonderheiten:
	/* 
	 * Holzbalken sind lang und werden daher auf zwei Paletten verteilt.
	 * Ein gesamter Lagerplatz wird notwendig
	 * 
	 * */
	
	public Holz() {
		setProductType("Holz");
	}
	
	public Holz(String Art, String Form) {
		setProductType("Holz");
		this.Art = Art;
		this.Form = Form;
	}
	
	public void setArt(String Art) {
		this.Art = Art;
	}
	
	public String getArt() {
		return Art;
	}
	
	public void setForm(String Form) {
		this.Form = Form;
	}
	
	public String getForm() {
		return Form;
	}
	
	
}
