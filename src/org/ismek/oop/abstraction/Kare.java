package org.ismek.oop.abstraction;

public class Kare extends Cokgen {

	private int kenarUzunlugu;

	@Override
	public int alanHesapla() {
		// TODO Auto-generated method stub
		return kenarUzunlugu * kenarUzunlugu;
	}

	@Override
	public int cevreHesapla() {
		// TODO Auto-generated method stub
		return kenarUzunlugu * 4;
	}

	public int getKenarUzunlugu() {
		return kenarUzunlugu;
	}

	public void setKenarUzunlugu(int kenarUzunlugu) {
		this.kenarUzunlugu = kenarUzunlugu;
	}
}