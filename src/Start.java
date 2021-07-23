import GUI.GUI;
import Product.Holz;
import Product.Papier;
import Product.Product;
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

	System.out.println(holz.getIcon());
	
	Stein stein = new Stein("Marmor", "Leicht");
	System.out.println(stein);
	System.out.println(stein.getProduktType());
	System.out.println(stein.getArt());
	
	
	Product test = new Product();
	test.setProductType("Papier");

	System.out.println("1. " + test);
	System.out.println("2. " + test.getProduktType());
	
	
	if(test.getProduktType() == "Papier") {
		test = new Papier("Weiﬂ","A3");
	}
	System.out.println("3. " + test);
	System.out.println("4. " + ((Papier) test).getFarbe());
	System.out.println("5. " + ((Papier) test).getIcon());
	
	GUI Spiel = new GUI();
  }
}
