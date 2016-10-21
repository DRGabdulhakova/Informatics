import java.util.Scanner;

public class Committee {
	String join() {
		
		String t1 = "Union Сommittee";
		String t2 = "Sports Organisation";
		String t3 = "Cultural Organisation";
		String t4 = "Social Organisation";
		String n = "No organisation";

		System.out.println("1) Union Committee");
		System.out.println("2) Sports Organisation");
		System.out.println("3) Cultural Organisation");
		System.out.println("4) Social Organisation"); 

		Scanner scan = new Scanner(System.in);
		System.out.println("Select organisation: ");
		int unionСommittee = scan.nextInt();

		if ( unionСommittee == 1) return t1;
		else if ( unionСommittee == 2) return t2;
		else if ( unionСommittee == 3) return t3;
		else if ( unionСommittee == 4) return t4;
		else System.exit(0);
		return n;
	}	
}
