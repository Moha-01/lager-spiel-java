package Regale;

import java.awt.Color;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import Auftrag.Auftrag;
import GUI.GUI;
import Product.Holz;
import Product.Papier;
import Product.Product;
import Product.Stein;

public class Regal2 {

	private JPanel regal2Panel = new JPanel();
	private Icon icnPlaceHolder = new ImageIcon(GUI.class.getResource("placeholder.png"));


	// r1v1 = Regal 1 Vorne 1 | r2h2 = regal 2 hinten 2
	//Regal 2
	public JButton [] RegalVorne = new JButton[5];
	public JButton [] RegalHinten = new JButton[5];

	private JLabel Label2Regal = new JLabel();
	private JLabel Label2Vorne = new JLabel();
	private JLabel Label2Hinten = new JLabel();


	private Auftrag auftrag[] = new Auftrag[4];
	private int auftragIndex;
	private boolean auftragSelected[] = new boolean[4];


	//Platzhalter
	private boolean [] regalVornePH = new boolean[5];
	private boolean [] regalHintenPH = new boolean[5];

	private Product [] ProduktVorne = new Product[5];
	private Product [] ProduktHinten = new Product[5];



	private void Components() {
		regal2Panel.setBounds(450 , 30, 370, 465);
		regal2Panel.setLayout(null);


		//Regal 2 Vorne
		int abstandy = 24;

		for(int i = 0; i < 5; i++){
			RegalVorne[i] = new JButton();
			RegalHinten[i] = new JButton();

			RegalVorne[i].setIcon(icnPlaceHolder);
			RegalHinten[i].setIcon(icnPlaceHolder);

			RegalVorne[i].setBorder(new LineBorder(Color.BLACK));
			RegalHinten[i].setBorder(new LineBorder(Color.BLACK));

			RegalVorne[i].setBackground(Color.WHITE);
			RegalVorne[i].setForeground(Color.BLACK);

			RegalHinten[i].setBackground(Color.WHITE);
			RegalHinten[i].setForeground(Color.BLACK);


			RegalVorne[i].setFocusPainted(false);
			RegalVorne[i].setMargin(new Insets(2, 2, 2, 2));


			RegalHinten[i].setFocusPainted(false);
			RegalHinten[i].setMargin(new Insets(2, 2, 2, 2));

			regalVornePH[i] = false;
			regalHintenPH[i] = false;

			ProduktVorne[i] = new Product();
			ProduktHinten[i] = new Product();

		}



		RegalVorne[0].setBounds(0, abstandy, 180, 80);
		RegalVorne[0].addActionListener(new ActionListener() {
	      public void actionPerformed(ActionEvent evt) {
	    	  buttonClickVorne(0);
	      }
	    });

	    abstandy=(abstandy + 82);

	    RegalVorne[1].setBounds(0, abstandy, 180, 80);
	    RegalVorne[1].addActionListener(new ActionListener() {
	      public void actionPerformed(ActionEvent evt) {
	    	  buttonClickVorne(1);
	      }
	    });

	    abstandy=(abstandy + 82);
	    RegalVorne[2].setBounds(0, abstandy, 180, 80);
	    RegalVorne[2].addActionListener(new ActionListener() {
	      public void actionPerformed(ActionEvent evt) {
	    	  buttonClickVorne(2);
	      }
	    });

	    abstandy=(abstandy + 82);
	    RegalVorne[3].setBounds(0, abstandy, 180, 80);
	    RegalVorne[3].addActionListener(new ActionListener() {
	      public void actionPerformed(ActionEvent evt) {
	    	  buttonClickVorne(3);
	      }
	    });

	    abstandy=(abstandy + 82);
	    RegalVorne[4].setBounds(0, abstandy, 180, 80);
	    RegalVorne[4].addActionListener(new ActionListener() {
	      public void actionPerformed(ActionEvent evt) {
	    	  buttonClickVorne(4);
	      }
	    });

	    // Regal 1 Hinten
	    abstandy = 24;
	    RegalHinten[0].setBounds(185, abstandy, 180, 80);
	    RegalHinten[0].addActionListener(new ActionListener() {
	      public void actionPerformed(ActionEvent evt) {
	    	  buttonClickHinten(0);
	      }
	    });

	    abstandy=(abstandy + 82);
	    RegalHinten[1].setBounds(185, abstandy, 180, 80);
	    RegalHinten[1].addActionListener(new ActionListener() {
	      public void actionPerformed(ActionEvent evt) {
	    	  buttonClickHinten(1);
	      }
	    });

	    abstandy=(abstandy + 82);
	    RegalHinten[2].setBounds(185, abstandy, 180, 80);
	    RegalHinten[2].addActionListener(new ActionListener() {
	      public void actionPerformed(ActionEvent evt) {
	    	  buttonClickHinten(2);
	      }
	    });

	    abstandy=(abstandy + 82);
	    RegalHinten[3].setBounds(185, abstandy, 180, 80);
	    RegalHinten[3].addActionListener(new ActionListener() {
	      public void actionPerformed(ActionEvent evt) {
	    	  buttonClickHinten(3);
	      }
	    });

	    abstandy=(abstandy + 82);
	    RegalHinten[4].setBounds(185, abstandy, 180, 80);
	    RegalHinten[4].addActionListener(new ActionListener() {
	      public void actionPerformed(ActionEvent evt) {
	    	  buttonClickHinten(4);
	      }
	    });

	    Label2Regal.setBounds(1, 0, 363, 20);
	    Label2Regal.setText("2. Regal");
	    Label2Regal.setHorizontalAlignment(SwingConstants.CENTER);
	    Label2Regal.setHorizontalTextPosition(SwingConstants.CENTER);
	    Label2Regal.setBackground(Color.BLACK);
	    Label2Regal.setForeground(Color.WHITE);
	    Label2Regal.setOpaque(true);

	    Label2Vorne.setBounds(1, 435, 177, 20);
	    Label2Vorne.setText("Vorne");
	    Label2Vorne.setHorizontalAlignment(SwingConstants.CENTER);
	    Label2Vorne.setHorizontalTextPosition(SwingConstants.CENTER);
	    Label2Vorne.setBackground(Color.GREEN);
	    Label2Vorne.setOpaque(true);

	    Label2Hinten.setBounds(187, 435, 177, 20);
	    Label2Hinten.setText("Hinten");
	    Label2Hinten.setHorizontalAlignment(SwingConstants.CENTER);
	    Label2Hinten.setHorizontalTextPosition(SwingConstants.CENTER);
	    Label2Hinten.setBackground(Color.YELLOW);
	    Label2Hinten.setOpaque(true);


	    //Regal 2 Vorne
		regal2Panel.add(RegalVorne[0]);
		regal2Panel.add(RegalVorne[1]);
		regal2Panel.add(RegalVorne[2]);
		regal2Panel.add(RegalVorne[3]);
		regal2Panel.add(RegalVorne[4]);

		//Regal 2 Hinten
		regal2Panel.add(RegalHinten[0]);
		regal2Panel.add(RegalHinten[1]);
		regal2Panel.add(RegalHinten[2]);
		regal2Panel.add(RegalHinten[3]);
		regal2Panel.add(RegalHinten[4]);

		regal2Panel.add(Label2Regal);
		regal2Panel.add(Label2Vorne);
		regal2Panel.add(Label2Hinten);


		regal2Panel.setBackground(Color.GRAY);
		regal2Panel.setVisible(true);
	}

