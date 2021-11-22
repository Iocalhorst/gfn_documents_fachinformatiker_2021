package myPackage;

/* Ein Enum (Enumeration - "Aufzählung") ist eine fest definierte Gruppe von Konstanten */
public class Enums {
	
	public static void main(String[] args) {
		/* Eine spezifische Konstante des Enums ansprechen */
		Farbe farbe = Farbe.blau;
		
		/* Enums haben ein Array ihrer Konstanten namens values */
		for (Farbe f : Farbe.values()) {
			System.out.println(f);			// Jede Farbe einmal ausgeben
		}
		
		/* Zufällige Farbe auswählen */
		farbe = Farbe.values()[(int)(Math.random()*Farbe.values().length)];
		System.out.println(farbe);
		
		/* Größe der Kaffeebecher abfragen */
		System.out.println(KaffeeBecher.medium.size);		// 200
		System.out.println(KaffeeBecher.tall.size);			// 300
		System.out.println(KaffeeBecher.grande.size);		// 500
		
		/* Gibt uns den Index einer spezifischen Konstante eines Enums heraus */
		System.out.println(Farbe.blau.ordinal());			// 3
		System.out.println(Farbe.grün.ordinal());			// 1
		
	}

}

/* Ein Enum deklariert eine Liste von Konstanten, wir geben nur die Bezeichner an */
enum Farbe {
	rot, grün, gelb, blau, schwarz, weiß;
	
}

/* Enums können auch Instanzvariablen besitzen */
enum KaffeeBecher {
	medium(200), tall(300), grande(500);
	
	int size;
	
	private KaffeeBecher(int size) {
		this.size = size;
	}
}