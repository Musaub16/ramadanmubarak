package com.ramadanmubarak;

public class Prayer {
	
	double fazar = 5.5;

	public static void main(String[] args) {
		
		Prayer prayer = new Prayer();
		
		prayer.prayerTime();

	}
	
	public void prayerTime() {
	
		if(fazar == 5.5) {
			System.out.println("Ready for Fazar salat...");
		}
	}

}
