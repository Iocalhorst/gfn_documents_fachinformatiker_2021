package chapter_1;

// Literale sind buchst�bliche Darstellungen eines Wertes
// Nur primitive Werte und Strings, sowie in gewisser Weise Arrays (z.B. {1, 3, 5})
// haben Literale
// Literale Zahlen k�nnen auf unterschiedliche Art und Weise dargestellt werden

public class Literal_Numbers {

	public static void main(String[] args) {
		// Literale Ganzzahlen sind per Definition vom Datentyp int
		takeNumber(10);
//		takeNumber(4000000000);						// Ung�ltiger Literal! 4 Milliarden ist kein int 
		takeNumber(4000000000L);					// So ist die Zahl g�ltig - das L kann auch klein sein, ist aber schwerer lesbar
		
		// Literale Flie�kommazahlen sind per Definition vom Typ double
		takeNumber(10.0);							// Argument war ein double
		takeNumber(10.0F);							// Argument war ein float - das F muss mit
		
		// Als Trennzeichen werden bei literalen Zahlen Unterstriche akzeptiert - sonst nichts
		int a = 1_000_000;
		// Unterstriche d�rfen sich NICHT am Anfang oder Ende der Zahl befinden
//		int b = _1000;								// Kompiliert nicht, weil Unterstrich am Anfang	
//		int c = 1000_;								// Kompiliert nicht, weil Unterstruch am Ende
		// Unterstriche d�rfen bei Kommazahlen nicht neben dem Punkt liegen
//		double d = 100._000;						// Kompiliert nicht, weil Unterstrich neben Punkt
		// Davon abgesehen m�ssen die Unterstriche keiner Struktur folgen
		int e = 1___0;								// Ok!
		int f = 1_0_0_0_0_0;						// Ok!
		// Niemals Kommazahlen (floating point numbers) mit einem tats�chlichen Komma schreiben!
//		double g = 100,00;							// Kompiliert nicht, weil Komma nicht als Punkt gilt
		
		// Literale Zahlen d�rfen auch im Bin�rsystem geschrieben werden - gekennzeichnet mit 0b
		int h = 0b0110;								// Bin�re 6 - f�hrende 0 wird ignoriert
		int i = -0b0110;							// Bei Bin�rzahlen bleibt das Vorzeichen ganz normal
		System.out.println(h);						// 6
		
		// Bin�rzahl darf nur 0 und 1 enthalten!
//		int j = 0b0012;								// Kompiliert nicht, weil es keine Bin�rzahl ist
		
		// Auch Darstellung als Hexadezimalzahl ist erlaubt - gekennzeichnet mit 0x
		// Hexadezimale Zahlen bestehen aus den Ziffern 0-9 sowie den Buchstaben a-f
		int k = 0Xff12;			
//		int l = 0x77FG;								// Kompiliert nicht, weil es keine Hexadezimalzahl ist
		
		// Auch Oktalzahlen sind erlaubt - gekennzeichnet nur mit einer f�hrenden 0
		// Oktalzahlen bestehen aus den Ziffern 0-7
		int m = 017; 
//		int n = 082;								// Kompiliert nicht, weil es keine Oktalzahl ist
		
	}
	
	// Diese �berladungen dienen lediglich der Beweisf�hrung
	public static void takeNumber(byte b) {
		System.out.println("Argument war ein byte");
	}
	public static void takeNumber(int b) {
		System.out.println("Argument war ein int");
	}
	public static void takeNumber(long b) {
		System.out.println("Argument war ein long");
	}
	
	public static void takeNumber(double b) {
		System.out.println("Argument war ein double");
	}
	public static void takeNumber(float b) {
		System.out.println("Argument war ein float");
	}

}

// F�r die Pr�fung:
// 1. Literale Ganzzahlen sind ints
// 2. Literale Kommazahlen sind doubles
// 3. Soll eine Zahl als long designiert werden, bekommt sie ein L am Ende
// 4. Soll eine Zahl als float desiginiert werden, bekommt sie ein F am Ende
// 5. Bin�rzahlen werden mit 0B am Anfang gekennzeichnet und d�rfen nur die Ziffern 0 oder 1 enthalten
// 6. Hexadezimalzahlen werden mit 0X am Anfang gekennzeichnet und d�rfen alle Ziffern sowie die Buchstaben a - f enthalten
// 7. Oktalzahlen werden mit 0 am Anfang gekennzeichnet und d�rfen nur die Ziffern 0-7 enthalten
// 8. Alle Zahlen d�rfen Unterstriche als Trennzeichen verwenden
// 9. Unterstriche am Anfang oder am Ende einer Zahl oder neben einem Punkt sind nicht gestattet
// 10.Enthalten Zahlen Buchstaben (z.B. L f�r long oder F in einer Hexzahl), k�nnen die Buchstaben gro� oder klein geschrieben werden