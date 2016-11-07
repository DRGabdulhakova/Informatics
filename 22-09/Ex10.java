class Ex10 {

	public static void main(String[] args) {

		int firstNum = Integer.parseInt(args[0]);
		int secondNum = Integer.parseInt(args[1]);
		int a = firstNum;
		int b = secondNum;
		
		if (firstNum < 0 || secondNum < 0) {

			System.out.print("Number must be greater than 0");

		} else {

			while (firstNum != 0 && secondNum != 0) {

				if ( firstNum > secondNum) {

					firstNum %= secondNum;

				} else {

					secondNum %= firstNum;

				}

			}

		}

		System.out.printf("Least Common Multiple is %d" , (a*b)/(firstNum+secondNum));
		
	}
}	