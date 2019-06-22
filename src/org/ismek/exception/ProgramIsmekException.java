package org.ismek.exception;

import java.util.Scanner;

public class ProgramIsmekException {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Sayý 1 i giriniz = ");
		int sayi1 = scanner.nextInt();

		System.out.print("Sayý 2 yi giriniz = ");
		int sayi2 = scanner.nextInt();
		
		try {
			bol(sayi1, sayi2);
		} catch (IsmekException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getHataMesaji());
		}
	}

	public static int bol(int sayi1, int sayi2) throws IsmekException {
		if (sayi1 == 3) {
			throw new IsmekException("Sayý1 3 olamaz");
		}
		return sayi1 / sayi2;
	}
}