class Lemuria extends MythicalIsland {

	Lemuria(String name, String location, boolean existence) {
		super(name, location, existence);
	}

	@Override
	public void settle() {
		System.out.println();
		System.out.println("This island inhabited by  " + getName() + ". It's located on " + getLocation() + ". This island exists? " + getExistence());
	}	

	@Override
	public void overgrown() {
	}

	@Override
	public void sink() {
		System.out.println("This Island now deep under water");
	}
}