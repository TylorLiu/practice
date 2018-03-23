package org.tylor.other.basic;

/**
 * final对象可修改其属性值
 */

public class FinalParam {
	public static void main(String[] args) {
		FinalParam param = new FinalParam();
		Param p = param.new Param();
		param.change(p);
		System.out.println(p.key);
	}
	void change (final Param param){
		param.key="22121";
		param.value="12wwqqw";
	}
	public class Param{
		String key="122242";
		String value;
	}

}
