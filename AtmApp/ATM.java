package csd.AtmApp;

import java.util.Scanner;

public class ATM {
	public void calýs(HESAP hesap)
	{
	   
		Login login = new Login();
		
		Scanner scanner = new Scanner(System.in);
		int count = 3;
		System.out.println("Bankamýza Hoþgeldiniz...");
		
		System.out.println("******************************************");
		System.out.println("Kullanýcý Giriþi");
		System.out.println("******************************************");
		
		while(true) {
			if(login.login(hesap)) {
				System.out.println("Giriþ Baþarýlý...");
				break;
			}
			
			else {
				System.out.println("Giriþ Baþarýsýz...");
				count -= 1;
				System.out.println("Deneme Hakký : " + count);
			}
			
			if(count == 0) {
				System.out.println("Giriþ Hakkýnýz bitti");
				return;
			}
		}
		
		System.out.println("******************************************");
		System.out.println("Ýþlmeler");
		System.out.println("1. Bakiye Görüntüleme");
		System.out.println("2. Para Yatýrma");
		System.out.println("3. Para Çekme");
		System.out.println("Çýkýþ için q'ya basýn");
		System.out.println("******************************************");		
		
		while(true) {
			String islem = scanner.nextLine();
			
			if(islem.equals("q"))
				break;
			
			else if(islem.equals("1"))
				System.out.println("Bakiyeniz : " + hesap.getBakiye());
			else if(islem.equals("2")) {
				System.out.print("Yatýrmak istediðiniz tutar:");
				double paraYatýr = scanner.nextDouble();
				scanner.nextLine();
				hesap.paraYatir(paraYatýr);
				System.out.println("Güncel Bakiye : " + hesap.getBakiye());
				
			}
			
			else if(islem.equals("3")) {
				System.out.println("Çekmek istediðiniz tutar : ");
				double paraCek = scanner.nextDouble();
				scanner.nextLine();
				hesap.paraCek(paraCek);
				
			}
			else {
				System.out.println("Giriþ iþlem");
			}
				
		}
		
	}
}
