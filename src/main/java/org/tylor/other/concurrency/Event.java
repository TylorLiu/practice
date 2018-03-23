package org.tylor.other.concurrency;

import java.util.Date;

/**
 * @author liubin10
 *		   2017年5月25日
 */
public class Event {
	private Date date;
	private String event;
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getEvent() {
		return event;
	}
	public void setEvent(String event) {
		this.event = event;
	}

}
