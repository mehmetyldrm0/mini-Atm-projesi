package csd.AtmApp;

import java.util.Scanner;

public class Login {
	public boolean login(HESAP hesap)
	{
		
		Scanner scanner = new Scanner(System.in);
		String kullan�c�_ad�;
		String parola;
		
		System.out.print("Kullan�c� Ad� : ");
		kullan�c�_ad� = scanner.nextLine();
		System.out.print("Parola : ");
		parola = scanner.nextLine();
		
		if(hesap.getKullan�c�_ad�().equals(kullan�c�_ad�) && hesap.getParola().equals(parola)) {
			
			return true;
		}
		
		else {
			return false;
		}
			
		
	}
}
