package Wettrennen;

public class Krankenwagen extends Auto {
	
	public Krankenwagen(int geschwindigkeit, int maxGeschwindigkeit, int anzahlR�der) {
		// Delegiert an den Konstruktor der Elternklasse
		super(geschwindigkeit, maxGeschwindigkeit, anzahlR�der);
	} 
	
	private boolean blaulicht = false;
	
	public void blaulichtAnschalten() {
		blaulicht = true;
	}
	
	public void blaulichtAusschalten() {
		blaulicht = false;
	}
	
}
