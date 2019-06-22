package org.ismek.file.serilestirme;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SerilestirmeYazmaProgram {

	public static void main(String[] args) {
		
//		Student student1 = new Student(1, "AHMET", "MEHMET");
//		Student student2 = new Student(2, "ALÝ", "ASD");
//		Student student3 = new Student(3, "VELÝ", "DEF");
//		
//		List<Student> studentList = new ArrayList<Student>();
//		studentList.add(student1);
//		studentList.add(student2);
//		studentList.add(student3);
//		
//		File file = new File("Z:\\Java\\ogrenciler.txt");
//		
//		for (Student student : studentList) {
//			try (FileWriter fileWriter = new FileWriter(file, true)) {
//				fileWriter.write(student.getNo() + "\t" + student.getAdi() + "\t" + student.getSoyadi() + "\r\n");
//				fileWriter.flush();
//			} catch (IOException e) {
//				System.out.println("Dosya yazma hatasý");
//			}
//		}
		
		Student student1 = new Student(1, "AHMET", "MEHMET");
		Student student2 = new Student(2, "ALÝ", "ASD");
		Student student3 = new Student(3, "VELÝ", "DEF");
		
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(student1);
		studentList.add(student2);
		studentList.add(student3);
		
		File file = new File("Z:\\Java\\ogrenciler.txt");
		try (FileOutputStream fileOutputStream = new FileOutputStream(file, true)) {
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(studentList);
			objectOutputStream.flush();
		} catch (IOException e) {
			System.out.println("Dosya yazma hatasý");
		}
	}

}
