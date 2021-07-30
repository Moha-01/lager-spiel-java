package Auftrag;

public class Auftrag {
	private String auftragNr = new String();
	private String auftragArt = new String();
	private String produkt = new String();
	private String [] Attribut = new String[2];
	private String auftragBelohnung = new String();
	private String status = new String();
	private boolean auftragDone = false;
	
	public Auftrag() {
		status = "Leer";
		System.out.println("Auftrag Leer");
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String Status) {
		this.status = Status;
	}
	
	public Auftrag(String Auftrag_Nummer, String AuftragArt, String Produkt, String Attribut1, String Attribut2, String Belohnung) {
		status = "Besetzt";
		auftragNr = Auftrag_Nummer;
		auftragArt = AuftragArt;
		produkt = Produkt;
		Attribut[0] = Attribut1;
		Attribut[1] = Attribut2;
		auftragBelohnung  = Belohnung;
	}
	
	public void setAuftragDone(boolean done) {
		auftragDone = done;
	}
	
	public boolean getAuftragDone() {
		return auftragDone;
	}
	
	public String getAuftragNr() {
		return auftragNr;
	}
	
	public void setAuftragNr(String Auftrag_Nummer) {
		auftragNr = Auftrag_Nummer;
	}
	
	public String getAuftragArt() {
		return auftragArt;
	}
	
	public void getAuftragArt(String AuftragArt) {
		auftragArt = AuftragArt;
	}
	
	public String getProdukt() {
		return produkt;
	}
	
	public void setProdukt(String Produkt) {
		 produkt = Produkt;
	}
	
	public String getAttribut_1() {
		return Attribut[0];
	}
	
	public void setAttribut_1(String Attribut) {
		this.Attribut[0] = Attribut;
	}
	
	public String getAttribut_2() {
		return Attribut[1];
	}
	
	public void setAttribut_2(String Attribut) {
		this.Attribut[1] = Attribut;
	}
	
	public String getBelohnung() {
		return auftragBelohnung;
	}
	
	public void setBelohnung(String Belohnung) {
		auftragBelohnung = Belohnung;
	}
	
}
