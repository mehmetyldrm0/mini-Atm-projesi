package csd.AtmApp;

public class AtmTest {
	
	public static void main(String [] args) {
		ATM atm = new ATM();
		
		HESAP hesap = new HESAP("MehmetY�ld�r�m", "123456", 3000);
		atm.cal�s(hesap);
		
		System.out.println("Programdan ��k�� Yap�l�yor");
	
	}
	
	
	
}
