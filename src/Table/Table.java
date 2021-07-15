package Table;

import java.awt.Dimension;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Table extends JPanel{

    JTable jt;
    private String [] header;
    private String [][] data; //= new String[100][4];
    
    public Table(String[] header, String [][] data){

    	this.header = header;
    	this.data = data;
        DefaultTableModel model = new DefaultTableModel(data,header);

        JTable table = new JTable(model);

        table.setPreferredScrollableViewportSize(new Dimension(450,400));
        table.setFillsViewportHeight(true);

        JScrollPane js=new JScrollPane(table);
        js.setVisible(true);
        add(js);

    }

}