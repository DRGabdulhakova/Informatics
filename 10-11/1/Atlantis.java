class Atlantis extends MythicalIsland {

	Atlantis(String name, String location, boolean existence) {
		super(name, location, existence);
	}

	@Override
	public void settle() {
		System.out.println();
		System.out.println("It's homeland of " + getName() + ". It's located on " + getLocation() + ". This island exists? " + getExistence());
	}	

	@Override
	public void overgrown() {
	}

	@Override
	public void sink() {
		System.out.println("This Island now deep under water");
		System.out.println();
	}

}