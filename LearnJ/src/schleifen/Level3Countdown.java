package schleifen;

public class Level3Countdown {

	// Schreibe ein Programm, das von 10 an rückwärts zählt und folgende Ausgabe hat:
	// 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0!
	
	public static void main(String[] args) {
		int n=10;
		
		while(n>=1) {
			
			System.out.print(n+",");
			
			n=n-1;
			
			
		}
		System.out.print("0!");
	}

	// Lösung der Seite https://www.learnj.de/doku.php?id=einstieg:aufgabenwhile:loesung:level3:start
	// int n = 10;

	// while (n >= 1) {

	// print(n + ", "); 
	// n--;
	
	// }

	// println("0!");
	
}
