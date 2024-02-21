package schleifen;

public class ForBeispiel6 {

	// Wir schreiben den Text "Hallo Welt!" 10-mal untereinander in die Ausgabe. Zählen mit "for"
	
	public static void main(String[] args) {
		
		for (int i=1; i<=10; i++) {
			System.out.println("Hallo Welt (zum " + i + "-ten Mal)!");
		}
		System.out.println("Fertig!");

	}

}
