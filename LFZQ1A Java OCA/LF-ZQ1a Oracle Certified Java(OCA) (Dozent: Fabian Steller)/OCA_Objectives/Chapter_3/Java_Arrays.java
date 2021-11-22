package Chapter_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Ein Array ist eine Art geordneter Liste
// Ein Array kann beliebig viele Elemente enthalten, wobei jedes seinen festen Platz im Array hat
// Ein Array kann seine Länge (Anzahl der Elemente) nicht ändern, nachdem es erzeugt wurde

public class Java_Arrays {

	public static void main(String[] args) {
		// Eine Array-Variable deklarieren:
		int [] numbers;							// int ist der Datentyp der Elemente, die Klammer gibt ein Array an
		String[] strings;						// Datentyp kann jede beliebige Klasse sein
		
		// Bisher haben wir nur Variablen, aber noch keine Arrays!
		// Um die Variablen zu initialisieren, müssen Arrays mit fester Größe erzeugt werden
		
		numbers = new int[5];					// erzeugt Array von 5 ints - alle Elemente bekommen Standardwerte
		numbers = new int[] {1, 2, 4, 6, 8};	// erzeugt Array von 5 ints mit den spezifizierten Werten
		
		// Nicht gültig sind folgende Zeilen:
//		numbers = new int[];					// Kompiliert nicht weil Array keine Größe hat
//		numbers = new int[5] {1, 2, 4, 6, 8};	// Kompiliert nicht weil Größe zweimal angegeben wurde
		
		// Obwohl die Größe des Arrays unveränderlich ist, können einzelne Elemente verändert werden:
		System.out.println(numbers[2]);			// 4
		numbers[2] = 12;						// die Position 2 neu zuweisen
		System.out.println(numbers[2]);			// 12
		
		// Arrays werden nicht automatisch sortiert: die 12 befindet sich jetzt zwischen 2 und 6!
		
		// Die eckige Klammer beim Datentyp der Variable verhält sich etwas sonderbar:
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
		
		// Arrays mit 0 Elementen sind gültige Arrays:
		numbers = new int[0];
		// Anfangen kann man damit nichts...
//		numbers[0] = 25;						// ArrayIndexOutOfBoundsException
		
		// Array mit 0 Elemeten ist zu unterscheiden von einer Nullreferenz...
		numbers = null;
//		numbers[0] = 25;						// NullPointerException - hier ist kein Array
		
		// Wie andere Referenzvariablen können wir auch Arrays casten!
		strings = new String[] {"Hello", "Servus", "Nihao"};	// Array mit 3 Strings
		Object[] objs = strings;								// Strings sind Objekte!	
		strings = (String[])objs;								// Expliziter Cast nötig...
		
//		objs[1] = new StringBuilder("");						// Auch StringBuilder sind Objekte...
		// Aber halt! In der Variable steckte doch ein String-Array. Ein StringBuilder ist aber kein String.
		// Folglich kommt es auch hier zu einer Exception!
		
		// Die Klasse Arrays stellt einige statische Methoden zur Verfügung, welche die Arbeit mit einem
		// Array erleichtern sollen. Die Klasse Arrays ist nicht zu verwechseln mit der Klasse Array!
		// Mit der Methode Arrays.toString() lassen wir ein Array komfortabel als String drucken.
		System.out.println(Arrays.toString(strings));			// "Hello", "Servus", "Nihao"
		System.out.println(strings.toString());					// nerviger HashCode...
		
		// Mit der Methode Arrays.sort() kann ein Array sortiert werden - sofern die Elemente
		// eine natürliche Ordnung besitzen!
		numbers = new int[] {5, 0, 3, 17, 9, 6};
		Arrays.sort(numbers);									// sortiert das Array, gibt nichts zurück
		System.out.println(Arrays.toString(numbers));			// 0, 3, 5, 6, 9, 17
		
		// Strings können alphabetisch sortiert werden:
		Arrays.sort(strings);
		System.out.println(Arrays.toString(strings));			// "Hello", "Nihao", "Servus"
		
		// Objekte können nicht sortiert werden, weil sie keine natürliche Ordnung besitzen...
		objs = new Object[] {new Object(), new Object(), new Object()};
//		Arrays.sort(objs);										// Exception!
		
		// Die Methode Arrays.binarySearch() durchsucht ein Array nach einem spezifischen Element -
		// aber das Array muss sortiert sein, damit dies funktioniert!
		// Als Rückgabe erhalten wir die Position des gesuchten Elements
		System.out.println(Arrays.binarySearch(numbers, 5));	// 2
		// Befindet sich das gesuchte Element NICHT im Array, erhalten wir einen negativen Wert,
		// welcher der vermuteten Position des Elementes anhand der natürlich Ordnung +1 entspricht
		System.out.println(Arrays.binarySearch(numbers, 12));	// -6 (die 12 wäre an Position 5 zu vermuten)
		// Bei einem nicht sortierten Array ist das Ergebnis nicht zu gebrauchen:
		Integer[] numbers8 = new Integer[] {5, 2, 9, 4, 13, 8};
		System.out.println(Arrays.binarySearch(numbers, 4));	// unvorhersehbar laut JavaDoc
		
		// Mit der Methode Arrays.asList() kann ein Array in eine Liste verwandelt werden.
		// Allerdings handelt es sich in diesem Fall um eine Liste, welche auf das selbe Array
		// im Speicher zugreift. Das Resultat ist daher immutable (die Liste kann nicht verlängert
		// oder verkürzt werden)
		List<Integer> nrs = Arrays.asList(numbers8);
//		nrs.add(22);											// Exception, Liste darf nicht verlängert werden
		nrs.set(3, 10);
		System.out.println(Arrays.toString(numbers8));			// 5, 2, 9, 10, 13, 8
		// Durch das verändern der Liste nrs hat sich ebenfalls das Array numbers8 verändert!
		// Dieses Prinzip findet sich lediglich bei Listen die mit dieser Methode erzeugt wurden.
		
		// Nicht vergessen:
		// Arrays können über eine abgekürzte Schreibweise instanziiert werden, wenn
		// gleichzeitig eine Variable deklariert wird.
		int[] ints = {5, 50, 500};								// new int[] wurde ausgelassen!
//		ints = {10, 100, 1000};									// darf hier nicht ausgelassen werden
		
		// Außerdem niemals die größe des Arrays beim Datentyp der Variable angeben!
//		int[10] myNumbers;										// Kompiliert nicht
		
	}

}

