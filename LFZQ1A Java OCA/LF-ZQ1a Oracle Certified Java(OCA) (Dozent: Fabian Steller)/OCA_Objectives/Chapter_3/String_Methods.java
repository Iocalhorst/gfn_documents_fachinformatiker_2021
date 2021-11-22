package Chapter_3;

import java.util.Arrays;

// Für die OCA-Prüfung müssen wir einige Methoden der Klasse String gut kennen
// Die Klasse String hat dutzende Methoden, von denen aber nur ein paar relevant sind

public class String_Methods {

	public static void main(String[] args) {
		// Um die Anzahl der Zeichen in einem String zu erfahren, verwenden wir die 
		// Methode length() - diese gibt uns einen int zurück
		
		String a = "Zähle meine Zeichen";
		System.out.println(a.length());			// 19 - Leerzeichen sind auch Zeichen!

//		System.out.println(a.length);			// Kompiliert nicht - length ohne Klammern geht nur bei Array
		
		// Die Methode charAt(int index) gibt uns den char, der sich an der per int angegebenen
		// Position des Strings befindet, heraus
		
		System.out.println(a.charAt(0));				// "Z" - auch Strings zählen von 0
		// Letzte Position ist immer length() -1
		System.out.println(a.charAt(a.length()-1));		// "n"
//		System.out.println(a.charAt(a.length()));		// Kompiliert, aber wirft eine Exception!
		// Negative Argumente werfen immer Exception
//		System.out.println(a.charAt(-1));				// Kompiliert, aber wirft eine Exception!
		
		// Die Methode indexOf gibt uns die Position des gesuchten Elementes als int heraus
		// Es existieren mehrere Überladungen:
		// int indexOf(int c)
		// int indexOf(String str)
		// int indexOf(int c, int startPosition)
		// int indexOf((String str, int startPosition)
		// Wird das gesuchte Elemente nicht gefunden, ist das Ergebnis immer -1
		System.out.println(a.indexOf('e'));				// 4 - gibt uns nur die Position des ersten "e"
		System.out.println(a.indexOf("eiche"));			// 13 - gibt die Position des ersten Zeichens der Abfolge
		System.out.println(a.indexOf("Eiche"));			// -1 - Strings sind natürlich case sensitive
		System.out.println(a.indexOf('e', 5));			// 7 - erstes "e" ab Position 5
		// Auch Ziffern können so gefunden werden:
		String b = "Number5";
		System.out.println(b.indexOf('5'));				// 6 - Position der 5
		System.out.println(b.indexOf(5));				// -1 - Sucht NICHT nach der 5 als Zeichen

		// Die Methode Substring gibt uns einen Teil des ursprünglichen Strings als neuen
		// String heraus - wir müssen angeben, welche Positionen als Teilstring genommen werden sollen
		// String Substring(int start, int end)
		// String Substring(int start)
		System.out.println(a.substring(12));			// Bildet den Teilstring von der Position 12
														// bis zum Ende des Strings - "Zeichen"
		System.out.println(a.substring(12, 19));		// Identisch zu vorher
		System.out.println(a.substring(12, 18));		// "Zeiche"
		// Bedenke, dass anstelle von literalen ints häufig Methoden als Argumente verwendet werden
		System.out.println(a.substring(12, a.length()));// "Zeichen"
		// Auch bei substring kann es zur Exception kommen!
//		System.out.println(a.substring(5, 20));			// Kompiliert, aber wirft Exception - 20 outofBounds
//		System.out.println(a.substring(-1, 19));		// Kompiliert, aber wirft Exception - -1 outofBounds
//		System.out.println(a.substring(3, 1));			// Kompiliert, aber wirft Exception - erstes Argument
														// ist größer als das Zweite!
		// Sind beide Argumente gleich groß, ist das Ergebnis ein leerer String
		System.out.println(a.substring(3, 3));			// "" - leerer String
		System.out.println(a.substring(3, 4));			// "l" - ähnlich wie a.charAt(3) 
		
		// Die Methoden toUpperCase() und toLowerCase() sind unkompliziert
		// Sie geben den String komplett in Groß- bzw. Kleinbuchstaben zurück
		// Immer daran denken: Strings sind immutable, es wird also ein neuer String erzeugt
		// Zeichen, die keine Buchstaben sind, werden von diesen Methoden ignoriert
		System.out.println(a.toLowerCase());			// "zähle meine zeichen"
		System.out.println(b.toUpperCase());			// "NUMBER5"
		
		// Die Methoden equals() und equalsIgnoreCase() sind ebenfalls unkompliziert
		// Sie vergleichen zwei Strings anhand ihrer Zeichenfolgen und geben true heraus,
		// wenn beide Zeichenfolgen gleich sind
		// Bei equalsIgnoreCase() wird dabei Groß- und Kleinschreibung nicht unterschieden!
		String c = "Apfel";
		String d = "apfel";
		System.out.println(c.equals(d));				// false
		System.out.println(c.equalsIgnoreCase(d));		// true
		// Zu beachten: equals() stammt aus der Klasse Object und akzeptiert alle Referenzvariablen als Argument
		// equalsIgnoreCase() stammt aus der Klasse String und akzeptiert nur String Argumente
		System.out.println(c.equals(new Object()));				// false - Objekt in c und Argument haben nicht
																// den gleichen Datentyp
//		System.out.println(c.equalsIgnoreCase(new Object()));	// Kompiliert nicht!
		
		// Die Methoden startsWith() und endsWith() überprüfen, ob ein String mit einer spezifischen 
		// Zeichenfolge beginnt bzw. endet. Sie erwarten einen String als Argument und geben einen
		// boolean zurück:
		// boolean startsWith(String prefix)
		// boolean endsWith(String suffix)
		System.out.println(c.startsWith("a"));					// false - Methode ist case sensitive
		System.out.println(c.startsWith("A"));					// true
		System.out.println(c.startsWith("Apfel"));				// auch true!
		System.out.println(c.endsWith("el"));					// true
		System.out.println(c.endsWith("A"));					// false
		// Achtung, char ist kein gültiges Argument:
//		System.out.println(c.endsWith('A'));					// Kompiliert nicht!
		
		// Die Methode contains() prüft, ob ein String die gesuchte Zeichenfolge enthält, und gibt
		// entsprechend einen boolean zurück:
		// boolean contains(String str)
		System.out.println(a.contains("Zeichen"));				// true
		System.out.println(a.contains("meine"));				// true
		System.out.println(a.contains("zähle"));				// false - ebenfalls case sensitive
		
		// Die Methode replace() ersetzt alle Zeichen oder Zeichenfolgen eines Strings, welche dem
		// ersten Argument entsprechen, mit dem zweiten. Ergebnis ist ein neuer String:
		// String replace(char oldChar, char newChar)
		// String replace(CharSequence oldSequence, CharSequence newSequence)
		String e = "Banane";
		e.replace('a', 'o');
		System.out.println(e);									// "Banane" - weil Strings immutable sind
		e = e.replace('a' , 'o');	
		System.out.println(e);									// "Bonone" 
		
		String f = "mimimimi";	
		System.out.println(f.replace("mi", "po"));				// "popopopo"
		
		// Die Methode trim() bereinigt einen String um führende un abschließende Leerzeichen:
		// String trim()
		System.out.println(a.trim());							// "Zähle meine Zeichen"
		System.out.println(" Fabian der Trickser ".trim());		// "Fabian der Trickser"
		
		// Mit der Methode split() können wir einen String in ein Array zerlegen
		String[] array 	= e.split("");							// {"B", "o", "n", "o", "n", "e"}
		String[] array2	= a.split(" "); 						// {"Zähle", "mein", "Zeichen"}
		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.toString(array2));
		
