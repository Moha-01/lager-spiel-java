package GUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.LineBorder;


@SuppressWarnings("serial")
public class GUI extends JFrame implements ActionListener{

	// r1v1 = Regal 1 Vorne 1 | r2h2 = regal 2 hinten 2

	//Regal 1
	private JButton r1v1 = new JButton();
	private JButton r1v2 = new JButton();
	private JButton r1v3 = new JButton();
	private JButton r1v4 = new JButton();
	private JButton r1v5 = new JButton();
	private JButton r1h1 = new JButton();
	private JButton r1h2 = new JButton();
	private JButton r1h3 = new JButton();
	private JButton r1h4 = new JButton();
	private JButton r1h5 = new JButton();

	//Regal 2
	private JButton r2v1 = new JButton();
	private JButton r2v2 = new JButton();
	private JButton r2v3 = new JButton();
	private JButton r2v4 = new JButton();
	private JButton r2v5 = new JButton();
	private JButton r2h1 = new JButton();
	private JButton r2h2 = new JButton();
	private JButton r2h3 = new JButton();
	private JButton r2h4 = new JButton();
	private JButton r2h5 = new JButton();
	private JButton outControl = new JButton();
	private JButton moveControl = new JButton();
	private JButton destroyControl = new JButton();
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
	
	/* Underline */
	private JLabel Label1Regal = new JLabel();
	private JLabel Label2Regal = new JLabel();
	private JLabel Label1Vorne = new JLabel();
	private JLabel Label1Hinten = new JLabel();
	private JLabel Label2Vorne = new JLabel();
	private JLabel Label2Hinten = new JLabel();
	private JLabel controlsLabel = new JLabel();
	private JLabel colLeft = new JLabel();
	private JLabel colRight = new JLabel();
	private JLabel colBottom = new JLabel();
	private JLabel LabelAuslagern = new JLabel();
	private JLabel LabelMove = new JLabel();
	private JLabel LabelDestroy = new JLabel();
	private JLabel lKontostand = new JLabel();
	private JLabel LabelBilanz = new JLabel();
	private JLabel lAuftraege = new JLabel();
	private JLabel colLeft_auf = new JLabel();
	private JLabel colRight_auf = new JLabel();
	private JLabel colButtom_auf = new JLabel();
	
	private Icon btnIcon = new ImageIcon(GUI.class.getResource("placeholder.png"));
	private Icon btnDestroy = new ImageIcon(GUI.class.getResource("destroy.png"));
	private Icon btnMove = new ImageIcon(GUI.class.getResource("move.png"));
	private Icon btnOut = new ImageIcon(GUI.class.getResource("auslagern.png"));
	private Icon btnBilanz = new ImageIcon(GUI.class.getResource("bilanz.png"));
	private Icon btnDelete = new ImageIcon(GUI.class.getResource("ablehnen.png"));
	
	private ImageIcon img = new ImageIcon(GUI.class.getResource("gaming.png"));
	
	//TextField
	private JTextField KontostandTextField = new JTextField();

	
	//Variablen
	//Placeholder
	int r1v1_ph = 1;
	int r1v2_ph = 1;
	int r1v3_ph = 1;
	int r1v4_ph = 1;
	int r1v5_ph = 1;
	int r1h1_ph = 1;
	int r1h2_ph = 1;
	int r1h3_ph = 1;
	int r1h4_ph = 1;
	int r1h5_ph = 1;
	int r2v1_ph = 1;
	int r2v2_ph = 1;
	int r2v3_ph = 1;
	int r2v4_ph = 1;
	int r2v5_ph = 1;
	int r2h1_ph = 1;
	int r2h2_ph = 1;
	int r2h3_ph = 1;
	int r2h4_ph = 1;
	int r2h5_ph = 1;
	
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


		/*Labels*/

		/*Buttons*/
		//Regal 1 Vorne
		cp.add(r1v1);
		cp.add(r1v2);
		cp.add(r1v3);
		cp.add(r1v4);
		cp.add(r1v5);

		//Regal 1 Hinten
		cp.add(r1h1);
		cp.add(r1h2);
		cp.add(r1h3);
		cp.add(r1h4);
		cp.add(r1h5);

