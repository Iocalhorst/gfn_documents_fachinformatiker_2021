package myPackage;

public class Loop {

	public static void main(String[] args) {
		
		/* Einfache while-Schleife */
		/* Schleife ist immer true und l�uft so lange, bis sie manuell abgebrochen wird */
		int a = 0;
		while (true) {
			if (a > 100) {
				/* break bricht die Schleife sofort ab - springe zur Zeile 18 */
				break;
			}
			System.out.println(a);
			a++;
		}
		
		/* Schleife mit dynamischer Bedingung - identisch zu der oberen Schleife */
		a = 0;
		while (a < 100) {
			System.out.println(a);
			a++;
		}
		
		/* Schleife mit continue - springt zur n�chsten Iteration */
		a = 0;
		while (a < 100) {
			a++;
			if (a % 2 != 0) {
				/* continue springt zur Zeile 29 zur�ck - Schleife druckt nur die geraden as */
				continue;
			}
			System.out.println(a);
		}
		
		
		/* Fu�gesteuerte Schleife - wird mindestens einmal ausgef�hrt */
		a= 101;
		do {
			/* druckt einmal die 101 aus */
			System.out.println(a);
		} while (a < 100);
		
		
		/* 
		 Z�hlschleife - l�uft so lange wie die Bedingung true ergibt  
		 Das erste Statement deklariert eine Z�hlvariable
		 Das zweite Statement ist die Bedingung (muss boolean ergeben)
		 Das letzte Statement wird am ENDE jeder Iteration ausgef�hrt und ver�ndert die Z�hlvariable 
		 */
		for (int i = 0; i < 100; i++) {
			System.out.println(i);
		}

		
		/* for-each-Schleife - geht �ber jedes Element eines Arrays einmal */
		int[] numbers = {1, 3, 5, 7, 9};	
		for (int e : numbers) {
			/* Drucke jede Ziffer genau einmal aus */
			System.out.println(e);
		}
		
	}

}
