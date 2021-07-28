package Regale;

import java.awt.Color;
import java.awt.Component;
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
	    	  
	    	  auftrag = GUI.getAuftragDaten();
		  	  auftragSelected = GUI.getAuftragSelected();
			  for(int i = 0; i < 4; i++) {
			   	if(auftragSelected[i] == true) {
					auftragIndex = i;
			    }
			  }
	    	  
    		  setIconInfo(0, regalVornePH, ProduktVorne, RegalVorne);
	    	  if(ProduktVorne[0].getProduktType() == "Holz" && ((Holz) ProduktVorne[0]).getForm() == "Balken") {
	    		  setIconInfo(0, regalHintenPH, ProduktHinten, RegalHinten);
	    	  }
	    	  
	    	  GUI.doneAuftrag(auftragIndex);
	    	  
		  }
	    });

  	  	abstandy=(abstandy + 82);
  	  	RegalVorne[1].setBounds(0, abstandy, 180, 80);
  	  	RegalVorne[1].addActionListener(new ActionListener() {
	  	  public void actionPerformed(ActionEvent evt) {
	  		
	  		auftrag = GUI.getAuftragDaten();
		  	auftragSelected = GUI.getAuftragSelected();
			for(int i = 0; i < 4; i++) {
			   	if(auftragSelected[i] == true) {
					auftragIndex = i;
			    }
			}
	  		  
	  		  
  			setIconInfo(1, regalVornePH, ProduktVorne, RegalVorne);
	  		if(ProduktVorne[1].getProduktType() == "Holz" && ((Holz) ProduktVorne[1]).getForm() == "Balken") {
	    		  setIconInfo(1, regalHintenPH, ProduktHinten, RegalHinten);
	    	}
		  		
	  		GUI.doneAuftrag(auftragIndex);
	  	  }
  	  	});

  	  	abstandy=(abstandy + 82);
  	  	RegalVorne[2].setBounds(0, abstandy, 180, 80);
  	  	RegalVorne[2].addActionListener(new ActionListener() {
  	  		public void actionPerformed(ActionEvent evt) {
  	  		
  	  		auftrag = GUI.getAuftragDaten();
	  	  	auftragSelected = GUI.getAuftragSelected();
		  	  for(int i = 0; i < 4; i++) {
			  	if(auftragSelected[i] == true) {
						auftragIndex = i;
			  }
		  	}
  	  			
  	  			
  	  		setIconInfo(2, regalVornePH, ProduktVorne, RegalVorne);
		  	if(ProduktVorne[2].getProduktType() == "Holz" && ((Holz) ProduktVorne[2]).getForm() == "Balken") {
		  		  setIconInfo(2, regalHintenPH, ProduktHinten, RegalHinten);
		  	}
		  	GUI.doneAuftrag(auftragIndex);
  	  	  }
  	  	});

  	  	abstandy=(abstandy + 82);
  	  	RegalVorne[3].setBounds(0, abstandy, 180, 80);
  	  	RegalVorne[3].addActionListener(new ActionListener() {
	  	    public void actionPerformed(ActionEvent evt) {
	  	    
	  	    	auftrag = GUI.getAuftragDaten();
		  	  	auftragSelected = GUI.getAuftragSelected();
			  	  for(int i = 0; i < 4; i++) {
				  	if(auftragSelected[i] == true) {
							auftragIndex = i;
				  }
			  	}
	  	    	
	  	    	
  	    		setIconInfo(3, regalVornePH, ProduktVorne, RegalVorne);
	  	    	if(ProduktVorne[3].getProduktType() == "Holz" && ((Holz) ProduktVorne[3]).getForm() == "Balken") {
		    		  setIconInfo(3, regalHintenPH, ProduktHinten, RegalHinten);
		    	}
		  	    	
	  	    	GUI.doneAuftrag(auftragIndex);
	  	    }
	    });

	    abstandy=(abstandy + 82);  	  
	    RegalVorne[4].setBounds(0, abstandy, 180, 80);
	    RegalVorne[4].addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent evt) {
	    		
	    		auftrag = GUI.getAuftragDaten();
		  	  	auftragSelected = GUI.getAuftragSelected();
			  	  for(int i = 0; i < 4; i++) {
				  	if(auftragSelected[i] == true) {
							auftragIndex = i;
				  }
			  	}
	    		
    			setIconInfo(4, regalVornePH, ProduktVorne, RegalVorne);
	    		if(ProduktVorne[4].getProduktType() == "Holz" && ((Holz) ProduktVorne[4]).getForm() == "Balken") {
		    		  setIconInfo(4, regalHintenPH, ProduktHinten, RegalHinten);
		    	}
	    		GUI.doneAuftrag(auftragIndex);
	    	}
	    });

  	    // Regal 2 Hinten
	    abstandy = 24;
	    RegalHinten[0].setBounds(185, abstandy, 180, 80);
	    RegalHinten[0].addActionListener(new ActionListener() {
  	      public void actionPerformed(ActionEvent evt) {
  	    	
  	    	  
  	    	auftrag = GUI.getAuftragDaten();
	  	  	auftragSelected = GUI.getAuftragSelected();
		  	  for(int i = 0; i < 4; i++) {
			  	if(auftragSelected[i] == true) {
						auftragIndex = i;
			  }
		  	}
  	    	  
  	    	  
    		setIconInfo(0, regalHintenPH, ProduktHinten, RegalHinten);
  	    	if(ProduktHinten[0].getProduktType() == "Holz" && ((Holz) ProduktHinten[0]).getForm() == "Balken") {
	    		  setIconInfo(0, regalVornePH, ProduktVorne, RegalVorne);
	    	}
  	  	    	
  	    	GUI.doneAuftrag(auftragIndex);
  	      }
	    });

	    abstandy=(abstandy + 82);
	    RegalHinten[1].setBounds(185, abstandy, 180, 80);
	    RegalHinten[1].addActionListener(new ActionListener() {
  	      public void actionPerformed(ActionEvent evt) {
  	    	
  	    	auftrag = GUI.getAuftragDaten();
	  	  	auftragSelected = GUI.getAuftragSelected();
		  	  for(int i = 0; i < 4; i++) {
			  	if(auftragSelected[i] == true) {
						auftragIndex = i;
			  }
		  	}
  	    	  
    		setIconInfo(1, regalHintenPH, ProduktHinten, RegalHinten);
  	    	if(ProduktHinten[1].getProduktType() == "Holz" && ((Holz) ProduktHinten[1]).getForm() == "Balken") {
	    		  setIconInfo(1, regalVornePH, ProduktVorne, RegalVorne);
	    	 }
  	  	    	
  	    	GUI.doneAuftrag(auftragIndex);
  	      }
  	  	});

  	  	abstandy=(abstandy + 82);
  	  	RegalHinten[2].setBounds(185, abstandy, 180, 80);  
  	  	RegalHinten[2].addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent evt) {
		    	
		    	
		    	auftrag = GUI.getAuftragDaten();
		  	  	auftragSelected = GUI.getAuftragSelected();
			  	  for(int i = 0; i < 4; i++) {
				  	if(auftragSelected[i] == true) {
							auftragIndex = i;
				  }
			  	}
		    	
	    		setIconInfo(2, regalHintenPH, ProduktHinten, RegalHinten);
		    	if(ProduktHinten[2].getProduktType() == "Holz" && ((Holz) ProduktHinten[2]).getForm() == "Balken") {
		    		  setIconInfo(2, regalVornePH, ProduktVorne, RegalVorne);
		    	 }
			    	
		    	GUI.doneAuftrag(auftragIndex);
	    	}
	    });

	    abstandy=(abstandy + 82);
	    RegalHinten[3].setBounds(185, abstandy, 180, 80);
	    RegalHinten[3].addActionListener(new ActionListener() {
  	      public void actionPerformed(ActionEvent evt) {
  	    	
  	    	  
  	    	auftrag = GUI.getAuftragDaten();
	  	  	auftragSelected = GUI.getAuftragSelected();
		  	  for(int i = 0; i < 4; i++) {
			  	if(auftragSelected[i] == true) {
						auftragIndex = i;
			  }
		  	}
  	    	  
    		setIconInfo(3, regalHintenPH, ProduktHinten, RegalHinten);
  	    	if(ProduktHinten[3].getProduktType() == "Holz" && ((Holz) ProduktHinten[3]).getForm() == "Balken") {
	    		  setIconInfo(3, regalVornePH, ProduktVorne, RegalVorne);
	    	 }
  	    	
  	    	GUI.doneAuftrag(auftragIndex);
  	    	
  	      }
	    });

	    abstandy=(abstandy + 82);
	    RegalHinten[4].setBounds(185, abstandy, 180, 80);
	    RegalHinten[4].addActionListener(new ActionListener() {
  	      public void actionPerformed(ActionEvent evt) {
  	    	
  	    	auftrag = GUI.getAuftragDaten();
	  	  	auftragSelected = GUI.getAuftragSelected();
		  	  for(int i = 0; i < 4; i++) {
			  	if(auftragSelected[i] == true) {
						auftragIndex = i;
			  }
		  	}
  	    	  
    		setIconInfo(4, regalHintenPH, ProduktHinten, RegalHinten);
  	    	if(ProduktHinten[4].getProduktType() == "Holz" && ((Holz) ProduktHinten[4]).getForm() == "Balken") {
	    		  setIconInfo(4, regalVornePH, ProduktVorne, RegalVorne);
	    	 }
  	  	    	
  	    	GUI.doneAuftrag(auftragIndex);
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
	  	
		if(ph[index] == false && auftragSelected[auftragIndex] && auftrag[auftragIndex].getAuftragArt().equals("Einlagerung")) {
			ph[index] = true;
  			if(product[index].getProduktType().equals("Papier")) {
  				product[index] = new Papier();
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
  					
  				}else if(schwer && (index == 0 || index == 1 || index == 2)){
  					JFrame frame = new JFrame();
					JOptionPane.showMessageDialog(frame ,
				    "Stein zu Schwer!",
				    "Fehler",
				    JOptionPane.ERROR_MESSAGE);
  				}
  				
  				if(mittel && (index == 1 || index == 2 || index == 3 || index == 4)) {
  					btnRegal[index].setIcon(((Stein) product[index]).getIcon());
  					
  				}else if(mittel && (index == 0)){
  					JFrame frame = new JFrame();
					JOptionPane.showMessageDialog(frame ,
				    "Stein zu Schwer!",
				    "Fehler",
				    JOptionPane.ERROR_MESSAGE);
  				}
  				
  				if(leicht) {
  					btnRegal[index].setIcon(((Stein) product[index]).getIcon());
  					
  				}
  				
  				
  				
  			}
  			//GUI.doneAuftrag(auftragIndex);
  			
  		 }else {
  			//Auslagern
  			ph[index] = false;
  		 }
		return true;
	}
	
	public JPanel getJPanel() {
		Components();
		return regal2Panel;
	}
	
	
}
