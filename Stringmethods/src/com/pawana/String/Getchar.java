package com.pawana.String;

public class Getchar {

	public static void main(String[] args) {
	String a=new String("this is vagdevi");
	char[]Array=new char[3];
	a.getChars(1, 3, Array, 0);
	for(char b:Array) {
		System.out.print(b);
	}
	char[]Array1=new char[] {'a','b','c','d'};
	a.getChars(0, 1, Array1, 1);
	for(char b:Array1) {
		System.out.print(b);
	}
	
	}
}