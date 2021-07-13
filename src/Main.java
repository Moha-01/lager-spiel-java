import GUI.GUI;
import Product.Paper;

public class Main {
  public static void main(String[] args) {
	Paper paper = new Paper("White", "A3");
	System.out.println(paper);
	System.out.println(paper.getProduktType());
    GUI Spiel = new GUI();
  }
}
