public class Mains{
	public static void main(String[] args) {
		Atlantis at = new Atlantis("Atlants", "Mediterranean Sea", false);
		Lemuria lem = new Lemuria("Lemurs", "Indian Sea", false);

	
		System.out.println(at.getName());
		System.out.println(at.getLocation());
		System.out.println(at.getExistence());
		at.settle();
		at.overgrown();
		at.sink();

		System.out.println(lem.getName());
		System.out.println(lem.getLocation());
		System.out.println(lem.getExistence());
		lem.settle();
		lem.overgrown();
		lem.sink();
	}
}



