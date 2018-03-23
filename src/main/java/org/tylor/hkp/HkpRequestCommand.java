/**
 * 
 */
package org.tylor.hkp;

/**
 * @author dengyishi
 *
 *         2017年4月20日 下午8:07:20
 */
public enum HkpRequestCommand {
	/**
	 * 上报设备在线状态请求
	 */
	REPORT_DEVONLINE_REQ("REPORT_DEVONLINE_REQ"),
	/**
	 * 上报设备信息请求。 说明：平台添加离线设备后，设备代理检测到设备上线后主动上报设备信息。
	 * Ehome设备注册成功后立即上报，SDK可能存在检测时间的延时。
	 * 
	 */
	REPORT_DEVINFO_REQ("REPORT_DEVINFO_REQ"), TRANSSTDCONFIG("TRANSSTDCONFIG"),
  /**
   * 透传
   */
  TRANSCONFIG("TRANSCONFIG"),
	/**
	 * VAG信息注册
	 */
	REGISTER_REQ("REGISTER_REQ"),
	/**
	 * VAG校时
	 */
	SET_TIME_REQ("SET_TIME_REQ"),
	/**
	 * 删除设备
	 */
	DEL_DEV_REQ("DEL_DEV_REQ"),
	/**
	 * 添加设备
	 */
	GET_DEVINFO_REQ("GET_DEVINFO_REQ"),
	
	/**
	 * 录像计划 设置
	 */
	SET_RECORD_CONFIG("SET_RECORD_CONFIG"),
	/**
	 * 录像计划 查询
	 */
	GET_RECORD_CONFIG("GET_RECORD_CONFIG"),
	/**
	 * 录像文件查询
	 */
	QUERY_RECORD_FILE("QUERY_RECORD_FILE"),
	
	/**
	 * 获取设备配置
	 */
	GETDEVICECONFIG("GETDEVICECONFIG"),
	
	/**
	 * 获取设备配置
	 */
	SETDEVICECONFIG("SETDEVICECONFIG");
	
	
	


	private String command;

	HkpRequestCommand(String command) {
		this.command = command;
	}

	public String getCommand() {
		return command;
	}

}
