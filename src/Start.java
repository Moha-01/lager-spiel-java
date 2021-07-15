import GUI.GUI;
import Product.Holz;
import Product.Papier;
import Product.Stein;

public class Start {
  public static void main(String[] args) {
	Papier papier = new Papier("White", "A3");
	System.out.println(papier);							//Product.Paper@cac736f
	System.out.println(papier.getProduktType());		//Paper
	
	
	Holz holz = new Holz("Kiefer", "Scheit");
	System.out.println(holz);
	System.out.println(holz.getProduktType());
	System.out.println(holz.getForm());
	
	Stein stein = new Stein("Marmor", "Leicht");
	System.out.println(stein);
	System.out.println(stein.getProduktType());
	System.out.println(stein.getArt());
	
	
	GUI Spiel = new GUI();
  }
}
