package chapter_2;

import java.util.ArrayList;

// Relationale Operatoren vergleichen zwei Werte und geben einen boolean zurück
// Mit <, >, <=, >= dürfen nur Zahlentypen verglichen werden - es muss sich aber nicht
// um zwei gleiche Zahlentypen handeln
// Mit instanceof wird ein Objekt auf seine Klassenzugehörigkeit überprüft

public class Relational_Operators {

	public static void main(String[] args) {
		// zwei Zahlen vergleichen - Datentyp spielt keine Rolle
		int a = 10;
		byte b = 20;
		System.out.println(a < b);					// true - 10 ist kleiner als 20
		
		double c = 10.0;
		System.out.println(a < c);					// false - 10 ist nicht kleiner als 10.0
		
		// Funktioniert auch mit char
		char d = 'h';
		System.out.println(d > a);					// true - h hat den Zahlenwert 17
		
		// Mit der Methode Character.getNumericValue(char c) wird der Zahlenwert eines chars ausgegeben
		System.out.println(Character.getNumericValue('h'));
		
		// Objekte oder booleans können nicht größer oder kleiner sein!
		boolean e = true;
//		System.out.println(e > false);				// Dieser Vergleich ist NICHT gestattet
		
		String f = "adc";
		String g = "cba";
//		System.out.println(f > g);					// Dieser Vergleich ist NICHT gestattet
		
		// Vergleiche sind überall gestattet, wo ein boolean erwartet wird
		boolean h = 20 < 10;						// weist h den Wert false zu
		
		if (0 >= 0) {								// identisch zu if (true)

		}
		
		// Der instanceof Operator gibt ebenfalls einen boolean als Ergebnis zurück
		// Der linke Operand muss eine Referenzvariable sein, der rechte Operand ein Klassenname!
		
		String i = "Ich bin ein Object";
		System.out.println(i instanceof Object);		// true - ein String ist ein Object
		System.out.println(i instanceof String);		// true - ein String ist ein String
//		System.out.println(i instanceof ArrayList);		// nicht erlaubt, weil es niemals true sein kann
		
		Object j = new Object();
		System.out.println(j instanceof String);		// false - ein Object ist KEIN String
		j = new String();
		System.out.println(j instanceof String);		// true - String ist ein String
				
	}

}

// Für die Prüfung:
// 1. Für >, <, <=, >= müssen beide Operanden Zahlen sein, und das Ergebnis ist immer ein boolean
// 2. Zahlen müssen nicht den selben Datentyp haben, um verglichen zu werden
// 3. Auch char ist eine Zahl!
// 4. Auch Vergleiche zwischen Literalen Zahlen sind gestattet - diese gelten als literaler boolean
// 5. instanceof gibt true zurück, wenn der rechte Operand (Klassenname) dem Instanztyp des linken
// Operanden (Referenzvariable) entspricht - oder wenn es sich beim Instanztypen um einen Nachfahren
// des Klassennamens handelt (Kindklasse, Enkelklasse usw.)
// 6. Der instanceof Operator ist nicht gestattet, wenn das Ergebnis niemals true sein kann