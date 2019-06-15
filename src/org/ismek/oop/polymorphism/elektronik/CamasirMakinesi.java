package org.ismek.oop.polymorphism.elektronik;

public class CamasirMakinesi extends BeyazEsya {

	int devirHizi;
	int yikamaKapasitesi;
	
	@Override
	public void kapakAc() {
		if (isCalisiyor()) {
			System.out.println("Kapak açýlamaz");
		} else {
			System.out.println("Kapak açýldý");
		}
	}
}