package org.ismek.oop.abstraction;

public class Ucgen extends Cokgen {

	private int tabanUzunluk;
	private int yukseklik;

	@Override
	public int alanHesapla() {
		// TODO Auto-generated method stub
		return tabanUzunluk * yukseklik / 2;
	}
	
	public int getTabanUzunluk() {
		return tabanUzunluk;
	}

	public void setTabanUzunluk(int tabanUzunluk) {
		this.tabanUzunluk = tabanUzunluk;
	}

	public int getYukseklik() {
		return yukseklik;
	}

	public void setYukseklik(int yukseklik) {
		this.yukseklik = yukseklik;
	}

}
