package codility.equilibrium;

public class MatrixEquilibriumPoints {

	public int solution(int[][] A) {
        // write your code in Java SE 8
		int rowsLength = A.length;
		int columnsLength = A[0].length;

		int equilibriumPoints = 0;

		//check ROW sums
		for (int r = 0; r < rowsLength; r++) {

			int rowsSumBelow = 0;
			int rowsSumAbove = 0;
			int colsSumLeft = 0;
			int colsSumRight = 0;

			for (int c = 0; c < columnsLength; c++) {

				for (int belowR = 0; belowR < r; belowR++ ) {

					rowsSumBelow = rowsSumBelow + A[belowR][c];
				}

				for (int aboveR = r + 1; aboveR < rowsLength; aboveR++) {

					rowsSumAbove = rowsSumAbove + A[aboveR][c];
				}
			}

				System.out.println("RowSumBelow: " + rowsSumBelow + " - RowSumAbove: " + rowsSumAbove);

				if (rowsSumBelow == rowsSumAbove) {

					for (int c = 0; c < columnsLength; c++) {


						for (int leftC = 0; leftC < c; leftC++) {

							for (int cr = 0; cr < rowsLength; cr++) {
								colsSumLeft = colsSumLeft + A[cr][leftC];
							}
						}

						for (int rightC = c + 1; rightC < columnsLength; rightC++) {

							for (int cr = 0; cr < rowsLength; cr++) {
								colsSumRight = colsSumRight + A[cr][rightC];
							}
						}
					}

					System.out.println("colsSumLeft: " + colsSumLeft + " - colsSumRight: " + colsSumRight);

					if (colsSumLeft == colsSumRight) {
						equilibriumPoints++;
					}

				}

		}





		return equilibriumPoints;
    }

	public static void main(String[] args) {

		int[][] A = new int[5][3];

		A[0][0] = 2;    A[0][1] = 7;    A[0][2] =  5;
				  A[1][0] = 3;    A[1][1] = 1;    A[1][2] =  1;
				  A[2][0] = 2;   A[2][1] = 1;    A[2][2] = -7;
				  A[3][0] = 0;    A[3][1] = 2;    A[3][2] =  1;
				  A[4][0] = 1;    A[4][1] = 6;    A[4][2] =  8;

		MatrixEquilibriumPoints mep = new MatrixEquilibriumPoints();
		System.out.println("Equilibrium Points: " + mep.solution(A));


	}

}
