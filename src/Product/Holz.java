package Product;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import GUI.GUI;

public class Holz extends Product{
	
	private String Art = new String();		//Art (Kiefer, Buche, Eiche)
	private String Form = new String();	//Form (Bretter, Balken, Scheit)
	
	private Icon icnPlaceHolder = new ImageIcon(GUI.class.getResource("placeholder.png"));
	private Icon buche_balken = new ImageIcon(GUI.class.getResource("Buche_Balken.png"));
	private Icon buche_brett = new ImageIcon(GUI.class.getResource("Buche_Brett.png"));
	private Icon buche_scheit = new ImageIcon(GUI.class.getResource("Buche_Scheit.png"));
	private Icon eiche_balken = new ImageIcon(GUI.class.getResource("Eiche_Balken.png"));
	private Icon eiche_brett = new ImageIcon(GUI.class.getResource("Eiche_Brett.png"));
	private Icon eiche_scheit = new ImageIcon(GUI.class.getResource("Eiche_Scheit.png"));
	private Icon kiefer_balken = new ImageIcon(GUI.class.getResource("Kiefer_Balken.png"));
	private Icon kiefer_brett = new ImageIcon(GUI.class.getResource("Kiefer_Brett.png"));
	private Icon kiefer_scheit = new ImageIcon(GUI.class.getResource("Kiefer_Scheit.png"));
	
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
	
	public Icon getIcon() {
		
		//Kiefer
		if(Art == "Kiefer") {
			if(Form == "Bretter") {
				return kiefer_brett;
			}
			if(Form == "Balken") {
				return kiefer_balken;
			}
			if(Form == "Scheit") {
				return kiefer_scheit;
			}
		}
		
		//Buche
		if(Art == "Buche") {
			if(Form == "Bretter") {
				return buche_brett;
			}
			if(Form == "Balken") {
				return buche_balken;
			}
			if(Form == "Scheit") {
				return buche_scheit;
			}
		}
		
		//Eiche
		if(Art == "Eiche") {
			if(Form == "Bretter") {
				return eiche_brett;
			}
			if(Form == "Balken") {
				return eiche_balken;
			}
			if(Form == "Scheit") {
				return eiche_scheit;
			}
		}
		return icnPlaceHolder;
	}
	
	
}
