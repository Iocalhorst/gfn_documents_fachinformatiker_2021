package Chapter_3;

// Ein Stringbuilder ist ein String-ähnliches Objekt
// Der Hauptunterschied zum String besteht darin, dass Stringbuilder mutable sind

public class StringBuilders {

	public static void main(String[] args) {
		// Ein Stringbuilder muss, wie die meisten Klassen, per Konstruktor instanziiert werden
		// Praktischerweise akzeptiert der Konstruktor ein String-Argument
		StringBuilder a = new StringBuilder("Stringbuilder wird erzeugt");
		System.out.println(a);					// "Stringbuilder wird erzeugt"
		
		// Auch ein Konstruktor ohne Argumente steht zur Verfügung:
		StringBuilder b = new StringBuilder();
		System.out.println(b);					// leere Zeile
		
		// Der dritte Konstruktor erwartet einen int:
		StringBuilder c = new StringBuilder(50);
		// Mit dem int wird die gewünschte Kapazität angegeben:
		System.out.println(c.capacity());			// c hat eine Kapazität für 50 Zeichen
		System.out.println(b.capacity());			// b hat eine Kapazität für 16 Zeichen (Standard)
		System.out.println(a.capacity());			// a hat eine Kapazität für 42 Zeichen (String + 16)
		
		// Die Kapazität gibt an, wie viel Speicher aktuell für den StringBuilder reserviert ist.
		// Es macht nichts, wenn die Kapazität überschritten wird - sie wird automatisch vergrößert.
		// Kapazität ist nicht zu verwechseln mit der Länge des StringBuilders! (Anzahl der tatsächlichen Zeichen)
		
		System.out.println(a.length());				// a hat eine Länge von 26 Zeichen
		
		// Darauf achten, dass ein StringBuilder NICHT wie ein String als Literal erzeugt werden kann!
//		StringBuilder d = "Literaler String";		// Kompiliert nicht
		
		
		// Die folgenden Methoden funktionieren beim StringBuilder genauso wie bei einem String:
		// int length() 						- gibt die Anzahl der Zeichen heraus
		// int indexOf(String str)				- gibt die Position der gesuchten Zeichenfolge heraus
		// char charAt(int index)				- gibt das Zeichen an der gesuchten Position heraus
		// String substring(int start, int end)	- gibt den angegebenen Teilstring heraus (als String!!)
		
		// Der StringBuilder hat auch Methoden, welche beim String NICHT zur Verfügung stehen:
		// Die Methode append() hängt eine Zeichenfolge an den aktuellen Inhalt des StringBuilder an:
		b.append("Abc");
		b.append("Abc");
		b.append("Abc");
		System.out.println(b);					// "AbcAbcAbc"
		// Man beachte die mutability! Durch den Aufruf der Methode hat sich das Objekt verändert.
		// append() funktioniert mit praktisch allen Datentypen, dank zahlreicher Überladungen:
		b.append(false);
		b.append(new Object());
		System.out.println(b);
		// append() funktioniert also so ähnlich wie das Konkatenieren von Strings!
		// Obwohl diese Methode den StringBuilder verändert, gibt sie gleichzeitig eine StringBuilder-Referenz
		// zurück! Das zurückgegebene Objekt ist identisch mit dem Objekt, auf dem die Methode aufgerufen wurde.
		StringBuilder d = c.append("angehängt");
		System.out.println(d == c);				// true - sind identisch
		// Der Zweck dieser Rückgabe liegt im Verketten von Methodenaufrufen:
		// Dieses Prinzip ist bei Strings weit verbreitet und sollte daher vom StringBuilder beibehalten werden.
		c.append("!").append("!").append("!").append("!").append("!");
		
		// Mit der Methode insert() können wir eine Zeichenfolge an einer gewünschten Position einfügen.
		// Genauso wie append() gibt diese Methode den veränderten StringBuilder zurück und akzeptiert 
		// praktisch alle Argumente:
		c = new StringBuilder("Salat");
		c.insert(0, "Nudel");
		System.out.println(c);					// "NudelSalat"
		c.insert(5, "-");
		System.out.println(c);					// "Nudel-Salat"
		c.insert(11, "-Gabel");					// identisch zu append("-Gabel");
		System.out.println(c);					// "Nudel-Salat-Gabel"
		// Der Index (erstes Argument) darf nicht negativ oder größer als die Länge des Stringbuilders sein!
		
		// Mit der Methode delete() können wir einen Teil des StringBuilders wieder entfernen
		// Wir geben dies mit zwei Indizes an - der zweite ist dabei exklusive zu betrachten
		c.delete(5, 11);						// entfernt die Positionen 5, 6, 7, 8, 9 und 10
		System.out.println(c);					// "Nudel-Gabel"
		// Alternativ lässt sich mit deleteCharAt() ein einzelnes Zeichen entfernen:
		c.deleteCharAt(5);
		System.out.println(c);					// "NudelGabel"
		
		// Die Methode reverse() dreht die Zeichenfolge einfach um:
		c.reverse();
		System.out.println(c);					// "lebaGleduN"
		
		// Wollen wir aus einem StringBuilder wieder einen normalen String machen, verwenden wir einfach
		// die toString() Methode aus der Klasse Objekt. Diese wurde von der StringBuilder Klasse sinnvoll
		// überschrieben:
		String e = c.toString();				// Gibt einen String mit dem Inhalt des Stringbuilders c heraus
	}

}


// Für die Prüfung:
// 1. StringBuilder-Objekte sind mutable (im Gegenteil zu Strings)
// 2. Die Klasse StringBuilder hat genau 3 Konstruktoren: StringBuilder(String str), 
// StringBuilder(int capacity) und StringBuilder()
// 3. Die Klassen String und StringBuilder sind nicht kompatibel oder austauschbar
// 4. String und StringBuilder haben gemeinsame Methoden: length(), substring(), indexOf() und charAt() -
// siehe Strings zur Verwendung dieser Methoden
// 5. Die Klasse StringBuilder hat außerdem exklusive Methoden: append(), insert(), delete() und reverse()
// 6. Die StringBuilder-Methoden verändern direkt das Objekt, mit dem sie verwendet werden -
// dennoch geben sie zusätzlich eine Referenz auf dieses Objekt heraus (zum Verketten der Aufrufe)
// 7. Die Klasse StringBuilder befindet sich, ebenso wie String, im Package java.lang und muss
// daher nicht importiert werden
// 8. Mit toString() kann ein String erzeugt werden, welcher dem Inhalt des StringBuilders entspricht
// 9. Die Standardkapazität eines StringBuilders ist 16 Zeichen - diese wird aber automatisch vergrößert
// falls dies notwendig sein sollte und muss nicht manuell eingestellt werden
