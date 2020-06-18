package codility.equilibrium;

public class Task3 {

	public int solution(int[] A) {
        // write your code in Java SE 8
		int retVal = -1;
		Integer PminusQ = null;
		Integer QminusR = null;
		Integer depth = null;

		for(int p = 0; p < A.length; p++) {

			int P = A[p];
			int Q = 0;
			int R = 0;

			for(int q = p+1; q < A.length; q++) {

				Q = A[q];

				if(A[q] < A[p]) {
					continue;
				} else {

					Q = A[q-1];

					for (int r = q + 1; r < A.length; r++) {
						R = A[r];

						if(R > Q) {
							continue;
						} else {
							R = A[r-1];
							break;
						}
					}

					break;
				}
			}

			int currPminQ = P - Q;
			int currQminR = R - Q;

			if (PminusQ == null) {
				PminusQ = currPminQ;
			} else if (PminusQ.intValue() > currPminQ) {
				PminusQ = currPminQ;
			}

			if (QminusR == null) {
				QminusR = currQminR;
			} else if (QminusR.intValue() < currQminR) {
				QminusR = currQminR;
			}

			int currDepth = (PminusQ < QminusR) ? PminusQ : QminusR;
			if(depth == null) {
				depth = currDepth;
			} else if (currDepth > depth) {
				depth = currDepth;
			}

			retVal = depth;

		}

		return retVal;
    }

	public static void main(String[] args) {

		int[] arr = {0, 1, 3, -2, 0, 1, 0, -3, 2, 3};

		Task3 task3 = new Task3();

		task3.solution(arr);

	}

}
