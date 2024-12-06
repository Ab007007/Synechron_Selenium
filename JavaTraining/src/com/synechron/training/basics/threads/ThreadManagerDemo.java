package com.synechron.training.basics.threads;

import java.util.ArrayList;
import java.util.Iterator;

public class ThreadManagerDemo {
	
	public static void main(String[] args) throws InterruptedException {
		
		PrintOddNumbers po = new PrintOddNumbers();
		PrintEvenNumbers pe = new PrintEvenNumbers();
		
		po.start();
		pe.start();
		
		for (int i = 0; i < 100; i++) {
			System.out.println("Main " + i);
			Thread.sleep(1000);
		}
		
		System.out.println("Main Ended");
		
	}

}
