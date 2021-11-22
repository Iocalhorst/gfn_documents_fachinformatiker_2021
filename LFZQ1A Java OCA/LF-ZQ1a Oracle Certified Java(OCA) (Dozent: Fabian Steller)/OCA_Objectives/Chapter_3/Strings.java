package Chapter_3;

// Ein String ist eine Zeichenfolge - technisch gesehen repr�sentiert als ein Array
// vom Datentyp char
// In Java ist ein String aber vor allem eine Instanz der Klasse String und damit ein Objekt
// Wir d�rfen einen String nicht wie ein Array behandeln


public class Strings {

	public static void main(String[] args) {
		// Wie instanziiere ich ein Objekt der Klasse String?
		// Es gibt mehrere M�glichkeiten:
		
		String a = new String("Mein String");			// Erzeugt ein String-Objekt per new Keyword
		
		String b = "Mein String";						// Weist der Variable b einen Literal als String zu
		
		// Der unterschied besteht darin, dass die erste Variante IMMER ein neues Objekt erzeugt.
		// Die zweite Variante erzeugt nur dann ein neues Objekt, wenn nicht bereits vorher der selbe
		// String-Literal verwendet wurde. Dies dient der Einsparung von Speicher.
		
		// Dies ist leicht zu beweisen:
		String c = "Mein String";
		System.out.println(c == b);						// true - c und b zeigen auf das gleiche Objekt
		System.out.println(a == b);						// false - a und b zeigen auf unterschiedliche Objekte
		System.out.println(a == c);						// false - a und c zeigen auf unterscheidliche Objekte
		
		// Es wurden also nur 2 Strings erzeugt. In der Zeile 24 wurde auf die Erzeugung eines 
		// neuen Strings verzichtet, um Speicher zu sparen.
		
		// Hierf�r gibt es einen separaten Speicherbereich auf dem Heap, welcher "String Constant Pool"
		// genannt wird. In diesem Speicher landen nur Strings, die ohne ausdr�cklichen Konstruktoraufruf
		// erzeugt wurden.
		
		// Auch bei Zusammengesetzten Strings funktioniert dies:
		String d = "Mein" + " " + "String"; 			// "Mein String"
		System.out.println(d == c);						// true - d und c (und b) zeigen auf das gleiche Objekt
		
		// Zus�tzlich liegen nun auch die Strings "Mein", " " und "String" im String Constant Pool ab
		// Obwohl keine Variablen auf diese Objekte zeigen, bleiben sie erhalten
		
		// Wird beim Zusammensetzen des Strings ein Objekt verwendet, und kein Literal 
		// dann ist das Ergebnis wieder ein neuer String!
		// Dies gilt unabh�ngig davon, ob der neue String aus Objekten im String Constant Pool zusammengestzt
		// wird oder aus "normalen" Objekten
		String e = new String("Mein ");
		String f = e + "String";
		System.out.println(f == d);						// false - f und d zeigen auf unterschiedliche Objekte
		
		String g = "Mein";								// g referenziert den bereits in Zeile 37 erzeugten String
		String h = g + " " + "String";
		System.out.println(h == d);						// false - h und d zeigen auf unterschiedliche Objekte
		
		// Auch bei Methoden gilt: gibt die Methode einen String heraus, so handelt es sich um ein neues
		// Objekt, welches nicht im Constant Pool abgelegt wird
		
		String i = " Mein String ".trim();				// entfernt f�hrende und schlie�ende Leerstellen...
		System.out.println(i == d);						// false - i und d zeigen auf unterschiedliche Objekte
		
		// Dieses spezifische Verhalten finden wir ausschlie�lich bei der Klasse String
		// Es wurde entwickelt, weil statistisch betrachtet in Programmen ein betr�chtlicher
		// Teil des Speichers durch sich wiederholende Strings belegt wurde
		// Es funktioniert nur, weil Strings immutable sind!
		
		// d, c und b sind alle identisch - dies ist gefahrlos m�glich, weil das Objekt im Speicher
		// nicht mehr ver�ndert werden kann
		d.toUpperCase();								// Erzeugt neuen String aus Gro�buchstaben, welcher
														// direkt wieder verf�llt
		System.out.println(d);							// An dem String in d hat sich nichts ge�ndert...
		
		// Nur �ber Neuzuweisung kann d auf einen anderen String zeigen:
		d = d.toUpperCase();							// d zeigt auf neuen String (nicht im Constant Pool)
		System.out.println(d == b);						// false - nicht mehr identisch
		System.out.println(d == c);						// false - nicht mehr identisch
	}

}

// F�r die Pr�fung:
// 1. Strings sind immutable, und die Klasse String ist final
// 2. Im String Constant Pool landen nur Strings, welche aus einem oder mehreren Literalen entstanden sind
// 3. Nur Variablen, welche aus einem oder mehreren Literalen zusammengesetzt werden, werden automatisch
// auf einen String im Constant Pool zugewiesen
// 4. Folglich sind alle Strings, welche �ber Konstruktoren, Methoden, oder Zusammensetzungen mit Objekten
// entstanden sind, vom String Constant Pool komplett unabh�ngig
// 5. Strings im Constant Pool werden von der GC (Garbage Collection) nicht gel�scht
// 6. Strings au�erhalb des Constant Pools werden von der GC wie alle anderen Objekte m�glicherweise gel�scht

