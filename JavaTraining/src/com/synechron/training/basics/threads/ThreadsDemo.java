package com.synechron.training.basics.threads;

import java.util.Iterator;

public class ThreadsDemo {

	
	public static void printOddNumbers() throws InterruptedException
	{
		for (int i = 1; i <=100; i++) {
			System.out.println("OddNumber " + i);
			i++;
			
			Thread.sleep(1000);
		}
	}

	public static void printEvenNumbers() throws InterruptedException
	{
		for (int i = 2; i <=100; i++) {
			System.out.println("Even number " + i);
			i++;
			Thread.sleep(1000);
		}
	}
	


	public static void main(String[] args) throws InterruptedException  {
		
		printOddNumbers();
		System.out.println("*****************************");
		printEvenNumbers();
	}
}
