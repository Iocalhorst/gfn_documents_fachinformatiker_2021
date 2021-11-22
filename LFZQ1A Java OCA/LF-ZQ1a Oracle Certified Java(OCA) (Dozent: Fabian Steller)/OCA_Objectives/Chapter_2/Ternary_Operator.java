package chapter_2;

// Der Tern�re Operator hat 3 Operanden
// Er gibt einen Wert zur�ck, abh�ngig von einer Bedingung

public class Ternary_Operator {

	public static void main(String[] args) {
		// Grunds�tzliche Syntax:
		// Bedingung ? TRUE-CASE : FALSE-CASE
		int a = 0;
		boolean b = a > 100? true : false;		// Wenn a gr��er ist als 100, weise b den Wert true zu
												// sonst false
		
		// Der Tern�re Operator darf nicht "f�r sich" stehen - allein ist er keine g�ltige Anweisung
//		a > 100? a = 101 : a = 99;
		
		// In Methodenaufrufen ist er gestattet
		double time = 14.57;
		System.out.println(time > 15? "Hakan will ins Wochenende!": "Hakan nimmt brav am Unterricht teil!");

		// Der Datentyp des zur�ckgegebenen Wertes muss passend sein
		System.out.println(time > 15 ? 10.00 : "10.00");				// Ok, println nimmt alles
		
//		double x = time == 20? 10.00 : "10";							// Kompiliert nicht, kein String zul�ssig
		
		// Zuweisungen innerhalb des tern�ren Operators sind g�ltig:
		System.out.println(a > 100? a = 101 : (a = 20));
		
		// Tern�re Operatoren k�nnen verschachtelt werden :)
		System.out.println(a == 50? (a % 2 == 0? "Hilfe!" : 
			"Kompliziert!") : (a > 0? "Ich kann nicht mehr!" : "Abgest�rzt!"));
		// Da a 20 ist, ist die Ausgabe "Ich kann nicht mehr!"
		
		
	}

}

// F�r die Pr�fung:
// 1. Der Tern�re Operator hat 3 Operanden
// 2. Vor dem "?" muss ein boolean-Ausdruck stehen (Bedingung)
// 3. Hinter dem "?" steht der Ausdruck, welcher zur�ckgegeben wird, wenn die Bedingung true ergibt
// 4. Hinter dem ":" steht der Ausdruck, welcher zur�ckgegeben wird, wenn die Bedingung false ergibt
// 5. Der Tern�re Operator gibt einen Wert zur�ck, dieser MUSS durch eine Zuweisung oder einen 
// Methodenaufruf oder �hnliches aufgefangen werden
// 6. Ein Methodenaufruf INNERHALB des Tern�ren Operators ist grunds�tzlich gestattet, aber eine Methode
// ohne R�ckgabetyp (void) ist allein kein g�ltiger Operand
// 7. Der Tern�re Operator kann einen beliebigen Datentyp zur�ckgeben - sofern dieser an der 
// betreffenden Stelle sinnvoll verwendet werden kann