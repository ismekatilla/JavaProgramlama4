package org.ismek.collections;

import java.util.ArrayList;
import java.util.HashSet;

public class ListProgram {

	public static void main(String[] args) {
		
		Ogrenci ogrenci1 = new Ogrenci("ALÝ", "234234234");
		Ogrenci ogrenci2 = new Ogrenci("VELÝ", "21345234");
		Ogrenci ogrenci3 = new Ogrenci("AHMET", "3249834");
		
		Ogrenci[] ogrenciDizi = new Ogrenci[3];
		ogrenciDizi[0] = ogrenci1;
		ogrenciDizi[1] = ogrenci2;
		ogrenciDizi[2] = ogrenci3;
		
		ArrayList<Ogrenci> ogrenciListesi = new ArrayList<Ogrenci>();
		ogrenciListesi.add(ogrenci1);
		ogrenciListesi.add(ogrenci2);
		ogrenciListesi.add(ogrenci3);
		

		for (Ogrenci ogrenci : ogrenciListesi) {
			System.out.println(ogrenci.getAdi());
		}
		
		for (Ogrenci ogrenci : ogrenciDizi) {
			System.out.println(ogrenci.getAdi());
		}
		
		ArrayList sayilar = new ArrayList();
		sayilar.add(1);
		sayilar.add(2);
		sayilar.add(3);
		sayilar.add(4);
		sayilar.add(1);
		
		System.out.println(sayilar.size());
	}
}
