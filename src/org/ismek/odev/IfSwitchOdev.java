package org.ismek.odev;

import java.util.Scanner;

public class IfSwitchOdev {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		// sayi1 = 10
		System.out.println("1. say�y� giriniz");
		int sayi1 = scanner.nextInt();
		
		// sayi2 = 3;
		System.out.println("2. say�y� giriniz");
		int sayi2 = scanner.nextInt();
		
		System.out.println("1. (a+b) kare");
		System.out.println("2. (a+b) k�p�");
		System.out.println("3. (a-b) kare");
		System.out.println("4. (a-b) k�p�");
		System.out.println("Yapmak istedi�iniz i�lemi se�iniz");
		
		// secim = 1
		int secim = scanner.nextInt();
		int sonuc = 0;
		switch (secim) {
		case 1:
				// 
			int toplam = sayi1 + sayi2;
			//sonuc = toplam * toplam;
			sonuc = (int) Math.pow(toplam, 2);
			break;
		case 2:
			
			break;
		case 3:
			
			break;
		case 4:
			
			break;
		default:
			break;
		}
		
		System.out.println(sonuc);
		
		int kalanGun = sonuc % 7;
		switch (kalanGun) {
		case 0:
			System.out.println("PAZARTES�");
			break;
		case 1:
			System.out.println("SALI");
			break;
		case 2:
			System.out.println("�AR�AMBA");
			break;
		case 6: 
			System.out.println("PAZAR");
		default:
			break;
		}
	}

}
