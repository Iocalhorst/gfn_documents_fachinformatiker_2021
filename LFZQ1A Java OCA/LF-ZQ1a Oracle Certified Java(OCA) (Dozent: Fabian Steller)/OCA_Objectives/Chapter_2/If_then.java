package chapter_2;

// Das "if" keyword wird verwendet, um einen konditionalen Block einzuleiten
// Dies wird auch als "Verzweigung" bezeichnet

public class If_then {

	public static void main(String[] args) {

		// F�r das if gilt: es muss eine runde Klammer darauf folgen, und in dieser Klammer
		// muss ein boolean stehen 
		if (true) {													// Literale booleans sind erlaubt
			
		}
		
//		if () {
//							// Kompiliert nicht, weil die runde Klammer leer ist
//		}
		
//		if ("true") {
//							// Kompiliert nicht, weil die runde Klammer keinen boolean enth�lt
//		}
		
//		if true {
//							// Kompiliert nicht, weil die runde Klammer fehlt!
//		}
		
		// Auf die Bedingung folgt normalerweise ein Block {} - aber die geschweiften Klammern
		// D�RFEN weggelassen werden
		char a = '#';
		if (Character.isLetter(a)) 								// Ok, die Methode gibt einen boolean zur�ck
			System.out.println("Ist ein Buchstabe!");			// Diese Zeile ist der konditionale Teil
			System.out.println("Nach dem If-Block");			// Diese Zeile ist NICHT mehr konditional
		
		// Bei einem if ohne geschweifte Klammern gilt der Block nur bis zum n�chsten Semikolon!
		// Das hei�t, er kann dann nur eine Anweisung enthalten
		// Zeilenumbr�che und Einr�ckungen spielen dabei KEINE Rolle (grunds�tzlich in Java)
			
		// Grunds�tzlicher Ablauf:
		
		int b = 10;
		if (b > 10) {								// Zuerst wird die Klammer ausgewertet
													// Ergibt die runde Klammer ein "true", geht es hier weiter
		}
													// Ergibt die runde Klammer ein "false", geht es hier weiter
	}												// In jedem Fall geht es nach dem Block normal weiter

}

// F�r die Pr�fung:
// 1. Auf das if MUSS eine runde Klammer folgen
// 2. Die runde Klammer darf NICHT leer sein und MUSS zu einem boolean evaluiert werden
// 3. Literale booleans, auch "false", sind erlaubt
// 4. Der Block {} nach der runden Klammer kann ausgelassen werden - in diesem Fall gilt
// der konditionale Teil genau bis zum ERSTEN Semikolon nach der runden Klammer
