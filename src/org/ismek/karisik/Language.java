package org.ismek.karisik;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Language implements Externalizable {

	private String adi;
	private String kisaKod;
	
	public Language() {
		
	}

	public Language(String adiP, String kisaKodP) {
		adi = adiP;
		kisaKod = kisaKodP;
	}

	public String getAdi() {
		return adi;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}

	public String getKisaKod() {
		return kisaKod;
	}

	public void setKisaKod(String kisaKod) {
		this.kisaKod = kisaKod;
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		adi = in.readObject().toString();
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(this.adi);
	}
}