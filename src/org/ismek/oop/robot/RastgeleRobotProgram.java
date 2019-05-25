package org.ismek.oop.robot;

import java.util.Random;

public class RastgeleRobotProgram {

	public static void main(String[] args) {
		
		Robot robot = new Robot();
		robot.isim = "POKEMON";
		robot.boy = 150;
		robot.renk = "SARI";
		
		robot.kendiniTanit();
		System.out.println();
		
		Random random = new Random();
		int tekrarSayisi = random.nextInt(10);
		tekrarSayisi++;
		
		for (int i = 0; i < tekrarSayisi; i++) {
			int yonTahmini = random.nextInt(2);
			int adim = random.nextInt(10);
			adim++;
			
			if (yonTahmini == 0) {
				robot.adimAt(EnumYon.ILERI, adim);
				System.out.println("ÝLERÝ " + adim + " ADIM ATILDI");
			} else {
				robot.adimAt(EnumYon.GERI, adim);
				System.out.println("GERÝ " + adim + " ADIM ATILDI");
			}
			int neredesin = robot.neredesin();
			System.out.println(neredesin);
		}
		
		robot.konferansVer("BEN BÝR ROBOTUM YAD ELLERDE");
	}
}
