package com.stringexamples;

import java.util.Scanner;

public class NoOfwords {

	public static void main(String[] args) {
		String s;
		Scanner s1=new Scanner(System.in);
		System.out.println("enter a string");
		s=s1.next();
		s1.close();
		System.out.println(s);
		
		char[] ch=s.toCharArray();
		System.out.println(ch.length);
		
		

	}

}
