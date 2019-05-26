package org.ismek.oop.polymorphism.hayvan;

public class Aslan extends Hayvan implements Kosabilir {

	boolean yelesiVar;
	
	@Override
	public void sesCikar() {
		System.out.println(isim +  "Kükrüyorum dedi");
		
	}

	@Override
	public void kosar() {
		System.out.println("Fena Hýzlý Koþarým");
		
	}
}