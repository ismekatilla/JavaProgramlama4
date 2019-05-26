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
	
	// OKUNABÝLÝR
	public String getIsim() {
		if (this.meslek == EnumMeslek.DOKTOR) {
			return "Dr. " + isim;
		} else {
			return "Öðr. " + isim;
		}
	}
	
	// YAZILABÝLÝR
	public void setIsim(String isimDisardanGelen) {
		isim = isimDisardanGelen;
	}
}