// Für die Prüfung:
// 1. Arrays haben eine feste Größe, die beim Instanziieren angegeben werden muss.
// 2. Die Elemente eines Arrays können neu zugewiesen werden.
// 3. Arrays sind nicht automatisch sortiert, und können Duplikate enthalten.
// 4. Die toString() Methode wurde für Arrays nicht überschrieben - stattdessen nutzen wir die
// statische Methode Arrays.toString() (die Klasse Arrays enthält Hilfsmethoden)
// 5. Mit Arrays.sort() kann ein Array sortiert werden, sofern der Datentyp seiner Elemente eine
// natürliche Ordnung vorgibt - ansonsten gibt es hier eine Exception
// 6. Mit Arrays.binarySearch() kann die Position eines gesuchten Elementes in einem Array ausgegeben 
// werden - sofern das Array sortiert ist. Ist das gesuchte Element nicht enthalten, bekommen wir
// einen negativen Wert. Ist das Array unsortiert, bleibt das Ergebnis unvorhersehbar. 
// 7. Mit Arrays.asList() kann eine Liste generiert werden, welche mit dem benutzten Array in
// dauerhafter Verbindung steht. Diese Liste kann nicht verlängert oder verkürzt werden.
// Änderungen an der Liste wirken sich auf das ursprüngliche Array aus un umgekehrt.
// 8. Beim Arbeiten mit Arrays gibt es immer die Gefahr von ArrayIndexOutOfBoundsException.
