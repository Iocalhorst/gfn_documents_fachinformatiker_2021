package myPackage;

/* In Java wird grundsätzlich zwischen primitiven Datentypen und Objekttypen unterschieden */
public class Datatypes {

	public static void main(String[] args) {
		/* Die primitiven Datentypen in Java */
		byte 	a = 100;						// 8 bit (-128 bis 127)
		short 	b = 500;						// 16 bit
		char 	c = 'a';						// 16 bit (ohne negative Zahlen)
		int 	d = 10000;						// 32 bit 
		long 	e = 1000000;					// 64 bit
		
		float 	f = 80.0f;					// 32 bit (literale floats sind mit f zu kennzeichnen)
		double 	g = 500.5;					// 64 bit
		
		boolean h = true;					// nur true oder false
		
		/* Zuweisungen sind nur im Wertebereich gültig */
		
//		a = 150;							// 150 ist zu groß für byte
//		b = 70000;							// 70000 ist zu groß für short
//		c = -50;							// -50 ist negativ, char hat nur positive 
		
		int i = 100;
//		byte j = i;							// kann int nicht auf byte zuweisen
		
		byte j = (byte)i;					// primitives können auch gecasted werden
		
		System.out.println(j);
		i = 130;
		j = (byte)i;						
		System.out.println(j);				// -126
		
		j = 5 + 5 ;
//		byte k = j + 1;						// Verrechnungen von Ganzzahlen ergeben immer einen int
		
		/* Grundsätzlich gilt: wir können primitives auf andere primitives mit größerem Wertebereich
		 * zuweisen. Umgekehrt ist ein cast notwendig - dabei droht Informationsverlust */
		
		/* Alle nicht-primitiven Datentypen sind Objekte, inkl. Strings und Arrays */
		
	}

}
