abstract class MythicalIsland {

	protected String name;
	protected String location;
	protected boolean existence;

	String getName() {
		return name;
	}
	String getLocation() {
		return location;
	}
	boolean getExistence(){
		return existence;
	}

	public MythicalIsland(String name, String location, boolean existence) {
		this.name = name;
		this.location = location;
		this.existence = existence;
	}

 
	public abstract void settle();

	public abstract void overgrown();

	public abstract void sink();
}