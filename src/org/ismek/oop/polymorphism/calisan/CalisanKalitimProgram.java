package org.ismek.oop.polymorphism.calisan;

public class CalisanKalitimProgram {

	public static void main(String[] args) {
		
		Egitmen egitmen = new Egitmen();
		egitmen.isim = "ALÝ VELÝ";
		
		Calisan egitmenCalisan = egitmen;
		egitmenCalisan.maasHesaplaSoyut();
		
		System.out.println(egitmenCalisan.maas);
		System.out.println(egitmen.maas);
		
		
		
		GuvenlikGorevlisi guvenlikGorevlisi = new GuvenlikGorevlisi();
		guvenlikGorevlisi.isim = "AHMET YASÝN";
		
		Calisan guvenlikGorevlisiCalisan = guvenlikGorevlisi;
		guvenlikGorevlisiCalisan.maasHesaplaSoyut();
		
		System.out.println(guvenlikGorevlisiCalisan.maas);
		System.out.println(guvenlikGorevlisi.maas);
		
		
		
		maasHesaplaVeYazdir(egitmen);
		maasHesaplaVeYazdir(guvenlikGorevlisi);
	}
	
	public static void maasHesaplaVeYazdir(Calisan calisan) {
		calisan.maasHesaplaSoyut();
		System.out.println(calisan.maas);
	}
}