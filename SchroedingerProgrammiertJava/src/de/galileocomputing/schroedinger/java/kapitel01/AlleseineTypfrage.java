package de.galileocomputing.schroedinger.java.kapitel01;
import java.io.IOException;

public class AlleseineTypfrage {

	public static void main(String[] args) throws IOException {

		Long zahl = Long.parseLong(args[0]);
		System.out.println(zahl + " passt in long Wertebereich: " +
		(zahl >= Long.MIN_VALUE && zahl <= Long.MAX_VALUE));
		System.out.println(zahl + " passt in int Wertebereich: " +
		(zahl >= Integer.MIN_VALUE && zahl <= Integer.MAX_VALUE));
		System.out.println(zahl + " passt in short Wertebereich: " +
		(zahl >= Short.MIN_VALUE && zahl <= Short.MAX_VALUE));
		System.out.println(zahl + " passt in byte Wertebereich: " +
		(zahl >= Byte.MIN_VALUE && zahl <= Byte.MAX_VALUE));
	}

}
