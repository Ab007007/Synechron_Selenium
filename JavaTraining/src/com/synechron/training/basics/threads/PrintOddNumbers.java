package com.synechron.training.basics.threads;

public class PrintOddNumbers extends Thread {
	
	
	
	
	@Override
	public void run() {
		try 
		{
			ThreadsDemo.printOddNumbers();
		}
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
