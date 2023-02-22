package csd.AtmApp;

import java.util.Scanner;

public class ATM {
	public void cal�s(HESAP hesap)
	{
	   
		Login login = new Login();
		
		Scanner scanner = new Scanner(System.in);
		int count = 3;
		System.out.println("Bankam�za Ho�geldiniz...");
		
		System.out.println("******************************************");
		System.out.println("Kullan�c� Giri�i");
		System.out.println("******************************************");
		
		while(true) {
			if(login.login(hesap)) {
				System.out.println("Giri� Ba�ar�l�...");
				break;
			}
			
			else {
				System.out.println("Giri� Ba�ar�s�z...");
				count -= 1;
				System.out.println("Deneme Hakk� : " + count);
			}
			
			if(count == 0) {
				System.out.println("Giri� Hakk�n�z bitti");
				return;
			}
		}
		
		System.out.println("******************************************");
		System.out.println("��lmeler");
		System.out.println("1. Bakiye G�r�nt�leme");
		System.out.println("2. Para Yat�rma");
		System.out.println("3. Para �ekme");
		System.out.println("��k�� i�in q'ya bas�n");
		System.out.println("******************************************");		
		
		while(true) {
			String islem = scanner.nextLine();
			
			if(islem.equals("q"))
				break;
			
			else if(islem.equals("1"))
				System.out.println("Bakiyeniz : " + hesap.getBakiye());
			else if(islem.equals("2")) {
				System.out.print("Yat�rmak istedi�iniz tutar:");
				double paraYat�r = scanner.nextDouble();
				scanner.nextLine();
				hesap.paraYatir(paraYat�r);
				System.out.println("G�ncel Bakiye : " + hesap.getBakiye());
				
			}
			
			else if(islem.equals("3")) {
				System.out.println("�ekmek istedi�iniz tutar : ");
				double paraCek = scanner.nextDouble();
				scanner.nextLine();
				hesap.paraCek(paraCek);
				
			}
			else {
				System.out.println("Giri� i�lem");
			}
				
		}
		
	}
}
