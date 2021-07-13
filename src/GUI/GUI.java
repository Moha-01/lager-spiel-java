package GUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

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
	
	private ImageIcon img = new ImageIcon(GUI.class.getResource("gaming.png"));
	
	
	
	public GUI() {
		
		super();
		setTitle("Lager Spiel");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		int frameWidth = 1700;
	    int frameHeight = 1000;
	    setSize(frameWidth, frameHeight);
	    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
	    int x = (d.width - getSize().width) / 2;
	    int y = (d.height - getSize().height) / 2;
	    setLocation(x, y);
		
		setResizable(true);
		Container cp = getContentPane();
	    cp.setLayout(null);
	    cp.setBackground(Color.LIGHT_GRAY);
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
		
		
		setLocationRelativeTo(null);
		setVisible(true);
		
	}
	
	private void initComponents() {
		
		/*Label*/
		
		/*Button*/
		
		//Regal 1 Vorne 
		int abstandx = 54;
		r1v1.setBounds(50, abstandx, 180, 80);
	    r1v1.setText("r1v1");
	    r1v1.setBackground(Color.WHITE);
	    r1v1.setForeground(Color.BLACK);
	    r1v1.setFocusPainted(false);
	    r1v1.setMargin(new Insets(2, 2, 2, 2));
	    r1v1.addActionListener(new ActionListener() { 
	      public void actionPerformed(ActionEvent evt) { 
	        System.out.println("Klick");
	      }
	    });
	    
	    abstandx=(abstandx + 82);
	    r1v2.setBounds(50, abstandx, 180, 80);
	    r1v2.setText("r1v2");
	    r1v2.setBackground(Color.WHITE);
	    r1v2.setForeground(Color.BLACK);
	    r1v2.setFocusPainted(false);
	    r1v2.setMargin(new Insets(2, 2, 2, 2));
	    r1v2.addActionListener(new ActionListener() { 
	      public void actionPerformed(ActionEvent evt) { 
	        System.out.println("Klick");
	      }
	    });

	    abstandx=(abstandx + 82);
	    r1v3.setBounds(50, abstandx, 180, 80);
	    r1v3.setText("r1v3");
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
	    r1v4.setBounds(50, abstandx, 180, 80);
	    r1v4.setText("r1v4");
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
	    r1v5.setBounds(50, abstandx, 180, 80);
	    r1v5.setText("r1v5");
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
	    r1h1.setBounds(235, abstandx, 180, 80);
	    r1h1.setText("r1h1");
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
	    r1h2.setBounds(235, abstandx, 180, 80);
	    r1h2.setText("r1h2");
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
	    r1h3.setBounds(235, abstandx, 180, 80);
	    r1h3.setText("r1h3");
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
	    r1h4.setBounds(235, abstandx, 180, 80);
	    r1h4.setText("r1h4");
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
	    r1h5.setBounds(235, abstandx, 180, 80);
	    r1h5.setText("r1h5");
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
  		r2v1.setBounds(450, abstandx, 180, 80);
  	    r2v1.setText("r2v1");
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
  	    r2v2.setBounds(450, abstandx, 180, 80);
  	    r2v2.setText("r2v2");
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
  	    r2v3.setBounds(450, abstandx, 180, 80);
  	    r2v3.setText("r2v3");
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
  	    r2v4.setBounds(450, abstandx, 180, 80);
  	    r2v4.setText("r2v4");
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
  	    r2v5.setBounds(450, abstandx, 180, 80);
  	    r2v5.setText("r2v5");
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
  	    r2h1.setBounds(635, abstandx, 180, 80);
  	    r2h1.setText("r2h1");
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
  	    r2h2.setBounds(635, abstandx, 180, 80);
  	    r2h2.setText("r2h2");
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
  	    r2h3.setBounds(635, abstandx, 180, 80);
  	    r2h3.setText("r2h3");
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
  	    r2h4.setBounds(635, abstandx, 180, 80);
  	    r2h4.setText("r2h4");
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
  	    r2h5.setBounds(635, abstandx, 180, 80);
  	    r2h5.setText("r2h5");
	    r2h5.setBackground(Color.WHITE);
	    r2h5.setForeground(Color.BLACK);
	    r2h5.setFocusPainted(false);
  	    r2h5.setMargin(new Insets(2, 2, 2, 2));
  	    r2h5.addActionListener(new ActionListener() { 
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
