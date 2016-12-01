public class MagicWind implements Protecting, Attacking {

	@Override
	public void protect() {
		System.out.println("Protego!");
	}

	@Override
	public void disarm() {
		System.out.println("Expelliarmus!");
	}

	@Override
	public void paralyze() {
		System.out.println("Petrificus Totalus");
	}

	@Override
	public void kill() {
		System.out.println("Avada Kedavra");
	}
}