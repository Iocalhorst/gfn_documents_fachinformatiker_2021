package myPackage;

import java.util.Scanner;

/* Exceptions sind Fehler, die bei der Ausf�hrung eines Programmes auftreten */
/* Java bringt eine ganze Reihe vordefinierter Exceptions mit - 
 * es k�nnen auch eigene geschrieben werden */

public class Fehlerbehandlung {

	public static void main(String[] args) {
	
		/* Runtime Exceptions sind Fehler, welche die JVM (Java Runtime Machine) w�hrend der
		 * Laufzeit des Programmes feststellt. Zumeist sind die auf Bugs im Code zur�ckzuf�hren */

		int[] numbers = new int[3];
//		System.out.println(numbers[3]);				/* ArrayIndexOutOfBoundsException tritt auf */
		
		/* Runtime Exceptions K�NNEN behandelt werden - das ist aber nicht unbedingt sinnvoll */
		/* Um eine Exception zu behandeln, muss sie aufgefangen werden */
		try {
			/* gesch�tzter Bereich */
			System.out.println(numbers[3]);			/* ArrayIndexOutOfBoundsException tritt auf */
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception gefangen - Absturz verhindert!");
		}
		System.out.println("Code l�uft normal weiter...");
		
		/* Besser, als eine Runtime Exception zu behandeln, ist es, den Bug zu beheben */
		/* Nur auf Indizes zugreifen, wenn diese auch existieren */
		if (3 < numbers.length) {
			System.out.println(numbers[3]);	
		}
		
		Scanner sc = new Scanner(System.in);

		while (true) {
			String input = sc.nextLine();
			try {
				pr�feEingabe(input);			/* Diese Methode kann eine FehlEingabe(Exception) verursachen*/
				break;							/* Diese Zeile kommt nur zum Tragen, wenn vorher keine Exception auftritt */
			} catch (FehlEingabe e) {
				System.out.println(e.getMessage());		/* Falls die FehlEingabe aufgetreten ist */
			} catch (Exception e) {
				/* Hier kommt der Programmfluss an, falls eine andere Exception als FehlEingabe auftritt */
			}
		}
		
	}
	
	/* Methode zum pr�fen der Nutzereingabe */
	static void pr�feEingabe(String input) throws FehlEingabe {
		/* Werfe Exception wenn die Eingabe leer ist */
		if (input.equals("")) {
			throw new FehlEingabe();
		}
	}

}

/* Eigene Exception-Klasse deklarieren - erbt von java.lang.Exception */
class FehlEingabe extends Exception {
	
	/* �berschreiben der Methode getMessage aus der Elternklasse */
	@Override
	public String getMessage() {
		return "Du hast eine fehlerhafte Eingabe get�tigt. Bitte versuche es nochmal.";
	}
}
