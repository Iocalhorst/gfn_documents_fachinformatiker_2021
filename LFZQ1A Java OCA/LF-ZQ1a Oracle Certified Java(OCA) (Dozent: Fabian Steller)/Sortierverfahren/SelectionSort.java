package Sortierverfahren;

import java.util.ArrayList;

//Es gibt zahlreiche unterschiedliche Algorithmen zum sortieren von Mengen.
//
//Zwei davon sollen nun näher betrachtet werden.
//
//Als BubbleSort bezeichnet man folgendes Verfahren:
//Jedes Element eines unsortierten Arrays wird mit seinem direkten (rechten) Nachbarn anhand eines Kriteriums verglichen. Sind die Elemente nach dem Kriterium nicht in der korrekten Reihenfolge, tauschen sie ihre Position.
//Das Array muss solange wiederholt durchlaufen werden, bis es nichts mehr zu vertauschen gibt.
//
//Als SelectionSort bezeichnet man folgendes Verfahren:
//Aus einem unsortierten Array wird der nach dem Sortierkriterium kleinste Wert herausgesucht. 
//Dieser tauscht dann die Position mit dem aktuell ersten Element des Arrays. 
//Der Vorgang wird wiederholt durchlaufen, wobei die bereits sortierten Elemente im jeweils nächsten Schritt 
//nicht mehr betrachtet werden müssen.
//
//Implementiere für beide Sortierverfahren eine Methode in Java und teste diese.
//
//Zusatz: Wie können wir eventuell feststellen, welcher der beiden Algorithmen schneller arbeitet?

public class SelectionSort {
	
	public static void sort(int[] array) {						// Methode nimmt jedes beliebige Array von Ganzzahlen entgegen
		for (int j = 0; j < array.length; j++) {				// Schleife über die Länge des Arrays
			int min = Integer.MAX_VALUE;						// Hilfsvariable zum Vergleichen - größte denkbare 32bit-Zahl						
			int pos = 0;										// Hilfsvariable für die Position der kleinsten Zahl im Array
			for (int i = j; i < array.length; i++) {			// Schleife von j(Iteration der Äußeren) bis zum Ende des Arrays
				if (array[i] < min) {							// Ist die Zahl an der aktuellen Position kleiner als der Vergleichswert?
					min = array[i];								// Wenn ja, überschreiben wir den Vergleichswert mit der kleineren Zahl
					pos = i;									// und merken uns deren Position
				}
			}
			array[pos] = array[j];								// Schreibe die Zahl an der Position, von der aus wir gezählt haben, an die Position der kleinsten Zahl
			array[j] = min;										// Schreibe die kleinste Zahl an die Anfangsposition
		}
	}
	
	// Einfachere Lösung mit Listen
	
	public static ArrayList<Integer> sortList(ArrayList<Integer> list) {	// Methode arbeitet mit einer Liste, die sortiert werden soll
		ArrayList<Integer> result = new ArrayList<>();						// leere Liste für das Ergebnis
		while (!list.isEmpty()) {											// Solange die zu sortierende Liste noch nicht leer ist...
			int min = Integer.MAX_VALUE;									
			int pos = 0;													// Suche die Position der kleinsten Zahl in der Liste
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i) < min) {
					min = list.get(i);
					pos = i;
				}
			}
			result.add(list.remove(pos));									// Schneide die kleinste Zahl aus der Liste aus und füge sie an die Ergebnisliste an
		}
		return result;		
	}
	
	
	
	
	
//	public static int getMin(ArrayList<Integer> list) {
//		return 0;
//		
//	}
//	public static int getMin(int[] array) {
//		return 0;
//		
//	}
	
	
}




