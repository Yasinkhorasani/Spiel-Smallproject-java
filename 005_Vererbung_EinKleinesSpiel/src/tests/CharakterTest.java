package tests;

import com.sannesgames.figuren.Charakter;

public class CharakterTest {

	public static void main(String[] args) {
		Charakter siegfried = new Charakter();
		//new Charakter(): Aufruf des Konstruktors
		Charakter drache = new Charakter();
		
		String siegfriedInfo = siegfried.erstellenStatusInfo();
		String dracheInfo = drache.erstellenStatusInfo();
		
		System.out.println("\nSiegfried:\n" + siegfriedInfo);
		System.out.println("\nDrache:\n" + dracheInfo);
		
		siegfried.verwunden(drache);
		drache.verwunden(siegfried);
		
		System.out.println("\nSiegfried\n" + siegfried.erstellenStatusInfo());
		System.out.println("\nDrache\n" + drache.erstellenStatusInfo());
		
		siegfried.verwunden(drache);
		drache.verwunden(siegfried);
		
		System.out.println("\nSiegfried\n" + siegfried.erstellenStatusInfo());
		System.out.println("\nDrache\n" + drache.erstellenStatusInfo());
		
		siegfried.verwunden(drache);
		drache.verwunden(siegfried);
		
		System.out.println("\nSiegfried\n" + siegfried.erstellenStatusInfo());
		System.out.println("\nDrache\n" + drache.erstellenStatusInfo());
		
		siegfried.verwunden(drache);
		drache.verwunden(siegfried);
		
		System.out.println("\nSiegfried\n" + siegfried.erstellenStatusInfo());
		System.out.println("\nDrache\n" + drache.erstellenStatusInfo());
		
		siegfried.verwunden(drache);
		drache.verwunden(siegfried);
		
		System.out.println("\nSiegfried\n" + siegfried.erstellenStatusInfo());
		System.out.println("\nDrache\n" + drache.erstellenStatusInfo());
		
		siegfried.verwunden(drache);
		drache.verwunden(siegfried);
		
		System.out.println("\nSiegfried\n" + siegfried.erstellenStatusInfo());
		System.out.println("\nDrache\n" + drache.erstellenStatusInfo());
		
		if(siegfried.isUnbesiegt()) {
			siegfried.verwunden(drache);
			//return;
		}else {
			System.out.println("Der Drache hat gewonnen!");
			
		}
		
		System.out.println("\n\tSiegfried\n\t" + siegfried.erstellenStatusInfo());
		System.out.println("\n\tDrache\n\t" + drache.erstellenStatusInfo());
		if(drache.isUnbesiegt()) {
			drache.verwunden(siegfried);
			//return;
		}else {
			System.out.println("Siegfried hat gewonnen!");
		}
		 
		System.out.println("\nSiegfried\n" + siegfried.erstellenStatusInfo());
		System.out.println("\nDrache\n" + drache.erstellenStatusInfo());
		
		if (!!!siegfried.isUnbesiegt() ) {
			
			return;
		}if(!drache.isUnbesiegt()){
			return;
		}
	}
	
}
// KISS
// DRY


//Übung: In der Test-Klasse(oder in einer zweiten Test-Klasse) eine Schleife und/oder Methode erstellen:
//Es soll so lange gekämpft werden, bis ein Charakter besiegt ist
//Wenn Charakter besiegt ist, darf er nicht mehr verwunden
//
//Organistation eines Kampfs: Kampf-Klasse/Kampfrunden-Klasse/Turnier-Klasse erstellen
//Der Sieger soll in der Konsole ausgeben werde
//Charakter-Klasse soll NICHT geändert werden

//Klasse im Projekt, die die main-Methode enthält: organisiert den Ablauf des Spiels

//Kampf von 3 Charaker-Objekten: Regeln selber aufstellen: Regeln im Dokumentationskommentar erklären
//Kampf von sovielen Charakter-Objekten, wie der Benutzer möchte(SCHWIERIG!)

