package org.tylor.other.jvm;

import java.util.ArrayList;
import java.util.List;
/**
 * String.intern()导致运行时常量池溢出
 * -XX:MetaspaceSize=10m
 */

public class StringOomMock {
	static String base = "string";

	public static void main(String[] args) throws InterruptedException {

        /**
         * 导致heap space溢出
         */
//		List<String> list = new ArrayList<String>();
//		int i = 0;
//		try {
//			for (i = 0; i < Integer.MAX_VALUE; i++) {
//				String str = base + base;
//				base = str;
//				list.add(str.intern());
//			}
//		} finally {
//			System.out.println(i);
//		}
        /**
         * intern()不占用metaspace
         */
        StringBuilder stringBuilder =new StringBuilder("init");
        Thread.sleep(10000);
        for (int i = 0; i < 10000; i++) {
            stringBuilder.append(i);
            stringBuilder.toString().intern();
            Thread.sleep(10);
        }

    Thread.sleep(111111);

	}
}