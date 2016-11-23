public class Palindrome6 {
	
	public static void main(String[] args) {
	

		String str = args[0];
		char[] line = str.toCharArray();
		boolean pol = true;

		if (str.length() == 0) {
		
			System.out.print("String length must be greater than zero");
			System.exit(0);
		}

		for (int i = 0; i < line.length/2; i++) {
			
			if (line[i] != line[line.length - 1 - i])
				
				pol = false;
		}
			if (pol) System.out.print("This is palindrome");
			
			else System.out.print("This isn't palindrome");

	}
}