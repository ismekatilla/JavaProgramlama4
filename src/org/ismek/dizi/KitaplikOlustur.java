package org.ismek.dizi;

import java.util.Scanner;

public class KitaplikOlustur {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Kaç kitap üretilecek");
		int uretilecekSayi = scanner.nextInt();
		
		Kitap[] kitapDizisi = new Kitap[uretilecekSayi];
		
		for (int i = 0; i < kitapDizisi.length; i++) {
			Kitap kitap = new Kitap();
			
			System.out.print("Kitap Adý = ");
			kitap.adi = scanner.next();
			
			System.out.print("Kitap Yayýn Yýlý = ");
			kitap.yayinYili = scanner.nextInt();
			
			kitapDizisi[i] = kitap;
		}
		
//		for (int i = 0; i < kitapDizisi.length; i++) {
//			System.out.println(kitapDizisi[i].adi);
//		}
		
		System.out.println("Yayýn yýlý giriniz = ");
		int yayinYili = scanner.nextInt();
		
		for (int i = 0; i < kitapDizisi.length; i++) {
			Kitap kitap = kitapDizisi[i];
			
			if (kitap.yayinYili == yayinYili) {
				System.out.println(kitap.adi);
			}
		}
	}
}
