package Wettrennen;

public class Wettrennen {

	public static void main(String[] args) {
		// Erzeugen der einzelnen Instanzen
		Fahrzeug a = new Auto(150, 140, 4);
		Fahrzeug b = new Fahrrad(20, 30, 2);
		Fahrzeug c = new Rennwagen(200, 220, 4);
		Fahrzeug d = new Krankenwagen(80, 140, 4);
//		
//		// Setzen der tats�chlichen Geschwindigkeiten
//		a.setGeschwindigkeit(150);
//		b.setGeschwindigkeit(20);
//		c.setGeschwindigkeit(200);
//		d.setGeschwindigkeit(80);
		
		// Vorw�rtsbewegen der Fahrzeuge
		a.bewegen(60);	
		b.bewegen(300);
		c.bewegen(60);
		d.bewegen(60);
		
		// Position der Fahrzeuge ausgeben lassen
		System.out.println("Das Auto f�hrt mit "+a.getGeschwindigkeit()+" km/h. Seine Position nach 60 Minuten ist Kilometer "+a.getPosition()+".");
		System.out.println("Das Fahrrad f�hrt mit "+b.getGeschwindigkeit()+" km/h. Seine Position nach 300 Minuten ist Kilometer "+b.getPosition()+".");
		System.out.println("Das Rennauto f�hrt mit "+c.getGeschwindigkeit()+" km/h. Seine Position nach 60 Minuten ist Kilometer "+c.getPosition()+".");
		System.out.println("Der Krankenwagen f�hrt mit "+d.getGeschwindigkeit()+" km/h. Seine Position nach 60 Minuten ist Kilometer "+d.getPosition()+".");
	}

}
