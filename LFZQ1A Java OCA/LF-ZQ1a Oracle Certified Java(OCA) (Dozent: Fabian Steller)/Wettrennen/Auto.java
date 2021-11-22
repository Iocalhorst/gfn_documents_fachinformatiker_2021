package Wettrennen;

public class Auto extends Fahrzeug {

	// Initialisierungsblock - wird vor dem Konstruktor ausgeführt
//	{
//		setAnzahlRäder(4);
//		setMaxGeschwindigkeit(140);
//	}
	
	public Auto(int geschwindigkeit, int maxGeschwindigkeit, int anzahlRäder) {
		super(geschwindigkeit, maxGeschwindigkeit, anzahlRäder);
	}
	
}
