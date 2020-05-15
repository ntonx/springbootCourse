
public class Dog {
	
	String name;
	int height;
	
	public Dog(String name) {
		this.name = name;
	}

	public Dog(int height) {
		this.height = height+2;
		System.out.println("height "+height);
		System.out.println("this height "+this.height);
		
	}
	
	public void speak() {
		System.out.println(this.name + " saying woof");
	}

	
}
