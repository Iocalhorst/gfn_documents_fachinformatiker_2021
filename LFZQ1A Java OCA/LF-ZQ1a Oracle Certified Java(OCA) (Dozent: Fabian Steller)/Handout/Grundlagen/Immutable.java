package myPackage;

import java.util.ArrayList;

/* Immutability bedeutet unveränderbarkeit - wir verwenden dies für Objekte, die ihren Zustand nicht
 * mehr verändern können nachdem sie erzeugt wurden */

public class Immutable {

	public static void main(String[] args) {
		
		/* Strings in Java sind immutable */
		String a = "Unveränderbar";
		a.toUpperCase();					/* Wandelt den String in Großbuchstaben um */
		
		System.out.println(a);				/* Unveränderbar - der String wurde nicht verändert */
		
		a = a.toUpperCase();				/* Rückgabewert der Methode wird aufgefangen */
		System.out.println(a);				/* UNVERÄNDERBAR */	
		
		/* Die Methode toUpperCase erzeugt einen neuen String, der die gewünschte Veränderung widergibt */
		
		/* Mutable Objects können direkt verändert werden */
		
		/* Eine ArrayList ist eine Art mutable Array */
		ArrayList<String> words = new ArrayList<>();
		
		/* ArrayLists sind normalerweise nach ihrer Erzeugung zunächst leer */
		System.out.println(words);
		
		/* Zufügen von Elementen */
		words.add("Salat");
		words.add("Kartoffel");
		words.add("Bohne");
		
		System.out.println(words);		/* [Salat, Kartoffel, Bohne] */
		
		/* Da die ArrayList mutable ist, konnten wir ihre Form über einen einfachen Methodenaufruf verändern */
		
		/* Merke: eine Variable, welche auf ein immutable Object (z.B. String) zeigt, wird sich
		 * nicht verändern, sofern sie nicht NEU ZUGEWIESEN wird */
		
		Food food = new Food();
		System.out.println(food.getCalories());		/* 0 */
		food.setCalories(700);
		System.out.println(food.getCalories());		/* 700 - Zustand des Objekts wurde geändert */
		
		Drink drink = new Drink(100, "Cola");
		drink.mix("Spezi");							/* Object wird nicht verändert */
		System.out.println(drink.getName());		/* Cola */
	}

}


/* Beispiel für eine mutable Class */

class Food {
	/* Instanzvariablen */
	private int calories;
	private String name;
	
	
	public int getCalories() {
		return calories;
	}
	/* Über den Setter wird der Zustand eines Objektes verändert - es ist also nicht immutable */
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

/* Beispiel für eine immutable Class */
/* Darf keine Methoden haben welche Instanzvariablen verändern (setter oder änhliches) */

class Drink {
	
	private int calories;
	private String name;
	
	public int getCalories() {
		return calories;
	}

	public String getName() {
		return name;
	}
	/* Immutable classes benötigen in der Regel Konstruktoren, weil ihre Instanzvariablen anders 
	 * nicht gesetzt werden können, da keine Setter existieren */
	
	public Drink (int calories, String name) {
		this.calories 	= calories;
		this.name 		= name;
	}
	
	/* Diese Methode verändert nicht die Instanz, mit der sie verwendet wird, sondern erzeugt
	 * eine neue, die von der alten Gebrauch macht (die Methode ist etwas unsinnig, nicht verwirren lassen) */
	public Drink mix(String name) {
		return new Drink(this.calories, name);
	}
}
