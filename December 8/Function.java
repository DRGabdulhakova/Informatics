public class Function {
	
	public static void main(String[] args) {
		calculateInt(0, 10, 100, (new SinFunction()));
		System.out.println();
		calculateInt(0, 10, 100, (new CubFunction()));
	}

	public static void calculateInt(float a, float b, int n, FunctionAware f) {
		float sum = 0;
		float dx = (b - a) / n;
		
		for (float i = a; i < b; i += dx) {
			sum += dx * f.func(i);
		}

		System.out.println("Result: " + sum);
		sum = 0;
		
		for (float i = a; i < b; i += dx) {
			sum += dx * (f.func(i) + f.func(i + dx)) / 2;
		}
		System.out.println("Result by trapeze: " + sum);
		sum = 0;
		
		for (float i = 1; i < n; i += 2) {
			sum += f.func(a + i * dx) * 4 * dx / 3;
		}
		for (float i = 2; i < (n + 1); i += 2) {
			sum += f.func(a + i * dx) * 2 * dx / 3;
		}
		sum += (f.func(a) + f.func(b)) * dx / 3;
				
		System.out.println("Result by Simpson method: " + sum);
	}

}
