package org.ismek.oop.abstraction.telefon;

public class AkilliTelefon extends CepTelefonu implements GoruntuluAramaYapabilir {

	@Override
	public void goruntuluAramaYap() {
		System.out.println("GÖRÜNTÜLÜ ARADIM");
		
	}

}
