package org.tylor.hkp;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 把某个Serivce Bean标记为VAG请求处理器
 * 
 * @author dengyishi
 *
 *         2017年4月20日 下午7:54:37
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface HkpRequestMapping {
	/**
	 * VAG XML中的pack type="?"，目前只有HKP的主动请求
	 * 
	 * @return
	 * @author dengyishi 2016年10月14日 上午10:39:14
	 */
	HkpPackType packType() default HkpPackType.HKP;

	HkpRequestCommand command();
}
