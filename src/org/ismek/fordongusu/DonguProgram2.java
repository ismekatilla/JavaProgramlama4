package org.ismek.fordongusu;

import java.util.Scanner;

public class DonguProgram2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		ahmet:for(;;) {
			System.out.println("1. Faktoriyel");
			System.out.println("2. Tek Say�");
			System.out.println("3. ��k��");
			System.out.print("Se�im?");
			int secim = scanner.nextInt();
			
			switch (secim) {
			case 1:
				// Faktoriyel al
				System.out.print("Faktoriyel al�nacak say�=");
				int faktoriyelAlinacakSayi = scanner.nextInt();
				int sonuc = 1;
				for (int i = 1; i <= faktoriyelAlinacakSayi; i++) {
					sonuc = sonuc * i; // sonuc *= i; ayn� �ey
				}
				System.out.println("Faktoriyel = " + sonuc);
				break;
			case 2:
				// Tek say�
				System.out.print("Tek say� =");
				int sayi = scanner.nextInt();
				for (int i = 1; i < sayi; i = i+2) {
					System.out.println(i);
					
				}
				break;
			case 3:
				// ��k��
				System.out.println("��k�� yapt�n�z");
				break ahmet;
			default:
				break;
			}
		}

	}

}
