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


