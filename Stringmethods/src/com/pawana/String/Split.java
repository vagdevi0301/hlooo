package com.pawana.String;

public class Split {

	public static void main(String[] args) {
	String a=new String("this is  vagdevi");
	String Array1[]=a.split("v", 7);
	System.out.println("zero limit split :");
	for(String str1:Array1)
	{
		System.out.println(str1);
	}
	String Array2[]=a.split("i", -1);
	System.out.println("zero limit split :");
	for(String str2:Array2)
	{
		System.out.println(str2);
	}
	System.out.println("end of the string");
	}
}
