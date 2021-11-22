package Smarties;

public class Smarties {

	// gekapselte Instanzvariable f�r die Farbe eines Smartie
	private Farbe farbe;
	
	// Konstruktor - setzt die Farbe des Smartie auf ein zuf�llig ausgew�hlte aus dem Enum Farbe
	public Smarties() {
		int random = (int)(Math.random() * Farbe.values().length);
		farbe = Farbe.values()[random];		
	}

	// getter
	public Farbe getFarbe() {
		return farbe;
	}
}

enum Farbe {
	
	gr�n, rot, blau, gelb;
}
