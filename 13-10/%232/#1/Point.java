import java.util.Scanner;
import java.io.*;

public class Point {
	int x, y;
	int x0, y0;

	Point() {
	x = 0;
	y = 0;
	x0 = 0;
	y0 = 0;
	}

	void getPoint() throws FileNotFoundException {
		File f = new File("C://Users//hp//Desktop//task.txt"); 
		Scanner sc = new Scanner(f); 
		sc.useDelimiter(", ");
		x = sc.nextInt();
		y = sc.nextInt();
		x0 = sc.nextInt();
		y0 = sc.nextInt();
	}

	public int getX() {
	return x;
	}


	public int getY() {
	return y;
	}


	public int getX0() {
	return x0;
	}


	public int getY0() {
	return y0;
}
}