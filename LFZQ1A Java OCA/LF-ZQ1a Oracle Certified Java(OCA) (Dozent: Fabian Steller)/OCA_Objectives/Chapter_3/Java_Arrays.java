package Chapter_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Ein Array ist eine Art geordneter Liste
// Ein Array kann beliebig viele Elemente enthalten, wobei jedes seinen festen Platz im Array hat
// Ein Array kann seine L�nge (Anzahl der Elemente) nicht �ndern, nachdem es erzeugt wurde

public class Java_Arrays {

	public static void main(String[] args) {
		// Eine Array-Variable deklarieren:
		int [] numbers;							// int ist der Datentyp der Elemente, die Klammer gibt ein Array an
		String[] strings;						// Datentyp kann jede beliebige Klasse sein
		
		// Bisher haben wir nur Variablen, aber noch keine Arrays!
		// Um die Variablen zu initialisieren, m�ssen Arrays mit fester Gr��e erzeugt werden
		
		numbers = new int[5];					// erzeugt Array von 5 ints - alle Elemente bekommen Standardwerte
		numbers = new int[] {1, 2, 4, 6, 8};	// erzeugt Array von 5 ints mit den spezifizierten Werten
		
		// Nicht g�ltig sind folgende Zeilen:
//		numbers = new int[];					// Kompiliert nicht weil Array keine Gr��e hat
//		numbers = new int[5] {1, 2, 4, 6, 8};	// Kompiliert nicht weil Gr��e zweimal angegeben wurde
		
		// Obwohl die Gr��e des Arrays unver�nderlich ist, k�nnen einzelne Elemente ver�ndert werden:
		System.out.println(numbers[2]);			// 4
		numbers[2] = 12;						// die Position 2 neu zuweisen
		System.out.println(numbers[2]);			// 12
		
		// Arrays werden nicht automatisch sortiert: die 12 befindet sich jetzt zwischen 2 und 6!
		
		// Die eckige Klammer beim Datentyp der Variable verh�lt sich etwas sonderbar:
		int[] numbers2;							// Array von ints
		int numbers3[];							// ebenfalls Array von ints
		
		// Achtung ist geboten, wenn mehrere Variablen in einer Anweisung deklariert werden sollen:
		int[] nums1, nums2;						// Zwei Variablen vom Typ int[]
		int nums3[], nums4;						// Eine Variable vom Typ int[], eine vom Typ int
		int nums5[], nums6[];					// Zwei Variablen vom Typ int[]
		
		// Beim Arbeiten mit Arrays muss beachtet werden, dass wir keinen Index verwenden, welcher
		// in dem Array nicht existiert!
		numbers = new int[2];					// Erzeugt Array mit 2 Elementen!
//		numbers[2] = 25;						// Nutze die 3. Position, weil 0-basiert...
												// Es kommt zur ArrayIndexOutOfBoundsException!
		
		// Arrays mit 0 Elementen sind g�ltige Arrays:
		numbers = new int[0];
		// Anfangen kann man damit nichts...
//		numbers[0] = 25;						// ArrayIndexOutOfBoundsException
		
		// Array mit 0 Elemeten ist zu unterscheiden von einer Nullreferenz...
		numbers = null;
//		numbers[0] = 25;						// NullPointerException - hier ist kein Array
		
		// Wie andere Referenzvariablen k�nnen wir auch Arrays casten!
		strings = new String[] {"Hello", "Servus", "Nihao"};	// Array mit 3 Strings
		Object[] objs = strings;								// Strings sind Objekte!	
		strings = (String[])objs;								// Expliziter Cast n�tig...
		
//		objs[1] = new StringBuilder("");						// Auch StringBuilder sind Objekte...
		// Aber halt! In der Variable steckte doch ein String-Array. Ein StringBuilder ist aber kein String.
		// Folglich kommt es auch hier zu einer Exception!
		
		// Die Klasse Arrays stellt einige statische Methoden zur Verf�gung, welche die Arbeit mit einem
		// Array erleichtern sollen. Die Klasse Arrays ist nicht zu verwechseln mit der Klasse Array!
		// Mit der Methode Arrays.toString() lassen wir ein Array komfortabel als String drucken.
		System.out.println(Arrays.toString(strings));			// "Hello", "Servus", "Nihao"
		System.out.println(strings.toString());					// nerviger HashCode...
		
		// Mit der Methode Arrays.sort() kann ein Array sortiert werden - sofern die Elemente
		// eine nat�rliche Ordnung besitzen!
		numbers = new int[] {5, 0, 3, 17, 9, 6};
		Arrays.sort(numbers);									// sortiert das Array, gibt nichts zur�ck
		System.out.println(Arrays.toString(numbers));			// 0, 3, 5, 6, 9, 17
		
		// Strings k�nnen alphabetisch sortiert werden:
		Arrays.sort(strings);
		System.out.println(Arrays.toString(strings));			// "Hello", "Nihao", "Servus"
		
		// Objekte k�nnen nicht sortiert werden, weil sie keine nat�rliche Ordnung besitzen...
		objs = new Object[] {new Object(), new Object(), new Object()};
//		Arrays.sort(objs);										// Exception!
		
		// Die Methode Arrays.binarySearch() durchsucht ein Array nach einem spezifischen Element -
		// aber das Array muss sortiert sein, damit dies funktioniert!
		// Als R�ckgabe erhalten wir die Position des gesuchten Elements
		System.out.println(Arrays.binarySearch(numbers, 5));	// 2
		// Befindet sich das gesuchte Element NICHT im Array, erhalten wir einen negativen Wert,
		// welcher der vermuteten Position des Elementes anhand der nat�rlich Ordnung +1 entspricht
		System.out.println(Arrays.binarySearch(numbers, 12));	// -6 (die 12 w�re an Position 5 zu vermuten)
		// Bei einem nicht sortierten Array ist das Ergebnis nicht zu gebrauchen:
		Integer[] numbers8 = new Integer[] {5, 2, 9, 4, 13, 8};
		System.out.println(Arrays.binarySearch(numbers, 4));	// unvorhersehbar laut JavaDoc
		
		// Mit der Methode Arrays.asList() kann ein Array in eine Liste verwandelt werden.
		// Allerdings handelt es sich in diesem Fall um eine Liste, welche auf das selbe Array
		// im Speicher zugreift. Das Resultat ist daher immutable (die Liste kann nicht verl�ngert
		// oder verk�rzt werden)
		List<Integer> nrs = Arrays.asList(numbers8);
//		nrs.add(22);											// Exception, Liste darf nicht verl�ngert werden
		nrs.set(3, 10);
		System.out.println(Arrays.toString(numbers8));			// 5, 2, 9, 10, 13, 8
		// Durch das ver�ndern der Liste nrs hat sich ebenfalls das Array numbers8 ver�ndert!
		// Dieses Prinzip findet sich lediglich bei Listen die mit dieser Methode erzeugt wurden.
		
		// Nicht vergessen:
		// Arrays k�nnen �ber eine abgek�rzte Schreibweise instanziiert werden, wenn
		// gleichzeitig eine Variable deklariert wird.
		int[] ints = {5, 50, 500};								// new int[] wurde ausgelassen!
//		ints = {10, 100, 1000};									// darf hier nicht ausgelassen werden
		
		// Au�erdem niemals die gr��e des Arrays beim Datentyp der Variable angeben!
//		int[10] myNumbers;										// Kompiliert nicht
		
	}

}

