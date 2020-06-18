package codility.equilibrium;

public class Task2 {


    public int solution(IntList L) {
        // write your code in Java SE 8

    	IntList next = L.next;

    	while(next.next != null) {

    		next = next.next;
    	}

    	return next.value;
    }

    public static void main(String[] args) {

    	IntList A = new IntList();
    	A.value = 1;

    	IntList B = new IntList();
    	B.value = 2;

    	IntList C = new IntList();
    	C.value = 3;

    	IntList D = new IntList();
    	D.value = 4;

    	IntList E = new IntList();
    	E.value = 5;

    	A.next = B;
    	B.next = C;
    	C.next = D;
    	D.next = E;

    	Task2 task2 = new Task2();

    	System.out.println(task2.solution(A));

	}
}
