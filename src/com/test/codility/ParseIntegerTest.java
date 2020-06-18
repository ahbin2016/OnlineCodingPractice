package com.test.codility;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ParseIntegerTest {

	public static void main(String[] args) {

		//int i = Integer.parseInt("00");

		//LocalTime startTime = LocalTime.of(1, 15, 16);
		LocalTime startTime = LocalTime.of(0, 0, 0);
		String formattedTime = startTime.format(DateTimeFormatter.ofPattern("HH:mm:ss"));

		char[] charArray = startTime.toString().toCharArray();

		//char[] secondDigits = String.format("%02d", i).toCharArray();

		//System.out.print(":" + secondDigits[0] + secondDigits[1]);

		System.out.println(formattedTime);

		/*for (int i = 0; i < charArray.length; i++) {

			if (charArray[i] != ':') {
				System.out.println(charArray[i]);
			}
		}*/
	}

}
