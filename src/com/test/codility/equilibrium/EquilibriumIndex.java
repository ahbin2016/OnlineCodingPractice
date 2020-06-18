package codility.equilibrium;

public class EquilibriumIndex {

	    public Integer solution(int[] A) {
	        // write your code in Java SE 8
	        int size = A.length;
            Integer retVal = -1;

	        for(int p = 0; p < size; p++) {

	        	int lowerSum = 0;
	            int upperSum = 0;

	                System.out.println("Current P: " + p + " - Current Val: " + A[p]);

	                for(int l = 0; l < p; l++) {
	                  lowerSum = lowerSum + A[l];
	                  //System.out.println("current lowersum: " + lowerSum);
	                }

	                System.out.println("current lowersum: " + lowerSum);

	                for(int u = p + 1; u < size; u++) {
	                    upperSum = upperSum + A[u];
	                    System.out.println("adding to uppersum: " + A[u] + " Current uppersum: " + upperSum);
	                }

	                System.out.println("current uppersum: " + upperSum);

	                if(lowerSum == upperSum) {
	                	System.out.println("lower = upper at index " + p);
	                    retVal = p;
	                    break;
	                }
	        }




	        return retVal;
	    }

	    public static void main(String[] args) {

	    	EquilibriumIndex dt = new EquilibriumIndex();
	    	int[] arr = {-1,3,-4,5,1,-6,2,1};

	    	Integer i = dt.solution(arr);

	    	System.out.println("equilibrium index: " + i);
		}

}
