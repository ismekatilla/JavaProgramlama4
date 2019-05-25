package org.ismek.oop.abstraction;

public class SoyutlamaProgram {

	public static void main(String[] args) {
		
		Ucgen ucgen = new Ucgen();
		ucgen.setTabanUzunluk(5);
		ucgen.setYukseklik(4);
		int alanHesapla = ucgen.alanHesapla();
		System.out.println(alanHesapla);
		
		int cevreHesapla = ucgen.cevreHesapla();
		System.out.println(cevreHesapla);
		
		Kare kare = new Kare();
		kare.setKenarUzunlugu(15);
		int kareCevresi = kare.cevreHesapla();
		System.out.println(kareCevresi);
	}
}
