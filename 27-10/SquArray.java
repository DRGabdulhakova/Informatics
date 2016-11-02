import java.util.Arrays;

public class SquArray{

    public static void main(String[] args) {
	
	    int n = 5;
		long arr[] = new long [n];
            
		arr[0] = (int) (Math.random() * 10);
		
		
		for (long a: arr) {                                     
            System.out.print(a + " ");
		}
						
        for (int i = 1; i <= arr.length-1; i++) { 		
           
		   arr[i] = arr[i-1] * arr[i-1];
        }
		
        String arrString = Arrays.toString(arr);
		System.out.println(arrString);
    }
			
}