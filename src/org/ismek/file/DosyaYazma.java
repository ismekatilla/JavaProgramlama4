package org.ismek.file;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class DosyaYazma {

	public static void main(String[] args) {
		File file = new File("Z:\\Java\\ismek.txt");
		
		try (FileWriter fileWriter = new FileWriter(file)) {
			fileWriter.write("BU BÝR TESTTÝR");
		} catch (IOException e) {
			System.out.println("Dosya yazma hatasý");
		}
		
		try (FileOutputStream fileOutputStream = new FileOutputStream(file, true)) {
			
			String content = "BU BÝR TESTTÝR2";
			fileOutputStream.write(content.getBytes());
		} catch (Exception e) {
			System.out.println("Dosya yazma hatasý");
		}
	}

}
