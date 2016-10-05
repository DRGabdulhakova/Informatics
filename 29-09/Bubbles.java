import java.util.Arrays;

public class Bubbles {

	public static void main(String [] args) {

		int[] a = {4, 7, 2, 9, 0, 1, 9, 12 ,56 ,78};
    	boolean swap = false;
    	int k;

    	while(!swap) {
    		swap = true;

    		for (int i = 0; i < a.length - 1; i++) {

    			if (a[i] > a[i+1]) {

    				k = a[i+1];
    				a[i+1] = a[i];
    				a[i] = k;
    				swap = false;

    			}
    		}
    	}

    	System.out.print(Arrays.toString(a));

    }
}