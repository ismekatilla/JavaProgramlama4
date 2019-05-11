package org.ismek.fordongusu;

import java.util.Scanner;

public class YildizYazdirma {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bir sayý giriniz");
		int sayi = scanner.nextInt();
		
		for (int i = sayi; i > 0; i--) {
			if (i % 3 == 0) {
				System.out.println();
				continue;
			}
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i = 1; i < sayi + 1; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
