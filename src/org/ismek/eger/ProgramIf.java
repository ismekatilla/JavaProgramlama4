package org.ismek.eger;

import java.util.Scanner;

public class ProgramIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�lk say� = ");
		int sayi1 = scan.nextInt();
		
		System.out.print("�kinci say� = ");
		int sayi2 = scan.nextInt();
		
		if (sayi1>sayi2) {
			System.out.println(sayi1 + " b�y�kt�r " + sayi2);
		} else if (sayi1 < sayi2) {
			System.out.println(sayi2 + " b�y�kt�r " + sayi1);
		} else {
			System.out.println(sayi1 + " e�ittir " + sayi2);
		}
	}

}
