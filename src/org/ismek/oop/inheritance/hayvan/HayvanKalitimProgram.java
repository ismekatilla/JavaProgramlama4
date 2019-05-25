package org.ismek.oop.inheritance.hayvan;

public class HayvanKalitimProgram {

	public static void main(String[] args) {
		
//		Cita cita = new Cita();
//		cita.kilo = 250;
//		cita.beslenir();
//		cita.hizliKosar();
		
		
		Karga karga = new Karga();
		karga.kilo = 3;
		karga.renk = "SÝYAH";
		System.out.println(karga.yas);
		
		Karga karga2 = new Karga("SARI", 5);
		karga2.yas = 2;
		System.out.println(karga2.renk);
	}
}
