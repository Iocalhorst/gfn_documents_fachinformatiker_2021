package Wettrennen;

public abstract class Fahrzeug {

	// Position des Fahrzeugs in Kilometer (Abstand zum Startpunkt)
	private int position;
	
	// Aktuelle Geschwindigkeit, mit der sich das Fahrzeug bewegt
	private int geschwindigkeit;
	
	// Maximale Geschwindigkeit
	private int maxGeschwindigkeit;
	
	//Wie viele R�der?
	private int anzahlR�der;
	
	// Methode zum Bewegen - ver�ndert die Position!
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

	public int getAnzahlR�der() {
		return anzahlR�der;
	}

	public void setAnzahlR�der(int anzahlR�der) {
		this.anzahlR�der = anzahlR�der;
	}
	
	public Fahrzeug(int geschwindigkeit, int maxGeschwindigkeit, int anzahlR�der) {
		setMaxGeschwindigkeit(maxGeschwindigkeit);
		setGeschwindigkeit(geschwindigkeit);
		setAnzahlR�der(anzahlR�der);
	}

}
