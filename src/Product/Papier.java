package Product;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import GUI.GUI;

public class Papier extends Product{
	
	private String Farbe;		//Farbe (Weiß, Grün, Blau)	
	private String Groesse;		//Größe (A3, A4, A5)
	
	private Icon icnPlaceHolder = new ImageIcon(GUI.class.getResource("placeholder.png"));
	private Icon papier_blue_a3 = new ImageIcon(GUI.class.getResource("papier_blue_a3.png"));
	private Icon papier_blue_a4 = new ImageIcon(GUI.class.getResource("papier_blue_a4.png"));
	private Icon papier_blue_a5 = new ImageIcon(GUI.class.getResource("papier_blue_a5.png"));
	private Icon papier_green_a3 = new ImageIcon(GUI.class.getResource("papier_green_a3.png"));
	private Icon papier_green_a4 = new ImageIcon(GUI.class.getResource("papier_green_a4.png"));
	private Icon papier_green_a5 = new ImageIcon(GUI.class.getResource("papier_green_a5.png"));
	private Icon papier_white_a3 = new ImageIcon(GUI.class.getResource("papier_white_a3.png"));
	private Icon papier_white_a4 = new ImageIcon(GUI.class.getResource("papier_white_a4.png"));
	private Icon papier_white_a5 = new ImageIcon(GUI.class.getResource("papier_white_a5.png"));
	
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
	
	
	public Icon getIcon() {
		//Weis
		if(Farbe == "White") {
			if(Groesse == "A3") {
				return papier_white_a3;
			}
			if(Groesse == "A4") {
				return papier_white_a4;
			}
			if(Groesse == "A5") {
				return papier_white_a5;
			}
		}
		//Grün
		if(Farbe == "Green") {
			if(Groesse == "A3") {
				return papier_green_a3;
			}
			if(Groesse == "A4") {
				return papier_green_a4;
			}
			if(Groesse == "A5") {
				return papier_green_a5;
			}
		}
		//Blau
		if(Farbe == "Blue") {
			if(Groesse == "A3") {
				return papier_blue_a3;
			}
			if(Groesse == "A4") {
				return papier_blue_a4;
			}
			if(Groesse == "A5") {
				return papier_blue_a5;
			}
		}
		return icnPlaceHolder;
	}
}
