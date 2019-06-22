package org.ismek.file;

import java.io.File;
import java.util.Scanner;

public class FileIslemleri {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Dosya adresi giriniz = ");
		String path = scanner.nextLine();
		
		File file = new File(path);
		boolean directory = file.isDirectory();
		if (directory) {
			System.out.println("Bu bir dizindir(klas�r).");
		} else {
			boolean exists = file.exists();
			if (!exists) {
				System.out.println("Belirtilen adreste dosya bulunamad�.");
			} else {
				boolean dosyaMi = file.isFile();
				if (dosyaMi) {
					System.out.println("Bu bir dosyad�r.");
				}
			}
		}
	}
}