		//Regal 2 Vorne
		cp.add(r2v1);
		cp.add(r2v2);
		cp.add(r2v3);
		cp.add(r2v4);
		cp.add(r2v5);

		//Regal 2 Hinten
		cp.add(r2h1);
		cp.add(r2h2);
		cp.add(r2h3);
		cp.add(r2h4);
		cp.add(r2h5);

		//Underline
		cp.add(Label1Regal);
		cp.add(Label2Regal);
        cp.add(Label1Vorne);
        cp.add(Label1Hinten);
        cp.add(Label2Vorne);
        cp.add(Label2Hinten);
        cp.add(controlsLabel);
        cp.add(colLeft);
        cp.add(colRight);
        cp.add(colBottom);
        cp.add(outControl);
        cp.add(LabelAuslagern);
        cp.add(moveControl);
        cp.add(destroyControl);
        cp.add(LabelMove);
        cp.add(LabelDestroy);
        cp.add(lKontostand);
        cp.add(bilanzButton);
        cp.add(LabelBilanz);
        cp.add(KontostandTextField);
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

		setLocationRelativeTo(null);
		setVisible(true);

	}
	
	
	
	private void initComponents() {
		
		
		/*Label*/

		/*Button*/

		//Regal 1 Vorne
		int abstandx = 54;
		
		r1v1.setIcon(btnIcon);
		r1v1.setBorder(new LineBorder(Color.BLACK));
		r1v1.setBounds(50, abstandx, 180, 80);
	    r1v1.setBackground(Color.WHITE);
	    r1v1.setForeground(Color.BLACK);
	    r1v1.setFocusPainted(false);
	    r1v1.setMargin(new Insets(2, 2, 2, 2));
	    r1v1.addActionListener(new ActionListener() {
	      int klick = 0;
	      public void actionPerformed(ActionEvent evt) {
	    	  if(klick == 0) {
	    		  klick = 1;
	    		  r1v1.setBackground(Color.red);
	    	  } else if(klick == 1) {
	    		  klick = 0;
	    		  r1v1.setBackground(Color.white);
	    	  }
	    	  
	    	  if (r1v2_ph == 1) {
				r1v2.setBackground(Color.ORANGE);
				r1v2_ph = 0;
			}
	    	  
	    	  
	      }
	    });

	    abstandx=(abstandx + 82);
	    
	    r1v2.setIcon(btnIcon);
		r1v2.setBorder(new LineBorder(Color.BLACK));
	    r1v2.setBounds(50, abstandx, 180, 80);
	    r1v2.setBackground(Color.WHITE);
	    r1v2.setForeground(Color.BLACK);
	    r1v2.setFocusPainted(false);
	    r1v2.setMargin(new Insets(2, 2, 2, 2));
	    r1v2.addActionListener(new ActionListener() {
	      public void actionPerformed(ActionEvent evt) {
	        if (r1v2_ph == 0) {
				r1v2.setBackground(Color.white);
				r1v2_ph = 1;
			}
	      }
	    });

	    abstandx=(abstandx + 82);
	    r1v3.setIcon(btnIcon);
		r1v3.setBorder(new LineBorder(Color.BLACK));
	    r1v3.setBounds(50, abstandx, 180, 80);
	    r1v3.setBackground(Color.WHITE);
	    r1v3.setForeground(Color.BLACK);
	    r1v3.setFocusPainted(false);
	    r1v3.setMargin(new Insets(2, 2, 2, 2));
	    r1v3.addActionListener(new ActionListener() {
	      public void actionPerformed(ActionEvent evt) {
	        System.out.println("Klick");
	      }
	    });

	    abstandx=(abstandx + 82);
	    r1v4.setIcon(btnIcon);
		r1v4.setBorder(new LineBorder(Color.BLACK));
	    r1v4.setBounds(50, abstandx, 180, 80);
	    r1v4.setBackground(Color.WHITE);
	    r1v4.setForeground(Color.BLACK);
	    r1v4.setFocusPainted(false);
	    r1v4.setMargin(new Insets(2, 2, 2, 2));
	    r1v4.addActionListener(new ActionListener() {
	      public void actionPerformed(ActionEvent evt) {
	        System.out.println("Klick");
	      }
	    });

	    abstandx=(abstandx + 82);
	    r1v5.setIcon(btnIcon);
	    r1v5.setBorder(new LineBorder(Color.BLACK));
	    r1v5.setBounds(50, abstandx, 180, 80);
	    r1v5.setBackground(Color.WHITE);
	    r1v5.setForeground(Color.BLACK);
	    r1v5.setFocusPainted(false);
	    r1v5.setMargin(new Insets(2, 2, 2, 2));
	    r1v5.addActionListener(new ActionListener() {
	      public void actionPerformed(ActionEvent evt) {
	        System.out.println("Klick");
	      }
	    });

	    // Regal 1 Hinten
	    abstandx = 54;
	    r1h1.setIcon(btnIcon);
	    r1h1.setBorder(new LineBorder(Color.BLACK));
	    r1h1.setBounds(235, abstandx, 180, 80);
	    r1h1.setBackground(Color.WHITE);
	    r1h1.setForeground(Color.BLACK);
	    r1h1.setFocusPainted(false);
	    r1h1.setMargin(new Insets(2, 2, 2, 2));
	    r1h1.addActionListener(new ActionListener() {
	      public void actionPerformed(ActionEvent evt) {
	    	  System.out.println("Klick");
	      }
	    });

	    abstandx=(abstandx + 82);
	    r1h2.setIcon(btnIcon);
	    r1h2.setBorder(new LineBorder(Color.BLACK));
	    r1h2.setBounds(235, abstandx, 180, 80);
	    r1h2.setBackground(Color.WHITE);
	    r1h2.setForeground(Color.BLACK);
	    r1h2.setFocusPainted(false);
	    r1h2.setMargin(new Insets(2, 2, 2, 2));
	    r1h2.addActionListener(new ActionListener() {
	      public void actionPerformed(ActionEvent evt) {
	    	  System.out.println("Klick");
	      }
	    });

	    abstandx=(abstandx + 82);
	    r1h3.setIcon(btnIcon);
		r1v1.setBorder(new LineBorder(Color.BLACK));
	    r1h3.setBounds(235, abstandx, 180, 80);
	    r1h3.setBackground(Color.WHITE);
	    r1h3.setForeground(Color.BLACK);
	    r1h3.setFocusPainted(false);
	    r1h3.setMargin(new Insets(2, 2, 2, 2));
	    r1h3.addActionListener(new ActionListener() {
	      public void actionPerformed(ActionEvent evt) {
	    	  System.out.println("Klick");
	      }
	    });

	    abstandx=(abstandx + 82);
	    r1h4.setIcon(btnIcon);
	    r1h4.setBorder(new LineBorder(Color.BLACK));
	    r1h4.setBounds(235, abstandx, 180, 80);
	    r1h4.setBackground(Color.WHITE);
	    r1h4.setForeground(Color.BLACK);
	    r1h4.setFocusPainted(false);
	    r1h4.setMargin(new Insets(2, 2, 2, 2));
	    r1h4.addActionListener(new ActionListener() {
	      public void actionPerformed(ActionEvent evt) {
	    	  System.out.println("Klick");
	      }
	    });

	    abstandx=(abstandx + 82);
	    r1h5.setIcon(btnIcon);
	    r1h5.setBorder(new LineBorder(Color.BLACK));
	    r1h5.setBounds(235, abstandx, 180, 80);
	    r1h5.setBackground(Color.WHITE);
	    r1h5.setForeground(Color.BLACK);
	    r1h5.setFocusPainted(false);
	    r1h5.setMargin(new Insets(2, 2, 2, 2));
	    r1h5.addActionListener(new ActionListener() {
	      public void actionPerformed(ActionEvent evt) {
	    	  System.out.println("Klick");
	      }
	    });



    	//Regal 2 Vorne
  		abstandx = 54;
    	r2v1.setIcon(btnIcon);
    	r2v1.setBorder(new LineBorder(Color.BLACK));
    	r2v1.setBounds(450, abstandx, 180, 80);
	    r2v1.setBackground(Color.WHITE);
	    r2v1.setForeground(Color.BLACK);
	    r2v1.setFocusPainted(false);
  	  	r2v1.setMargin(new Insets(2, 2, 2, 2));
  	  	r2v1.addActionListener(new ActionListener() {
	      public void actionPerformed(ActionEvent evt) {
		        System.out.println("Klick");
		  }
	    });

  	 	abstandx=(abstandx + 82);
    	r2v2.setIcon(btnIcon);
    	r2v2.setBorder(new LineBorder(Color.BLACK));
    	r2v2.setBounds(450, abstandx, 180, 80);
	    r2v2.setBackground(Color.WHITE);
	    r2v2.setForeground(Color.BLACK);
	    r2v2.setFocusPainted(false);
  	  	r2v2.setMargin(new Insets(2, 2, 2, 2));
  	  	r2v2.addActionListener(new ActionListener() {
	  	  public void actionPerformed(ActionEvent evt) {
	  	      System.out.println("Klick");
	  	    }
  	  	});

  	  	abstandx=(abstandx + 82);
  	  	r2v3.setIcon(btnIcon);
  	  	r2v3.setBorder(new LineBorder(Color.BLACK));
  	  	r2v3.setBounds(450, abstandx, 180, 80);
	    r2v3.setBackground(Color.WHITE);
	    r2v3.setForeground(Color.BLACK);
	    r2v3.setFocusPainted(false);
  	  	r2v3.setMargin(new Insets(2, 2, 2, 2));
  	  	r2v3.addActionListener(new ActionListener() {
  	  		public void actionPerformed(ActionEvent evt) {
  	  			System.out.println("Klick");
  	  		}
  	  	});

  	  	abstandx=(abstandx + 82);
  	  	r2v4.setIcon(btnIcon);
  	  	r2v4.setBorder(new LineBorder(Color.BLACK));
  	  	r2v4.setBounds(450, abstandx, 180, 80);
	    r2v4.setBackground(Color.WHITE);
	    r2v4.setForeground(Color.BLACK);
	    r2v4.setFocusPainted(false);
	    r2v4.setMargin(new Insets(2, 2, 2, 2));
	    r2v4.addActionListener(new ActionListener() {
	  	    public void actionPerformed(ActionEvent evt) {
	  	      System.out.println("Klick");
	  	    }
	    });

  	  	abstandx=(abstandx + 82);  	  
  	  	r2v5.setIcon(btnIcon);
  	  	r2v5.setBorder(new LineBorder(Color.BLACK));
  	  	r2v5.setBounds(450, abstandx, 180, 80);
	    r2v5.setBackground(Color.WHITE);
	    r2v5.setForeground(Color.BLACK);
	    r2v5.setFocusPainted(false);
	    r2v5.setMargin(new Insets(2, 2, 2, 2));
	    r2v5.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent evt) {
	    		System.out.println("Klick");
	    	}
	    });

  	    // Regal 2 Hinten
	    abstandx = 54;
	    r2h1.setIcon(btnIcon);
	    r2h1.setBorder(new LineBorder(Color.BLACK));
	    r2h1.setBounds(635, abstandx, 180, 80);
	    r2h1.setBackground(Color.WHITE);
	    r2h1.setForeground(Color.BLACK);
	    r2h1.setFocusPainted(false);
	    r2h1.setMargin(new Insets(2, 2, 2, 2));
	    r2h1.addActionListener(new ActionListener() {
  	      public void actionPerformed(ActionEvent evt) {
  	    	  System.out.println("Klick");
  	      }
	    });

	    abstandx=(abstandx + 82);
	    r2h2.setIcon(btnIcon);
	    r2h2.setBorder(new LineBorder(Color.BLACK));
	    r2h2.setBounds(635, abstandx, 180, 80);
  	    r2h2.setBackground(Color.WHITE);
	    r2h2.setForeground(Color.BLACK);
	    r2h2.setFocusPainted(false);
	    r2h2.setMargin(new Insets(2, 2, 2, 2));
  	  	r2h2.addActionListener(new ActionListener() {
  	      public void actionPerformed(ActionEvent evt) {
  	    	  System.out.println("Klick");
  	      }
  	  	});

  	  	abstandx=(abstandx + 82);
  	  	r2h3.setIcon(btnIcon);
  	  	r2h3.setBorder(new LineBorder(Color.BLACK));
  	  	r2h3.setBounds(635, abstandx, 180, 80);  
	    r2h3.setBackground(Color.WHITE);
	    r2h3.setForeground(Color.BLACK);
	    r2h3.setFocusPainted(false);
	    r2h3.setMargin(new Insets(2, 2, 2, 2));
	    r2h3.addActionListener(new ActionListener() {
  	      public void actionPerformed(ActionEvent evt) {
  	    	  System.out.println("Klick");
  	      }
	    });

	    abstandx=(abstandx + 82);
	    r2h4.setIcon(btnIcon);
	    r2h4.setBorder(new LineBorder(Color.BLACK));
	    r2h4.setBounds(635, abstandx, 180, 80);
	    r2h4.setBackground(Color.WHITE);
	    r2h4.setForeground(Color.BLACK);
	    r2h4.setFocusPainted(false);
	    r2h4.setMargin(new Insets(2, 2, 2, 2));
	    r2h4.addActionListener(new ActionListener() {
  	      public void actionPerformed(ActionEvent evt) {
  	    	  System.out.println("Klick");
  	      }
	    });

	    abstandx=(abstandx + 82);
	    r2h5.setIcon(btnIcon);
	    r2h5.setBorder(new LineBorder(Color.BLACK));
	    r2h5.setBounds(635, abstandx, 180, 80);
	    r2h5.setBackground(Color.WHITE);
	    r2h5.setForeground(Color.BLACK);
	    r2h5.setFocusPainted(false);
	    r2h5.setMargin(new Insets(2, 2, 2, 2));
	    r2h5.addActionListener(new ActionListener() {
  	      public void actionPerformed(ActionEvent evt) {
  	    	  System.out.println("Klick");
  	      }
	    });


	    /* Underlines */

      Label1Regal.setBounds(51, 30, 363, 20);
      Label1Regal.setText("1. Regal");
      Label1Regal.setHorizontalAlignment(SwingConstants.CENTER);
      Label1Regal.setHorizontalTextPosition(SwingConstants.CENTER);
      Label1Regal.setBackground(Color.BLACK);
      Label1Regal.setForeground(Color.WHITE);
      Label1Regal.setOpaque(true);

      Label2Regal.setBounds(450, 30, 363, 20);
      Label2Regal.setText("2. Regal");
      Label2Regal.setHorizontalAlignment(SwingConstants.CENTER);
      Label2Regal.setHorizontalTextPosition(SwingConstants.CENTER);
      Label2Regal.setBackground(Color.BLACK);
      Label2Regal.setForeground(Color.WHITE);
      Label2Regal.setOpaque(true);

      Label1Vorne.setBounds(51, 465, 177, 20);
      Label1Vorne.setText("Vorne");
      Label1Vorne.setHorizontalAlignment(SwingConstants.CENTER);
      Label1Vorne.setHorizontalTextPosition(SwingConstants.CENTER);
      Label1Vorne.setBackground(Color.GREEN);
      Label1Vorne.setOpaque(true);

      Label1Hinten.setBounds(236, 465, 177, 20);
      Label1Hinten.setText("Hinten");
      Label1Hinten.setHorizontalAlignment(SwingConstants.CENTER);
      Label1Hinten.setHorizontalTextPosition(SwingConstants.CENTER);
      Label1Hinten.setBackground(Color.YELLOW);
      Label1Hinten.setOpaque(true);

      Label2Vorne.setBounds(451, 465, 177, 20);
      Label2Vorne.setText("Vorne");
      Label2Vorne.setHorizontalAlignment(SwingConstants.CENTER);
      Label2Vorne.setHorizontalTextPosition(SwingConstants.CENTER);
      Label2Vorne.setBackground(Color.GREEN);
      Label2Vorne.setOpaque(true);

      Label2Hinten.setBounds(637, 465, 177, 20);
      Label2Hinten.setText("Hinten");
      Label2Hinten.setHorizontalAlignment(SwingConstants.CENTER);
      Label2Hinten.setHorizontalTextPosition(SwingConstants.CENTER);
      Label2Hinten.setBackground(Color.YELLOW);
      Label2Hinten.setOpaque(true);
      
      controlsLabel.setBounds(50, 519, 768, 34);
      controlsLabel.setText("Controls");
      controlsLabel.setHorizontalTextPosition(SwingConstants.CENTER);
      controlsLabel.setHorizontalAlignment(SwingConstants.CENTER);
      controlsLabel.setBackground(Color.BLACK);
      controlsLabel.setOpaque(true);
      controlsLabel.setForeground(Color.WHITE);
      
      colLeft.setBounds(50, 551, 14, 153);
      colLeft.setText("");
      colLeft.setBackground(Color.BLACK);
      colLeft.setOpaque(true);
      
      colRight.setBounds(804, 551, 14, 153);
      colRight.setBackground(Color.BLACK);
      colRight.setText("");
      colRight.setOpaque(true);
      
      colBottom.setBounds(50, 688, 768, 17);
      colBottom.setBackground(Color.BLACK);
      colBottom.setText("");
      colBottom.setOpaque(true);
      
      outControl.setBounds(105, 569, 180, 80);
      outControl.setIcon(btnOut);
      outControl.setMargin(new Insets(2, 2, 2, 2));
      outControl.setBackground(Color.WHITE);
      outControl.setFocusPainted(false);
      outControl.setBorder(new LineBorder(Color.BLACK));
      outControl.addActionListener(new ActionListener() { 
        public void actionPerformed(ActionEvent evt) { 
          System.out.println("Klick");
        }
      });
      
      LabelAuslagern.setBounds(106, 655, 179, 20);
      LabelAuslagern.setText("Auslagern");
      LabelAuslagern.setHorizontalTextPosition(SwingConstants.CENTER);
      LabelAuslagern.setHorizontalAlignment(SwingConstants.CENTER);
      LabelAuslagern.setBackground(new Color(0xFFC800));
      LabelAuslagern.setOpaque(true);
      
      
      moveControl.setBounds(345, 569, 180, 80);
      moveControl.setIcon(btnMove);
      moveControl.setMargin(new Insets(2, 2, 2, 2));
      moveControl.setBackground(Color.WHITE);
      moveControl.setFocusPainted(false);
      moveControl.setBorder(new LineBorder(Color.BLACK));
      moveControl.addActionListener(new ActionListener() { 
        public void actionPerformed(ActionEvent evt) { 
        	System.out.println("Klick");
        }
      });
      
      LabelMove.setBounds(346, 655, 179, 20);
      LabelMove.setText("Move");
      LabelMove.setHorizontalTextPosition(SwingConstants.CENTER);
      LabelMove.setHorizontalAlignment(SwingConstants.CENTER);
      LabelMove.setBackground(Color.YELLOW);
      LabelMove.setOpaque(true);
      
      destroyControl.setBounds(585, 569, 180, 80);
      destroyControl.setIcon(btnDestroy);
      destroyControl.setMargin(new Insets(2, 2, 2, 2));
      destroyControl.setBackground(Color.WHITE);
      destroyControl.setFocusPainted(false);
      destroyControl.setBorder(new LineBorder(Color.BLACK));
      destroyControl.addActionListener(new ActionListener() { 
        public void actionPerformed(ActionEvent evt) { 
        	System.out.println("Klick");
        }
      });
      
      LabelDestroy.setBounds(586, 655, 179, 20);
      LabelDestroy.setText("Verschrotten");
      LabelDestroy.setHorizontalTextPosition(SwingConstants.CENTER);
      LabelDestroy.setHorizontalAlignment(SwingConstants.CENTER);
      LabelDestroy.setBackground(Color.RED);
      LabelDestroy.setOpaque(true);
      
      lKontostand.setBounds(561, 778, 266, 43);
      lKontostand.setText("  Kontostand:                          €");
      lKontostand.setHorizontalTextPosition(SwingConstants.CENTER);
      lKontostand.setHorizontalAlignment(SwingConstants.LEFT);
      lKontostand.setBackground(new Color(0xEEEEEE));
      lKontostand.setOpaque(true);
      lKontostand.setFont(new Font("Dialog", Font.BOLD, 18));
      
      bilanzButton.setBounds(887, 745, 180, 80);
      bilanzButton.setIcon(btnBilanz);
      bilanzButton.setBackground(Color.WHITE);
      bilanzButton.setBorder(new javax.swing.border.LineBorder(Color.BLACK));
      bilanzButton.setMargin(new Insets(2, 2, 2, 2));
      bilanzButton.setFocusPainted(false);
      bilanzButton.addActionListener(new ActionListener() { 
        public void actionPerformed(ActionEvent evt) { 
        	System.out.println("Klick");
        }
      });
      
      LabelBilanz.setBounds(887, 830, 180, 20);
      LabelBilanz.setText("BILANZ");
      LabelBilanz.setHorizontalTextPosition(SwingConstants.CENTER);
      LabelBilanz.setHorizontalAlignment(SwingConstants.CENTER);
      LabelBilanz.setBackground(Color.BLACK);
      LabelBilanz.setForeground(Color.WHITE);
      LabelBilanz.setOpaque(true);
      
      KontostandTextField.setBounds(683, 783, 116, 35);
      KontostandTextField.setText("0");
      KontostandTextField.setEditable(false);
      KontostandTextField.setFont(new Font("Dialog", Font.PLAIN, 18));
      
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
        public void actionPerformed(ActionEvent evt) { 
        	System.out.println("Klick");
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
        	System.out.println("Klick");
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
        	System.out.println("Klick");
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
        	System.out.println("Klick");
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
        	System.out.println("Klick");
        }
      });
      
      
      bAblehnen1.setBounds(1616, 202, 75, 80);
      bAblehnen1.setIcon(btnDelete);
      bAblehnen1.setBackground(Color.WHITE);
      bAblehnen1.setBorder(new LineBorder(Color.BLACK));
      bAblehnen1.setMargin(new Insets(2, 2, 2, 2));
      bAblehnen1.setFocusPainted(false);
      bAblehnen1.addActionListener(new ActionListener() { 
        public void actionPerformed(ActionEvent evt) { 
        	System.out.println("Klick");
        }
      });
      
      bAblehnen2.setBounds(1616, 300, 75, 80);
      bAblehnen2.setIcon(btnDelete);
      bAblehnen2.setBackground(Color.WHITE);
      bAblehnen2.setBorder(new LineBorder(Color.BLACK));
      bAblehnen2.setMargin(new Insets(2, 2, 2, 2));
      bAblehnen2.setFocusPainted(false);
      bAblehnen2.addActionListener(new ActionListener() { 
        public void actionPerformed(ActionEvent evt) { 
        	System.out.println("Klick");
        }
      });
      
      
      bAblehnen3.setBounds(1616, 398, 75, 80);
      bAblehnen3.setIcon(btnDelete);
      bAblehnen3.setBackground(Color.WHITE);
      bAblehnen3.setBorder(new LineBorder(Color.BLACK));
      bAblehnen3.setMargin(new Insets(2, 2, 2, 2));
      bAblehnen3.setFocusPainted(false);
      bAblehnen3.addActionListener(new ActionListener() { 
        public void actionPerformed(ActionEvent evt) { 
        	System.out.println("Klick");
        }
      });
      
      bAblehnen4.setBounds(1616, 495, 75, 81);
      bAblehnen4.setIcon(btnDelete);
      bAblehnen4.setBackground(Color.WHITE);
      bAblehnen4.setBorder(new LineBorder(Color.BLACK));
      bAblehnen4.setMargin(new Insets(2, 2, 2, 2));
      bAblehnen4.setFocusPainted(false);
      bAblehnen4.addActionListener(new ActionListener() { 
        public void actionPerformed(ActionEvent evt) { 
        	System.out.println("Klick");
        }
      });
      
      
      
      
      

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}




}
