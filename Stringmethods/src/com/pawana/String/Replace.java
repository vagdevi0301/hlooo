package com.pawana.String;

public class Replace {

	public static void main(String[] args) {
		String a=new String("this is vagdevi");
		System.out.println(a.replace('i', 'k'));         //.replace(arg0, arg1),repalce;
System.out.println(a.replaceFirst(a, "is"));              //replaceFirst(regex, replacement);
System.out.println(a.replaceAll(a, "hi hru"));            //replaceAll(regex, replacement);
	}

}
