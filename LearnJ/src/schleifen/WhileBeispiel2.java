package schleifen;

public class WhileBeispiel2 {

	public static void main(String[] args) {
		int z=1;
		
		while (z<=12) {
			
			System.out.print("Das ist der ");
			System.out.print(z);
			System.out.println("-te Wiederholungsschritt.");
			z++; // z wird um 1 erhöht
			
		}
// Die drei print-Anweisungen kann man übrigens auch zu einer einzigen Anweisung zusammenfassen:
// println("Das ist der " + z + "-te Wiederholungsschritt");
		
		
	}

}
