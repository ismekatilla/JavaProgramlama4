package org.ismek.oop.polymorphism.hayvan;

public class HayvanProgram {

	public static void main(String[] args) {
		
		Fil fil = new Fil();
		fil.setHortumUzunlugu(5);
		seslen(fil);
		
		Aslan aslan = new Aslan();
		aslan.yelesiVar = true;
		seslen(aslan);
		
		Kanarya kanarya = new Kanarya();
		seslen(kanarya);
	}
	
	public static void seslen(Hayvan hayvan) {
		hayvan.sesCikar();
	}
}
