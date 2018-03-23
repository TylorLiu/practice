package org.tylor.other.concurrency;

import java.util.Date;
import java.util.Deque;


/**
 * @author liubin10
 *		   2017年5月25日
 */
public class WriterTask implements Runnable {
	private Deque<Event> deque;
	public WriterTask (Deque<Event> deque){
		this.deque=deque;
	}
	@Override
	public void run() {
        for (int i = 1; i < 100; i++) {
            Event event = new Event();
            event.setDate(new Date());
            event.setEvent(String
                .format("The thread %s has generated an   event", Thread.currentThread().getId()));
            deque.addFirst(event);
            try {
                Thread.sleep(1000);
                //		   TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
