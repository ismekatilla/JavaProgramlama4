package org.ismek.dizi;

public class OgrenciYasDiziIslemi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] yasDizisi = new int[3];
		yasDizisi[0] = 10;
		yasDizisi[1] = 35;
		yasDizisi[2] = 34;
		
		int toplam = 0;
		for (int i = 0; i < yasDizisi.length; i++) {
			System.out.println(yasDizisi[i]);
			toplam += yasDizisi[i];
		}
		
		System.out.println(toplam);
	}

}
 