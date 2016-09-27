public class Circle {
	
	public static void main (String[] args) {
		int x = Integer.parseInt (args[0]);
		int y = Integer.parseInt (args[1]);
		int x0 = Integer.parseInt (args[2]);
		int y0 = Integer.parseInt (args[3]);
		int r = Integer.parseInt (args[4]);

			if(((x - x0) * (x - 0) + (y - y0)) < r * r) {
				System.out.println ("Dot on circle");	
			}
			else {

				System.out.println ("Dot out of circle");
				
			}
	}
}