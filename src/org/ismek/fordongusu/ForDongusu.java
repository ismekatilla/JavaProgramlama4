package org.ismek.fordongusu;

import java.util.Scanner;

public class ForDongusu {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int sayi = scanner.nextInt();
		for (int i = 1; i < sayi; i = i+2) {
			if (i % 5 == 0) {
				break;
			}
			
			if (i % 3 == 0) {
				continue;
			}
			
			System.out.println(i);
			
		}
	}

}
