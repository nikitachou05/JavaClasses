package first;

public class Bicycle implements Vehicle
{
	private int gear;
	private int speed;
	public void changeGear(int gear) 
	{
		this.gear = gear;
	}
	public void speedUp(int speed_increment) 
	{
		speed+=speed_increment;
	}
	public void applyBreaks(int speed_decrement) 
	{
		speed-=speed_decrement;
	}
	public void printSates() 
	{
		System.out.println("Bicycle\nspeed: "+speed+"\ngear: "+gear);
	}
}
