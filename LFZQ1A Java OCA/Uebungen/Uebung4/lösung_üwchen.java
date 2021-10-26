package nameCheckerClass;
import java.util.Scanner;

/*Schreibe ein kleines Programm, in dessen Main-Methode der Nutzer aufgefordert wird, seinen Namen über die Kommandozeile einzugeben.

Im Anschluss wird der Nutzer entsprechend mit seinem Namen begrüßt (z.B. "Hallo Fabian!");

Betätigt der Nutzer die Return-Taste, ohne etwas eingegeben zu haben, wird "Hallo Nutzer" angezeigt. */

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bitte gib deinen Namen ein!");
		String username = sc.nextLine();
		if (!wasdrin(username)) {
			username = "Nutzer";
		}
		
		User user = new User(username);
		System.out.println("Hallo "+user.getName()+"!");
		
		sc.close();		
	}
	public static boolean wasdrin(String txt) {
		if (txt=="") return false;
		return true;
		}
	
	}

class User {
	private String name;
	public User (String name){
		this.name=name;		
	}
	
	public String getName(){
		return this.name;
	}
	
}
