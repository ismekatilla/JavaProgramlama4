package org.ismek.thread;

public class Program {

	public static void main(String[] args) {
		
		Thread tekSayiThread = new Thread(new TekSayi());
		Thread ciftSayiThread = new Thread(new CiftSayi());
		
		tekSayiThread.start();
		ciftSayiThread.start();
		
//		
//		for (int i = 0; i < 1000; i++) {
//			if (i % 2 == 1) {
//				System.out.println("Thread Tek - "  + i);
//			}
//		}
//		
//		for (int i = 0; i < 1000; i++) {
//			if (i % 2 == 0) {
//				System.out.println("Thread Çift - "  + i);
//			}
//		}
	}
}
