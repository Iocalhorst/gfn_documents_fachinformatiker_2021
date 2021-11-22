package chapter_2;

// Logische Operatoren sind das logische UND &, das logische ODER |, und das logische XOR ^
// UND/ODER existieren auch in doppelter Ausführung: &&, ||
// Diese Operatoren machen aus zwei boolean Operanden einen boolean
// Linker und rechter Operand sind für das logische Ergebnis austauschbar
// true & true 		== true
// true & false 	== false
// true | true  	== true
// true | false 	== true
// false & false 	== false
// false | false	== false
// true ^ true		== false
// true ^ false		== true
// false ^ false	== false

public class Logical_Operators {

	public static void main(String[] args) {
		// Operanden müssen booleans sein!
		// Folgender Ausdruck ist gültig:
		System.out.println(10 > 5 | 5 > 10);				// Links und rechts des ODER stehen booleans
															// true
		
		// Alle Ausdrücke, die booleans ergeben, dürfen mit |, &, ^ verknüpft werden
		// Solche Ausdrücke können beliebig lang sein
		// Wichtig: & hat eine höhere Priorität als | 
		System.out.println(false & true | true | false & true);		// (false&true) | true | (false&true)

		// Beim doppelten && bzw. || verändert sich die logische Bedeutung nicht
		// Allerdings wird bei der doppelten Variante nur so lange ausgewertet, bis das Ergebnis feststeht
		// Beim && wird der rechte Operand nicht mehr ausgewertet, wenn der linke Operand false ist
		// Beim || wird der rechte Operand nicht mehr ausgewertet, wenn der linke Operand true ist
		// Dies spielt nur dann eine Rolle, wenn die Operanden Methodenaufrufe oder Zuweisungen enthalten
		int a = 20;
		int b = 25;
		System.out.println(a > b && b < (a = 30));			// Links des && ergibt sich ein false - a wird nicht neu zugewiesen 
		System.out.println(a);								// immer noch 20
		
		// In der folgenden Zeile wird die Methode giveMeTwo() NICHT mehr ausgeführt
		System.out.println(giveMeOne() == 1 || giveMeTwo() == 2);
		
		System.out.println(true || false & true );          // Rechts des || ist "dead code"
		
		// Die doppelten Operatoren && und || heißen auch "Short-Circuit operators" (Kurzschlussoperatoren)
		// & und | haben höhere Priorität als && und ||
		System.out.println(true && true | false && false);				// false
		System.out.println(true && (true | false) && false);			// false
		System.out.println(true & true | false & false);				// true
		
		// Die einfachen Operatoren & und | sind auch mit Zahlen verwendbar
		// Hierbei handelt es sich um einen Vergleich der Bits - dieses Thema ist NICHT im OCA
	}
	
	static int giveMeOne() {
		System.out.println("Methode 1");
		return 1;
	}
	
	static int giveMeTwo() {
		System.out.println("Methode 2");
		return 2;
	}

}

// Für die Prüfung:
// 1. Logische Operatoren machen aus zwei booleans einen boolean
// 2. Aus dem logischen & ergibt sich ein "true", wenn beide Operanden "true" sind
// 3. Aus dem logischen | ergibt sich ein "true", wenn mindestens ein Operand "true" ist
// 4. Aus dem logischen ^ (XOR) ergibt sich ein "true", wenn genau ein Operand "true" ist
// 5. Die Short-Circuit Operatoren && und || brechen die Auswertung ab, sobald das Ergebnis feststeht!
// 6. Zuweisungen oder Methodenaufrufe können eventuell nicht stattfinden, wenn sie rechts 
// von einem Short-Circuit Operator stehen
// 7. Die einfachen Operatoren &, | und ^ haben eine höhere Priorität als die doppelten && und ||
// 8. Das & hat eine höhere Priorität als | und ^ (auch bei && und ||)
