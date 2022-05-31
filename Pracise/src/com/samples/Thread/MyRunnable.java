package com.samples.Thread;

class test implements Runnable
{

	@Override
	public void run() {
		MyRunnable run = new MyRunnable();
		MyRunnable.getDat2();
		
	}
	
}
public class MyRunnable implements Runnable {
	

	public static void main(String[] args) {
		Thread T1 = new Thread(new MyRunnable(),"Thread 1");
		Thread T2 = new Thread(new test(),"Thread 2 - Test");
		//Thread T3 = new Thread(new MyRunnable(),"Thread 3");
		
		T1.start();
		T2.start();
		//T3.start();
	
	}

	@Override
	public void run() {
		MyRunnable run = new MyRunnable();
		MyRunnable.getDat();
	}
	
	public synchronized static void getDat()
	{
		//synchronized (MyRunnable.class) {
			for (int t = 0; t < 10; t++) {

				System.out.println(Thread.currentThread().getName() + "- Number :" + t);
			//}
		}
		

	}
	
	public  synchronized static void getDat2()
	{
		//synchronized (MyRunnable.class) {
			for (int t = 0; t < 2; t++) {

				System.out.println(Thread.currentThread().getName() + "- Number :" + t + " in getDat2() method ");
			}
		//}

	}

}
