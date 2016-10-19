import java.io.*;

public class PointViewer {

	public static void main(String[] args) throws FileNotFoundException {

	Point point = new Point();
	point.getPoint();
	DistanceCalculator discalc = new DistanceCalculator();
	System.out.println ("Distance is " + discalc.calculate(point));
	}
	}