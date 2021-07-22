package GUI;



import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.LineBorder;

import Bilanz.Bilanz;
import Controls.Controls;
import FileLoader.FileLoader;
import Regale.Regal1;
import Regale.Regal2;


@SuppressWarnings("serial")
public class GUI extends JFrame {

	
	Regal1 regal1 = new Regal1();
	Regal2 regal2 = new Regal2();
	
	Controls controls = new Controls();
	
	private JButton bilanzButton = new JButton();
	private JButton bNeuerAuftrag = new JButton();
	private JButton bAuftrag1 = new JButton();
	private JButton bAuftrag2 = new JButton();
	private JButton bAuftrag3 = new JButton();
	private JButton bAuftrag4 = new JButton();
	private JButton bAblehnen1 = new JButton();
	private JButton bAblehnen2 = new JButton();
	private JButton bAblehnen3 = new JButton();
	private JButton bAblehnen4 = new JButton();
	
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
	private int Belohnung1 = 0;
	private int Belohnung2 = 0;
	private int Belohnung3 = 0;
	private int Belohnung4 = 0;
	private int Umsatz = 0;
	private String Art1 = "";
	private String Art2 = "";
	private String Art3 = "";
	private String Art4 = "";
	
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
    
	//Check ob die Aufträge frei sind oder nicht
	private int af1 = 0;
	private int af2 = 0;
	private int af3 = 0;
	private int af4 = 0;
	
	
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
        cp.add(bAuftrag1);
        cp.add(bAuftrag2);
        cp.add(bAuftrag3);
        cp.add(bAuftrag4);
        cp.add(bAblehnen1);
        cp.add(bAblehnen2);
        cp.add(bAblehnen3);
        cp.add(bAblehnen4);
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
        	
