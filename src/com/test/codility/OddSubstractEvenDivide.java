package com.test.codility;

public class OddSubstractEvenDivide {

	public int solution(String S) {
        // write your code in Java SE 8
		int intVal = Integer.parseInt(S, 2);
		int finalValue = intVal;
		int counter = 0;

		while (finalValue != 0) {

			if(finalValue % 2 == 0) {
				finalValue = finalValue/2;
			} else {
				finalValue = finalValue - 1;
			}

			counter++;
		}


		return counter;

	}

	public static void main(String[] args) {

		OddSubstractEvenDivide osed = new OddSubstractEvenDivide();
		System.out.println("Final Value: " + osed.solution("011100"));
	}

}
