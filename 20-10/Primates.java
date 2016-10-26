public class Primates {

	public static void main(String[] args) {
		Monkey m = new Monkey("driopithecus", "fruits", 5, true);
		Human h = new Human("Modern", "fruits", 21, true, false, true, "one");
		System.out.println(h.getAge());
		System.out.println(h.getType());
		System.out.println(h.getMammoth());
	}	
}