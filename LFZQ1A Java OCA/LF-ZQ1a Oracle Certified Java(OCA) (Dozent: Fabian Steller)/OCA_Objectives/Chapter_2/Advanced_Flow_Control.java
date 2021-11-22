package chapter_2;

// Zur Steuerung des Programmflusses stehen uns einige spezielle keywords zur Verf�gung
// Mit continue kann die aktuelle Iteration einer Schleife beendet werden 
// Mit break kann die komplette Schleife abgebrochen werden
// Durch die Verwendung von Labels k�nnen break und continue noch flexibler gemacht werden

public class Advanced_Flow_Control {

	public static void main(String[] args) {
		// Schleifen k�nnen ineinander verschachtelt werden:
		
		int[][] numbers = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		// Um �ber ein zweidimensionales Array zu iterieren, brauchen wir 2 Schleifen:
		
		// Wichtig: f�r jede Iteration der �u�eren Schleife wird die innere Schleife 
		// komplett mit allen Iterationen ausgef�hrt - sie multipliziert sich also
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				System.out.println(numbers[i][j]);
			}
		}
		
		// Auch mit foreach-Schleifen m�glich:
		for (int[] e : numbers) {
			for (int f : e) {
				System.out.println(f);
			}
		}
		
		
		// Komplexeres Beispiel:
		// Die �u�ere Schleife wird zwei mal ausgef�hrt
		// Nach der ersten Iteration hat x den Wert 3, weil es in der inneren
		// Schleife bis 4 verringert wird
		// In der zweiten Iteration wird der do-Block nur noch einmal ausgef�hrt
		// x ist am Ende 0
		int x = 20;
		while (x > 0) {
			do {
				x -= 2;									// diese Zeile wird 9-mal ausgef�hrt
			} while (x > 5);
			x--;
			System.out.print(x+"\t");					// Ausgabe 3	0
		}

		
		// break darf nur in switch oder Schleifen verwendet werden
		int z = Integer.MAX_VALUE;
		while (true) {
			if (z == 0) {
				break;									// brich die Schleife ab, wenn z 0 erreicht hat
			}
			z--;
		}
		
		// das gleiche ohne break:
		z = Integer.MAX_VALUE;
		while (z > 0) {
			z--;
		}
		
		// nach einem break darf keine Anweisung mehr folgen:
//		while (true) {
//			break;
//			System.out.println("???");					// Diese Zeile erzeugt einen Kompilierfehler
//		}
		
		// continue folgt �hnlichen Regeln wie break, nur dass es zur n�chsten Iteration der Schleife springt
		z = 10;
		while (z > 0) {
			if (z % 2 != 0) {
				z--;
				continue;								// Wenn z ungerade ist, werden die Zeilen 76 und 77 �bersprungen
			}
			System.out.println(z);						// Gibt nur die geraden Zahlen aus
			z--;
		}
		
		// break oder continue d�rfen nicht in if-Bl�cken verwendet werden:
		
		if (true) {
			System.out.println("Mich kann man nicht brechen!");
//			break;										// Kompiliert nicht!
//			continue;									// Kompiliert nicht!
		}
		
		// Ein break oder continue bezieht sich immer auf die innerste m�gliche Schleife:
		
//		while(true) {
//			do {
//				break;									// Bricht nur die innere do-while Schleife ab!
//			} while (true);
//		}
		
		// Noch einmal das Beispiel vom Anfang:
		numbers = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
	
		
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				if (j > 1) {
					break;								// Bricht die innere Schleife ab
				}
				System.out.println(numbers[i][j]);		// 1, 2, 4, 5, 7, 8
			}

		}
		
		// mit Label:
		outer: for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				if (j > 1) {
					break outer;						// Bricht die �u�ere Schleife ab
				}
				System.out.println(numbers[i][j]);		// 1, 2
			}

		}
		
		outer :for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				if (j > 1) {
					continue outer;						// Bricht die innere Schleife ab
				}
				System.out.println(numbers[i][j]);		// 1, 2, 4, 5, 7, 8
			}

		}
		
		// Labels d�rfen praktisch �berall verwendet werden
		// Ein echter Anwendungsfall daf�r besteht aber nur bei Schleifen
		// Bl�cke mit labels k�nnen gebreaked, aber nicht continued werden
		
		hans: {
			break hans;									// Springt ans Ende des Blockes 
		}
		
		otto : {
//			continue otto;								// Kompiliert nicht, continue nicht g�ltig
//			break hans;									// Kompiliert nicht, hans out of Scope
		}
		
	}
	
}

// F�r die Pr�fung:
// 1. Befindet sich eine Schleife innerhalb einer anderen Schleife, wird die innere Schleife komplett
// mit allen Iterationen f�r jede Iteration der �u�eren ausgef�hrt. 
// 2. Das keyword break bricht die innerste Schleife ab, in der es sich befindet
// 3. Das keyword continue springt zur n�chsten Iteration der innersten Schleife, in der es sich befindet
// 4. Das keyword continue darf nicht au�erhalb von Schleifen verwendet werden
// 5. Mit einem Label k�nnen Bl�cke oder statements wie if/for mit einem Namen versehen werden
// 6. Break oder continue mit einem Label beziehen auf die so benannte Schleife/Block
// 7. Break darf nicht au�erhalb von switch, Schleifen oder Bl�cken mit Labels verwendet werden
// 8. Labels d�rfen nur innerhalb ihres Blockes angesprochen werden