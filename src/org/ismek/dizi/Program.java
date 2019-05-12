package org.ismek.dizi;

public class Program {

	public static void main(String[] args) {
		
		Ogrenci ogr = new Ogrenci();
		ogr.isim = "AHMET";
		ogr.boy = 173;
		ogr.cinsiyet = EnumCinsiyet.ERKEK;

		System.out.println(ogr.yas);
		System.out.println(ogr.mezunMu);
		if (ogr.kilo > 10) {
			System.out.println(ogr.kilo);
		}
		
		//Ogrenci[] ogrenciDizisi = new Ogrenci[5];
	}

}
