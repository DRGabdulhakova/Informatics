class DistanceCalculator {

	double calculate (Point p) {
	int x = p.getX();
	int y = p.getY();
	int x0 = p.getX0();
	int y0 = p.getY0();
	return Math.sqrt((x0-x) * (x0-x) + (y0-y) * (y0-y));
}
}
