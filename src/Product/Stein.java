/*
 * Student:  Mohamed Haji
 * Kurs: 	 INF20B
 * Matr.Nr.: 8528264
 * GitHub: 	 https://github.com/Moha-01/lager-spiel-java
 * 
 */


package Product;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import GUI.GUI;

public class Stein extends Product{
		
	private String Art = new String();			//Art (Marmor, Granit, Sandstein)
	private String Gewicht = new String();		//Gewicht (Leicht, Mittel, Schwer)
	
	private Icon icnPlaceHolder = new ImageIcon(GUI.class.getResource("placeholder.png"));
	private Icon granit_leicht = new ImageIcon(GUI.class.getResource("Granit_Leicht.png"));
	private Icon granit_mittel = new ImageIcon(GUI.class.getResource("Granit_Mittel.png"));
	private Icon granit_schwer = new ImageIcon(GUI.class.getResource("Granit_Schwer.png"));
	private Icon sandstein_leicht = new ImageIcon(GUI.class.getResource("Sandstein_Leicht.png"));
	private Icon sandstein_mittel = new ImageIcon(GUI.class.getResource("Sandstein_Mittel.png"));
	private Icon sandstein_schwer = new ImageIcon(GUI.class.getResource("Sandstein_Schwer.png"));
	private Icon marmor_leicht = new ImageIcon(GUI.class.getResource("Marmor_leicht.png"));
	private Icon marmor_mittel = new ImageIcon(GUI.class.getResource("Marmor_Mittel.png"));
	private Icon marmor_schwer = new ImageIcon(GUI.class.getResource("Marmor_Schwer.png"));
	
	//Besonderheiten
	/*
	 * Schwere Steine sind zu Schwer für das Regal und können nur auf den unteren beiden Etagen eingelagert werden.
	 * Mittelschwere können nicht in der obersten Etage eingelagert werden.
	 * */
	
	public Stein() {
		setProductType("Stein");
	}
	
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
	
	public Icon getIcon() {
		//Weis
		if(Art == "Marmor") {
			if(Gewicht == "Leicht") {
				return marmor_leicht;
			}
			if(Gewicht == "Mittel") {
				return marmor_mittel;
			}
			if(Gewicht == "Schwer") {
				return marmor_schwer;
			}
		}
		//Grün
		if(Art == "Granit") {
			if(Gewicht == "Leicht") {
				return granit_leicht;
			}
			if(Gewicht == "Mittel") {
				return granit_mittel;
			}
			if(Gewicht == "Schwer") {
				return granit_schwer;
			}
		}
		//Blau
		if(Art == "Sandstein") {
			if(Gewicht == "Leicht") {
				return sandstein_leicht;
			}
			if(Gewicht == "Mittel") {
				return sandstein_mittel;
			}
			if(Gewicht == "Schwer") {
				return sandstein_schwer;
			}
		}
		return icnPlaceHolder;
	}
	
}
