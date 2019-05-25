package org.ismek.oop.inheritance.hayvan;

public class Karga extends Hayvan{

	public Karga() {
		yas = 11;
	}
	
	public Karga(String renkDisardanGelen, int kiloDisardanGelen) {
		kilo = kiloDisardanGelen;
		renk = renkDisardanGelen;
		System.out.println("KARGA ÜRETÝLDÝ");
	}
	
	public void ucar() {
		
	}

	
}
