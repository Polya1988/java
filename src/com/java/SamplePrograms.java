package com.java;

import java.util.Scanner;

public class SamplePrograms {

	public static void main(String[] args) {
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		n=s.nextInt();
		s.close();
		
		for(int i=n;i>=0;i--){
			System.out.println(i);

	}

}
}