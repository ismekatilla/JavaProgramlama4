package org.ismek.dizi;


import java.util.Random;
import java.util.Scanner;

public class EnBuyukRastgeleSayiBulma {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Kaç sayi üretilecek");
		int uretilecekSayi = scanner.nextInt();
		
		int[] rastgeleSayiDizisi = new int[uretilecekSayi];
		
		for (int i = 0; i < rastgeleSayiDizisi.length; i++) {
			int rastgeleUretilenSayi = rnd.nextInt(100);
			rastgeleSayiDizisi[i] = rastgeleUretilenSayi;
		}
		
		for (int i = 0; i < rastgeleSayiDizisi.length; i++) {
			int dizininElemani = rastgeleSayiDizisi[i];
			System.out.println(dizininElemani);
		}
		
		int enBuyukSayi = -1;
		for (int i = 0; i < rastgeleSayiDizisi.length; i++) {
			int dizininElemani = rastgeleSayiDizisi[i];
			if (enBuyukSayi < dizininElemani) {
				enBuyukSayi = dizininElemani;
			}
		}
		System.out.println("En büyük sayý = " + enBuyukSayi);

	}

}
