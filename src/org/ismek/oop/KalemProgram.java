package org.ismek.oop;

public class KalemProgram {

	public static void main(String[] args) {
		Kalem kalem = new Kalem();
		kalem.tur = EnumTur.KURSUN;
		kalem.renk = "SÝYAH";
		kalem.marka = "OFFICE";
		kalem.yaziYazmak();
		
		Kalem k1 = new Kalem();
		k1.tur = EnumTur.TUKENMEZ;
		k1.renk = "MAVÝ";
		k1.marka = "TYU";
		k1.yaziYazmak();
	}

}
