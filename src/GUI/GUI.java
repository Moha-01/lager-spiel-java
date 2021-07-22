package GUI;



import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.LineBorder;

import Auftrag.Auftrag;
import Bilanz.Bilanz;
import Controls.Controls;
import FileLoader.FileLoader;
import Product.*;
import Regale.Regal1;
import Regale.Regal2;


@SuppressWarnings("serial")
public class GUI extends JFrame {

	
	Regal1 regal1 = new Regal1();
	Regal2 regal2 = new Regal2();
	
	Controls controls = new Controls();
	
	private JButton bilanzButton = new JButton();
	private JButton bNeuerAuftrag = new JButton();
	private JButton [] AuftragListe = new JButton[4];
	private JButton [] AuftragAblehnen = new JButton[4];
	
	private JLabel lKontostand = new JLabel();
	private JLabel LabelBilanz = new JLabel();
	private JLabel lAuftraege = new JLabel();
	private JLabel colLeft_auf = new JLabel();
	private JLabel colRight_auf = new JLabel();
	private JLabel colButtom_auf = new JLabel();
	
	private Icon icnBilanz = new ImageIcon(GUI.class.getResource("bilanz.png"));
	private Icon icnDelete = new ImageIcon(GUI.class.getResource("ablehnen.png"));
	
	private FileLoader csv = new FileLoader();
	
	private ImageIcon img = new ImageIcon(GUI.class.getResource("gaming.png"));
	
	private JPanel kontostandPanel = new JPanel();
	
	
	//Variablen
	
	private int KontoStand = 10000;
	private int [] Belohnung = new int[4];
	private int Umsatz = 0;
	private String [] Art = new String[4];
	
	private int Eintrag = 0;
	
	//Bilanz Variablen
	private String[] colTableStrings = {"Eintrag", "Kosten", "Kontostand", "Umsatz"};
	private String[][] dataStrings = new String[100][4];
	
	/*			(Daten zur übergabe und Rückgabe)
	 * [][]	Auftragsnummer
	 * [][]	Auftragsart
	 * [][]	Produkt
	 * [][]	Attribut 1
	 * [][]	Attribut 2
	 * [][]	Belohnung
	 * 
	 * */
	private String auftragDaten[][] = new String[6][100];
	private static Auftrag [] auftrag = new Auftrag[4];
	
	private Product [] Regal1Produkte = new Product[10];
	private Product [] Regal2Produkte = new Product[10];
    
	
	
