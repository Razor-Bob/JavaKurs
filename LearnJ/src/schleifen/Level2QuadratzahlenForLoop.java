package schleifen;

public class Level2QuadratzahlenForLoop {
	
		// Schreibe unter Benutzung der for-Loop ein Programm, das die ersten 30 Quadratzahlen ausgibt. Die Ausgabe sollte so aussehen:
		// 1 * 1 = 1;
		// 2 * 2 = 4;
		// 3 * 3 = 9;
		// usw.

	public static void main(String[] args) {
		for (int i=1; i<=30; i++) {
			
			 System.out.print(i);
			 System.out.print(" * ");
			 System.out.print(i);
			 System.out.print(" = ");
			 System.out.println(i*i);
						
		}

		// alleine geschafft :-)
		 
		// // Link zur Aufgabenstellung: https://www.learnj.de/doku.php?id=einstieg:aufgabenfor:start#level_1beginn_nicht_bei_eins
		
	}

}
