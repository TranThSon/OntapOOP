package BT6_7;

public class TestAnimal {
	  public static void main(String[] args) {
		  Cat cat1 = new Cat();
	      cat1.greeting();
	      Dog dog1 = new Dog();
	      dog1.greeting();
	      BigDog bigDog1 = new BigDog();
	      bigDog1.greeting();
	       
	      // Using Polymorphism
	      Animal animal1 = new Cat();
	      animal1.greeting();
	      Animal animal2 = new Dog();
	      animal2.greeting();
	      Animal animal3 = new BigDog();
	      animal3.greeting();
	   }
}
