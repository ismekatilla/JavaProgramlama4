package org.ismek.dizi;

import java.util.Scanner;

public class YasDizisiDoldurma {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Kaç öðrenci var?");
		int ogrenciSayisi = scanner.nextInt();
		
		int[] yasDizisi = new int[ogrenciSayisi];
		int toplam = 0;
		for (int i = 0; i < yasDizisi.length; i++) {
			System.out.print((i + 1) + ". öðrencinin yaþýný giriniz=");
			int yas = scanner.nextInt();
			yasDizisi[i] = yas;
			toplam+=yas;
		}
		System.out.println(toplam);
		
		System.out.println("Kaçýncý Öðrenci");
		int kacinciOgrenci = scanner.nextInt();
		int ogrenciYasi = yasDizisi[kacinciOgrenci - 1];
		System.out.println(ogrenciYasi);
	}
}
