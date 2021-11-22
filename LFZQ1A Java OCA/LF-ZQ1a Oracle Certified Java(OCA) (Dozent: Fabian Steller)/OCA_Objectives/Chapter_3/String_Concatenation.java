package Chapter_3;

import java.util.ArrayList;
import java.util.Date;

// Der arithmetische Operator "+" hat eine spezielle Überladung
// Sofern mindestens einer seiner Operanden ein String ist,
// handelt es sich nicht mehr um Addition, sondern um "Verkettung" (Konkatenierung)

public class String_Concatenation {

	public static void main(String[] args) {
		// Zwei Strings konkatenieren
		String a = "Hello";
		String b = "World";
		String c = a + b;						// Keine Addition - a und b sind keine Zahlen
		System.out.println(c);					// "HelloWorld"
		
		// Die beiden Strings werden direkt hintereinander gestellt
		// Der rechte Operand wird dabei hinter den linken gesetzt
		// Es wird kein Trennzeichen, auch kein Leerzeichen, automatisch eingefügt
		
		// Ist ein Leerzeichen gewünscht, muss dies manuell eingefügt werden:
		c = a + " " + b;
		System.out.println(c);					// "Hello World"
		
		// Wie wir sehen, ist es problemlos möglich, Literale mit Variablen zu konkatenieren.
		
		// Wie oben erwähnt wurde, muss nur EINER der Operanden ein String sein:
		int d = 25;
		c = a + d;								// Nur ein Operand ist ein int, keine Addition
		System.out.println(c);					// "Hello25"
		
		// Sobald mindestens ein Operand ein String ist, wird der andere ebenfalls zum String gemacht
		// Dies funktioniert mit primitiven Werten problemlos, weil sie literale Darstellungen haben
		
		boolean e = false;
		c = a + e;
		System.out.println(c);					// "Hellofalse"
		
		// Es funktioniert aber auch mit allen Referenzvariablen, welche keine Strings sind!
		// Hierfür wird die Methode toString() aus der Klasse Objekt bemüht
		
		int[] f = {1, 2, 3};
		c = a + f;
		System.out.println(c);					// z.B. "Hello[I@6504e3b2"
		
		// Es wurde ein Hashcode generiert und als Repräsentierung des Objektes (Array) verwendet
		// Die Methode toString wird häufig überschrieben:
		
		ArrayList<Integer> g = new ArrayList<>();
		g.add(1);
		g.add(2);
		g.add(3);
		c = a + g;
		System.out.println(c);					// "Hello[1, 2, 3]"
		
		// Die Klasse ArrayList hat die toString() Methode überschrieben, so dass die Elemente
		// der Liste angezeigt werden
		// Handelt es sich bei dem Elementen wiederum um Objekte, werden diese ebenfalls mithilfe
		// ihrer toString() Methode dargestellt!
		
		// Konkatenierung funktioniert sogar mit Nullvariablen
		Date h = null;
		c = a + h;
		System.out.println(c);					// "Hellonull"
		
		// Immer daran denken, dass dieser Mechanismus nur greift, sofern mindestens ein Operand
		// von "+" ein String ist!
//		System.out.println(d + e);				// Kompiliert nicht - int und boolean Operanden
//		System.out.println(d + h);				// Kompiliert nicht - int und Date Operanden
//		System.out.println(h + g);				// Kompiliert nicht - Date und ArrayList Operanden
		
		// In einem Ausdruck können sowohl Additionen als auch Konkatenierungen vorkommen:
		c = 1 + 5 + "8" + 4 + 5;
		System.out.println(c);					// "6845"
		
		// Wird schon ganz zu Beginn des Ausdruckes konkateniert, bleibt das Ergebnis ein String
//		System.out.println("" + 8 + 5 / 2 * 7 - 9);		// Kompiliert nicht, weil ein String nicht
														// subtrahiert wird - er wird natürlich
														// auch nicht dividiert, aber es gilt wie immer
														// Punkt- vor Strichrechnung
		
		// Mit Klammern können wir den Ausdruck zum Kompilieren bringen
		System.out.println("" + 8 + (5 / 2 * 7 - 9));	// "85"
	}

}


// Für die Prüfung:
// 1. Ist mindestens ein Operand ein String, gilt das "+" als Konkatenierungsoperator
// 2. Sofern ein Operand ein String ist, kann der andere einen beliebigen Datentyp haben
// 3. Wird ein String mit einem Objekt konkateniert, wird immer die toString() Methode des Objekts aufgerufen
// 4. Die toString() Methode muss überschrieben werden, um ein sinnvolles (lesbares) Ergebnis zu liefern
// 5. Auch Variablen mit Nullreferenz können konkateniert werden!
// 6. Beim Konkatenieren ("Verketten") wird der rechte Operand hinter den linken gestellt
// 7. Das Ergebnis der Konkatenierung ist IMMER ein String
// 8. Das "+" hat als Additions- und Konkatenierungsoperator die gleiche Priorität
