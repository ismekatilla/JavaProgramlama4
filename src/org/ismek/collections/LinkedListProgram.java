package org.ismek.collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListProgram {

	public static void main(String[] args) {
		
		LinkedList<Integer> sayilar = new LinkedList<Integer>();
		sayilar.add(1);
		sayilar.add(2);
		sayilar.add(3);
		sayilar.add(4);
		sayilar.add(1);
		sayilar.add(3);
		sayilar.add(4);
		sayilar.add(1);
		
		for (Integer integer : sayilar) {
			System.out.println(integer);
		}
		
		System.out.println("\n---------------------------------\n");
		ArrayList<Integer> sayilar2 = new ArrayList<Integer>();
		sayilar2.add(1);
		sayilar2.add(2);
		sayilar2.add(3);
		sayilar2.add(4);
		sayilar2.add(1);
		sayilar2.add(3);
		sayilar2.add(4);
		sayilar2.add(1);
		sayilar2.add(1);
		sayilar2.add(2);
		sayilar2.add(3);
		sayilar2.add(4);
		sayilar2.add(1);
		sayilar2.add(3);
		sayilar2.add(4);
		sayilar2.add(1);
		
		for (Integer integer : sayilar2) {
			System.out.println(integer);
		}
	}
}
