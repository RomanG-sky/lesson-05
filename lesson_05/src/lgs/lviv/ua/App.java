package lgs.lviv.ua;

public class App {
	public static void main(String[] args) {

		Cow cow = new Cow();
		cow.voice();

		Cat cat = new Cat();
		cat.voice();

		Dog dog = new Dog();
		dog.voice();

		Frog froggy = new Frog();
		
		froggy.eat();
		froggy.sleep();
		froggy.sweam();
		froggy.wolk();
	}
}
