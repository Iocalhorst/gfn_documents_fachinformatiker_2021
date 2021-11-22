package chapter_2;

// Der Ternäre Operator hat 3 Operanden
// Er gibt einen Wert zurück, abhängig von einer Bedingung

public class Ternary_Operator {

	public static void main(String[] args) {
		// Grundsätzliche Syntax:
		// Bedingung ? TRUE-CASE : FALSE-CASE
		int a = 0;
		boolean b = a > 100? true : false;		// Wenn a größer ist als 100, weise b den Wert true zu
												// sonst false
		
		// Der Ternäre Operator darf nicht "für sich" stehen - allein ist er keine gültige Anweisung
//		a > 100? a = 101 : a = 99;
		
		// In Methodenaufrufen ist er gestattet
		double time = 14.57;
		System.out.println(time > 15? "Hakan will ins Wochenende!": "Hakan nimmt brav am Unterricht teil!");

		// Der Datentyp des zurückgegebenen Wertes muss passend sein
		System.out.println(time > 15 ? 10.00 : "10.00");				// Ok, println nimmt alles
		
//		double x = time == 20? 10.00 : "10";							// Kompiliert nicht, kein String zulässig
		
		// Zuweisungen innerhalb des ternären Operators sind gültig:
		System.out.println(a > 100? a = 101 : (a = 20));
		
		// Ternäre Operatoren können verschachtelt werden :)
		System.out.println(a == 50? (a % 2 == 0? "Hilfe!" : 
			"Kompliziert!") : (a > 0? "Ich kann nicht mehr!" : "Abgestürzt!"));
		// Da a 20 ist, ist die Ausgabe "Ich kann nicht mehr!"
		
		
	}

}

// Für die Prüfung:
// 1. Der Ternäre Operator hat 3 Operanden
// 2. Vor dem "?" muss ein boolean-Ausdruck stehen (Bedingung)
// 3. Hinter dem "?" steht der Ausdruck, welcher zurückgegeben wird, wenn die Bedingung true ergibt
// 4. Hinter dem ":" steht der Ausdruck, welcher zurückgegeben wird, wenn die Bedingung false ergibt
// 5. Der Ternäre Operator gibt einen Wert zurück, dieser MUSS durch eine Zuweisung oder einen 
// Methodenaufruf oder ähnliches aufgefangen werden
// 6. Ein Methodenaufruf INNERHALB des Ternären Operators ist grundsätzlich gestattet, aber eine Methode
// ohne Rückgabetyp (void) ist allein kein gültiger Operand
// 7. Der Ternäre Operator kann einen beliebigen Datentyp zurückgeben - sofern dieser an der 
// betreffenden Stelle sinnvoll verwendet werden kann