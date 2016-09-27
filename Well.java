public class Well {
    public static void main(String[] args) {
    	int  t = Integer.parseInt(args[0]);
        double g = 9.8d;
        double h = (g * t * t)/2;

        System.out.println (h);
    }
}