package schleifen;

public class ForBeispiel8 {

	// Berechnung von 8! (Fakultät von 8)
	
	public static void main(String[] args) {
		int zahl=8;
		int fakultät=1;
		
		for (int i=1; i<=zahl; i++) {
			fakultät *=i;
		}
		System.out.println(zahl + "! = " + fakultät);
	}

}
