package csd.AtmApp;

import java.util.Scanner;

public class Login {
	public boolean login(HESAP hesap)
	{
		
		Scanner scanner = new Scanner(System.in);
		String kullanýcý_adý;
		String parola;
		
		System.out.print("Kullanýcý Adý : ");
		kullanýcý_adý = scanner.nextLine();
		System.out.print("Parola : ");
		parola = scanner.nextLine();
		
		if(hesap.getKullanýcý_adý().equals(kullanýcý_adý) && hesap.getParola().equals(parola)) {
			
			return true;
		}
		
		else {
			return false;
		}
			
		
	}
}
