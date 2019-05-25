package org.ismek.oop.inheritance;

import org.ismek.dizi.EnumCinsiyet;

public class KalitimProgram {

	public static void main(String[] args) {
		
		Calisan calisan = new Calisan();
		calisan.cinsiyet = EnumCinsiyet.ERKEK;
		calisan.isim = "ALÝ VELÝ";
		calisan.maas = 2340f;
		calisan.yas = 34;
		
		Egitmen egitmen = new Egitmen();
		egitmen.iseGelir();
	}
}
