package Wettrennen;

public abstract class Fahrzeug {

	// Position des Fahrzeugs in Kilometer (Abstand zum Startpunkt)
	private int position;
	
	// Aktuelle Geschwindigkeit, mit der sich das Fahrzeug bewegt
	private int geschwindigkeit;
	
	// Maximale Geschwindigkeit
	private int maxGeschwindigkeit;
	
	//Wie viele Räder?
	private int anzahlRäder;
	
	// Methode zum Bewegen - verändert die Position!
	public void bewegen(double minuten) {
		if (geschwindigkeit > 0) {
			this.position += geschwindigkeit * (minuten / 60);
		}
	}
		
	// Setter und Getter - diese sind wichtig, weil die privaten Attribute sonst nicht vererbt werden!
	
	public int getPosition() {
		return position;
	}

	public int getGeschwindigkeit() {
		return geschwindigkeit;
	}

	// Beim setzen der Geschwindigkeit ist die Maximalgeschwindigkeit zu beachten!
	public void setGeschwindigkeit(int geschwindigkeit) {
		if (geschwindigkeit > maxGeschwindigkeit) {
			geschwindigkeit = maxGeschwindigkeit;
			System.out.println("Zu schnell! Geschwindigkeit drosseln...");
		}
		this.geschwindigkeit = geschwindigkeit;
	}

	public int getMaxGeschwindigkeit() {
		return maxGeschwindigkeit;
	}

	public void setMaxGeschwindigkeit(int maxGeschwindigkeit) {
		this.maxGeschwindigkeit = maxGeschwindigkeit;
	}

	public int getAnzahlRäder() {
		return anzahlRäder;
	}

	public void setAnzahlRäder(int anzahlRäder) {
		this.anzahlRäder = anzahlRäder;
	}
	
	public Fahrzeug(int geschwindigkeit, int maxGeschwindigkeit, int anzahlRäder) {
		setMaxGeschwindigkeit(maxGeschwindigkeit);
		setGeschwindigkeit(geschwindigkeit);
		setAnzahlRäder(anzahlRäder);
	}

}
