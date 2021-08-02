/*
 * Student:  Mohamed Haji
 * Kurs: 	 INF20B
 * Matr.Nr.: 8528264
 * GitHub: 	 https://github.com/Moha-01/lager-spiel-java
 * 
 */


package Bilanz;

import java.awt.Dimension;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

@SuppressWarnings("serial")
public class Bilanz extends JPanel{

    public Bilanz(String[] header, String [][] data){

        DefaultTableModel model = new DefaultTableModel(data,header);

        JTable table = new JTable(model);

        table.setPreferredScrollableViewportSize(new Dimension(450,400));
        table.setFillsViewportHeight(true);

        JScrollPane js=new JScrollPane(table);
        js.setVisible(true);
        add(js);

    }

}