package com.pawana.String;

public class Booleanignore {

	public static void main(String[] args) {
		String a=new String("vagdevi");
		String b=new String("devi");
		String c=new String("vagdevi");
		System.out.println(a.equalsIgnoreCase(b));
		System.out.println(a.equalsIgnoreCase(c));
		System.out.println(a.equalsIgnoreCase("devi"));
		System.out.println(a.equalsIgnoreCase("gdevi"));
		System.out.println(b.equalsIgnoreCase("devi"));

	}

}
