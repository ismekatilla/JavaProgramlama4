package org.ismek.eger;

import java.util.Scanner;

public class ProgramSwitchGun {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Gün\t=\t");
		String gun = scanner.next();

		switch (gun) {
		case "PTS":
		case "SL":
		case "CRS":
		case "PRS":
		case "CM":
			System.out.println("Hafta içi");
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
			System.out.println("Hafta içi ÝF");
		} else {
			System.out.println("Hafta Sonu ÝF");
		}
	}
}