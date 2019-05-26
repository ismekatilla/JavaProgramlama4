package org.ismek.oop.polymorphism.hayvan;

public class Fil extends Hayvan {

	private int hortumUzunlugu;

	@Override
	public void sesCikar() {
		System.out.println(isim +  "PUUUUUUUUU dedi");
	}

	public int getHortumUzunlugu() {
		return hortumUzunlugu;
	}

	public void setHortumUzunlugu(int hortumUzunlugu) {
		this.hortumUzunlugu = hortumUzunlugu;
	}
}