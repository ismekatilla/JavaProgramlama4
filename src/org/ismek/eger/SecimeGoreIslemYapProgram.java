package org.ismek.eger;

import java.util.Scanner;

public class SecimeGoreIslemYapProgram {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("1. Toplama");
		System.out.println("2. ��karma");
		System.out.println("3. �arpma");
		System.out.println("4. B�lme");
		
		System.out.print("Bir se�im yap�n�z\t=\t");
		int secim = scanner.nextInt();
		
		System.out.println("1. Say�y� giriniz\t=\t");
		int sayi1 = scanner.nextInt();
		
		System.out.println("2. Say�y� giriniz\t=\t");
		int sayi2 = scanner.nextInt();
		
		if (secim == 1) {
			int toplam = sayi1 + sayi2;
			System.out.println("Toplam = " + toplam);
		} else if (secim == 2) {
			int fark = sayi1 - sayi2;
			System.out.println("Fark = " + fark);
		} else if (secim == 3) {
			int carpim = sayi1 * sayi2;
			
			System.out.println("�arp�m = " + carpim);
		} else if (secim == 4) {
			float bolme = sayi1 / (float)sayi2;
			System.out.println("B�lme = " + bolme);
		}
	}
}
