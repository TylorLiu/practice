package org.tylor.hkp.client.bizModel.channel;

public class Windows {

	private String pipChan;
	private String topLeftX;
	private String topLeftY;
	private String height;
	private String width;
	public String getPipChan() {
		return pipChan;
	}
	public Windows(String pipChan, String topLeftX, String topLeftY,
			String height, String width) {
		super();
		this.pipChan = pipChan;
		this.topLeftX = topLeftX;
		this.topLeftY = topLeftY;
		this.height = height;
		this.width = width;
	}
	public void setPipChan(String pipChan) {
		this.pipChan = pipChan;
	}
	public String getTopLeftX() {
		return topLeftX;
	}
	public void setTopLeftX(String topLeftX) {
		this.topLeftX = topLeftX;
	}
	public String getTopLeftY() {
		return topLeftY;
	}
	public void setTopLeftY(String topLeftY) {
		this.topLeftY = topLeftY;
	}
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	public String getWidth() {
		return width;
	}
	public void setWidth(String width) {
		this.width = width;
	}
	
	
}
