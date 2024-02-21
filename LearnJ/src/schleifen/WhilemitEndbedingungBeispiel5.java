package schleifen;

public class WhilemitEndbedingungBeispiel5 {

	// Man kann die while-loop auch so schreiben, dass die Bedingung zum Fortfahren jeweils erst am 
	// Ende jedes Wiederholungsschrittes überprüft wird.
	// while-loop mit Endbedingung (do...while-loop)
	// Wir zählen von 1 bis 10
	
	public static void main(String[] args) {
		
		int i=0;	
		
		do {
			
			System.out.println(i);
			i++;
			
		} while (i<=10);	

	}

}
