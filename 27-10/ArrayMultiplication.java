public class ArrayMultiplication{

    public static void main(String[] args) {

        int size = ((int) (Math.random() * 10) + 3);  
        System.out.println("The size of array is " + size);
        long[] arr = new long[size];

        for (int i = 0; i < 2; i++) {
            arr[i] = ((int) (Math.random() * 4 + 1));
        }

        for (long i: arr) {                                     
            System.out.print(i + " ");
        }

        for (int i = 2; i < size; i++) {
            arr[i] = arr[i - 2] * arr[i - 1];
        }

        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
    }
}