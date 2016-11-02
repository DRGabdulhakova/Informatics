public class InvertedArray {

    public static void main(String[] args) {
        int[] arr = new int[10];
        int tmp = 0;
        
        System.out.println("The array: ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
            System.out.print(arr[i] + ", ");
        }

        System.out.println("\n" + "\n" + "Inverted array: ");

        for (int i = 0; i < arr.length / 2; i++) {
            tmp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = tmp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }

}