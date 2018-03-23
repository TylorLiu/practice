package org.tylor.other.input;

import java.util.Scanner;

public class SystemInput {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String name = in.nextLine();
		int age = in.nextInt();
		System.out.println("my name is "+name+" and I'm "+age);
		in.close();
	}
}
