package org.ismek.metod;

public class MethodOverload {

	public static void main(String[] args) {

		int sayi1 = 33;
		int sayi2 = 55;
		int sonuc = topla(sayi1, sayi2);
		System.out.println(sonuc);
		println(sonuc);
		
		println("ELÝF HANIM");
		
		String yazi = String.valueOf(5);
		println(yazi);
		
		
		int ali = 33;
		int veli = 55;
		int ahmet = 77;
		int islemSonucu = topla(ali, veli, ahmet);
		System.out.println(islemSonucu);

	}
	
	static int topla(int s1, int s2) {
		return s1 + s2;
	}
	
	static int topla(int s1, int s2, int s3) {
		return s1 + s2 + s3;
	}
	
	static void println(String yazi) {
		System.out.println(yazi);
	}
	
	static void println(int yazi) {
		String str = String.valueOf(yazi);
		System.out.println(str);
	}
}
