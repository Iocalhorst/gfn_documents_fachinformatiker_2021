package Wettrennen;

public class Krankenwagen extends Auto {
	
	public Krankenwagen(int geschwindigkeit, int maxGeschwindigkeit, int anzahlRäder) {
		// Delegiert an den Konstruktor der Elternklasse
		super(geschwindigkeit, maxGeschwindigkeit, anzahlRäder);
	} 
	
	private boolean blaulicht = false;
	
	public void blaulichtAnschalten() {
		blaulicht = true;
	}
	
	public void blaulichtAusschalten() {
		blaulicht = false;
	}
	
}
