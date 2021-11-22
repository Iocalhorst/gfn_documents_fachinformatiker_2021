package W�rfelspiel;
//Schreibe eine Klasse, welche W�rfel mit unterschiedlich vielen Seitenzahlen erzeugen kann. 
//Die Klasse soll nur eine Methode zum Werfen des W�rfels enthalten.
//
//Die Anzahl der W�rfelseiten soll �ber den Konstruktor der Klasse gesetzt werden, 
//aber es sollen nicht alle beliebigen Werte akzeptiert werden. 
//Nur W�rfel mit 6, 8, 12 oder 20 Seiten sind erw�nscht. 
//
//Schreibe eine zweite Klasse die mehrere, unterschiedliche W�rfel erzeugt und in der Lage ist, 
//eine beliebige Menge davon �ber einen einzelnen Methodenaufruf zu werfen und das Gesamtergebnis auszugeben.

public class W�rfel {

	// Instanzvariable f�r die Seitenzahl
	private int seitenZahl;
	
	// Methode zum werfen
	int werfen() {
		// Zuf�llige Zahl zwischen 1 und seitenZahl ermitteln
		int ergebnis = (int)(Math.random() * seitenZahl + 1);
		return ergebnis;
	}
	
	// Konstruktor
	public W�rfel(int seiten) {
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
			System.out.println("Das ist kein g�ltiger W�rfel! Es d�rfen nur 6, 8, 12 oder 20 Seiten sein.");
		}
	}
}
