package chapter_2;

public class Operator_Precedence {

	public static void main(String[] args) {
		// Einige Beispiele:
		
		System.out.println((- 7 - 4) + " " + (-(7 - 4)));  		// Vorzeichen - kommt vor Subtraktion
																// Ausgabe: -11 -3
		
		System.out.println((2 + 3 * 4) + " " + ((2 + 3) * 4));	// Multiplikation kommt vor Addition
																// Ausgabe: 14 20
		
		System.out.println(7 > 5 && 2 > 3);						// > kommt vor &&
																// Ausgabe: false
		
		System.out.println(true & false == false | true);   	// == kommt vor & und |
																// Ausgabe: true
		
		System.out.println((true & false) == (false | true)); 	// Klammern zuerst!
																// Ausgabe: false
		
		boolean b1 = false;
		boolean b2;
		int x = 2, y = 5;
		b1 = 2-12/4 > 5+-7 && b1 != y++>5 == 7%4 > ++x | b1 == true;
		b2 = (2-12/4 > 5+-7) && (b1 != y++>5) == (7%4 > ++x) | (b1 == true);
		System.out.println(b1 + " " + b2);
		
		// Um komplizierte Ausdrücke zu verstehen, setze nach und nach Klammern
		// entsprechend der Prioritäten ein!
		// b1 = ((2-(12/4)) > (5+(-7))) && ((b1 != ((y++)>5)) == ((7%4) > (++x))) | (b1 == true);
		// Auswerten Schritt für Schritt:
		// b1 = ((2 - 3) > (-2)) && ((b1 != (5 > 5)) == ( 3 > 3 )) | (b1 == true);
		// b1 =  true && ( false == false ) | false;
		// b1 = true;
		
		// b2 = true && false == false | true;
		// b2 = true;
		// Ausgabe ist: true true
	}

}

// Prioritäten aller relevanten Operatoren (von hoch bis niedrig)
// Für die Prüfung:
// 1. Unäre Operatoren 							(!, -, ++, --)
// 2. Multiplikation, Division, Modulus 		(*, /, %)
// 3. Addition, Subtraktion						(+, -)
// 4. Relationale Operatoren					(<, >, >=, <=)
// 5. Gleichheitsoperatoren						(==, !=)
// 6. Einfaches logisches UND					(&)
// 7. Einfaches logisches ODER / XOR			(|, ^)
// 8. Short-Circuit UND							(&&)
// 9. Short-Circuit ODER						(||)
//10. Ternärer Operator							(? :)
//11. Zuweisungen								(=)
//12. Mit Klammern können die Prioritäten ignoriert werden - Ausdrücke in Klammern haben immer Priorität
