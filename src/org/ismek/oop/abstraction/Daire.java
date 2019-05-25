package org.ismek.oop.abstraction;

public class Daire extends Sekil {

	private int yaricap;
	
	@Override
	public int alanHesapla() {
		// TODO Auto-generated method stub
		return (int) (Math.PI * yaricap * yaricap);
	}

}