		// Methoden können per Kettenaufruf gestartet werden:
		// Dabei wird brav von links nach rechts ausgewertet, jede Methode wird dabei auf dem
		// Rückgabewert ihres Vorgängers aufgerufen
		// Wenn wir gleichzeitig verschachteln, wird der Code schwerer lesbar:
		System.out.println(Arrays.toString(e.trim().toLowerCase().split("")));

	}
}

// Für die Prüfung:
// 1. Die Methode length() gibt die Anzahl der Zeichen in einem String als int heraus
// 2. Die Methode charAt(int index) gibt uns das Zeichen an der Position index heraus (Exception droht)
// 3. Die Methode indexOf(int c) gibt uns die Position des gesuchten Zeichens heraus - existiert das Zeichen
// mehrfach, bekommen wir die Position des ersten, existiert es nicht, bekommen wir -1
// 4. indexOf() hat Überladungen für ein String-Argument, und um von einer spezifischen Position aus zu suchen
// 5. Die Methode substring(int beginIndex, int endIndex) gibt uns die Zeichenfolge von der Position
// beginIndex bis (exklusive) zur Position endIndex heraus - funktioniert auch mit nur beginIndex (bis Ende)
// 6. toLowerCase() und toUpperCase() wandeln einen String komplett in Klein- bzw. Großbuchstaben um
// 7. equals() und equalsIgnoreCase() vergleichen zwei Strings anhand ihrer Zeichenfolgen
// 8. startsWith() und endsWith() geben true heraus, wenn der String mit der angegebenen 
// Zeichenfolge beginnt bzw. endet - sonst false
// 9. contains() gibt true heraus, wenn der String die angegebene Zeichenfolge enthält
// 10. Die Methode replace() ersetzt alle Vorkomnisse eines angegebenen chars oder einer angegebenen
// Zeichenfolge mit einem neuen char/neuer Zeichenfolge
// 11. Die Methode trim() bereinigt den String von führenden und schließenden Leerzeichen
// 12. Die Methode split() zerlegt den String in ein String[], anhand eines Trennzeichens (oder keinem)
// 13. KEINE dieser Methoden verändert den ursprünglichen String, weil Strings immutable sind
// 14. String-Methoden arbeiten in der Regel case sensitive, mit der offensichtlichen Ausnahme equalsIgnoreCase() 
