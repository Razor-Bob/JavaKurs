package schleifen;

public class ForBeispiel7 {
	
	// Zählen im Dreierschritt

	public static void main(String[] args) {
		
		System.out.println("Dreier-Einmaleins:");
		for (int n = 3; n<=30; n+=3) {
			System.out.print(n + ", ");
		}
		System.out.println(" -> Fertig!");
		
	}

}
