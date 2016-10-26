 class GyroScooter extends Segway {
	
	protected boolean holder;
	
	GyroScooter() {
	}

	public GyroScooter(String type, int weight, int wheels, String color, boolean working, boolean holder) {

		super(type, weight, wheels, color, working);
		this.holder = holder;
	}

	public boolean equals(GyroScooter gyroscooter) {

		if ((gyroscooter.color == this.color) && (gyroscooter.type == this.type) && (gyroscooter.weight == this.weight) && (gyroscooter.wheels == this.wheels) && (gyroscooter.color == this.color) && (gyroscooter.working == this.working) && (gyroscooter.holder == this.holder)) {
			return true;
		} 
		else {
			return false;
		} 
	}

	public String toString() {
		return type + " GyroScooter. Color: " + color + ". " + wheels + " wheels. Working condition - " + working + ". You can manage it without handlebar? " + holder;
	}

}
