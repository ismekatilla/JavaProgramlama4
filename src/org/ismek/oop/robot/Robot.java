package org.ismek.oop.robot;

public class Robot {

	String isim;
	String renk;
	int boy;
	int konum;
	private int kilo;
	
	// Okumak i�in(Okunabilir)
	public int getKilo() {
		return kilo;
	}
	
	// Atama yapmak i�in(Yaz�labilir)
	public void setKilo(int kilo) {
		this.kilo = kilo;
	}
	
	void konferansVer(String konusmaMetni) {
		System.out.println(konusmaMetni);
	}
	
	void adimAt(EnumYon yon, int adimSayisi) {
		if (EnumYon.ILERI.equals(yon)) {
			konum += adimSayisi;
		} else {
			konum -= adimSayisi;
		}
	}
	
	void kendiniTanit() {
		System.out.printf("�sim = %s, rengim = %s, boyum = %d", isim, renk, boy);
	}
	
	int neredesin() {
		return konum;
	}
}