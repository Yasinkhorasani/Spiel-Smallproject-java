package com.sannesgames.figuren;

import java.util.Random;

/**
 * Beschreibt die Figuren in diesem Spiel
 * 
 * "Blick aus Fenster"
 * Dieser Charakter har aktuell 112 Lebenspunkte (er kann noch 112 Schadenspunkte einstecken, bis er 
 * nicht mehr mitspielen darf)
 * Im Moment darf er mitspielen
 * Wenn er zuhaut, verursacht er in jeder Kampfrunde 14 Schadenspunkte
 * Er kann seinen aktuellen Status (seine Werte) zusammenfassen in einem String
 * 
 * 
 * Abstraktion:
 * 	Attribute: Lebenspunkte, Schadensrate, unbesiegt(noch dabei/darf mitspielen...)
 *  Methoden: verwunden, verwundet werden, erstellen Statusinfo
 * 
 * Spiel: 
 * 		Lebenspunkte und Schadensrate sollen anfangs für jedes Objekt ausgewürfelt werden	
 * 
 * Bemerkung: Zugriffsmodifier der Attribute anfangs auf private. Das wird später geändert
 * 
 * Konstruktoren: Jede Klasse in Java hat mindestens einen Konstruktor
 * entweder: Kein Konstruktor wird explizit geschrieben: Dann "spendiert" Java einen parameterlosen, public Konstruktor
 * oder: Ein Konstruktor wie explizit geschrieben: Dann existieren nur der oder die selbstgeschriebenen
 * Hier: Ein Konstruktor wird explizit erstellt, damit die Lebenspunkte und die Schadensrate so initialisiert werden können
 * wie es nach der Analyse des Objekts gewünscht ist
 * 
 * @author Alfa
 *
 */
public class Charakter {

// *********************************************************
// **********Attribute
// *********************************************************
	/**
	 * Lebenspunkte werden anfangs ausgewürfel.
	 * Bereich anfangs zwischen 100(incl) und 120(excl)
	 * 100, 101, 102,.....118, 119 
	 * Lebenspunkte ändern sich, wenn der Charakter verwundet wird
	 * Lebenspunkte fallen nicht unter 0
	 */
	private int lebenspunkte;
	
	/**
	 * Die Schadensrate wird anfangs auswürfelt
	 * Bereich zwischen 10 und 20;
	 * 10,11,12...19
	 * Gibt an, wieviele Lebenspunkte einem anderen Charakter abgezogen werden, wenn dieser 
	 * Charakter verwundet
	 * Die Schadensrate ändert sich nicht
	 */
	private int schadensrate;
	
	/**
	 * Gibt an, ob dieses Charakter-Objekt noch mitspielen darf.
	 * Steht auf true, wenn die Lebenspunkte größer sind als 0
	 * Wenn die Lebenspunkte auf 0 fallen, wird unbesiegt auf false gesetzt
	 * Ein neu erstellter Charakter ist immer unbesiegt
	 */
	private boolean unbesiegt = true;
	
// ******************************************************************
// ***** Konstruktoren
// ********************************************************************
	/**
	 * Konstruktoren haben den gleichen Bezeichner, wie die Klasse selbst
	 * Konstruktoren haben keine Rückgabe, auch nicht void
	 * Konstruktoren werden über new aufgerufen
	 * Inhalt des Konstruktors wird pro Objekt genau ein mal durchgeführt!
	 * Konstruktoren werden meist genutzt um Attributen einen Startwert zu geben
	 */
	public Charakter() {
		Random wuerfel = new Random();
		int zufallsZahl = wuerfel.nextInt(20);
		lebenspunkte = 100 + zufallsZahl;
		zufallsZahl = wuerfel.nextInt(10);
		schadensrate = 10 + zufallsZahl;
	}

	
// **********************************************************************
// ****** Methoden
// *******************************************************************
	
	/**
	 * Siegfried verwundet den Drachen
	 * siegfried.verwunden(drache)
	 * Lebenspunkte des Drachen verändern sich
	 * Die Lebenspunkte des Drachen werden um Schadensrate von Siegfried reduziert
	 */
	public void verwunden(Charakter gegner) {
		gegner.verwundetWerden(schadensrate);
	}
	
	/**
	 * Siegfried wird verwundet um 10 Schandenspunkte.
	 * Wenn ein Charakter im Kampf verwundet wird, werden die Schadenspunkte
	 * von seinen Lebenspunkten abgezogen.
	 * Wenn dabei die Lebenspunkte auf unter 0 fallen, werden sie auf 0 gesetzt
	 * Wenn die Lebenspunkte auf 0 fallen oder gesetzt werden, wird unbesiegt auf false gesetzt
	 * @param schaden die Punkte, die von den Lebenspunkten abgezogen werden
	 */
	public void verwundetWerden(int schaden) {
		lebenspunkte = lebenspunkte - schaden;
		if(lebenspunkte <= 0) {
			lebenspunkte = 0;
			unbesiegt = false;
		}
	}
	
	/**
	 * Gibt eine Kombination aus allen Werten als String an
	 * @return Übersicht über den Status des Objekts
	 */
	public String erstellenStatusInfo() {
		String infotext = "";
		infotext = "Dieser Charakter hat aktuell " + lebenspunkte + " Lebenspunkte.\n";
		infotext = infotext + "Er macht in jeder Runde " + schadensrate + " Schaden.\n";
		
//		if(unbesiegt) {
//			infotext = infotext + "Der Charakter ist noch dabei!";
//		}else {
//			infotext = infotext + "Der Charakter ist besiegt, Glückwunsch an den Sieger!";
//		} 
		
		// ?:-Operator Abkürzung für die if/else Verzweigung oben
		infotext = infotext + (unbesiegt ? "Der Charakter ist noch dabei" : "Der Charakter ist besiegt"
				+ ", Glückwunsch an den Sieger"); 
		
		return infotext;
	}
	
	
// *************** Methoden wegen Datenkapselung *****************************
	
	public boolean isUnbesiegt() {
		return unbesiegt; 
	}
	
	 
	
	
}
