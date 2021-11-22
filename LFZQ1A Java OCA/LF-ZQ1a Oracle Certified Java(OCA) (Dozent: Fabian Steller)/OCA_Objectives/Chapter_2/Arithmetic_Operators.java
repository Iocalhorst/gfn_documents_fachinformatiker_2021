package chapter_2;

// Die Arithmetischen Operatoren in Java sind +, -, *, /, %
// Für diese Operatoren gelten größtenteils die aus der Mathematik bekannten Regeln
// wie z.B. Punkt- vor Strichrechnung (/ und * und %) vor (+ und -)
// Davon abgesehen werden arithmetische Operationen von links nach rechts ausgewertet

// Alle arithmetischen Operatoren haben zwei Operanden, welche immer Zahlen sein sollten
// Die einzige Ausnahme hierzu bildet das +, welches auch mit Strings funktioniert (Konkatenieren)

public class Arithmetic_Operators {

	public static void main(String[] args) {
		// Einfache arithmetische Operationen
		System.out.println(5 + 5 * 2);				// Ergebnis 15, weil Multiplikation vor Addition
		System.out.println((5 + 5) * 2);			// Ergebnis 20 - Klammern gehen immer vor
		
		System.out.println(10 / 4);					// Ergebnis 2 - Int-Division ohne Rest!
		System.out.println(10.0 / 4);				// Ergebnis 2.5
		System.out.println(10 % 4);					// Ergebnis 2 - NUR der Rest der Division!
		
		// Wenn wir mit Variablen arbeiten, ist der Datentyp zu beachten
		// Arithemtische Operationen nur mit Zahlen!
		Object o = new Object();
//		System.out.println(o * 2);					// Kompiliert nicht - darf keine Objekte multiplizieren!
		
		// Bei Operationen mit unterschiedlichen Zahlentypen wird mindestens einer der Operanden konvertiert
		byte a = 5;
		short b = 10;
		
		// Bei Ganzzahlen ist das Ergebnis ein int - solange nicht einer der Operanden ein long ist
//		a = a + b;									// Kompiliert nicht - Ergebnis ist ein int 
//		b = a / b;									// Kompiliert nicht - Ergebnis ist ein int 
		int c = a * b;								// ok
		
		// Es ist wichtig, diese Regel für die Prüfung zu memorisieren!
		char d;
//		d = a + a;									// byte + byte = int und int > char
		
		long e = 5;
//		int f = e - c;								// long - int = long und long > int
		e = e - c;									// ok
		
		// Bei mindestens einem Operanden mit Kommastellen entspricht das Ergebnis dem größten beteiligten Datentyp
		float g = 20.6F;
//		e = g * e;									// float * long = float und float > long
		double h = 100.0;
//		g = h + g;									// double + float = double und double > float
		
		// Merke aber, dass alle Literalen Kommazahlen zunächst einem double entsprechen!
		// Literale Ganzzahlen sind immer ints
//		float i = 10.5 * 1;							// Ergebnis ist double!
		float i = 10;								// ok, int ist kleiner als float
		
		// Alle gewünschten Zuweisungen sind gestattet, wenn wir einen Cast verwenden
		byte j = (byte)(50*5);						// j ist NICHT 250!
		
	}

}

// Für die Prüfung:
// 1. Arithmetische Operatoren haben immer 2 Operanden
// 2. Arithmetische Operatoren funktionieren nur mit Zahlentypen (Ausnahme + und String)
// 3. Die Zahlentypen sind von klein nach groß: byte, short, char, int, long, float, double
// 4. Arithmetische Operationen mit zwei Zahlentypen haben als Ergebnis
// MINDESTENS den Typ int, ansonsten den Typ des hierarchisch höheren Operanden
// 5. Das Ergebnis der Operation kann mit einem expliziten Cast konvertiert werden -
// hierbei besteht die Gefahr des Datenverlustes
// 6. *, / und % haben eine höhere Priorität als + und -
// 7. Arithmetische Operationen sind grundsätzlich überall in Java erlaubt 