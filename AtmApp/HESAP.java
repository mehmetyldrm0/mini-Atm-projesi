package csd.AtmApp;

public class HESAP {
	private String kullanýcý_adý;
	private String parola;
	private double bakiye;
	
	public HESAP(String kullanýcý_adý, String parola, int bakiye) {
		
		this.kullanýcý_adý = kullanýcý_adý;
		this.parola = parola;
		this.bakiye = bakiye;
	}

	public String getKullanýcý_adý() {
		return kullanýcý_adý;
	}

	public void setKullanýcý_adý(String kullanýcý_adý) {
		this.kullanýcý_adý = kullanýcý_adý;
	}

	public String getParola() {
		return parola;
	}

	public void setParola(String parola) {
		this.parola = parola;
	}

	public double getBakiye() {
		return bakiye;
	}

	public void setBakiye(double bakiye) {
		this.bakiye = bakiye;
	}
	
	public void paraYatir(double tutar)
	{
		bakiye += tutar;
	}
	
	public void paraCek(double tutar)
	{
		if(bakiye - tutar < 0)
			System.out.println("Bakiyeniz yeterli deðil. Bakiye :" + bakiye);
		else {
			bakiye -= tutar;
			System.out.println("Yeni Bakiyeniz : " + bakiye);
		}
	}
	
}
