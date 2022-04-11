package com.training.cg;

public class MyThread implements Runnable {

	private Thread t;
	private String threadName;
	
	MyThread(String name){
		threadName = name;
	}
	
	@Override
	public void run() {
		System.out.println(threadName +": is running");
		
		for(int i =3;i>0;i--) {
			System.out.println("Thread "+threadName +"," + i);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Thread "+threadName  + " exiting");
		}
		
	}
	
	public void go() {
		t = new Thread(this, threadName);
		t.start();
	}
}

//1. Implement Runnable interface
//2. Extend Thread class
//3. Thread life-cycle : Born->Runnable->Running->waiting->Dead
//4. Deadlock





