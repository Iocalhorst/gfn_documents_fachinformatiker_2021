package chapter_2;

// Die do-while-Schleife ist "fu�gesteuert"
// Dies bedeutet, dass sie mindestens einmal ausgef�hrt wird

public class Do_While {

	public static void main(String[] args) {
		// Fu�gesteuerte Schleife
		// So lange w�rfeln, bis eine 6 kommt:
		int random;
		do {
			random = (int)(Math.random() * 6) + 1;
		} while (random != 6);

		// Das Beispiel w�re auch mit einer normalen while-Schleife l�sbar, aber in dem Fall
		// m�ssten wir zweimal den Code zum Erzeugen der Zufallszahl schreiben
		
		// Bei der fu�gesteuerten Schleife ist das weglassen des Blockes {} NICHT gestattet:
//		do 
//			
//			while (true);					// Kompiliert nicht, weil Block {} fehlt
		
		// Au�erdem MUSS die do-while-Schleife mit einem Semikolon abgeschlossen werden
//		do {
//			
//		} while (true)						// Kompiliert nicht, weil Semikolon fehlt
		
		// Ansonsten gelten die bekannten Regeln der while-Schleife	
		
	}

}

// F�r die Pr�fung:
// 1. do-while folgt den bereits bekannten Regeln von while, mit folgenden Unterschieden:
// 2. Die Schleife wird mindestens einmal ausgef�hrt
// 3. Die Schleife MUSS einen Block {} bekommen
// 4. Die Schleife MUSS mit einem Semikolon hinter der Bedingung abgeschlossen werden
// 5. Auf ein do MUSS auch ein while folgen
