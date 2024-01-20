package schleifen;

public class Level2Quadratzahlen {
	
	// Schreibe ein Programm, das die ersten 30 Quadratzahlen ausgibt. Die Ausgabe sollte so aussehen:
	// 1 * 1 = 1
	// 2 * 2 = 4
	// 3 * 3 = 9
	// usw.

	public static void main(String[] args) {
		int n=1;
		
		while(n<=30) {
			
			 System.out.print(n);
			 System.out.print(" * ");
			 System.out.print(n);
			 System.out.print(" = ");
			 System.out.println(n*n);
			
			n=n+1;
		
		}

		// alleine geschafft :-)
		 
		// Lösung der Seite
		 
		// int n = 1;
		// while (n <= 30) {
		// 		println(n + " * " + n + " = " + (n * n)); 
		//    	n++;
		// }
		 
	}

  }
