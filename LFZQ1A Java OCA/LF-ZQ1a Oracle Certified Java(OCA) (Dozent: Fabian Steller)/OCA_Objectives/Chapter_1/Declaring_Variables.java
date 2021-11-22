package chapter_1;

// Bei der Deklaration von Variablen gibt es eine handvoll Regeln zu beachten

public class Declaring_Variables {

	public static void main(String[] args) {
		// Zu unterscheiden sind grundsätzlich Deklaration und Initialisierung / Zuweisung
		// Bei der Deklaration geben wir den Datentyp der Variable an
		int a;
		String b;
		
		// Mehrmalige Deklaration einer Variable ist verboten
//		int a;											// Kompiliert nicht, weil die Variable im selben Kontext schon besteht
		
		// Lokale Variablen werden initialisiert, wenn ihnen erstmalig ein Wert zugewiesen wird
		a = 10;
		b = "Zehn";
		
		// Grundsätzlich können Variablen beliebig oft neu zugewiesen werden
		a = 20;
		
		// Die Deklaration und Initialiserung einer Variable können wir in einer Anweisung zusammenfassen
		int c = 500;	
		
		// Das selbe geht auch mit mehreren Variablen in einer Zeile
		int d, e, f;									// Deklaration dreier ints in einer Anweisung

		int g = 10, h = 20;								// Deklaration und Initialisierung zweier ints in einer Anweisung
		
		String i = "Hi", j;								// 2 Strings deklariert, nur i wurde initialisiert!
		
		// Es ist nicht möglich, Variablen unterschiedlicher Typen in einer Anweisung zu deklarieren
//		String k, int l;
		// Auch bei Variablen des gleichen Typs darf sich dieser nicht wiederholen
//		int m, int n;
		
		// Aufpassen müssen wir bei Semikola! Dies gilt als Ende einer Anweisung.
		int o; int p;									// Zwei einzelne Anweisungen, ok
//		int q; r;										// Datentyp für r fehlt!!
		
		// Sollen mehrere Varialen auf den gleichen Wert zugewiesen werden, sind Kettenzueweisungen erlaubt
		d = e = f = g = 0;
		
		// Auch zu beachten sind die Regeln für Bezeichner (gilt nicht für Variablen)
		// Dürfen nicht mit einer Ziffer beginnen!
//		int 1g;
		// Ziffer nach der ersten Stelle is ok
		int _2;
		// Keine Sonderzeichen außer Unterstrich und Währungszeichen
//		int #money;
		int $200;										// ok!
		// Auch keine Leerstellen!
//		int greedy bank;
		// Keywords dürfen auch nicht als Bezeichner verwendet werden
//		int int;
		
		// Nach Konvention schreiben wir Variablen im lowerCamelCase - dies ist aber keine Regel
	}

}

// Für die Prüfung:
// 1. Deklarationen von Variablen erkennen wir an der Angabe des Datentyps mit Bezeichner
// 2. Variablen können gleichzeitig mit ihrer Deklaration Initialisiert werden, oder später
// 3. Mehrere Variablen des gleichen Typs können in einer Anweisung mit Kommata getrennt deklariert werden
// 4. Der Datentyp darf bei Deklaration mehrerer Variablen nicht wiederholt angegeben werden
// 5. Werden mehrere Variablen in einer Anweisung deklariert, können beliebig viele davon gleichzeitig initialisiert werden
// 6. Bezeichner (identifier) dürfen alle Buchstaben, Unterstriche, Währungszeichen und Ziffern beinhalten - sonst nichts
// 7. Bezeichner dürfen NICHT mit einer Ziffer beginnen
// 8. Keywords sind als Bezeichner unzulässig
// 9. Bezeichner dürfen im selben Kontext (Block) nicht wiederverwendet werden für neue Variablen