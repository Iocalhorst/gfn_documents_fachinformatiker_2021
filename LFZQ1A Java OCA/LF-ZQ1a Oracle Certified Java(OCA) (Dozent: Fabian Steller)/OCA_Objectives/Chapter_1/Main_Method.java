package chapter_1;

// Die main-methode ist der Startpunkt f�r ein jedes Java-Programm
// Sie wird aufgerufen von der JVM (Java Virtual Machine)
// Dies funktioniert nur, wenn die Methode bestimmten Regeln gehorcht 
// Diese speziellen Regeln werden vom Kompiler nicht durchgesetzt
// Daher kann es "richtige" und "falsche" main-methode geben

public class Main_Method {

	// So sieht die "richtige" main aus 
	public static void main(String[] args) {
		System.out.println(args[0]);
		
	}
	
	// Das aussehen kann sich leicht ver�ndern - die folgenden sind alle "richtige":
//	static public void main(String[] args) {
//		
//
//	}	
//	public static void main(String[] params) {
//		
//
//	}	
//	public static final void main(String[] params) {
//	
//
//}
//	public static final void main(String... params) {		Varargs-Parameter(steht f�r 0 bis beliebig viele Strings)
//	
//
//}
	
	// Folgendes sind Beispiele f�r "falsche" main-methoden (keine Kompilierfehler):
//	static void main(String[] params) {						ist nicht public
//	
//
//}
	
//	public void main(String[] params) {						ist nicht static
//	
//
//}
	
//	public static int main(String[] params) {				hat falschen R�ckgabetyp
//	
//
//}
	
//	public static void main(String params) {				hat falschen Parametertyp
//	
//
//}
	
//	public static void main(String[] params, String[] params2) {	hat zu viele Parameter
//	
//
//}
	
//	public static void main() {										kein Parameter
//	
//	}
	
}

// F�r die Pr�fung:
// 1. Die main-Methode wird von der JVM aufgerufen
// 2. Die main-Methode muss public sein
// 3. Die main-Methode muss static sein
// 4. Die main-Methode muss void als R�ckgabetyp angeben
// 5. Die main-Methode muss einen Parameter vom Typ String-Array oder String Varargs haben
// 6. "Falsche" main-Methoden sind keine Kompilierfehler
// 7. Eine Anwendung darf beliebig viele main-Methoden haben
// 8. Die main-Methode kann �berladen werden (mit "falschen" main-Methoden)
// 9. Ausf�hren einer Klasse ohne "richtige" main-Methode f�hrt zu einer Fehlerausgabe
// 10. Der Befehl "javac" ruft in der Kommandozeile den Kompiler auf
// 11. Der Kompiler erwartet eine .java-Datei (mit Dateiendung angeben)
// 12. Der Befehl "java" startet die JVM �ber die Kommandozeile
// 13. Der JVM muss eine Klasse mit main-Methode genannt werden (ohne Dateiendung)
// 14. Argumente werden der main-Methode hinter dem Klassennamen ohne Kommata durch Leerstellen getrennt �bergeben
// 15. Der main-Methode m�ssen keine Argumente �bergeben werden
// 16. Die main-Methode bekommt, wenn keine Argumente �bergeben werden, ein LEERES Array - immer
// 17. Die main-Methode darf final sein