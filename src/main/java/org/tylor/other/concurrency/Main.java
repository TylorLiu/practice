package org.tylor.other.concurrency;

import java.util.ArrayDeque;
import java.util.Deque;


/**
 *
 * CleanerTask使用守护线程，程序空闲时才会执行，只有守护线程工作时程序exit
 * @author liubin10
 *		   2017年5月25日
 */
public class Main {
	public static void main(String[] args) {
		Deque<Event> deque=new ArrayDeque<Event>();
		ExceptionHandler handler = new ExceptionHandler();
		WriterTask writer=new WriterTask(deque);
		for (int i=0; i<3; i++){
			Thread thread=new Thread(writer);
			thread.setUncaughtExceptionHandler(handler);
			thread.start();
		}
		CleanerTask cleaner=new CleanerTask(deque);
		cleaner.start();
	}
}
