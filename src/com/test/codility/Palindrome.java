package com.test.codility;

import java.util.ArrayList;
import java.util.List;

public class Palindrome {

	public List<Integer> getList(int lower, int upper) {

		System.out.println("Starting..");

		List<Integer> pals = new ArrayList<>();

		for (int i = lower; i <= upper; i++) {

			String s = String.valueOf(i);

			boolean isPal = true;
			int len = s.length();

			for (int j = 0; j < len; j++) {

				int rightIndex = len - (j + 1);
				char left = s.charAt(j);
				char right = s.charAt(rightIndex);

				if (left != right) {
					isPal = false;
					break;
				} else if (j >= rightIndex ) {
					break;
				}
			}

			if(isPal) {
				pals.add(new Integer(s));
				System.out.println(s + " IS A palindrome.");
			} else {
				//System.out.println(s + " IS NOT A palindrome.");
			}
		}

		return pals;
	}

	public static void main(String[] args) {

		Palindrome pal = new Palindrome();
		pal.getList(88500000, 89000000);
	}
}
