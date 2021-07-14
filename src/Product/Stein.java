package Product;

public class Stein extends Product{
		
	private String Art;			//Art (Marmor, Granit, Sandstein)
	private String Gewicht;		//Gewicht (Leicht, Mittel, Schwer)
	
	//Besonderheiten
	/*
	 * Schwere Steine sind zu Schwer f�r das Regal und k�nnen nur auf den unteren beiden Etagen eingelagert werden.
	 * Mittelschwere k�nnen nicht in der obersten Etage eingelagert werden.
	 * */
	
	public Stein(String Art, String Gewicht) {
		setProductType("Stein");
		this.Art = Art;
		this.Gewicht = Gewicht;
	}
	
	public void setArt(String Art) {
		this.Art = Art;
	}
	
	public String getArt() {
		return Art;
	}
	
	public void setGewicht(String Gewicht) {
		this.Gewicht = Gewicht;
	}
	
	public String getGewicht() {
		return Gewicht;
	}
	
}
