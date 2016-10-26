class Human extends Monkey {
	
	private boolean speak;
	private String mammoth;
	private boolean cold;
	private String house;

	Human (String type, String food, int age, boolean hungry, boolean speak, boolean cold, String mammoth) {
		super(type, food, age, hungry);
		this.cold = cold;
		this.speak = speak;
		this.mammoth = mammoth;
		this.house = house;
	}

	void getHouse() { 
		cold = true;
		}

	void getSpeak() {
		System.out.println("I can speak! I can sing!");
	}

	String getMammoth() {
		System.out.println("We catch " + mammoth + " mammoth!");
		return mammoth;
	}
}

