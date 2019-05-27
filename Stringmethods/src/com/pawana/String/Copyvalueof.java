package com.pawana.String;
public class Copyvalueof 
{
public static void main(String[] args) 
{
		char[] Array= {'a','b','c','d','f'};
		String a=new String("vagdevi");
		String b=new String("devi");
		a=a.copyValueOf(Array);                //copyValueof(data);
		System.out.println(a);
		b=b.copyValueOf(Array, 1, 4);         //copyValueOf(data, offset, count);
		System.out.println(b);
}
}