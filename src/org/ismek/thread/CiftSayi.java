package org.ismek.thread;

public class CiftSayi implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			if (i % 2 == 0) {
				System.out.println("Thread Çift - "  + i);
			}
		}
	}

}
