package org.ismek.fordongusu;

import java.util.Scanner;

public class DonguProgram2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		ahmet:for(;;) {
			System.out.println("1. Faktoriyel");
			System.out.println("2. Tek Sayý");
			System.out.println("3. Çýkýþ");
			System.out.print("Seçim?");
			int secim = scanner.nextInt();
			
			switch (secim) {
			case 1:
				// Faktoriyel al
				System.out.print("Faktoriyel alýnacak sayý=");
				int faktoriyelAlinacakSayi = scanner.nextInt();
				int sonuc = 1;
				for (int i = 1; i <= faktoriyelAlinacakSayi; i++) {
					sonuc = sonuc * i; // sonuc *= i; ayný þey
				}
				System.out.println("Faktoriyel = " + sonuc);
				break;
			case 2:
				// Tek sayý
				System.out.print("Tek sayý =");
				int sayi = scanner.nextInt();
				for (int i = 1; i < sayi; i = i+2) {
					System.out.println(i);
					
				}
				break;
			case 3:
				// Çýkýþ
				System.out.println("Çýkýþ yaptýnýz");
				break ahmet;
			default:
				break;
			}
		}

	}

}
