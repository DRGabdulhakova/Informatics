
public abstract class Island{
	
	public abstract void overgrown();
	public abstract void sink();
	public abstract void settle();
	protected String name;
	protected String location;
	protected boolean existence;

}

	Atlantis at = new Atlantis("Atlants", "Mediterranean Sea", false);
	Lemuria lem = new Lemuria("Lemurians", "Indian Ocean", false);



