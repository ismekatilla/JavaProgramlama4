package org.ismek.oop.polymorphism.hayvan;

public class Kanarya extends Hayvan implements Ucabilir {

	@Override
	public void sesCikar() {
		System.out.println(isim +  " Cik Cik Ciiiiik Cik dedi.");
	}

	@Override
	public void ucar() {
		System.out.println("PIR DÝYE UÇU VERDÝ");
		
	}
}
