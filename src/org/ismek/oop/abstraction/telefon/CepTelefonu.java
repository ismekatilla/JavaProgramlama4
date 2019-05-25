package org.ismek.oop.abstraction.telefon;

public abstract class CepTelefonu extends Telefon {

	private boolean multiMedyaVar;

	public boolean isMultiMedyaVar() {
		return multiMedyaVar;
	}

	public void setMultiMedyaVar(boolean multiMedyaVar) {
		this.multiMedyaVar = multiMedyaVar;
	}
}