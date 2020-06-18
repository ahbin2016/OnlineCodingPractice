package com.test.codility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SwapSortAscending {

	public boolean solution(int[] A) {

		int numLength = A.length;

		int changeCount = 0;

		List<Integer> numArrList = new ArrayList<>();
		List<Integer> sortedNumList = new ArrayList<>();

			for (int i = 0; i < numLength; i++) {

				numArrList.add(A[i]);
			}

			for (int k = 0; k < numLength; k++) {
				sortedNumList.add(A[k]);
			}


			Collections.sort(sortedNumList);


            for (int n = 0; n < numLength; n++) {

            	int baseVal = numArrList.get(n);
            	int newVal = sortedNumList.get(n);

            	if (baseVal != newVal) {
            		changeCount += 1;
            	}
            }


		if (changeCount > 2) {
			return false;
		} else {
			return true;
		}

	}

}
