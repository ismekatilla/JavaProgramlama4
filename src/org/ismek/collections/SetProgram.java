package org.ismek.collections;

import java.util.ArrayList;
import java.util.HashSet;

public class SetProgram {

	public static void main(String[] args) {
		
		Ogrenci ogrenci1 = new Ogrenci("ALÝ", "234234234");
		Ogrenci ogrenci2 = new Ogrenci("AHMET", "3249834");
		Ogrenci ogrenci3 = new Ogrenci("VELÝ", "21345234");
		Ogrenci ogrenci4 = new Ogrenci("AHMET", "3249834");
		
		HashSet<Ogrenci> ogrenciSet = new HashSet<Ogrenci>();
		ogrenciSet.add(ogrenci1);
		ogrenciSet.add(ogrenci2);
		ogrenciSet.add(ogrenci3);
		ogrenciSet.add(ogrenci4);
		ogrenciSet.add(ogrenci1);
		System.out.println(ogrenciSet.size());
		
		HashSet sayilar = new HashSet();
		sayilar.add(1);
		sayilar.add(2);
		sayilar.add(3);
		sayilar.add(4);
		sayilar.add(1);
		
		System.out.println(sayilar.size());
	}
}
