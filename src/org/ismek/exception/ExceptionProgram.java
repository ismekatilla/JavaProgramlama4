package org.ismek.exception;



import java.util.Scanner;

public class ExceptionProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Say� 1 i giriniz = ");
		int sayi1 = scanner.nextInt();
		
		System.out.print("Say� 2 yi giriniz = ");
		int sayi2 = scanner.nextInt();
		
		try {
			int sonuc = bol(sayi1, sayi2);
			System.out.println("B�lme i�lemi sonucu = " + sonuc);
			
			int[] dizi = new int[1];
			dizi[0] = 5;
			
			String str = "asd";
			int sayi = Integer.parseInt(str);
			System.out.println(sayi);
		} catch (ArithmeticException w) {
			System.out.println("Say�1 0 a b�l�nemez.");
		} catch (ArrayIndexOutOfBoundsException a) {
			System.out.println("Dizi indis de�eri aral�k d���nda");
		} catch (Exception e) {
			System.out.println("Beklenmeyen bir hata olu�tu" + e.getMessage());
		}
		
	}
	
	private static int bol(int sayi1, int sayi2) {
		return sayi1 / sayi2;
	}
}