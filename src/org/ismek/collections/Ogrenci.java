package org.ismek.collections;

public class Ogrenci {

	private String adi;
	private String tcKimlikNo;

	public Ogrenci(String isim, String no) {
		adi = isim;
		tcKimlikNo = no;
	}
	
	public String getAdi() {
		return adi;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}

	public String getTcKimlikNo() {
		return tcKimlikNo;
	}

	public void setTcKimlikNo(String tcKimlikNo) {
		this.tcKimlikNo = tcKimlikNo;
	}
}