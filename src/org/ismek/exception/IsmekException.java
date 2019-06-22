package org.ismek.exception;

import java.io.IOException;

public class IsmekException extends Exception {

	private String hataMesaji;
	
	public IsmekException(String hataMesaji) {
		this.hataMesaji = hataMesaji;
	}

	public String getHataMesaji() {
		return hataMesaji;
	}

	public void setHataMesaji(String hataMesaji) {
		this.hataMesaji = hataMesaji;
	}
}
