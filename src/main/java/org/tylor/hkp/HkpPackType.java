/**
 * 
 */
package org.tylor.hkp;

/**
 * @author dengyishi
 *
 *         2017年4月20日 下午7:56:55
 */
public enum HkpPackType {
	/**
	 * VAG xml报文中的 <Pack type="PPVSP">,目前PPVSP协议没有VAG主动请求
	 */
	PPVSP("PPVSP"),
	/**
	 * VAG xml报文中的 <Pack type="HKP">
	 */
	HKP("HKP"),
	/**
	 * VAG xml报文中的 <Pack type="PAG">
	 */
	PAG("PAG");
	private String packType;

	HkpPackType(String packType) {
		this.packType = packType;
	}

	public String getPackType() {
		return packType;
	}

}
