package Sortierverfahren;
//Es gibt zahlreiche unterschiedliche Algorithmen zum sortieren von Mengen.
//
//Zwei davon sollen nun näher betrachtet werden.
//
//Als BubbleSort bezeichnet man folgendes Verfahren:
//Jedes Element eines unsortierten Arrays wird mit seinem direkten (rechten) Nachbarn anhand eines Kriteriums verglichen. Sind die Elemente nach dem Kriterium nicht in der korrekten Reihenfolge, tauschen sie ihre Position.
//Das Array muss solange wiederholt durchlaufen werden, bis es nichts mehr zu vertauschen gibt.
//
//Als SelectionSort bezeichnet man folgendes Verfahren:
//Aus einem unsortierten Array wird der nach dem Sortierkriterium kleinste Wert herausgesucht. Dieser tauscht dann die Position mit dem aktuell ersten Element des Arrays. Der Vorgang wird wiederholt durchlaufen, wobei die bereits sortierten Elemente im jeweils nächsten Schritt nicht mehr betrachtet werden müssen.
//
//Implementiere für beide Sortierverfahren eine Methode in Java und teste diese.
//
//Zusatz: Wie können wir eventuell feststellen, welcher der beiden Algorithmen schneller arbeitet?

public class BubbleSort {
	
	public static void sort(int[] array) {				// Methode nimmt jedes beliebige Array von Ganzzahlen entgegen
		int a;											// Zwischenspeicher zum Vertauschen zweier Positionen des Arrays
		boolean sortiert = false;						// Variable für die while-Schleife, gibt an ob das Array sortiert ist
		while (!sortiert) {								// Solange das Array nicht sortiert ist...
			sortiert = true;							// Behauptung, dass die Schleife sortiert ist						
			for (int i = 0; i < array.length - 1; i++) {// Gehe durch das Array bis zur vorletzten Position
				if (array[i] > array[i+1]) {			// ist die Zahl an der aktuellen Position größer als ihr Nachbar?	
					a = array[i];						// Wenn ja, vertauschen wir mithilfe des Zwischenspeichers a
					array[i] = array[i+1];
					array[i+1] = a;
					sortiert = false;					// Array war doch nicht sortiert - Bedingung wieder auf false setzen
				}
			}
		}			
	}
}
