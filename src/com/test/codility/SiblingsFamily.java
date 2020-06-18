package com.test.codility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SiblingsFamily {

	public int largestSibling(int N) {

		int retVal = 0;


		String strN = String.valueOf(N);

		System.out.println(strN);

		int numLength = strN.length();

		List<Integer> numArrList = new ArrayList<>();

		StringBuffer reversedNumStr = new StringBuffer();




			for (int i = 0; i < numLength; i++) {

				int currNum = Integer.parseInt(String.valueOf(strN.charAt(i)));

				//System.out.println("adding " + currNum);
				numArrList.add(currNum);

			}

			Collections.sort(numArrList);


            for (int k = numLength -1; k >= 0; k--) {
            	reversedNumStr.append(numArrList.get(k));
            }

            retVal = Integer.valueOf(reversedNumStr.toString());

		return retVal;


	}

	public static void main(String[] args) {

		SiblingsFamily sb = new SiblingsFamily();
		int largestNum = sb.largestSibling(345967513);

		System.out.println(largestNum);
	}

}
