package myPackage;

/* Laut Konvention sollen Klassen "gekapselt" sein
 * Das bedeutet, dass sie ihre Instanzvariablen verstecken
 * M�glich wird dies mit dem Keyword "private"
 */

public class Encapsulation {

	public static void main(String[] args) {
		Car car = new Car();
		/* Auf die Eigenschaften des Autos kann nicht zugegriffen werden, weil sie versteckt sind */
//		car.model = "Audi";
		
		/* �ber den Setter kann die Eigenschaft auf einen Wert gesetzt werden */
		car.setModel("Audi");
		
		/* �ber den Getter k�nnen wir die Eigenschaft auslesen */
		System.out.println(car.getModel());

	}

}

class Car {
	
	/* Gekapselte Variablen - sind au�erhalb der Klasse nicht sichtbar */
	private String model;
	private int ps;
	
	/* Um mit den Variablen zu arbeiten, brauchen wir �ffentliche Methoden */
	
	/* Setter */
	public void setModel(String model) {
		this.model = model;
	}
	public void setPs(int ps) {
		this.ps = ps;
	}
	
	
	/* Getter */
	public String getModel() {
		return model;	
	}
	public int getPs() {
		return ps;
	}
	
	/* Setter und Getter erlauben es der Klasse, die Kontrolle dar�ber zu behalten,
	 * was mit ihren Instanzvariablen passiert */
}
