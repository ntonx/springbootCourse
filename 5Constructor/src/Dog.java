
public class Dog {
	String name;
	int height;
	
	public Dog() {
		System.out.println("I am a dog");
		name="Jack";
	}

	public Dog(String var) {
		System.out.println("I am a dog");
		name=var;
	}	
	
	public Dog(int var) {
		System.out.println("I am a dog");
		height=var;
	}	
	
	public void speak() {
		System.out.println("Woof "+name);
	}
}
