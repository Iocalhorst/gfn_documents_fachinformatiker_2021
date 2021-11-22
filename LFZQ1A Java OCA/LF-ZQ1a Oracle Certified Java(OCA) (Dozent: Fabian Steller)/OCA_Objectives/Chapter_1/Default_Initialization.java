package chapter_1;

// Im Folgenden soll die Frage geklärt werden, welche Variablen mit Standardwerten initialisiert werden

public class Default_Initialization {

	public static void main(String[] args) {
		// Lokale Variablen bekommen keine Standardwerte
		// Sie werden erst initialisiert, wenn sie ausdrücklich zugewiesen werden

		String local;							// Variable wurde deklariert, aber nicht zugewiesen
		
		// Variablen, welche nicht initialisiert wurden, dürfen in Ausdrücken nicht verwendet werden
		
//		System.out.println(local);				// Kompiliert nicht, weil die Variable nie initialisiert wurde
//		String other = local;					// Kompiliert nicht, weil die Variable nie initialisiert wurde
		
		// Erst nach der Initialisierung kann die Variable normal verwendet werden
		
		local = "Lokale Variablen bekommen keine Standardwerte!";		// Variable wurde initialisiert
		
		System.out.println(local);										// ok
		String other = local;											// ok
		
		// Jede Zuweisung kann eine Variable initialisieren - auch Null!
		
		String noString;
//		System.out.println(noString);									// nicht initialisiert
		
		noString = null;
		System.out.println(noString);									// ok
		
		// Der Kompiler benötigt Sicherheit, dass die Variable auf jeden Fall initialisiert wurde
		
		int number;
		boolean flag = true;
		if (flag) {
			number = 0;													// Initialisierung abhängig von einer Bedingung
		}
//		System.out.println(number);										// nicht initialisiert
		
		for (int i = 0; i < 10; i++) {
			number = 0;													// Initialisierung abhängig von einer Bedingung
		}
//		System.out.println(number);										// nicht initialisiert
		
		if (true) {
			number = 0;													// Initialisierung NICHT abhängig von einer Bedingung
		}
		System.out.println(number);										// ok!
		
		// Konditionale Konstrukte die eine Variable eindeutig initialisieren, kann der Kompiler entschlüsseln
		
		int number2;
		
		if (flag) {
			number2 = 0;
		} else {
			number2 = 1;
		}
		System.out.println(number2);									// ok!
		
		// Zugriff auf die Variablen der Klasse Init
		System.out.println(Init.a);										// wurde auf 0 initialisiert
		System.out.println(Init.b);										// wurde auf false initialisiert
		Init i = new Init();											// Konstruktor initialisiert die Instanzvariablen
		System.out.println(i.c);										// wurde auf 0.0 initialisiert
		System.out.println(i.d);										// wurde auf 0 initialisert (Leerstelle per Unicode)
		System.out.println(i.e);										// wurde auf null initialisiert
		System.out.println(i.f);										// wurde auf null initialisiert
		
		// Arrays sind Objekte und werden mit Referenzvariablen verwendet
		// Die Positionen eines Arrays werden immer mit dem Standardwert des entsprechenden Datentyps gefüllt
		int[] ints = new int[10];										// zehn mal 0
		String[] words = new String[10];								// zehn mal null
	}

}

// Alle nicht-lokalen Variablen (Deklaration in einer Klasse) werden grundsätzlich mit Standardwerten initialisiert
// Konstanten bekommen keine Standardwerte
class Init {
	static int a;
	static boolean b;
	double c;
	char d;
	String e;
	int[] f;
	
	final static int x = 10;
	
	public static void doStuff(int x) {
		// Parameter werden per Methodenaufruf initialisiert
		// Sie bekommen keine Standardwerte und gelten nie als nicht initialisiert
		System.out.println(x);											// x ist auf jeden fall initialisiert worden
	}
}

// Für die Prüfung:
// 1. Lokale Variablen bekommen keine Standardwerte und werden erst bei ausdrücklicker Zuweisung initialisiert
// 2. Lokale Variablen, welche nicht initialisiert wurden, dürfen in Ausdrücken nicht verwendet werden
// 3. Die Initialisierung einer lokalen Variable muss für den Kompiler klar erkennbar und mit Sicherheit stattfinden
// 4. Der Kompiler kann keine Bedingungen mit Variablen auswerten (er kennt nie die Werte von Variablen)
// 5. Der Kompiler kann Bedingungen mit Konstanten oder Literalen auswerten
// 6. Der Kompiler kann komplexe Entscheidungskonstrukte (z.B. if-else) verstehen 
// 7. Statische Variablen und Instanzvariablen bekommen Standardwerte
// 8. Konstanten bekommen keine Standardwerte, und müssen daher ausdrücklich zugewiesen werden
// 9. Lokale Variablen dürfen uninitialisiert bleiben, sofern sie nicht verwendet werden
//10. Die Positionen eines Arrays werden mit Standardwerten initialisiert
//11. Parameter werden bei Methodenaufruf initialisiert und bekommen keine Standardwerte 
