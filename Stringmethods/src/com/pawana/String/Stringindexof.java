package com.pawana.String;

public class Stringindexof {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String a=new String("this is vagdevi");
String b=new String("v");
System.out.println(a.indexOf('i'));          //int indexof(int ch);
System.out.println(a.indexOf('i',6));       //int indexof(int ch,iny fromIndex);
System.out.println(a.indexOf(b));           //int indexof(String str);
System.out.println(a.indexOf(b, 9));        //int indexof(String str,int fromIndex);
	}

}
