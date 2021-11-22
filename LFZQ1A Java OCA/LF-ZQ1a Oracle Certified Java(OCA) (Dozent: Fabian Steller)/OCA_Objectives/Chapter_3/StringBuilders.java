package Chapter_3;

// Ein Stringbuilder ist ein String-�hnliches Objekt
// Der Hauptunterschied zum String besteht darin, dass Stringbuilder mutable sind

public class StringBuilders {

	public static void main(String[] args) {
		// Ein Stringbuilder muss, wie die meisten Klassen, per Konstruktor instanziiert werden
		// Praktischerweise akzeptiert der Konstruktor ein String-Argument
		StringBuilder a = new StringBuilder("Stringbuilder wird erzeugt");
		System.out.println(a);					// "Stringbuilder wird erzeugt"
		
		// Auch ein Konstruktor ohne Argumente steht zur Verf�gung:
		StringBuilder b = new StringBuilder();
		System.out.println(b);					// leere Zeile
		
		// Der dritte Konstruktor erwartet einen int:
		StringBuilder c = new StringBuilder(50);
		// Mit dem int wird die gew�nschte Kapazit�t angegeben:
		System.out.println(c.capacity());			// c hat eine Kapazit�t f�r 50 Zeichen
		System.out.println(b.capacity());			// b hat eine Kapazit�t f�r 16 Zeichen (Standard)
		System.out.println(a.capacity());			// a hat eine Kapazit�t f�r 42 Zeichen (String + 16)
		
		// Die Kapazit�t gibt an, wie viel Speicher aktuell f�r den StringBuilder reserviert ist.
		// Es macht nichts, wenn die Kapazit�t �berschritten wird - sie wird automatisch vergr��ert.
		// Kapazit�t ist nicht zu verwechseln mit der L�nge des StringBuilders! (Anzahl der tats�chlichen Zeichen)
		
		System.out.println(a.length());				// a hat eine L�nge von 26 Zeichen
		
		// Darauf achten, dass ein StringBuilder NICHT wie ein String als Literal erzeugt werden kann!
//		StringBuilder d = "Literaler String";		// Kompiliert nicht
		
		
		// Die folgenden Methoden funktionieren beim StringBuilder genauso wie bei einem String:
		// int length() 						- gibt die Anzahl der Zeichen heraus
		// int indexOf(String str)				- gibt die Position der gesuchten Zeichenfolge heraus
		// char charAt(int index)				- gibt das Zeichen an der gesuchten Position heraus
		// String substring(int start, int end)	- gibt den angegebenen Teilstring heraus (als String!!)
		
		// Der StringBuilder hat auch Methoden, welche beim String NICHT zur Verf�gung stehen:
		// Die Methode append() h�ngt eine Zeichenfolge an den aktuellen Inhalt des StringBuilder an:
		b.append("Abc");
		b.append("Abc");
		b.append("Abc");
		System.out.println(b);					// "AbcAbcAbc"
		// Man beachte die mutability! Durch den Aufruf der Methode hat sich das Objekt ver�ndert.
		// append() funktioniert mit praktisch allen Datentypen, dank zahlreicher �berladungen:
		b.append(false);
		b.append(new Object());
		System.out.println(b);
		// append() funktioniert also so �hnlich wie das Konkatenieren von Strings!
		// Obwohl diese Methode den StringBuilder ver�ndert, gibt sie gleichzeitig eine StringBuilder-Referenz
		// zur�ck! Das zur�ckgegebene Objekt ist identisch mit dem Objekt, auf dem die Methode aufgerufen wurde.
		StringBuilder d = c.append("angeh�ngt");
		System.out.println(d == c);				// true - sind identisch
		// Der Zweck dieser R�ckgabe liegt im Verketten von Methodenaufrufen:
		// Dieses Prinzip ist bei Strings weit verbreitet und sollte daher vom StringBuilder beibehalten werden.
		c.append("!").append("!").append("!").append("!").append("!");
		
		// Mit der Methode insert() k�nnen wir eine Zeichenfolge an einer gew�nschten Position einf�gen.
		// Genauso wie append() gibt diese Methode den ver�nderten StringBuilder zur�ck und akzeptiert 
		// praktisch alle Argumente:
		c = new StringBuilder("Salat");
		c.insert(0, "Nudel");
		System.out.println(c);					// "NudelSalat"
		c.insert(5, "-");
		System.out.println(c);					// "Nudel-Salat"
		c.insert(11, "-Gabel");					// identisch zu append("-Gabel");
		System.out.println(c);					// "Nudel-Salat-Gabel"
		// Der Index (erstes Argument) darf nicht negativ oder gr��er als die L�nge des Stringbuilders sein!
		
		// Mit der Methode delete() k�nnen wir einen Teil des StringBuilders wieder entfernen
		// Wir geben dies mit zwei Indizes an - der zweite ist dabei exklusive zu betrachten
		c.delete(5, 11);						// entfernt die Positionen 5, 6, 7, 8, 9 und 10
		System.out.println(c);					// "Nudel-Gabel"
		// Alternativ l�sst sich mit deleteCharAt() ein einzelnes Zeichen entfernen:
		c.deleteCharAt(5);
		System.out.println(c);					// "NudelGabel"
		
		// Die Methode reverse() dreht die Zeichenfolge einfach um:
		c.reverse();
		System.out.println(c);					// "lebaGleduN"
		
		// Wollen wir aus einem StringBuilder wieder einen normalen String machen, verwenden wir einfach
		// die toString() Methode aus der Klasse Objekt. Diese wurde von der StringBuilder Klasse sinnvoll
		// �berschrieben:
		String e = c.toString();				// Gibt einen String mit dem Inhalt des Stringbuilders c heraus
	}

}


// F�r die Pr�fung:
// 1. StringBuilder-Objekte sind mutable (im Gegenteil zu Strings)
// 2. Die Klasse StringBuilder hat genau 3 Konstruktoren: StringBuilder(String str), 
// StringBuilder(int capacity) und StringBuilder()
// 3. Die Klassen String und StringBuilder sind nicht kompatibel oder austauschbar
// 4. String und StringBuilder haben gemeinsame Methoden: length(), substring(), indexOf() und charAt() -
// siehe Strings zur Verwendung dieser Methoden
// 5. Die Klasse StringBuilder hat au�erdem exklusive Methoden: append(), insert(), delete() und reverse()
// 6. Die StringBuilder-Methoden ver�ndern direkt das Objekt, mit dem sie verwendet werden -
// dennoch geben sie zus�tzlich eine Referenz auf dieses Objekt heraus (zum Verketten der Aufrufe)
// 7. Die Klasse StringBuilder befindet sich, ebenso wie String, im Package java.lang und muss
// daher nicht importiert werden
// 8. Mit toString() kann ein String erzeugt werden, welcher dem Inhalt des StringBuilders entspricht
// 9. Die Standardkapazit�t eines StringBuilders ist 16 Zeichen - diese wird aber automatisch vergr��ert
// falls dies notwendig sein sollte und muss nicht manuell eingestellt werden
