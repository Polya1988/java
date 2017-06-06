package com.stringexamples;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class DuplicateWords {

	public static void main(String[] args) {
		String s;
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter a string");
		s = s1.next();
		System.out.println(s);
		s1.close();
		char c[] = s.toCharArray();
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for (Character ch : c) {
			if (hm.containsKey(ch)) {
				System.out.println(hm.get(ch));
				hm.put(ch, hm.get(ch) + 1);
			} else {
				hm.put(ch, 1);
			}
		}

		Set<Character> k = hm.keySet();
		for (Character c1 : k) {

			if (hm.get(c1) > 1) {
				System.out.println(c1 + "->" + hm.get(c1));
			}
		}
		System.out.println(hm);
	}

}
