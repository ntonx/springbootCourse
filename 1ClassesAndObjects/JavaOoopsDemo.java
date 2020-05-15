
public class JavaOoopsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Instantiate Dog class to create objects
		Dog dog1 = new Dog ();
		dog1.setColor("black");
		dog1.setHeight(4.5);
		dog1.setName("Jack");
		
		System.out.println("First Object");
		System.out.println(dog1.getColor());
		System.out.println(dog1.getHeight());
		System.out.println(dog1.getName());
		
		Dog dog2 = new Dog ();

		dog2.setColor("white");
		dog2.setHeight(5.4);
		dog2.setName("Mike");
		
		System.out.println("Second Object");
		System.out.println(dog2.getColor());
		System.out.println(dog2.getHeight());
		System.out.println(dog2.getName());
		
	}

}
