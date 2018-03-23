package org.tylor.other.concurrency;

import java.util.concurrent.TimeUnit;

/**
 *  Thread.join()主线程block等待子线程执行结束
 * @author liubin10
 *		   2017年5月19日
 */
public class Loader implements Runnable {
	
	public int i ;

	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		try {
			TimeUnit.SECONDS.sleep(i);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(i +"end");
	}
	
	
	public static void main(String[] args) {
		Loader loader1 = new Loader();
		loader1.i=4;
		Thread t1 = new Thread(loader1);
		Loader loader2= new Loader();
		Thread t2 = new Thread(loader2);
		loader2.i=10;

		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("the end");
		
	}

}
