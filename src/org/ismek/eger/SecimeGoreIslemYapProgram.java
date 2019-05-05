package org.ismek.eger;

import java.util.Scanner;

public class SecimeGoreIslemYapProgram {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("1. Toplama");
		System.out.println("2. Çýkarma");
		System.out.println("3. Çarpma");
		System.out.println("4. Bölme");
		
		System.out.print("Bir seçim yapýnýz\t=\t");
		int secim = scanner.nextInt();
		
		System.out.println("1. Sayýyý giriniz\t=\t");
		int sayi1 = scanner.nextInt();
		
		System.out.println("2. Sayýyý giriniz\t=\t");
		int sayi2 = scanner.nextInt();
		
		if (secim == 1) {
			int toplam = sayi1 + sayi2;
			System.out.println("Toplam = " + toplam);
		} else if (secim == 2) {
			int fark = sayi1 - sayi2;
			System.out.println("Fark = " + fark);
		} else if (secim == 3) {
			int carpim = sayi1 * sayi2;
			
			System.out.println("Çarpým = " + carpim);
		} else if (secim == 4) {
			float bolme = sayi1 / (float)sayi2;
			System.out.println("Bölme = " + bolme);
		}
	}
}
