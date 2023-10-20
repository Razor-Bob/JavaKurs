package de.galileocomputing.schroedinger.java.kapitel02;

public class EinCharakternamensCaear {

	public static void main(String[] args) {
		
		char buchstabe = 'V';
		int rotation = 6;
		int alphabetStart = 'A';
		buchstabe -= alphabetStart;
		buchstabe += rotation;
		buchstabe %= 26;
		buchstabe += alphabetStart;
		System.out.println(buchstabe);

	}

}
