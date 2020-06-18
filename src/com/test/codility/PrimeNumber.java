package com.test.codility;

public class PrimeNumber {

	public boolean checkPrime(int n) {

		boolean isPrime = true;

		int mod = -1;

		//prime numbers are only divisible by 1 and itself. skip 1
		for(int i = 2; i < n; i++) {

			mod = n % i;

			if (mod == 0) {
				System.out.println(n + " is divisible by " + i);
				isPrime = false;
				break;
			}
		}


		return isPrime;

	}

	public static void main(String[] args) {

		PrimeNumber pn = new PrimeNumber();

		System.out.println("PRIME: " + pn.checkPrime(607573139));
	}

}
