package org.ismek.oop.robot;

public class RobotProgram {

	public static void main(String[] args) {
		
		Robot robot = new Robot();
		robot.isim = "POKEMON";
		robot.boy = 150;
		robot.renk = "SARI";
		
		robot.kendiniTanit();
		System.out.println();
		
		robot.adimAt(EnumYon.ILERI, 10);
		robot.adimAt(EnumYon.ILERI, 3);
		robot.adimAt(EnumYon.GERI, 7);
		robot.adimAt(EnumYon.ILERI, 1);
		robot.adimAt(EnumYon.GERI, 6);
		
		System.out.println(robot.konum);
		
		int neredesin = robot.neredesin();
		System.out.println(neredesin);
		
		robot.konferansVer("BEN BÝR ROBOTUM YAD ELLERDE");
	}
}
