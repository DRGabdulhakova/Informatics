public class MagicWind implements WIzard {
	@Override 
	public void conjure() {
		System.out.println("It's time to conjure something or fight with someone");
	}
	
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
