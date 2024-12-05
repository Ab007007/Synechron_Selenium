package com.synechron.training.basics.threads;

public class PrintEvenNumbers extends Thread {
	
	
	
	
	@Override
	public void run() {
		try 
		{
			ThreadsDemo.printEvenNumbers();
		}
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
