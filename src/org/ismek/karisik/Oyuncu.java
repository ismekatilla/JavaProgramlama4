package org.ismek.karisik;

import java.io.Serializable;

public class Oyuncu implements Serializable {

	private String isim;
	private transient EnumCinsiyet cinsiyet;

	public Oyuncu(String isimParametre, EnumCinsiyet cinsiyetParametre) {
		this.isim = isimParametre;
		this.cinsiyet = cinsiyetParametre;
	}
	
	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public EnumCinsiyet getCinsiyet() {
		return cinsiyet;
	}

	public void setCinsiyet(EnumCinsiyet cinsiyet) {
		this.cinsiyet = cinsiyet;
	}
	
	@Override
	public boolean equals(Object obj) {
		Oyuncu oyuncuParametre = (Oyuncu) obj;
		if (this.isim.equals(oyuncuParametre.getIsim()) && this.cinsiyet.equals(oyuncuParametre.getCinsiyet())) {
			return true;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return isim.length();
	}
}