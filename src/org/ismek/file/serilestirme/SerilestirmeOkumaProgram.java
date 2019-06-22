package org.ismek.file.serilestirme;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SerilestirmeOkumaProgram {

	public static void main(String[] args) {
		
		List<Student> studentList = new ArrayList<Student>();
		
		File file = new File("Z:\\Java\\ogrenciler.txt");
		try (FileInputStream fileInputStream = new FileInputStream(file)) {
			ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
			studentList = (List<Student>) objectInputStream.readObject();
		} catch (IOException e) {
			System.out.println("Dosya okuma hatasý");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for (Student student : studentList) {
			System.out.println(student.getNo() + " - " + student.getAdi());
		}
	}

}
