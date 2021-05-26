package first;

public class VehicleTest 
{
	public static void main(String[] args) 
	{
		Bicycle bicycle = new Bicycle();
		Bike bike = new Bike();
		//bicycle
		bicycle.changeGear(10);
		bicycle.speedUp(3);
		bicycle.applyBreaks(2);
		bicycle.printSates();
		//break
		System.out.println();
		//bike
		bike.changeGear(10);
		bike.speedUp(3);
		bike.applyBreaks(2);
		bike.printSates();
	}
}