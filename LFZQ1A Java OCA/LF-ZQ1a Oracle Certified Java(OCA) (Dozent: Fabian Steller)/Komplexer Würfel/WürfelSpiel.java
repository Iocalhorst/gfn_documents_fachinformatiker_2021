package W�rfelspiel;

public class W�rfelSpiel {

	public static void main(String[] args) {
		// 6-seitigen W�rfel erzeugen
		W�rfel w6 = new W�rfel(6);
		W�rfel w8 = new W�rfel(8);
		W�rfel w12 = new W�rfel(12);
		W�rfel w20 = new W�rfel(20);
		W�rfel w = new W�rfel(11);
		
		System.out.println(w�rfeln(w6, w8, w12, w20));
	}
	
	static int w�rfeln(W�rfel... w�rfels) {
		int gesamt = 0;
		for (W�rfel w : w�rfels) {
			gesamt += w.werfen();
		}
		return gesamt;
	}

}
