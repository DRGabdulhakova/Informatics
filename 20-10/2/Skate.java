public class Skate {
	
	protected String type;
	protected int weight;
	protected int wheels;
	protected String color;
	
	Skate() {
	}

	public String getColor() {
		return color;
	}

	public String getType() {
		return type;
	}

	public int getWeight() {
		return weight;
	}

	public int getWheels() {
		return wheels;
	}

	public Skate(String type, int weight, int wheels, String color) {

		this.type = type;
		this.weight = weight;
		this.color = color;
		this.wheels = wheels;
	}

	public boolean equals(Skate skate) {

		if ((skate.color == this.color) && (skate.type == this.type) && (skate.weight == this.weight) && (skate.wheels == this.wheels) && (skate.color == this.color)) {
			return true;
		} 
		else {
			return false;
		}
	}

	public String toString() {
		return type + " skate. Color: " + color + ". " + wheels + " wheels. Weight = " + weight;
	}

}
