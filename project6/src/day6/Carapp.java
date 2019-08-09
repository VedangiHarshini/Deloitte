package day6;

class Vehicle {
	int modelNumber;
	public Vehicle(String carType)
	{
		System.out.println("Vehicle 2nd cons" + carType);
	}
	}
class Car extends Vehicle
{
	public Car()
	{
	super("p");
	System.out.println("car default cons called");
	}
	public Car (String carType)
	{
		super(carType);
		modelNumber = 2000;
		System.out.println("Car 2nd cons" +carType);
	}
	
}

public class Carapp() {
public static void main(String[] args) {

	Car c = new Car("Ferrari");
}
}
	
	

