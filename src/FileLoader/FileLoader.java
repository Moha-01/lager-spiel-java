package FileLoader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileLoader {
	
	private String fileAbsolutPathString = new File("").getAbsolutePath();
	private File CSVFile = new File(fileAbsolutPathString + "\\src\\FileLoader\\Leistungsnachweis.csv");
	
	
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
	private String allCSVLines[] = new String[500];
	
	public String[][] getCSVData() {
		
		Scanner sc = null;
		try {
			sc = new Scanner(CSVFile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
        sc.useDelimiter(";|\\n");
        int dataCounter = 0;
        while (sc.hasNext())
        {
        	allCSVLines[dataCounter] = sc.next().replace("\n", "").replace(" ", "").replace("\r", "");
        	if(allCSVLines[dataCounter] == null) {
        		break;
        	}
  			dataCounter++;
        }
        dataCounter = dataCounter - 1;
		        
        int x = 6;
        for(int i = 0; i <= (dataCounter/6); i++) {
        	auftragDaten[0][i] = allCSVLines[i+x];
        	auftragDaten[1][i] = allCSVLines[i+x+1];
        	auftragDaten[2][i] = allCSVLines[i+x+2];
        	auftragDaten[3][i] = allCSVLines[i+x+3];
        	auftragDaten[4][i] = allCSVLines[i+x+4];
        	auftragDaten[5][i] = allCSVLines[i+x+5];
            x= (x+6)-1;
        }
        sc.close(); 
		
		return auftragDaten;
	}
	
}
