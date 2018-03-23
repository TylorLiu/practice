package org.tylor.other.concurrency;

import java.lang.Thread.UncaughtExceptionHandler;

/**
 * @author liubin10
 *		   2017年5月25日
 */
public class ExceptionHandler implements UncaughtExceptionHandler{

	@Override
	public void uncaughtException(Thread t, Throwable e) {
	      System.out.printf("An exception has been captured\n");
	      System.out.printf("Thread: %s\n",t.getId());
	      System.out.printf("Exception: %s: %s\n",e.getClass().getName(),e.getMessage());
	      System.out.printf("Stack Trace: \n");
	      e.printStackTrace(System.out); System.out.printf("Thread status: %s\n",t.getState());
	}

}
