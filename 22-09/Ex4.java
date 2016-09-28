public class Ex4 {

	public static void main(String[]args) {

		int a1 = Integer.parseInt(args[0]);
		int a2 = Integer.parseInt(args[1]);
		int a3 = Integer.parseInt(args[2]);
		int diff = a2-a1;
		
		System.out.println(a1 + diff * (a3-1));
	}
}