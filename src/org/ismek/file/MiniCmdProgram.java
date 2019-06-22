package org.ismek.file;

import java.io.File;
import java.util.Scanner;

public class MiniCmdProgram {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Dosya adresi giriniz = ");
		String path = scanner.nextLine();

		File file = new File(path);
		boolean exists = file.exists();
		if (!exists) {
			System.out.println("Belirtilen adreste dosya bulunamadý.");
		}

		System.out.print(file.getPath() + ">");

		while (true) {
			String komut = scanner.nextLine();
			if (komut.equals("dir")) {
				String[] dosyaListesi = file.list();
				for (String dosyaAdi : dosyaListesi) {
					System.out.println(dosyaAdi);
				}
			} else if (komut.startsWith("cd ")) {
//				String[] split = komut.split("cd ");
//				String icKomut = komut.replaceAll("cd ", "");
				String altKomut = komut.substring(3);
				path = path + "\\" + altKomut;
				file = new File(path);
			} else if (komut.startsWith("mkdir ")) {
				String altKomut = komut.substring(6);
				path = path + "\\" + altKomut;
				file = new File(path);
				try {
					file.createNewFile();
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("Dosya oluþturulamadý" + e.getMessage());
				}
			}
			System.out.print(file.getPath() + ">");
		}

	}
}