// F�r die Pr�fung:
// 1. Arrays haben eine feste Gr��e, die beim Instanziieren angegeben werden muss.
// 2. Die Elemente eines Arrays k�nnen neu zugewiesen werden.
// 3. Arrays sind nicht automatisch sortiert, und k�nnen Duplikate enthalten.
// 4. Die toString() Methode wurde f�r Arrays nicht �berschrieben - stattdessen nutzen wir die
// statische Methode Arrays.toString() (die Klasse Arrays enth�lt Hilfsmethoden)
// 5. Mit Arrays.sort() kann ein Array sortiert werden, sofern der Datentyp seiner Elemente eine
// nat�rliche Ordnung vorgibt - ansonsten gibt es hier eine Exception
// 6. Mit Arrays.binarySearch() kann die Position eines gesuchten Elementes in einem Array ausgegeben 
// werden - sofern das Array sortiert ist. Ist das gesuchte Element nicht enthalten, bekommen wir
// einen negativen Wert. Ist das Array unsortiert, bleibt das Ergebnis unvorhersehbar. 
// 7. Mit Arrays.asList() kann eine Liste generiert werden, welche mit dem benutzten Array in
// dauerhafter Verbindung steht. Diese Liste kann nicht verl�ngert oder verk�rzt werden.
// �nderungen an der Liste wirken sich auf das urspr�ngliche Array aus un umgekehrt.
// 8. Beim Arbeiten mit Arrays gibt es immer die Gefahr von ArrayIndexOutOfBoundsException.
