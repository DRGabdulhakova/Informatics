 class Segway extends Skate {
	
	protected boolean working;

	Segway() {
	}

	public Segway(String type, int weight, int wheels, String color, boolean working) {

		super(type, weight, wheels, color);
		this.working = working;
	}

	public boolean equals(Segway segway) {

		if ((segway.color == this.color) && (segway.type == this.type) && (segway.weight == this.weight) && (segway.wheels == this.wheels) && (segway.color == this.color) && (segway.working == this.working)) {
			return true;
		} 
		else {
			return false;
		}
	}
	public String toString() {
		return type + " Segwai. Color: " + color + ". " + wheels + " wheels. Weight = " + weight + " Working condition - " + working;
	}	 
	
}
