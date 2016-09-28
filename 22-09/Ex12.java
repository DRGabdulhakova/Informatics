public class Ex12 {

	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);

		if (n >= 1) {

			for (int i = 1; i <= n; i++) {

				for (int j = 0 ; j < n - i ; j++) System.out.print(" ");
				for (int k = 0 ; k < i ; k++) System.out.print("* ");

				if (i < n) System.out.println("");
			}
		} else {

			System.out.print("Select a number greater than 0);

		}

	}

}