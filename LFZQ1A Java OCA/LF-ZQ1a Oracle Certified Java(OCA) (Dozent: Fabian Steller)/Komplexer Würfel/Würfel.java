package Würfelspiel;
//Schreibe eine Klasse, welche Würfel mit unterschiedlich vielen Seitenzahlen erzeugen kann. 
//Die Klasse soll nur eine Methode zum Werfen des Würfels enthalten.
//
//Die Anzahl der Würfelseiten soll über den Konstruktor der Klasse gesetzt werden, 
//aber es sollen nicht alle beliebigen Werte akzeptiert werden. 
//Nur Würfel mit 6, 8, 12 oder 20 Seiten sind erwünscht. 
//
//Schreibe eine zweite Klasse die mehrere, unterschiedliche Würfel erzeugt und in der Lage ist, 
//eine beliebige Menge davon über einen einzelnen Methodenaufruf zu werfen und das Gesamtergebnis auszugeben.

public class Würfel {

	// Instanzvariable für die Seitenzahl
	private int seitenZahl;
	
	// Methode zum werfen
	int werfen() {
		// Zufällige Zahl zwischen 1 und seitenZahl ermitteln
		int ergebnis = (int)(Math.random() * seitenZahl + 1);
		return ergebnis;
	}
	
	// Konstruktor
	public Würfel(int seiten) {
		setSeitenZahl(seiten);
	}

	public int getSeitenZahl() {
		return seitenZahl;
	}

	// Der Setter regelt, dass nur sinnvolle Seitenzahlen zugelassen werden
	public void setSeitenZahl(int seitenZahl) {
		if (seitenZahl == 6 | seitenZahl == 8 | seitenZahl == 12 | seitenZahl == 20) {
			this.seitenZahl = seitenZahl;
		} else {
			System.out.println("Das ist kein gültiger Würfel! Es dürfen nur 6, 8, 12 oder 20 Seiten sein.");
		}
	}
}
