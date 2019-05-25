package org.ismek.oop.abstraction.hayvan;

public class Leylek extends Hayvan implements Ucabilir, GocEdebilir {

	@Override
	public void ucar() {

		System.out.println("LEYLEK U�AB�L�R");
	}

	@Override
	public void gocEder(String nereye) {
		System.out.println("LEYLEK " + nereye + "  G�� EDEB�L�R");
		
	}

	@Override
	public void beslenir() {
		// TODO Auto-generated method stub
		
	}

	
}
