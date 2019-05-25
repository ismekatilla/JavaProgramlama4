package org.ismek.oop.abstraction.telefon;

public abstract class Telefon {

	private int agirlik;
	private String renk;
	private Marka marka;
	
	void aramaYapar() {
		
	}

	public int getAgirlik() {
		return agirlik;
	}

	public void setAgirlik(int agirlik) {
		this.agirlik = agirlik;
	}

	public String getRenk() {
		return renk;
	}

	public void setRenk(String renk) {
		this.renk = renk;
	}

	public Marka getMarka() {
		return marka;
	}

	public void setMarka(Marka marka) {
		this.marka = marka;
	}
}