package org.ismek.oop.polymorphism.elektronik;

public abstract class ElektronikEsya {

	private int akimGucu;
	private String isletimSistemi;
	private double fiyat;
	private Marka marka;
	private int uretimYili;
	private String mensei;
	private boolean calisiyor = false;

	public void fisiTak() {
		calisiyor = true;
		System.out.println("Fiþ Takýldý");
	}

	public int getAkimGucu() {
		return akimGucu;
	}

	public void setAkimGucu(int akimGucu) {
		this.akimGucu = akimGucu;
	}

	public String getIsletimSistemi() {
		return isletimSistemi;
	}

	public void setIsletimSistemi(String isletimSistemi) {
		this.isletimSistemi = isletimSistemi;
	}

	public double getFiyat() {
		return fiyat;
	}

	public void setFiyat(double fiyat) {
		this.fiyat = fiyat;
	}

	public Marka getMarka() {
		return marka;
	}

	public void setMarka(Marka marka) {
		this.marka = marka;
	}

	public int getUretimYili() {
		return uretimYili;
	}

	public void setUretimYili(int uretimYili) {
		this.uretimYili = uretimYili;
	}

	public String getMensei() {
		return mensei;
	}

	public void setMensei(String mensei) {
		this.mensei = mensei;
	}

	public boolean isCalisiyor() {
		return calisiyor;
	}	
}
