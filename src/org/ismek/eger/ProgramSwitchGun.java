package org.ismek.eger;

import java.util.Scanner;

public class ProgramSwitchGun {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("G�n\t=\t");
		String gun = scanner.next();

		switch (gun) {
		case "PTS":
		case "SL":
		case "CRS":
		case "PRS":
		case "CM":
			System.out.println("Hafta i�i");
			break;
		case "CMTS":
		case "PZR":
			System.out.println("Hafta Sonu");
			break;
		default:
			break;
		}

		if (	gun.equals("PTS") || 
				gun.equals("SL") || 
				gun.equals("CRS") || 
				gun.equals("PRS") || 
				gun.equals("CM")) {
			System.out.println("Hafta i�i �F");
		} else {
			System.out.println("Hafta Sonu �F");
		}
	}
}