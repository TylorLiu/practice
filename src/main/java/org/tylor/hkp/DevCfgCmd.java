package org.tylor.hkp;

/**
 * @author liubin10
 *		   2017年8月1日
 *
 * @function 设备配置命令
 */
public enum DevCfgCmd {
	
	GetPipStatus("GetPipStatus"),
	GetAutoTrack("GetAutoTrack"),
	GetRecordingHostInfo("GetRecordingHostInfo"),
	GetMultiStreamCompressionCfg("GetMultiStreamCompressionCfg"),
	
	SetPipStatus("SetPipStatus"),
	SetAutoTrack("SetAutoTrack"),
	SetRecordingHostInfo("SetRecordingHostInfo"),
	SetMultiStreamCompressionCfg("SetMultiStreamCompressionCfg");
	
	private String cmd;

	DevCfgCmd(String command) {
		this.cmd = command;
	}

	public String getCmd() {
		return cmd;
	}

}
