public class Monkey {
	
	protected String type;
	protected int age;
	protected String food;
	protected boolean hungry;
	protected boolean play;
	
	Monkey() {
	}

	Monkey(String type, String food, int age, boolean hungry) {

		this.type = type;
		this.food = food;
		this.age = age;
		this.hungry = hungry;
	}

	String getType() {
		return type;
	}

	int getAge() {
		return age;
	}

	void setFood(String food) {
		if (hungry = true) {
			System.out.println("Eat some " + food);
		}
		this.food = food;
	}

	void climpUpTrees() {
		if (play = true) {
			System.out.println("Monkeys like to swing on vines");
		}

	}
}
