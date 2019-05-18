package org.ismek.metod;

import java.util.Scanner;

public class OrtalamaHesabi {

	static int test = 0;
	
	public static void main(String[] args) {

		int s1 = 33;
		int s2 = 52;
		float sonuc = ortalama(s1, s2);
		System.out.println(sonuc);

		int[] sayilar = { 1, 3, 5, 7, 9, 12 };
		float ort = ortalama(sayilar);
		System.out.println(ort * 2);
		
		ortalamaYazdir(sayilar);

		int[] sayilar2 = diziOlustur();
		float ort2 = ortalama(sayilar2);
		System.out.println(ort2);
	}

	static int[] diziOlustur() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Kaç sayý girilecek");
		int girilecekSayi = scanner.nextInt();
		int[] sayilar = new int[girilecekSayi];

		for (int i = 0; i < girilecekSayi; i++) {
			System.out.println(i + 1 + ". sayýsý giriniz");
			int girilenSayi = scanner.nextInt();
			sayilar[i] = girilenSayi;
		}
		return sayilar;
	}

	static float ortalama(int sayi1, int sayi2) {
		return ((float) sayi1 + sayi2) / 2;
	}

	static float ortalama(int[] sayiDizisi) {

		int toplam = 0;
		for (int i = 0; i < sayiDizisi.length; i++) {
			toplam += sayiDizisi[i];
		}

		float ortalama = (float) toplam / sayiDizisi.length;
		return ortalama;
	}

	static void ortalamaYazdir(int[] sayiDizisi) {

		int toplam = 0;
		for (int i = 0; i < sayiDizisi.length; i++) {
			toplam += sayiDizisi[i];
		}

		float ortalama = (float) toplam / sayiDizisi.length;
		System.out.println(ortalama);
	}
}