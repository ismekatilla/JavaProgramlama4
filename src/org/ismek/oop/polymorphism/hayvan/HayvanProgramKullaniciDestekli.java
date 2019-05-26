package org.ismek.oop.polymorphism.hayvan;

import java.util.Scanner;

public class HayvanProgramKullaniciDestekli {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		Hayvan[] hayvanlar = new Hayvan[3];

		Ucabilir[] kuslar = new Ucabilir[1];
		
		cikis : for (int i = 0;; i++) {
			System.out.println("1. Aslan");
			System.out.println("2. Kanarya");
			System.out.println("3. Fil");
			System.out.println("4. Hayvanlar Ses Çýkarsýn");
			System.out.println("5. Uçsun");
			System.out.println("6. Çýkýþ");
			System.out.println("Hangi hayvaný tanýmlamak istiyorsunuz");

			int secim = scanner.nextInt();
			
			switch (secim) {
			case 1:
				Aslan aslan = aslanTanimiYap(scanner);
				hayvanlar[i] = aslan;
				break;
			case 2:
				Kanarya kanarya = kanaryaTanimiYap(scanner);
				hayvanlar[i] = kanarya;
				kuslar[0] = kanarya;
				break;
			case 3:
				Fil fil = filTanimiYap(scanner);
				hayvanlar[i] = fil;
				break;
			case 4:
				for (Hayvan hyv : hayvanlar) {
					hyv.sesCikar();
				}
				break;
			case 5: 
				for (Ucabilir kus : kuslar) {
					kus.ucar();
				}
				break;
			case 6:
				break cikis;
			default:
				break;
			}
		}
		
		scanner.close();

	}

	private static Fil filTanimiYap(Scanner scanner) {
		System.out.print("Ýsim giriniz = ");
		String isim = scanner.next();
		
		System.out.print("Yaþ giriniz = ");
		int yas = scanner.nextInt();
		
		System.out.print("Kilo giriniz = ");
		int kilo = scanner.nextInt();
		
		System.out.print("Hortum uzunluðu = ");
		int hortumUzunlugu = scanner.nextInt();
		
		Fil fil = new Fil();
		fil.isim = isim;
		fil.kilo = kilo;
		fil.yas = yas;
		fil.setHortumUzunlugu(hortumUzunlugu);
		return fil;
	}

	private static Kanarya kanaryaTanimiYap(Scanner scanner) {
		System.out.print("Ýsim giriniz = ");
		String isim = scanner.next();
		
		System.out.print("Yaþ giriniz = ");
		int yas = scanner.nextInt();
		
		System.out.print("Kilo giriniz = ");
		int kilo = scanner.nextInt();
		
		Kanarya kanarya = new Kanarya();
		kanarya.isim = isim;
		kanarya.kilo = kilo;
		kanarya.yas = yas;
		return kanarya;
	}

	private static Aslan aslanTanimiYap(Scanner scanner) {
		System.out.print("Ýsim giriniz = ");
		String isim = scanner.next();
		
		System.out.print("Yaþ giriniz = ");
		int yas = scanner.nextInt();
		
		System.out.print("Kilo giriniz = ");
		int kilo = scanner.nextInt();
		
		System.out.print("Yele Var Mý = ");
		boolean yeleVar = scanner.nextBoolean();
		
		Aslan aslan = new Aslan();
		aslan.isim = isim;
		aslan.kilo = kilo;
		aslan.yas = yas;
		aslan.yelesiVar = yeleVar;
		
		return aslan;
	}

	public static void seslen(Hayvan hayvan) {
		hayvan.sesCikar();
	}
}
