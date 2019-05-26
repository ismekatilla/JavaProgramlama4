package org.ismek.oop.inheritance.calisan;

import org.ismek.dizi.EnumCinsiyet;

public class Calisan {

	private String isim;
	int yas;
	float maas;
	EnumCinsiyet cinsiyet;
	EnumMeslek meslek;
	
	void iseGelir() {
		
	}
	
	// OKUNAB�L�R
	public String getIsim() {
		if (this.meslek == EnumMeslek.DOKTOR) {
			return "Dr. " + isim;
		} else {
			return "��r. " + isim;
		}
	}
	
	// YAZILAB�L�R
	public void setIsim(String isimDisardanGelen) {
		isim = isimDisardanGelen;
	}
}
