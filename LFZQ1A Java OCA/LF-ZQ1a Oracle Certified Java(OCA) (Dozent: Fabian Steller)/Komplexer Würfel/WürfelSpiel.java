package Würfelspiel;

public class WürfelSpiel {

	public static void main(String[] args) {
		// 6-seitigen Würfel erzeugen
		Würfel w6 = new Würfel(6);
		Würfel w8 = new Würfel(8);
		Würfel w12 = new Würfel(12);
		Würfel w20 = new Würfel(20);
		Würfel w = new Würfel(11);
		
		System.out.println(würfeln(w6, w8, w12, w20));
	}
	
	static int würfeln(Würfel... würfels) {
		int gesamt = 0;
		for (Würfel w : würfels) {
			gesamt += w.werfen();
		}
		return gesamt;
	}

}
