package schleifen;

public class WhileBeispiel3 {

	// Zweierpotenzen
	// Oft ist es nützlich, noch zusätzliche Variablen zu deklarieren, die bei jedem Wiederholungsschritt
	// geändert werden. Wir schreiben ein Programm, das die ersten 10 Zweierpotenzen ausgibt,
	// also 2^0=1, 2^1=2, 2^2=4, 2^3=8 usw. 
	
	public static void main(String[] args) {
		
		int i=0;
		int zp=1;
		
		while (i<=10) {
			
			System.out.println("2 ^ " + i + " = " + zp);
			i++; 	// i wird um 1 erhöht
			zp *=2; // Kurzform für zp = zp * 2;
			
		}

	}

}
