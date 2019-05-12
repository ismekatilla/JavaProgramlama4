package org.ismek.metod;

public class MetodOrnek1 {

	public static void main(String[] args) {

		yazdir("Fatih Biliþim Okulu");
		System.out.println();
		yazdir("----------------------");
		System.out.println();
		yazdir("Ýsmek");
		
		int sayi1 = 3;
		int sayi2 = 4;
		int carpim = sayi1 * sayi2;
		System.out.println(carpim);

		int sayi3 = 5;
		int sayi4 = 8;
		int carpim2 = sayi3 * sayi4;
		System.out.println(carpim2);

		int sonuc = carp(13, 34);
		System.out.println(sonuc);

	}

	private static int carp(int sayi1, int sayi2) {
		return sayi1 * sayi2;
	}

	private static void yazdir(String baslik) {
		System.out.println("----------------------------------------");
		System.out.println("--------------" + baslik + "--------------");
		System.out.println("----------------------------------------");
	}

}
