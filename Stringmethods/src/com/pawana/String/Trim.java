package com.pawana.String;

public class Trim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String a=new String("  this is vagdevi ");
System.out.println(a.trim());
System.out.println(a.replace("is", "si"));             //replace(oldChar, newChar));
System.out.println(a.replace(a, "this"));            //.replace(target, replacement));
System.out.println(a.replaceAll(a, "hi"));           //replaceAll(regex, replacement);
System.out.println(a.replaceFirst(a, "k"));     //replaceFirst(regex, replacement))
	}

}