	private boolean setIconInfo(int index, boolean [] ph, Product [] product, JButton [] btnRegal) {

		try {
	  		product[index].setProductType(auftrag[auftragIndex].getProdukt());
	  	}catch (Exception e) {
	  		  System.out.println(e);
	  	}
	  	boolean leicht = false;
	  	boolean mittel = false;
	  	boolean schwer = false;
	  	String iconPath = "";

		if(ph[index] == false && auftragSelected[auftragIndex] && auftrag[auftragIndex].getAuftragArt().equals("Einlagerung")) {
			ph[index] = true;
  			if(product[index].getProduktType().equals("Papier")) {
  				product[index] = new Papier();
  				//.equals() & eine einfache String "" unterscheiden sich an irgendein Punkt
  				//Papier(auftrag[auftragIndex].getAuftragAttribut_1(), ...) wärre hier Fehlerhaft
  				if(auftrag[auftragIndex].getAttribut_1().equals("Weiß")) {
  					((Papier) product[index]).setFarbe("Weiß");
  				}
  				if(auftrag[auftragIndex].getAttribut_1().equals("Blau")) {
  					((Papier) product[index]).setFarbe("Blau");
  				}
  				if(auftrag[auftragIndex].getAttribut_1().equals("Grün")) {
  					((Papier) product[index]).setFarbe("Grün");
  				}
  				if(auftrag[auftragIndex].getAttribut_2().equals("A4")) {
  					((Papier) product[index]).setGroesse("A4");
  				}
  				if(auftrag[auftragIndex].getAttribut_2().equals("A3")) {
  					((Papier) product[index]).setGroesse("A3");
  				}
  				if(auftrag[auftragIndex].getAttribut_2().equals("A5")) {
  					((Papier) product[index]).setGroesse("A5");
  				}
  				btnRegal[index].setIcon(((Papier) product[index]).getIcon());
  				iconPath = btnRegal[index].getIcon().toString();
  				System.out.println("[icon]: " + iconPath);

  				if (iconPath.contains("placeholder.png")) {
  					auftrag[auftragIndex].setAuftragDone(false);
				}else {
					auftrag[auftragIndex].setAuftragDone(true);
				}

  			}
  			if(product[index].getProduktType().equals("Holz")) {
  				product[index] = new Holz();
  				if(auftrag[auftragIndex].getAttribut_1().equals("Kiefer")) {
  					((Holz) product[index]).setArt("Kiefer");
  				}
  				if(auftrag[auftragIndex].getAttribut_1().equals("Buche")) {
  					((Holz) product[index]).setArt("Buche");
  				}
  				if(auftrag[auftragIndex].getAttribut_1().equals("Eiche")) {
  					((Holz) product[index]).setArt("Eiche");
  				}
  				if(auftrag[auftragIndex].getAttribut_2().equals("Bretter")) {
  					((Holz) product[index]).setForm("Bretter");
  				}
  				if(auftrag[auftragIndex].getAttribut_2().equals("Balken")) {
  					((Holz) product[index]).setForm("Balken");
  				}
  				if(auftrag[auftragIndex].getAttribut_2().equals("Scheit")) {
  					((Holz) product[index]).setForm("Scheit");
  				}


  				btnRegal[index].setIcon(((Holz) product[index]).getIcon());
  				iconPath = btnRegal[index].getIcon().toString();
  				System.out.println("[icon]: " + iconPath);

  				if (iconPath.contains("placeholder.png")) {
  					auftrag[auftragIndex].setAuftragDone(false);
				}else {
					auftrag[auftragIndex].setAuftragDone(true);
				}

  			}
  			if(product[index].getProduktType().equals("Stein")) {
  				product[index] = new Stein();
  				if(auftrag[auftragIndex].getAttribut_1().equals("Marmor")) {
  					((Stein) product[index]).setArt("Marmor");
  				}
  				if(auftrag[auftragIndex].getAttribut_1().equals("Granit")) {
  					((Stein) product[index]).setArt("Granit");
  				}
  				if(auftrag[auftragIndex].getAttribut_1().equals("Sandstein")) {
  					((Stein) product[index]).setArt("Sandstein");
  				}
  				if(auftrag[auftragIndex].getAttribut_2().equals("Leicht")) {
  					((Stein) product[index]).setGewicht("Leicht");
  					leicht = true;
  				}
  				if(auftrag[auftragIndex].getAttribut_2().equals("Mittel")) {
  					((Stein) product[index]).setGewicht("Mittel");
  					mittel = true;
  				}
  				if(auftrag[auftragIndex].getAttribut_2().equals("Schwer")) {
  					((Stein) product[index]).setGewicht("Schwer");
  					schwer = true;
  				}

  				if(schwer && (index == 3 || index == 4)) {
  					btnRegal[index].setIcon(((Stein) product[index]).getIcon());
  					iconPath = btnRegal[index].getIcon().toString();
  	  				System.out.println("[icon]: " + iconPath);

  	  				if (iconPath.contains("placeholder.png")) {
  	  					auftrag[auftragIndex].setAuftragDone(false);
  					}else {
  						auftrag[auftragIndex].setAuftragDone(true);
  					}

  				}else if(schwer && (index == 0 || index == 1 || index == 2)){
  					JFrame frame = new JFrame();
					JOptionPane.showMessageDialog(frame ,
				    "Stein zu Schwer!",
				    "Fehler",
				    JOptionPane.ERROR_MESSAGE);
					ph[index] = false;
  				}

  				if(mittel && (index == 1 || index == 2 || index == 3 || index == 4)) {
  					btnRegal[index].setIcon(((Stein) product[index]).getIcon());
  					iconPath = btnRegal[index].getIcon().toString();
  	  				System.out.println("[icon]: " + iconPath);

  	  				if (iconPath.contains("placeholder.png")) {
  	  					auftrag[auftragIndex].setAuftragDone(false);
  					}else {
  						auftrag[auftragIndex].setAuftragDone(true);
  					}

  				}else if(mittel && (index == 0)){
  					JFrame frame = new JFrame();
					JOptionPane.showMessageDialog(frame ,
				    "Stein zu Schwer!",
				    "Fehler",
				    JOptionPane.ERROR_MESSAGE);
					ph[index] = false;

  				}

  				if(leicht) {
  					btnRegal[index].setIcon(((Stein) product[index]).getIcon());
  					iconPath = btnRegal[index].getIcon().toString();
  	  				System.out.println("[icon]: " + iconPath);

  	  				if (iconPath.contains("placeholder.png")) {
  	  					auftrag[auftragIndex].setAuftragDone(false);
  					}else {
  						auftrag[auftragIndex].setAuftragDone(true);
  					}
  				}
  			}

  		 }
		if(ph[index] == false && auftragSelected[auftragIndex] && auftrag[auftragIndex].getAuftragArt().equals("Auslagerung")){

  			if (btnRegal[index].getIcon().toString().contains("placeholder.png") == true) {
  				JFrame frame = new JFrame();
				JOptionPane.showMessageDialog(frame ,
			    "Lagerplatz leer!",
			    "Fehler",
			    JOptionPane.ERROR_MESSAGE);
			}
  		 }

		funcAuslagerung(index, ph, product, btnRegal);

		return true;
	}

