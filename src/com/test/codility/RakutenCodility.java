package com.test.codility;

public class RakutenCodility {

	public int getBinarianLength(int[] A) {
        // write your code in Java SE 8
		int shortLength = 0;

		int arrayBinarian = 0;

		for(int i = 0; i < A.length; i++) {

			arrayBinarian = (int) (arrayBinarian + Math.pow(2, A[i]));
		}

		System.out.println(arrayBinarian);

		String binStr = Integer.toBinaryString(arrayBinarian);
		System.out.println(binStr);

		for (int j = 0; j < binStr.length(); j++) {

			String b = binStr.substring(j, j+1);

			if("1".equals(b)) {
				shortLength++;
			}
		}

		return shortLength;
    }


	public static void main(String[] args) {

		RakutenCodility rc = new RakutenCodility();

		int[] Arr = {1,3,4,5,1,6,2,1,0,9,8};

		System.out.println(rc.getBinarianLength(Arr));

	}

}
