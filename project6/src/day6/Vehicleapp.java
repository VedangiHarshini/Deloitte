package day6;
abstract class Transport{
	public abstract void startEngine();
	public void musicSystem()
	{
		System.out.println("music");
}
}
class Bus extends Transport
{
	@Override
	public void startEngine()
	{
		System.out.println("bus started");
		}
}
class Bike extends Transport
{
	@Override
	public void startEngine()
	{
		System.out.println("bike started");
	}
}

public class Vehicleapp {
	public static void main(String[]  args) {
		
		Transport t = new Bus();

}
}
