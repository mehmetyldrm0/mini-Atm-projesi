package csd.AtmApp;

public class AtmTest {
	
	public static void main(String [] args) {
		ATM atm = new ATM();
		
		HESAP hesap = new HESAP("MehmetYýldýrým", "123456", 3000);
		atm.calýs(hesap);
		
		System.out.println("Programdan Çýkýþ Yapýlýyor");
	
	}
	
	
	
}
