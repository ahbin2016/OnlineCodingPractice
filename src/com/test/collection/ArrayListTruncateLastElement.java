package com.test.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListTruncateLastElement {
	
	public List<Integer> truncateArray(List<Integer> integerArray) {
		
		List<Integer> newList = new ArrayList();
		int listLength = integerArray.size() - 1;
		
		for(int i = 0; i < listLength; i++) {
			
			newList.add((Integer)integerArray.get(i));			
		}
		
		return newList;
	}
	
	public static void main(String[] args) {
		
		ArrayListTruncateLastElement alt = new ArrayListTruncateLastElement();
		Integer[] intArr = {new Integer(1),new Integer(2),new Integer(3),new Integer(4),new Integer(5),new Integer(6),new Integer(7),new Integer(8),new Integer(9),new Integer(10)};
		List<Integer> sampleList = Arrays.asList(intArr);
		
		for(Integer i: sampleList) {
			System.out.println("Param: " + i);
		}
		
		List<Integer> resultList = alt.truncateArray(sampleList);
		
		for(Integer i: resultList) {
			System.out.println("Result: " + i);
		}
	}
}
