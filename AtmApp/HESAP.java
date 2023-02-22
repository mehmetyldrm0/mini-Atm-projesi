package csd.AtmApp;

public class HESAP {
	private String kullan�c�_ad�;
	private String parola;
	private double bakiye;
	
	public HESAP(String kullan�c�_ad�, String parola, int bakiye) {
		
		this.kullan�c�_ad� = kullan�c�_ad�;
		this.parola = parola;
		this.bakiye = bakiye;
	}

	public String getKullan�c�_ad�() {
		return kullan�c�_ad�;
	}

	public void setKullan�c�_ad�(String kullan�c�_ad�) {
		this.kullan�c�_ad� = kullan�c�_ad�;
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
			System.out.println("Bakiyeniz yeterli de�il. Bakiye :" + bakiye);
		else {
			bakiye -= tutar;
			System.out.println("Yeni Bakiyeniz : " + bakiye);
		}
	}
	
}
