package myPackage;

public class Methods {

	public static void main(String[] args) {
		giveInt(); 				// R�ckgabewert der Methode verf�llt
//		String a = giveInt(); 	// Darf einem String keinen int zuweisen
		int b = giveInt();		// Weist der Variable b den Wert 0 zu
//		b = giveInt(10);		// Darf kein Argument �bergeben
		
//		takeInt("50");			// Darf keinen String �bergeben, weil ein int erwartet wird		
		takeInt(50);			// Ok, int wird �bergeben
//		takeInt();				// Muss ein int Argument �bergeben
		
		int n = 100;
		takeInt(n);
		System.out.println(n);	// 100 - Variable n wird nicht neu zugewiesen
		
		takeInt(giveInt());		// Eine Methode mit R�ckgabewert kann als Argument gelten
		
		// Teilt 10 durch 5, weil die Argumente streng der Reihenfolge nach zugewiesen werden */
		System.out.println(takeIntsAndGiveInt(10, 5));
		}
	
	/* Methodendeklarationen */
	
	/* Methode gibt einen int zur�ck und akzeptiert keine Argumente */
	static int giveInt() {
		return 0;	
	}
	
	/* Methode gibt nichts zur�ck, aber akzeptiert einen int als Argument */
	static void takeInt(int number) {
		number = 25;
	}
	
	/* Methode nimmt zwei ints als Argumente entgegen und gibt einen int zur�ck */
	static int takeIntsAndGiveInt(int number1, int number2) {
		return number1 / number2;
	}
	
	/* In diesem Beispiel sind alle Methoden statisch, wiel sonst Objekte gebildet werden m�ssten */
	
	
}
