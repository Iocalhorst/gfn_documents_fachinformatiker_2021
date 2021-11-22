package Wettrennen;

public class Rennwagen extends Auto {

	{
		setAnzahlRäder(4);
		setMaxGeschwindigkeit(220);
	}
	
	public Rennwagen(int geschwindigkeit, int maxGeschwindigkeit, int anzahlRäder) {
		// Delegiert an den Konstruktor der Elternklasse
		super(geschwindigkeit, maxGeschwindigkeit, anzahlRäder);
	}

}
