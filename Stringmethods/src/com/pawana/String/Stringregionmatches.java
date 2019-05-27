package com.pawana.String;

public class Stringregionmatches {

	public static void main(String[] args) {
		String a=new String("this is vagdevi");
		String b=new String("is");
		System.out.println(a.regionMatches(5, b, 0, 1));        //5=is index value,b=string name,0=starting index of b,1=end index of b
System.out.println(a.regionMatches(false, 5, b, 0, 1));
	}

}
