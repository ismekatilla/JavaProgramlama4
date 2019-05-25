package org.ismek.oop.inheritance.calisan;

import org.ismek.dizi.EnumCinsiyet;

public class CalisanKalitimProgram {

	public static void main(String[] args) {
		
		Calisan calisan = new Calisan();
		calisan.cinsiyet = EnumCinsiyet.ERKEK;
		calisan.setIsim("ALÝ VELÝ");
		calisan.maas = 2340f;
		calisan.yas = 34;
		calisan.meslek = EnumMeslek.DOKTOR;
		
		Egitmen egitmen = new Egitmen();
		egitmen.iseGelir();
		
		System.out.println(calisan.getIsim());
	}
}
