package org.ismek;

import java.util.Scanner;

public class SayiAl {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Çarpýlacak 1. sayiyi giriniz = ");
		int sayi1 = scanner.nextInt();
		
		System.out.println("Çarpýlacak 2. sayiyi giriniz = ");
		int sayi2 = scanner.nextInt();
		
		int sonuc =  sayi1 * sayi2;
		System.out.println("Sonuç = " + sonuc);
	}
}
