package org.ismek.metod;

import java.util.Scanner;

public class KutleEndeksiHesaplama {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);

		System.out.print("Boyunuzu metre cinsinden giriniz: ");
		double boy = kb.nextDouble();

		System.out.print("Kilonuzu kilogram cinsinden giriniz: ");
		double kilo = kb.nextDouble();

		float endeks = kutleEndeksiHesapla(boy, kilo);
		
		System.out.println("Vücut kitle Ýndeksiniz: " + endeks);

		double boy1 = 1.72;
		double kilo1 = 45;
		double endeks1 = kutleEndeksiHesapla(boy1, kilo1);
		System.out.println(endeks1);
		
		double boy2 = 1.65;
		double kilo2 = 55;
		double endeks2 = kutleEndeksiHesapla(boy2, kilo2);
		System.out.println(endeks2);
		
		kb.close();
	}
	
//	static float kutleEndeksiHesapla(double boy, double kilo) {
//		double endeks = kilo / (boy * boy);
//		String endeksStr = String.valueOf(endeks);
//		float endeksAsFloat = Float.parseFloat(endeksStr);
//		return endeksAsFloat;
//	}
	
	static float kutleEndeksiHesapla(double boy, double kilo) {
		return (float) (kilo / (boy+3 * boy + 3));
	}
}