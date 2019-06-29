package org.ismek.karisik;

import java.io.Serializable;

public class Film implements Serializable {

	private String adi;
	private String aciklama;
	private int yayinYili;
	private EnumKategori kategori;
	private Language dil;
	
	public Film(String adiParametre, EnumKategori kategoriParametre, Language dilParametre) {
		this.adi = adiParametre;
		this.kategori = kategoriParametre;
		this.dil = dilParametre;
	}

	public String getAdi() {
		return adi;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}

	public String getAciklama() {
		return aciklama;
	}

	public void setAciklama(String aciklama) {
		this.aciklama = aciklama;
	}

	public int getYayinYili() {
		return yayinYili;
	}

	public void setYayinYili(int yayinYili) {
		this.yayinYili = yayinYili;
	}

	public EnumKategori getKategori() {
		return kategori;
	}

	public void setKategori(EnumKategori kategori) {
		this.kategori = kategori;
	}

	public Language getDil() {
		return dil;
	}

	public void setDil(Language dil) {
		this.dil = dil;
	}
	
	@Override
	public boolean equals(Object obj) {
		Film film = (Film) obj;
		if (this.adi.equals(film.getAdi())) {
			return true;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.adi.length();
	}
}