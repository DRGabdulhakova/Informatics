public class CubFunction implements FunctionAware {
	
	public CubFunction() {
	}
	
	@Override
	public float func(float x) {
		return x * x * x;
	}
	
}