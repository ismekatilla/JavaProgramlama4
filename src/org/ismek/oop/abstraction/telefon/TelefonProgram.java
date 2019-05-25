package org.ismek.oop.abstraction.telefon;

public class TelefonProgram {

	public static void main(String[] args) {
		AkilliTelefon akilliTelefon = new AkilliTelefon();
		akilliTelefon.setAgirlik(5);
		akilliTelefon.setMarka(new Marka("SAMSUNG", null));
		akilliTelefon.goruntuluAramaYap();
	}
}
