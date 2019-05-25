package org.ismek.oop.abstraction.telefon;

public class Marka {

	private String adi;
	private byte[] logo;

	public Marka(String adi, byte[] logo) {
		this.adi = adi;
		this.logo = logo;
	}

	public String getAdi() {
		return adi;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}

	public byte[] getLogo() {
		return logo;
	}

	public void setLogo(byte[] logo) {
		this.logo = logo;
	}
}