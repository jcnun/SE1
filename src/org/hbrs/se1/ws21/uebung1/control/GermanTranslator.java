package org.hbrs.se1.ws21.uebung1.control;

import java.util.*;

public class GermanTranslator implements Translator {

	public String date = "Okt/2021"; // Default-Wert

	private Map<Integer, String> numbers;

	public GermanTranslator() {
		numbers = new HashMap<Integer, String>();
		numbers.put(1, "eins");
		numbers.put(2, "zwei");
		numbers.put(8, "acht");
	}

	/**
	 * Methode zur Übersetzung einer Zahl in eine String-Repraesentation
	 */
	public String translateNumber( int number ) {
		// [ihr Source Code aus Übung 1-2]
		String s = this.numbers.getOrDefault(number, "gibts nicht");
		return s;
	}
		
	/**
	 * Objektmethode der Klasse GermanTranslator zur Ausgabe einer Info.
	 */
	public void printInfo(){
		System.out.println( "GermanTranslator v1.9, erzeugt am " + this.date );
	}

	/**
	 * Setzen des Datums, wann der Uebersetzer erzeugt wurde (Format: Monat/Jahr (Beispiel: Okt/2021))
	 * Das Datum sollte system-intern gesetzt werden und nicht von externen View-Klassen
	 */
	public void setDate( String date ) {
		this.date = date;
	}

}
