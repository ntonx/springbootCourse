
public class LearnOops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Animal speak() => animal speaks"
				+ "  //   Dog speak() => woof"
				+ "   //Cat speak() => meaow");
		Animal animal = new Dog();
		animal.speak();
		
		Animal cat = new Cat();
		cat.speak();
		
		
	}

}
