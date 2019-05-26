package org.ismek.oop.polymorphism.hayvan;

public class Aslan extends Hayvan implements Kosabilir {

	boolean yelesiVar;
	
	@Override
	public void sesCikar() {
		System.out.println(isim +  "K�kr�yorum dedi");
		
	}

	@Override
	public void kosar() {
		System.out.println("Fena H�zl� Ko�ar�m");
		
	}
}