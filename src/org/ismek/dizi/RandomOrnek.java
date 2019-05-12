package org.ismek.dizi;

import java.util.Random;

public class RandomOrnek {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		int rastgeleSayi = rnd.nextInt(100);
		System.out.println(rastgeleSayi);
	}
}
