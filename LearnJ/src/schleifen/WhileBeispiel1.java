package schleifen;

public class WhileBeispiel1 {

	// Wir schreiben den Text "Hallo Welt!" 10-mal untereinander in die Ausgabe.
	
	public static void main(String[] args) {
		int n=1; // Die Variable n benutzen wir, um zu zählen, wie oft wir schon wiederholt haben.
				  //	n == 1 bedeutet, dass wir im 1. Wiederholungsdurchgang sind.
		
		while (n<=8) {
		
			System.out.println("Hallo Ramón");
			n=n+1;
				
	// Die Anweisung while(n < = 10) bedeutet: Wiederhole die Anweisungen zwischen den nachfolgenden {},
	// solange n kleiner oder gleich 10 ist.
	// Damit die Anweisungen nicht unendlich oft wiederholt werden, müssen wir dafür sorgen,
	// dass die Aussage n < = 10 irgendwann nicht mehr zutrifft.
	// Deshalb erhöhen wir am Ende der des wiederholten Blocks n um 1, indem wir schreiben: n = n + 1;.
		
	}
		
		System.out.println("Fertig!");
		
	// Sobald die Bedingung hinter while nicht mehr zutrifft, werden die Anweisungen in {} übersprungen
	// und der Computer fährt mit den Anweisungen fort, die hinter den {} stehen.
	// In diesem Fall gibt er "Fertig!" aus.	
		
	}

}
