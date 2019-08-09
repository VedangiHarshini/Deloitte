package day6;

abstract class Animall{
	public abstract void makeNoise();
	public abstract void eat();
	public abstract void roam();
	public void sleep()
	{
		System.out.println("sleep for 8hrs");
	}
}
abstract class Feline extends Animall{
	public void roam()
	{
		System.out.println("felines roam");
	}
	
}
abstract class Hippo extends Animall {
		public  void roam() {
			System.out.println("hippo roam");	
		}
}
abstract class Cannine extends Animall {
			public  void roam()
			{
				System.out.println("cannine roam");
			}
}
class Lion extends Feline{
	public  void makeNoise()
	{
		System.out.println("roars");
	}
	public  void eat() {
		System.out.println("meat");
	}
	
}
class Tiger extends Feline{
	public  void makeNoise()
	{
		System.out.println("roars");
	}
	public  void eat() {
		System.out.println("meat");
	}
	
}
class Cat extends Feline{
	public  void makeNoise()
	{
		System.out.println("meow");
	}
	public  void eat() {
		System.out.println("fish");
	}
}
class Dog extends Cannine{
	public  void makeNoise()
	{
		System.out.println("bow");
	}
	public  void eat() {
		System.out.println("bone");
	}
}
class Wolf extends Cannine{
	public  void makeNoise()
	{
		System.out.println("howl");
	}
	public  void eat() {
		System.out.println("meat");
	}
}
public class AnimalApp {
	public static void main(String[] args) {

		Animall d = new Dog();
		d.eat();
		d.roam();
		Animall animal = new Animall()
				{
			public void eat() {
			System.out.println("grass");
				}
			public void makeNoise() {
				System.out.println("moo");
					}
			public void roam() {
				System.out.println("moon");
					}
				};
				animal.eat();
	}

}
