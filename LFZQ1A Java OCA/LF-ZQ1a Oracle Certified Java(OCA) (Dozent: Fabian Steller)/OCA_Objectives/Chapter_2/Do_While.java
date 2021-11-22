package chapter_2;

// Die do-while-Schleife ist "fußgesteuert"
// Dies bedeutet, dass sie mindestens einmal ausgeführt wird

public class Do_While {

	public static void main(String[] args) {
		// Fußgesteuerte Schleife
		// So lange würfeln, bis eine 6 kommt:
		int random;
		do {
			random = (int)(Math.random() * 6) + 1;
		} while (random != 6);

		// Das Beispiel wäre auch mit einer normalen while-Schleife lösbar, aber in dem Fall
		// müssten wir zweimal den Code zum Erzeugen der Zufallszahl schreiben
		
		// Bei der fußgesteuerten Schleife ist das weglassen des Blockes {} NICHT gestattet:
//		do 
//			
//			while (true);					// Kompiliert nicht, weil Block {} fehlt
		
		// Außerdem MUSS die do-while-Schleife mit einem Semikolon abgeschlossen werden
//		do {
//			
//		} while (true)						// Kompiliert nicht, weil Semikolon fehlt
		
		// Ansonsten gelten die bekannten Regeln der while-Schleife	
		
	}

}

// Für die Prüfung:
// 1. do-while folgt den bereits bekannten Regeln von while, mit folgenden Unterschieden:
// 2. Die Schleife wird mindestens einmal ausgeführt
// 3. Die Schleife MUSS einen Block {} bekommen
// 4. Die Schleife MUSS mit einem Semikolon hinter der Bedingung abgeschlossen werden
// 5. Auf ein do MUSS auch ein while folgen
