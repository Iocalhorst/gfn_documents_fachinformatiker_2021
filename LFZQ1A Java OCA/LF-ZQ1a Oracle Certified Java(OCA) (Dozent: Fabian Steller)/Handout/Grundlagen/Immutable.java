package myPackage;

import java.util.ArrayList;

/* Immutability bedeutet unver�nderbarkeit - wir verwenden dies f�r Objekte, die ihren Zustand nicht
 * mehr ver�ndern k�nnen nachdem sie erzeugt wurden */

public class Immutable {

	public static void main(String[] args) {
		
		/* Strings in Java sind immutable */
		String a = "Unver�nderbar";
		a.toUpperCase();					/* Wandelt den String in Gro�buchstaben um */
		
		System.out.println(a);				/* Unver�nderbar - der String wurde nicht ver�ndert */
		
		a = a.toUpperCase();				/* R�ckgabewert der Methode wird aufgefangen */
		System.out.println(a);				/* UNVER�NDERBAR */	
		
		/* Die Methode toUpperCase erzeugt einen neuen String, der die gew�nschte Ver�nderung widergibt */
		
		/* Mutable Objects k�nnen direkt ver�ndert werden */
		
		/* Eine ArrayList ist eine Art mutable Array */
		ArrayList<String> words = new ArrayList<>();
		
		/* ArrayLists sind normalerweise nach ihrer Erzeugung zun�chst leer */
		System.out.println(words);
		
		/* Zuf�gen von Elementen */
		words.add("Salat");
		words.add("Kartoffel");
		words.add("Bohne");
		
		System.out.println(words);		/* [Salat, Kartoffel, Bohne] */
		
		/* Da die ArrayList mutable ist, konnten wir ihre Form �ber einen einfachen Methodenaufruf ver�ndern */
		
		/* Merke: eine Variable, welche auf ein immutable Object (z.B. String) zeigt, wird sich
		 * nicht ver�ndern, sofern sie nicht NEU ZUGEWIESEN wird */
		
		Food food = new Food();
		System.out.println(food.getCalories());		/* 0 */
		food.setCalories(700);
		System.out.println(food.getCalories());		/* 700 - Zustand des Objekts wurde ge�ndert */
		
		Drink drink = new Drink(100, "Cola");
		drink.mix("Spezi");							/* Object wird nicht ver�ndert */
		System.out.println(drink.getName());		/* Cola */
	}

}


/* Beispiel f�r eine mutable Class */

class Food {
	/* Instanzvariablen */
	private int calories;
	private String name;
	
	
	public int getCalories() {
		return calories;
	}
	/* �ber den Setter wird der Zustand eines Objektes ver�ndert - es ist also nicht immutable */
	public void setCalories(int calories) {
		this.calories = calories;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

/* Beispiel f�r eine immutable Class */
/* Darf keine Methoden haben welche Instanzvariablen ver�ndern (setter oder �nhliches) */

class Drink {
	
	private int calories;
	private String name;
	
	public int getCalories() {
		return calories;
	}

	public String getName() {
		return name;
	}
	/* Immutable classes ben�tigen in der Regel Konstruktoren, weil ihre Instanzvariablen anders 
	 * nicht gesetzt werden k�nnen, da keine Setter existieren */
	
	public Drink (int calories, String name) {
		this.calories 	= calories;
		this.name 		= name;
	}
	
	/* Diese Methode ver�ndert nicht die Instanz, mit der sie verwendet wird, sondern erzeugt
	 * eine neue, die von der alten Gebrauch macht (die Methode ist etwas unsinnig, nicht verwirren lassen) */
	public Drink mix(String name) {
		return new Drink(this.calories, name);
	}
}
