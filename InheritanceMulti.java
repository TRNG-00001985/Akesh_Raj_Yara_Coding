class Animal{
	public void sleep() {
		System.out.println("Animal is Sleeping....");
	}
	
	public void eat() {
		System.out.println("Animal is Eating....");

	}
}
class Dog extends Animal{
	public void sleep() {
		System.out.println("Dog is Sleeping....");
	}
	
	public void eat() {
		System.out.println("Dog is Eating....");

	}	
}
class Monkey extends Dog{
	public void sleep() {
		System.out.println("Monkey is Sleeping....");
	}
	
	public void eat() {
		System.out.println("Monkey is Eating....");

	}	
}
public class InheritanceMulti {
	public static void main(String[] args) {
		Animal a = new Dog();
		Dog b = new Monkey();
		a.eat();
		a.sleep();
		b.eat();
		b.sleep();
	}

}
