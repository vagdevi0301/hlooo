package com.pawana.String;

public class Contentequals {

	public static void main(String[] args) {
	String a=new String("vagdevi");
	String b=new String("devi");
	StringBuffer c=new StringBuffer("devi");
	StringBuffer d=new StringBuffer("vagdevi");
	System.out.println(a.contentEquals(b));
	System.out.println(a.contentEquals(d));
	}

}
