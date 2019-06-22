package org.ismek.file.serilestirme;

import java.io.Serializable;

public class Student implements Serializable {

	private int no;
	private transient String adi;
	private String soyadi;

	public Student(int no, String adi, String soyadi) {
		this.no = no;
		this.adi = adi;
		this.soyadi = soyadi;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getAdi() {
		return adi;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}

	public String getSoyadi() {
		return soyadi;
	}

	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}
}