	public GUI() {
		super();
		setTitle("Lager Spiel");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		int frameWidth = 1760;
	    int frameHeight = 920;
	    setSize(frameWidth, frameHeight);
	    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
	    int x = (d.width - getSize().width) / 2;
	    int y = (d.height - getSize().height) / 2;
	    setLocation(x, y);

		setResizable(true);
		Container cp = getContentPane();
	    cp.setLayout(null);
	    cp.setBackground(Color.GRAY);
	    setIconImage(img.getImage());

		initComponents();

		kontostandPanel.add(lKontostand);
		
		cp.add(regal1.getJPanel());
		cp.add(regal2.getJPanel());
		cp.add(controls.getJPanel());
        cp.add(bilanzButton);
        cp.add(LabelBilanz);
        cp.add(lAuftraege);
        cp.add(colLeft_auf);
        cp.add(colRight_auf);
        cp.add(colButtom_auf);
        cp.add(bNeuerAuftrag);
        cp.add(AuftragListe[0]);
        cp.add(AuftragListe[1]);
        cp.add(AuftragListe[2]);
        cp.add(AuftragListe[3]);
        cp.add(AuftragAblehnen[0]);
        cp.add(AuftragAblehnen[1]);
        cp.add(AuftragAblehnen[2]);
        cp.add(AuftragAblehnen[3]);
        cp.add(kontostandPanel);

		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	private void initComponents() {
		
      lKontostand.setText("  Kontostand:  " + KontoStand +" € ");
      lKontostand.setHorizontalTextPosition(SwingConstants.CENTER);
      lKontostand.setHorizontalAlignment(SwingConstants.LEFT);
      lKontostand.setBackground(new Color(0xEEEEEE));
      lKontostand.setOpaque(true);
      lKontostand.setFont(new Font("Dialog", Font.BOLD, 18));
      
      bilanzButton.setBounds(887, 745, 180, 80);
      bilanzButton.setIcon(icnBilanz);
      bilanzButton.setBackground(Color.WHITE);
      bilanzButton.setBorder(new javax.swing.border.LineBorder(Color.BLACK));
      bilanzButton.setMargin(new Insets(2, 2, 2, 2));
      bilanzButton.setFocusPainted(false);
      bilanzButton.addActionListener(new ActionListener() { 
        public void actionPerformed(ActionEvent evt) { 
	            JFrame jf=new JFrame();
	            Bilanz tab= new Bilanz(colTableStrings, dataStrings);
	            jf.setTitle("Bilanz");
	            jf.setSize(800, 500);
	            jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	            jf.setVisible(true);
	            jf.add(tab); 
        }
      });
      
      LabelBilanz.setBounds(887, 830, 180, 20);
      LabelBilanz.setText("BILANZ");
      LabelBilanz.setHorizontalTextPosition(SwingConstants.CENTER);
      LabelBilanz.setHorizontalAlignment(SwingConstants.CENTER);
      LabelBilanz.setBackground(Color.BLACK);
      LabelBilanz.setForeground(Color.WHITE);
      LabelBilanz.setOpaque(true);
      
      lAuftraege.setBounds(898, 55, 824, 34);
      lAuftraege.setText("Aufträge");
      lAuftraege.setHorizontalTextPosition(SwingConstants.CENTER);
      lAuftraege.setHorizontalAlignment(SwingConstants.CENTER);
      lAuftraege.setBackground(Color.BLACK);
      lAuftraege.setOpaque(true);
      lAuftraege.setForeground(Color.WHITE);
      
      colLeft_auf.setBounds(898, 87, 14, 546);
      colLeft_auf.setText("");
      colLeft_auf.setBackground(Color.BLACK);
      colLeft_auf.setOpaque(true);
      colLeft_auf.setForeground(Color.BLACK);
      
      colRight_auf.setBounds(1708, 87, 14, 546);
      colRight_auf.setText("");
      colRight_auf.setBackground(Color.BLACK);
      colRight_auf.setOpaque(true);
      
      colButtom_auf.setBounds(898, 616, 823, 17);
      colButtom_auf.setText("");
      colButtom_auf.setBackground(Color.BLACK);
      colButtom_auf.setOpaque(true);
      
      bNeuerAuftrag.setBounds(944, 131, 229, 38);
      bNeuerAuftrag.setText("Neuer Auftrag");
      bNeuerAuftrag.setBackground(Color.WHITE);
      bNeuerAuftrag.setBorder(new LineBorder(Color.BLACK));
      bNeuerAuftrag.setMargin(new Insets(2, 2, 2, 2));
      bNeuerAuftrag.setFocusPainted(false);
      bNeuerAuftrag.addActionListener(new ActionListener() { 
    	int auf_num = 0;
        public void actionPerformed(ActionEvent evt) { 
        	
        	//CSV lesen
        	auftragDaten = csv.getCSVData();
        	
            if(AuftragListe[0].getText() == "Leer") {
            	AuftragListe[0].setText(auftragDaten[0][auf_num] + ": " + auftragDaten[2][auf_num] + ", " + auftragDaten[3][auf_num] + ", " + auftragDaten[4][auf_num] + ", " + auftragDaten[5][auf_num]);
            	Belohnung[0] = Integer.parseInt(auftragDaten[5][auf_num]);
            	Art[0] = auftragDaten[1][auf_num];
            	if(auftragDaten[1][auf_num].equals("Auslagerung")) {
            		AuftragListe[0].setBorder(new LineBorder(Color.RED, 5));
        		}else if(auftragDaten[1][auf_num].equals("Einlagerung")) {
        			AuftragListe[0].setBorder(new LineBorder(Color.GREEN, 5));
        		}
            	auftrag[0] = new Auftrag(auftragDaten[0][auf_num], auftragDaten[1][auf_num], auftragDaten[2][auf_num], auftragDaten[3][auf_num], auftragDaten[4][auf_num], auftragDaten[5][auf_num]);
            	auf_num++;
            } else if(AuftragListe[1].getText() == "Leer" ) {
            	AuftragListe[1].setText(auftragDaten[0][auf_num] + ": " + auftragDaten[2][auf_num] + ", " + auftragDaten[3][auf_num] + ", " + auftragDaten[4][auf_num] + ", " + auftragDaten[5][auf_num]);
	           	Belohnung[1] = Integer.parseInt(auftragDaten[5][auf_num]);
	           	Art[1] = auftragDaten[1][auf_num];
            	if(auftragDaten[1][auf_num].equals("Auslagerung")) {
            		AuftragListe[1].setBorder(new LineBorder(Color.RED, 5));
        		}else if(auftragDaten[1][auf_num].equals("Einlagerung")) {
        			AuftragListe[1].setBorder(new LineBorder(Color.GREEN, 5));
        		} 
            	auftrag[1] = new Auftrag(auftragDaten[0][auf_num], auftragDaten[1][auf_num], auftragDaten[2][auf_num], auftragDaten[3][auf_num], auftragDaten[4][auf_num], auftragDaten[5][auf_num]);
            	auf_num++;
        	}else if(AuftragListe[2].getText() == "Leer") {
        		AuftragListe[2].setText(auftragDaten[0][auf_num] + ": " + auftragDaten[2][auf_num] + ", " + auftragDaten[3][auf_num] + ", " + auftragDaten[4][auf_num] + ", " + auftragDaten[5][auf_num]);
	           	Belohnung[2] = Integer.parseInt(auftragDaten[5][auf_num]);
	           	Art[2] = auftragDaten[1][auf_num];
            	if(auftragDaten[1][auf_num].equals("Auslagerung")) {
            		AuftragListe[2].setBorder(new LineBorder(Color.RED, 5));
        		}else if(auftragDaten[1][auf_num].equals("Einlagerung")) {
        			AuftragListe[2].setBorder(new LineBorder(Color.GREEN, 5));
        		} 
            	auftrag[2] = new Auftrag(auftragDaten[0][auf_num], auftragDaten[1][auf_num], auftragDaten[2][auf_num], auftragDaten[3][auf_num], auftragDaten[4][auf_num], auftragDaten[5][auf_num]);
            	auf_num++;
        	}else if(AuftragListe[3].getText() == "Leer" ) {
        		AuftragListe[3].setText(auftragDaten[0][auf_num] + ": " + auftragDaten[2][auf_num] + ", " + auftragDaten[3][auf_num] + ", " + auftragDaten[4][auf_num] + ", " + auftragDaten[5][auf_num]);
	           	Belohnung[3] = Integer.parseInt(auftragDaten[5][auf_num]);
	           	Art[3] = auftragDaten[1][auf_num];
            	if(auftragDaten[1][auf_num].equals("Auslagerung")) {
            		AuftragListe[3].setBorder(new LineBorder(Color.RED, 5));
        		}else if(auftragDaten[1][auf_num].equals("Einlagerung")) {
        			AuftragListe[3].setBorder(new LineBorder(Color.GREEN, 5));
        		} 
            	auftrag[3] = new Auftrag(auftragDaten[0][auf_num], auftragDaten[1][auf_num], auftragDaten[2][auf_num], auftragDaten[3][auf_num], auftragDaten[4][auf_num], auftragDaten[5][auf_num]);
            	auf_num++;
        	}
            if(auf_num == 47) {
            	auf_num = 0;
            }
        }
      });
      
      for(int i = 0; i < 4; i++) {
    	  AuftragListe[i] = new JButton();
    	  AuftragAblehnen[i] = new JButton();
    	  
    	  AuftragListe[i].setText("Leer");
    	  AuftragListe[i].setBackground(Color.WHITE);
    	  AuftragListe[i].setBorder(new LineBorder(Color.BLACK));
    	  AuftragListe[i].setMargin(new Insets(2, 2, 2, 2));
    	  AuftragListe[i].setFocusPainted(false);
    	  AuftragListe[i].setFont(new Font("Dialog", Font.BOLD, 16));
    	  
          AuftragAblehnen[i].setIcon(icnDelete);
          AuftragAblehnen[i].setBackground(Color.WHITE);
          AuftragAblehnen[i].setBorder(new LineBorder(Color.BLACK));
          AuftragAblehnen[i].setMargin(new Insets(2, 2, 2, 2));
          AuftragAblehnen[i].setFocusPainted(false);
          
          
      }
      AuftragListe[0].setBounds(944, 202, 665, 80);
      AuftragListe[0].addActionListener(new ActionListener() { 
        public void actionPerformed(ActionEvent evt) { 
        	if(AuftragListe[0].getText() != "Leer") {
        		System.out.println(auftrag[0].getProdukt());
        		if (AuftragListe[0].isSelected() == false) {
            		AuftragListe[0].setSelected(true);
            		System.out.println(AuftragListe[0].isSelected());
            	} else if (AuftragListe[0].isSelected() == true) {
            		AuftragListe[0].setSelected(false);
            		System.out.println(AuftragListe[0].isSelected());
            	}
        		
        		if(AuftragListe[0].isSelected() == true) {
        			
        			if(auftrag[0].getAuftragArt().equals("Einlagerung")) {
        				AuftragListe[0].setBackground(Color.GREEN);
        			}else if(auftrag[0].getAuftragArt().equals("Auslagerung")) {
        				AuftragListe[0].setBackground(Color.RED);
        			}
        			
        			
        			AuftragListe[1].setSelected(false);
        			AuftragListe[1].setBackground(Color.WHITE);
        			
        			AuftragListe[2].setSelected(false);
        			AuftragListe[2].setBackground(Color.WHITE);
        			
        			AuftragListe[3].setSelected(false);
        			AuftragListe[3].setBackground(Color.WHITE);
        			
        		}else if (AuftragListe[0].isSelected() == false) {
        			AuftragListe[0].setBackground(Color.WHITE);
        		}
        	}
        	
        }
      });
      
      AuftragListe[1].setBounds(944, 300, 665, 80);
      AuftragListe[1].addActionListener(new ActionListener() { 
        public void actionPerformed(ActionEvent evt) { 
        	if(AuftragListe[1].getText() != "Leer") {
        		System.out.println(auftrag[1].getProdukt());
        		if (AuftragListe[1].isSelected() == false) {
            		AuftragListe[1].setSelected(true);
            		System.out.println(AuftragListe[1].isSelected());
            	} else if (AuftragListe[1].isSelected() == true) {
            		AuftragListe[1].setSelected(false);
            		System.out.println(AuftragListe[1].isSelected());
            	}
        	}
        	if(AuftragListe[1].isSelected() == true) {
    			
        		if(auftrag[1].getAuftragArt().equals("Einlagerung")) {
    				AuftragListe[1].setBackground(Color.GREEN);
    			}else if(auftrag[1].getAuftragArt().equals("Auslagerung")) {
    				AuftragListe[1].setBackground(Color.RED);
    			}
    			
    			AuftragListe[0].setSelected(false);
    			AuftragListe[0].setBackground(Color.WHITE);
    			
    			AuftragListe[2].setSelected(false);
    			AuftragListe[2].setBackground(Color.WHITE);
    			
    			AuftragListe[3].setSelected(false);
    			AuftragListe[3].setBackground(Color.WHITE);
    			
    		}else if (AuftragListe[1].isSelected() == false) {
    			AuftragListe[1].setBackground(Color.WHITE);
    		}
        }
      });
      
      AuftragListe[2].setBounds(944, 398, 665, 80);
      AuftragListe[2].addActionListener(new ActionListener() { 
        public void actionPerformed(ActionEvent evt) { 
        	if(AuftragListe[2].getText() != "Leer") {
        		System.out.println(auftrag[2].getProdukt());
        		if (AuftragListe[2].isSelected() == false) {
            		AuftragListe[2].setSelected(true);
            		System.out.println(AuftragListe[2].isSelected());
            	} else if (AuftragListe[2].isSelected() == true) {
            		AuftragListe[2].setSelected(false);
            		System.out.println(AuftragListe[2].isSelected());
            	}
        		
        		if(AuftragListe[2].isSelected() == true) {
        			
        			if(auftrag[2].getAuftragArt().equals("Einlagerung")) {
        				AuftragListe[2].setBackground(Color.GREEN);
        			}else if(auftrag[2].getAuftragArt().equals("Auslagerung")) {
        				AuftragListe[2].setBackground(Color.RED);
        			}
        			
        			AuftragListe[0].setSelected(false);
        			AuftragListe[0].setBackground(Color.WHITE);
        			
        			AuftragListe[1].setSelected(false);
        			AuftragListe[1].setBackground(Color.WHITE);
        			
        			AuftragListe[3].setSelected(false);
        			AuftragListe[3].setBackground(Color.WHITE);
        			
        		}else if (AuftragListe[2].isSelected() == false) {
        			AuftragListe[2].setBackground(Color.WHITE);
        		}
        	}
        }
      });
      
      AuftragListe[3].setBounds(944, 495, 665, 81);
      AuftragListe[3].addActionListener(new ActionListener() { 
        public void actionPerformed(ActionEvent evt) { 
        	if(AuftragListe[3].getText() != "Leer") {
        		System.out.println(auftrag[3].getProdukt());
        		if (AuftragListe[3].isSelected() == false) {
            		AuftragListe[3].setSelected(true);
            		System.out.println(AuftragListe[3].isSelected());
            	} else if (AuftragListe[3].isSelected() == true) {
            		AuftragListe[3].setSelected(false);
            		System.out.println(AuftragListe[3].isSelected());
            	}
        		
        		if(AuftragListe[3].isSelected() == true) {
        			
        			if(auftrag[3].getAuftragArt().equals("Einlagerung")) {
        				AuftragListe[3].setBackground(Color.GREEN);
        			}else if(auftrag[3].getAuftragArt().equals("Auslagerung")) {
        				AuftragListe[3].setBackground(Color.RED);
        			}
        			
        			AuftragListe[0].setSelected(false);
        			AuftragListe[0].setBackground(Color.WHITE);
        			
        			AuftragListe[1].setSelected(false);
        			AuftragListe[1].setBackground(Color.WHITE);
        			
        			AuftragListe[2].setSelected(false);
        			AuftragListe[2].setBackground(Color.WHITE);
        			
        		}else if (AuftragListe[3].isSelected() == false) {
        			AuftragListe[3].setBackground(Color.WHITE);
        		}
        	}
        }
      });
      
      AuftragAblehnen[0].setBounds(1616, 202, 75, 80);
      AuftragAblehnen[0].addActionListener(new ActionListener() { 
        public void actionPerformed(ActionEvent evt) { 
        	if(AuftragListe[0].getText() != "Leer") {
        		AuftragListe[0].setText("Leer");
        		AuftragListe[0].setBorder(new LineBorder(Color.BLACK));
        		KontoStand = KontoStand - Belohnung[0];
        		lKontostand.setText("  Kontostand:  " + KontoStand +" €");
        		Umsatz = KontoStand - (KontoStand + Belohnung[0]);
        		if(Eintrag != 0) {
        			Umsatz = Umsatz + Integer.parseInt(dataStrings[Eintrag-1][3]);
        		}
        		dataStrings[Eintrag][0] = Art[0];
        		dataStrings[Eintrag][1] = "-" + Belohnung[0];
        		dataStrings[Eintrag][2] = "" + KontoStand;
        		dataStrings[Eintrag][3] = "" + Umsatz;
        		Eintrag++;
        	}
        	auftrag[0] = new Auftrag();
        	AuftragListe[0].setBackground(Color.WHITE);
        	AuftragListe[0].setSelected(false);
        }
      });
      
      AuftragAblehnen[1].setBounds(1616, 300, 75, 80);
      AuftragAblehnen[1].addActionListener(new ActionListener() { 
        public void actionPerformed(ActionEvent evt) {
        	if(AuftragListe[1].getText() != "Leer") {
        		AuftragListe[1].setText("Leer");
        		AuftragListe[1].setBorder(new LineBorder(Color.BLACK));
        		KontoStand = KontoStand - Belohnung[1];
        		lKontostand.setText("  Kontostand:  " + KontoStand +" €");
        		Umsatz = KontoStand - (KontoStand + Belohnung[1]);
        		if(Eintrag != 0) {
        			Umsatz = Umsatz + Integer.parseInt(dataStrings[Eintrag-1][3]);
        		}
        		dataStrings[Eintrag][0] = Art[1];
        		dataStrings[Eintrag][1] = "-" + Belohnung[1];
        		dataStrings[Eintrag][2] = "" + KontoStand;
        		dataStrings[Eintrag][3] = "" + Umsatz;
        		Eintrag++;
        	}
        	auftrag[1] = new Auftrag();
        	AuftragListe[1].setBackground(Color.WHITE);
        	AuftragListe[1].setSelected(false);
        }
      });
      
      AuftragAblehnen[2].setBounds(1616, 398, 75, 80);
      AuftragAblehnen[2].addActionListener(new ActionListener() { 
        public void actionPerformed(ActionEvent evt) { 
        	if(AuftragListe[2].getText() != "Leer") {
        		AuftragListe[2].setText("Leer");
        		AuftragListe[2].setBorder(new LineBorder(Color.BLACK)); 
        		KontoStand = KontoStand - Belohnung[2];
        		lKontostand.setText("  Kontostand:  " + KontoStand +" €");

        		Umsatz = KontoStand - (KontoStand + Belohnung[2]);
        		if(Eintrag != 0) {
        			Umsatz = Umsatz + Integer.parseInt(dataStrings[Eintrag-1][3]);
        		}
        		dataStrings[Eintrag][0] = Art[2];
        		dataStrings[Eintrag][1] = "-" + Belohnung[2];
        		dataStrings[Eintrag][2] = "" + KontoStand;
        		dataStrings[Eintrag][3] = "" + Umsatz;
        		Eintrag++;
        	}
        	auftrag[2] = new Auftrag();
        	AuftragListe[2].setBackground(Color.WHITE);
        	AuftragListe[2].setSelected(false);
        	
        }
      });
      
      AuftragAblehnen[3].setBounds(1616, 495, 75, 81);
      AuftragAblehnen[3].addActionListener(new ActionListener() { 
        public void actionPerformed(ActionEvent evt) { 
        	if(AuftragListe[3].getText() != "Leer") {
        		AuftragListe[3].setText("Leer");
        		AuftragListe[3].setBorder(new LineBorder(Color.BLACK));
        		KontoStand = KontoStand - Belohnung[3];
        		lKontostand.setText("  Kontostand:  " + KontoStand +" €");

        		Umsatz = KontoStand - (KontoStand + Belohnung[3]);
        		if(Eintrag != 0) {
        			Umsatz = Umsatz + Integer.parseInt(dataStrings[Eintrag-1][3]);
        		}
        		dataStrings[Eintrag][0] = Art[3];
        		dataStrings[Eintrag][1] = "-" + Belohnung[3];
        		dataStrings[Eintrag][2] = "" + KontoStand;
        		dataStrings[Eintrag][3] = "" + Umsatz;
        		Eintrag++;
        	}
        	auftrag[3] = new Auftrag();
        	AuftragListe[3].setBackground(Color.WHITE);
        	AuftragListe[3].setSelected(false);
        }
      });
      kontostandPanel.setBackground(Color.GRAY);
      kontostandPanel.setBounds(561, 778, 266, 43);
      kontostandPanel.setVisible(true);
	}
	
	public static Auftrag[] getAuftragDaten() {
		try {
			return auftrag;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
	}
}
