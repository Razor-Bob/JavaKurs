package schleifen;

public class Level4FibonacciZahlen {

	// Schreibe ein Programm, das die ersten zehn Fibonacci-Zahlen ausgibt:
	// 1, 1, 2, 3, 5, 8, 13, 21, 34, ...
	
	public static void main(String[] args) {
		int x=1;
		int y=0;
		
		int z=1;
		
			while (z<=10) {
				
				int neu =x+y;
				
				System.out.print(neu + ", ");
				
				x=y;
				y=neu;
				
			z++;
			
			}
		// Zur Hälfte alleine geschafft :-)
			
		// Lösung der Seite https://www.learnj.de/doku.php?id=einstieg:aufgabenwhile:loesung:level4:start
			
		// int vorletzte = 1;
		// int letzte = 0;

		//	int zähler = 1;

		//	while (zähler <= 10) {
		//	   int neue = letzte + vorletzte;
		//	   print(neue + ", ");
			   
		//	   vorletzte = letzte;
		//	   letzte = neue;
			   
		//	   zähler++;
		//	}
	
	
		// Die elegantere Lösung
			
		// int n = 1;
		//	int p = 1;
		//	while (n + p < 100) {
		//	   print(n + "," + " " + p + "," + " ");
		//	   n = n + p;
		//	   p = p + n;
		//	}
	}

}
