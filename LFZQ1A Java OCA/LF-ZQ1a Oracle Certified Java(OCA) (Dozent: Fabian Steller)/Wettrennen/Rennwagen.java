package Wettrennen;

public class Rennwagen extends Auto {

	{
		setAnzahlR�der(4);
		setMaxGeschwindigkeit(220);
	}
	
	public Rennwagen(int geschwindigkeit, int maxGeschwindigkeit, int anzahlR�der) {
		// Delegiert an den Konstruktor der Elternklasse
		super(geschwindigkeit, maxGeschwindigkeit, anzahlR�der);
	}

}
