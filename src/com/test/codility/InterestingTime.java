package com.test.codility;

public class InterestingTime {

	public int solution(String S, String T) {

		int interestingCount = 0;
		String[] startArr = S.split(":");
		String[] endArr = T.split(":");

		int startHour = Integer.parseInt(startArr[0]);
		int startMinute = Integer.parseInt(startArr[1]);
		int startSecond = Integer.parseInt(startArr[2]);

		int endHour = Integer.parseInt(endArr[0]);
		int endMinute = Integer.parseInt(endArr[1]);
		int endSecond = Integer.parseInt(endArr[2]);

		/*if (endSecond == 0) {
			endMinute = 59;
			endHour--;
			endSecond = 59;
		}*/

		for (int h = startHour; h <= endHour; h++) {

			String hourDigits = String.format("%02d", h);

			int minutesCount = 59;
			int secondsCount = 59;

			if (h > 0 && h < endHour) {
				startMinute = 0;
				minutesCount = 59;
				startSecond = 0;
				secondsCount = 59;
			} else if (h==0) {

			}

			for (int m = startMinute; m <= minutesCount; m++) {

				String minuteDigits = String.format("%02d", m);

				//int secondsCount = ((h == endHour) && (m == endMinute)) ? endSecond : 59;

						for (int s = startSecond; s <= secondsCount; s++) {

							char digitOne = 'n';
							char digitTwo = 'n';

							String secondDigits = String.format("%02d", s);

							String fullTime = hourDigits + minuteDigits + secondDigits;

							System.out.println("Checking time: " + fullTime);

							char[] fullTimeArr = fullTime.toCharArray();

							for (int t = 0; t < fullTimeArr.length; t++) {

								if (digitOne == 'n') {
									digitOne = fullTimeArr[t];
								} else if (digitTwo == 'n') {

									if (fullTimeArr[t] != digitOne) {

										digitTwo = fullTimeArr[t];
									}
									//ALL OTHER DIGITS TO THE LEFT ARE THE SAME EXCEPT FOR THIS LAST ONE
									if(t == fullTimeArr.length - 1) {

										interestingCount += 1;
										System.out.println("GOTCHA: " + fullTime);
									}

								} else if ((fullTimeArr[t] == digitOne) || (fullTimeArr[t] == digitTwo)) {

									if(t == fullTimeArr.length - 1) {

										interestingCount += 1;

										System.out.println("GOTCHA: " + fullTime);
									}
								}
							}

							if ((h == endHour) && (m == endMinute) && (s == endSecond)) {

								System.out.println("End Time Reached. Terminating....");
								return interestingCount;
							}
						}
					}
			  }

		return interestingCount;
	}

	public static void main(String[] args) {

		InterestingTime it = new InterestingTime();

		//int countTimes = it.solution("22:22:21", "22:22:59");
		int countTimes = it.solution("15:15:55", "17:17:17");

		System.out.println("Count: " + countTimes);
	}
}