	private void buttonClickVorne(int index) {
		try {
  		  auftrag = GUI.getAuftragDaten();
  	  	  auftragSelected = GUI.getAuftragSelected();
	  	  for(int i = 0; i < 4; i++) {
		  	if(auftragSelected[i] == true) {
					auftragIndex = i;
			}
	  	  }
	  		if(auftrag[auftragIndex].getProdukt().equals("Holz") && auftrag[auftragIndex].getAttribut_2().equals("Balken") && auftrag[auftragIndex].getAuftragArt().equals("Einlagerung")) {
		  		if(ProduktHinten[index].getIcon().toString().contains("placeholder.png") == true) {
		    		setIconInfo(index, regalHintenPH, ProduktHinten, RegalHinten);
		    		setIconInfo(index, regalVornePH, ProduktVorne, RegalVorne);
		    	 }else if(ProduktVorne[index].getIcon().toString().contains("placeholder.png") == false && ProduktHinten[index].getIcon().toString().contains("placeholder.png") == false) {
					JFrame frame = new JFrame();
					JOptionPane.showMessageDialog(frame ,
					"Platz Belegt!",
					"Fehler",
					JOptionPane.ERROR_MESSAGE);
					regalVornePH[auftragIndex] = false;
		    	  }else {
		    		  JFrame frame = new JFrame();
						JOptionPane.showMessageDialog(frame ,
						"Balken benötigen zwei Lagerplätze!\n befreien Sie zuerst ein Lagerplatz",
						"Fehler",
						JOptionPane.ERROR_MESSAGE);
						regalVornePH[auftragIndex] = false;
		    	  }
		  	  }else {
		  		setIconInfo(index, regalVornePH, ProduktVorne, RegalVorne);
		  	  }
	  	  
    	  if(auftrag[auftragIndex].getAuftragDone() == true) {
    		  GUI.doneAuftrag(auftragIndex);
    	  }else {
    		  System.out.println("Do nothing!!");
    	  }

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	private void buttonClickHinten(int index) {
		try {
  		  auftrag = GUI.getAuftragDaten();
	  	  	  auftragSelected = GUI.getAuftragSelected();
		  	  for(int i = 0; i < 4; i++) {
			  	if(auftragSelected[i] == true) {
						auftragIndex = i;
				}
		  	  }

		  	if(auftrag[auftragIndex].getProdukt().equals("Holz") && auftrag[auftragIndex].getAttribut_2().equals("Balken") && auftrag[auftragIndex].getAuftragArt().equals("Einlagerung")) {
		  		if(ProduktVorne[index].getIcon().toString().contains("placeholder.png") == true) {
		    		setIconInfo(index, regalHintenPH, ProduktHinten, RegalHinten);
		    		setIconInfo(index, regalVornePH, ProduktVorne, RegalVorne);
		    	  }else if(ProduktVorne[index].getIcon().toString().contains("placeholder.png") == false && ProduktHinten[index].getIcon().toString().contains("placeholder.png") == false) {
						JFrame frame = new JFrame();
						JOptionPane.showMessageDialog(frame ,
						"Platz Belegt!",
						"Fehler",
						JOptionPane.ERROR_MESSAGE);
						regalVornePH[auftragIndex] = false;
			    	  }else {
			    		  JFrame frame = new JFrame();
							JOptionPane.showMessageDialog(frame ,
							"Balken benötigen zwei Lagerplätze!\n befreien Sie zuerst ein Lagerplatz",
							"Fehler",
							JOptionPane.ERROR_MESSAGE);
							regalVornePH[auftragIndex] = false;
			    	 }
		  	  }else {
		  		  if(ProduktVorne[index].getIcon().toString().contains("placeholder.png") == false && ProduktHinten[index].getIcon().toString().contains("placeholder.png") == true){

		  			JFrame frame = new JFrame();
					JOptionPane.showMessageDialog(frame ,
					"Eingang blockiert!\n befreien Sie zuerst den Eingang oder nehmen Sie ein weiterer Lagerplatz",
					"Fehler",
					JOptionPane.ERROR_MESSAGE);
					regalHintenPH[auftragIndex] = false;
		  		  }else {
		  			setIconInfo(index, regalHintenPH, ProduktHinten, RegalHinten);
		  		  }
		  	  }

	    	  if(auftrag[auftragIndex].getAuftragDone() == true) {
	    		  GUI.doneAuftrag(auftragIndex);
	    	  }else {
	    		  System.out.println("Do nothing!!");
	    	  }
  	  }catch (Exception e) {
			System.out.println(e);
  	  }
	}
	
	
	
	private void funcAuslagerung(int index, boolean [] ph, Product [] product, JButton [] btnRegal) {
		String iconPath = "";
		if(ph[index] == true && auftragSelected[auftragIndex] && auftrag[auftragIndex].getAuftragArt().equals("Auslagerung")){
			if(auftrag[auftragIndex].getProdukt().equals(auftrag[auftragIndex].getProdukt()) && auftrag[auftragIndex].getAttribut_1().equals(auftrag[auftragIndex].getAttribut_1()) && auftrag[auftragIndex].getAttribut_2().equals(auftrag[auftragIndex].getAttribut_2())) {
				
				if (btnRegal[index].getIcon().toString().contains(auftrag[auftragIndex].getAttribut_1() + "_" + auftrag[auftragIndex].getAttribut_2()) && !(auftrag[auftragIndex].getAttribut_2().equals("Balken"))) {
					ph[index] = false;
					btnRegal[index].setIcon(icnPlaceHolder);
					product[index] = new Product();
					iconPath = btnRegal[index].getIcon().toString();
  	  				if (iconPath.contains("placeholder.png")) {
  	  					auftrag[auftragIndex].setAuftragDone(true);
  					}else {
  						auftrag[auftragIndex].setAuftragDone(false);
  					}
				}else if(!(btnRegal[index].getIcon().toString().contains(auftrag[auftragIndex].getAttribut_1() + "_" + auftrag[auftragIndex].getAttribut_2()))){
					JFrame frame = new JFrame();
					JOptionPane.showMessageDialog(frame ,
				    "Falscher Produkt zum auslagern!",
				    "Fehler",
				    JOptionPane.ERROR_MESSAGE);
				}
				
				if (auftrag[auftragIndex].getAttribut_2().equals("Balken") && RegalHinten[index].getIcon().toString().contains("Balken") == true) {
					RegalHinten[index].setIcon(icnPlaceHolder);
					regalHintenPH[index] = false;
					ph[index] = false;
					btnRegal[index].setIcon(icnPlaceHolder);
					product[index] = new Product();
					iconPath = btnRegal[index].getIcon().toString();
  	  				if (iconPath.contains("placeholder.png")) {
  	  					auftrag[auftragIndex].setAuftragDone(true);
  					}else {
  						auftrag[auftragIndex].setAuftragDone(false);
  					}
				}
				if(auftrag[auftragIndex].getAttribut_2().equals("Balken") && RegalVorne[index].getIcon().toString().contains("Balken") == true) {
					
					RegalVorne[index].setIcon(icnPlaceHolder);
					regalVornePH[index] = false;
					ph[index] = false;
					btnRegal[index].setIcon(icnPlaceHolder);
					product[index] = new Product();
					iconPath = btnRegal[index].getIcon().toString();
  	  				if (iconPath.contains("placeholder.png")) {
  	  					auftrag[auftragIndex].setAuftragDone(true);
  					}else {
  						auftrag[auftragIndex].setAuftragDone(false);
  					}
					
				}
				
			}
		}
	}

	public JPanel getJPanel() {
		Components();
		return regal2Panel;
	}


}
