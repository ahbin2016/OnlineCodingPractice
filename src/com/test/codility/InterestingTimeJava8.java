package com.test.codility;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class InterestingTimeJava8 {

		public int solution(String S, String T) {

			int interestingCount = 0;
			char digitOne = 'n';
			char digitTwo = 'n';

			String[] startArr = S.split(":");
			String[] endArr = T.split(":");

			LocalTime resetTime = LocalTime.of(0, 0, 0);

			int startHour = Integer.parseInt(startArr[0]);
			int startMinutes = Integer.parseInt(startArr[1]);
			int startSeconds = Integer.parseInt(startArr[2]);

			LocalTime startTime = LocalTime.of(startHour, startMinutes, startSeconds);
			System.out.println("START TIME: " + startTime);

			int endHour = Integer.parseInt(endArr[0]);
			int endMinutes = Integer.parseInt(endArr[1]);
			int endSeconds = Integer.parseInt(endArr[2]);

			LocalTime endTime = LocalTime.of(endHour, endMinutes, endSeconds);
			System.out.println("END TIME: " + endTime);

			LocalTime runningTime = startTime;

			while (!runningTime.isAfter(endTime)) {

				String formattedRunningTime = runningTime.format(DateTimeFormatter.ofPattern("HH:mm:ss"));

				//System.out.println("RUNNING TIME: " + formattedRunningTime);

				char[] runningTimeChars = formattedRunningTime.toCharArray();

				int length = runningTimeChars.length;
				int lastIndex = length - 1;

				//System.out.println("LENGTH: " + length + " , LAST INDEX: " + lastIndex);

				for (int i = 0; i < length; i++) {

					char currentChar = runningTimeChars[i];

					if (currentChar == ':') {
						//System.out.println("Skipping: " + currentChar);
						continue;
					}

						if (digitOne == 'n') {
							//System.out.println("assiging digit ONE: " + currentChar);
							digitOne = currentChar;

						} else if (digitTwo == 'n') {

							if(currentChar != digitOne) {
								//System.out.println("assiging digit TWO: " + currentChar);
								digitTwo = currentChar;
							}

							if (i == lastIndex) {
								interestingCount++;
								System.out.println("INTERESTING 1: " + formattedRunningTime);
							}

						} else if (currentChar == digitOne || currentChar == digitTwo) {

							if (i == lastIndex) {
								interestingCount++;
								System.out.println("INTERESTING 2: " + formattedRunningTime);
							}
						} else {
							break;
						}
				}

				runningTime = runningTime.plusSeconds(1);
				digitOne = 'n';
				digitTwo = 'n';

				if (runningTime.equals(resetTime)) {
					return interestingCount;
				}
			}

			return interestingCount;

		}

		public static void main(String[] args) {

			InterestingTimeJava8 it = new InterestingTimeJava8();

			//int countTimes = it.solution("22:22:21", "22:22:59");
			int countTimes = it.solution("00:00:00", "23:59:59");
			//int countTimes = it.solution("15:15:10", "15:15:12");
			//int countTimes = it.solution("12:00:00", "23:59:59");
			System.out.println("Count: " + countTimes);
		}

}