            if(bAuftrag1.getText() == "Leer" && af1 != 1) {
            	af1 = 1;
            	bAuftrag1.setText(auftragDaten[0][auf_num] + ": " + auftragDaten[2][auf_num] + ", " + auftragDaten[3][auf_num] + ", " + auftragDaten[4][auf_num] + ", " + auftragDaten[5][auf_num]);
            	Belohnung1 = Integer.parseInt(auftragDaten[5][auf_num]);
            	Art1 = auftragDaten[1][auf_num];
            	if(auftragDaten[1][auf_num].equals("Auslagerung")) {
        			bAuftrag1.setBorder(new LineBorder(Color.RED, 5));
        		}else if(auftragDaten[1][auf_num].equals("Einlagerung")) {
        			bAuftrag1.setBorder(new LineBorder(Color.GREEN, 5));
        		}
            	auf_num++;
            } else if(bAuftrag2.getText() == "Leer" && af2 != 1) {
	            	af2 = 1;
		           	bAuftrag2.setText(auftragDaten[0][auf_num] + ": " + auftragDaten[2][auf_num] + ", " + auftragDaten[3][auf_num] + ", " + auftragDaten[4][auf_num] + ", " + auftragDaten[5][auf_num]);
		           	Belohnung2 = Integer.parseInt(auftragDaten[5][auf_num]);
		           	Art2 = auftragDaten[1][auf_num];
	            	if(auftragDaten[1][auf_num].equals("Auslagerung")) {
	        			bAuftrag2.setBorder(new LineBorder(Color.RED, 5));
	        		}else if(auftragDaten[1][auf_num].equals("Einlagerung")) {
	        			bAuftrag2.setBorder(new LineBorder(Color.GREEN, 5));
	        		} 
	            	auf_num++;
        	}else if(bAuftrag3.getText() == "Leer" && af3 != 1) {
        		af3 = 1;
	           	bAuftrag3.setText(auftragDaten[0][auf_num] + ": " + auftragDaten[2][auf_num] + ", " + auftragDaten[3][auf_num] + ", " + auftragDaten[4][auf_num] + ", " + auftragDaten[5][auf_num]);
	           	Belohnung3 = Integer.parseInt(auftragDaten[5][auf_num]);
	           	Art3 = auftragDaten[1][auf_num];
            	if(auftragDaten[1][auf_num].equals("Auslagerung")) {
        			bAuftrag3.setBorder(new LineBorder(Color.RED, 5));
        		}else if(auftragDaten[1][auf_num].equals("Einlagerung")) {
        			bAuftrag3.setBorder(new LineBorder(Color.GREEN, 5));
        		} 
            	auf_num++;
        	}else if(bAuftrag4.getText() == "Leer" && af4 != 1) {
        		af4 = 1;
	           	bAuftrag4.setText(auftragDaten[0][auf_num] + ": " + auftragDaten[2][auf_num] + ", " + auftragDaten[3][auf_num] + ", " + auftragDaten[4][auf_num] + ", " + auftragDaten[5][auf_num]);
	           	Belohnung4 = Integer.parseInt(auftragDaten[5][auf_num]);
	           	Art4 = auftragDaten[1][auf_num];
            	if(auftragDaten[1][auf_num].equals("Auslagerung")) {
        			bAuftrag4.setBorder(new LineBorder(Color.RED, 5));
        		}else if(auftragDaten[1][auf_num].equals("Einlagerung")) {
        			bAuftrag4.setBorder(new LineBorder(Color.GREEN, 5));
        		} 
            	auf_num++;
        	}
            if(auf_num == 47) {
            	auf_num = 0;
            }
        }
      });
      
      bAuftrag1.setBounds(944, 202, 665, 80);
      bAuftrag1.setText("Leer");
      bAuftrag1.setBackground(Color.WHITE);
      bAuftrag1.setBorder(new LineBorder(Color.BLACK));
      bAuftrag1.setMargin(new Insets(2, 2, 2, 2));
      bAuftrag1.setFocusPainted(false);
      bAuftrag1.setFont(new Font("Dialog", Font.BOLD, 16));
      bAuftrag1.addActionListener(new ActionListener() { 
        public void actionPerformed(ActionEvent evt) { 
        	if(af1 == 1) {
        		System.out.println("Selected AF1");
        		af1 = 0;
        	}else if(af1 == 0) {
        		System.out.println("Unselected AF1");
        		af1 = 1;
        	}
        }
      });
      
      bAuftrag2.setBounds(944, 300, 665, 80);
      bAuftrag2.setText("Leer");
      bAuftrag2.setBackground(Color.WHITE);
      bAuftrag2.setBorder(new LineBorder(Color.BLACK));
      bAuftrag2.setMargin(new Insets(2, 2, 2, 2));
      bAuftrag2.setFocusPainted(false);
      bAuftrag2.setFont(new Font("Dialog", Font.BOLD, 16));
      bAuftrag2.addActionListener(new ActionListener() { 
        public void actionPerformed(ActionEvent evt) { 
        	
        }
      });
      
      bAuftrag3.setBounds(944, 398, 665, 80);
      bAuftrag3.setText("Leer");
      bAuftrag3.setBackground(Color.WHITE);
      bAuftrag3.setBorder(new LineBorder(Color.BLACK));
      bAuftrag3.setMargin(new Insets(2, 2, 2, 2));
      bAuftrag3.setFocusPainted(false);
      bAuftrag3.setFont(new Font("Dialog", Font.BOLD, 16));
      bAuftrag3.addActionListener(new ActionListener() { 
        public void actionPerformed(ActionEvent evt) { 
        	
        }
      });
      
      bAuftrag4.setBounds(944, 495, 665, 81);
      bAuftrag4.setText("Leer");
      bAuftrag4.setBackground(Color.WHITE);
      bAuftrag4.setBorder(new LineBorder(Color.BLACK));
      bAuftrag4.setMargin(new Insets(2, 2, 2, 2));
      bAuftrag4.setFocusPainted(false);
      bAuftrag4.setFont(new Font("Dialog", Font.BOLD, 16));
      bAuftrag4.addActionListener(new ActionListener() { 
        public void actionPerformed(ActionEvent evt) { 
        	
        }
      });
      
      bAblehnen1.setBounds(1616, 202, 75, 80);
      bAblehnen1.setIcon(icnDelete);
      bAblehnen1.setBackground(Color.WHITE);
      bAblehnen1.setBorder(new LineBorder(Color.BLACK));
      bAblehnen1.setMargin(new Insets(2, 2, 2, 2));
      bAblehnen1.setFocusPainted(false);
      bAblehnen1.addActionListener(new ActionListener() { 
        public void actionPerformed(ActionEvent evt) { 
        	if(af1 == 1) {
        		bAuftrag1.setText("Leer");
        		bAuftrag1.setBorder(new LineBorder(Color.BLACK));
        		af1 = 0;
        		KontoStand = KontoStand - Belohnung1;
        		lKontostand.setText("  Kontostand:  " + KontoStand +" €");
        		Umsatz = KontoStand - (KontoStand + Belohnung1);
        		if(Eintrag != 0) {
        			Umsatz = Umsatz + Integer.parseInt(dataStrings[Eintrag-1][3]);
        		}
        		dataStrings[Eintrag][0] = Art1;
        		dataStrings[Eintrag][1] = "-" + Belohnung1;
        		dataStrings[Eintrag][2] = "" + KontoStand;
        		dataStrings[Eintrag][3] = "" + Umsatz;
        		Eintrag++;
        	}
        }
      });
      
      bAblehnen2.setBounds(1616, 300, 75, 80);
      bAblehnen2.setIcon(icnDelete);
      bAblehnen2.setBackground(Color.WHITE);
      bAblehnen2.setBorder(new LineBorder(Color.BLACK));
      bAblehnen2.setMargin(new Insets(2, 2, 2, 2));
      bAblehnen2.setFocusPainted(false);
      bAblehnen2.addActionListener(new ActionListener() { 
        public void actionPerformed(ActionEvent evt) {
        	if(af2 == 1) {
        		bAuftrag2.setText("Leer");
        		bAuftrag2.setBorder(new LineBorder(Color.BLACK));
        		af2 = 0;
        		KontoStand = KontoStand - Belohnung2;
        		lKontostand.setText("  Kontostand:  " + KontoStand +" €");
        		Umsatz = KontoStand - (KontoStand + Belohnung2);
        		if(Eintrag != 0) {
        			Umsatz = Umsatz + Integer.parseInt(dataStrings[Eintrag-1][3]);
        		}
        		dataStrings[Eintrag][0] = Art2;
        		dataStrings[Eintrag][1] = "-" + Belohnung2;
        		dataStrings[Eintrag][2] = "" + KontoStand;
        		dataStrings[Eintrag][3] = "" + Umsatz;
        		Eintrag++;
        	}
        }
      });
      
      bAblehnen3.setBounds(1616, 398, 75, 80);
      bAblehnen3.setIcon(icnDelete);
      bAblehnen3.setBackground(Color.WHITE);
      bAblehnen3.setBorder(new LineBorder(Color.BLACK));
      bAblehnen3.setMargin(new Insets(2, 2, 2, 2));
      bAblehnen3.setFocusPainted(false);
      bAblehnen3.addActionListener(new ActionListener() { 
        public void actionPerformed(ActionEvent evt) { 
        	if(af3 == 1) {
        		bAuftrag3.setText("Leer");
        		bAuftrag3.setBorder(new LineBorder(Color.BLACK)); 
        		af3 = 0;
        		KontoStand = KontoStand - Belohnung3;
        		lKontostand.setText("  Kontostand:  " + KontoStand +" €");

        		Umsatz = KontoStand - (KontoStand + Belohnung3);
        		if(Eintrag != 0) {
        			Umsatz = Umsatz + Integer.parseInt(dataStrings[Eintrag-1][3]);
        		}
        		dataStrings[Eintrag][0] = Art3;
        		dataStrings[Eintrag][1] = "-" + Belohnung3;
        		dataStrings[Eintrag][2] = "" + KontoStand;
        		dataStrings[Eintrag][3] = "" + Umsatz;
        		Eintrag++;
        	}
        }
      });
      
      bAblehnen4.setBounds(1616, 495, 75, 81);
      bAblehnen4.setIcon(icnDelete);
      bAblehnen4.setBackground(Color.WHITE);
      bAblehnen4.setBorder(new LineBorder(Color.BLACK));
      bAblehnen4.setMargin(new Insets(2, 2, 2, 2));
      bAblehnen4.setFocusPainted(false);
      bAblehnen4.addActionListener(new ActionListener() { 
        public void actionPerformed(ActionEvent evt) { 
        	if(af4 == 1) {
        		bAuftrag4.setText("Leer");
        		bAuftrag4.setBorder(new LineBorder(Color.BLACK));
        		af4 = 0;
        		KontoStand = KontoStand - Belohnung4;
        		lKontostand.setText("  Kontostand:  " + KontoStand +" €");

        		Umsatz = KontoStand - (KontoStand + Belohnung4);
        		if(Eintrag != 0) {
        			Umsatz = Umsatz + Integer.parseInt(dataStrings[Eintrag-1][3]);
        		}
        		dataStrings[Eintrag][0] = Art4;
        		dataStrings[Eintrag][1] = "-" + Belohnung4;
        		dataStrings[Eintrag][2] = "" + KontoStand;
        		dataStrings[Eintrag][3] = "" + Umsatz;
        		Eintrag++;
        	}
        }
      });
      kontostandPanel.setBackground(Color.GRAY);
      kontostandPanel.setBounds(561, 778, 266, 43);
      kontostandPanel.setVisible(true);
	}
}
