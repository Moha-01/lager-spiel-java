package Product;

public class Papier extends Product{
	
	private String Farbe;		//Farbe (Weiß, Grün, Blau)	
	private String Groesse;		//Größe (A3, A4, A5)
	
	public Papier(String Farbe, String Groesse) {
		setProductType("Papier");
		this.Farbe = Farbe;
		this.Groesse = Groesse;
	}
	
	public void setFarbe(String Farbe) {
		this.Farbe = Farbe;
	}
	
	public String getFarbe() {
		return Farbe;
	}
	
	public void setGroesse(String Groesse) {
		this.Groesse = Groesse;
	}
	
	public String getGroesse() {
		return Groesse;
	}
	
}
