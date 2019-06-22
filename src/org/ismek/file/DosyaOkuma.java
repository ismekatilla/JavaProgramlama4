package org.ismek.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class DosyaOkuma {

	public static void main(String[] args) {
		
		File file = new File("Z:\\Java\\Java1 Konular.txt");
		boolean exists = file.exists();
		if (exists) {
			System.out.println("Dosya mevcut");
		} else {
			System.out.println("Dosya mevcut deðil");
			return;
		}
		
		FileReader fileReader = null;
		try {
			char[] fileContent = new char[(int) file.length()];
			
			fileReader = new FileReader(file);
			fileReader.read(fileContent);
			System.out.println(fileContent);
		} catch (IOException e) {
			System.out.println("Dosya hatasý" + e.getMessage());
		} finally {
			try {
				fileReader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("----------- FileInputStream -------------");
		
		FileInputStream fileInputStream = null;
		try {
			byte[] buffer = new byte[(int) file.length()];
			
			fileInputStream = new FileInputStream(file);
			fileInputStream.read(buffer);
			String content = new String(buffer);
			System.out.println(content);
		} catch (IOException e) {
			System.out.println("Dosya hatasý" + e.getMessage());
		} finally {
			try {
				fileInputStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
