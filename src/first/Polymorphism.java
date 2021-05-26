package first;

public class Polymorphism 
{
	public static void main(String[] args) 
	{
		Main p = new Main(0.5, 0.4);
		Rectangle r = new Rectangle(1.5, 9.5);
		Triangle t = new Triangle(20, 10);
		//
		Main x = p;
		System.out.println(x.area());
		//
		x = r;
		System.out.println(x.area());
		//
		x = t;
		System.out.println(x.area());
	}
}
class Rectangle extends Main 
{
	public Rectangle(double dem1, double dem2)
	{
		super(dem1, dem2);
	}
	double area() 
	{
		System.out.println("rectangle");
		return dem1*dem2;
	}
}
class Triangle extends Main
{
	public Triangle(double dem1, double dem2) 
	{
		super(dem1,dem2);
	}
	double area() 
	{
		System.out.println("triangle");
		return 0.5*dem1*dem2;
	}
}
class Main 
{
	double dem1, dem2;
	public Main(double dem1, double dem2) 
	{
		this.dem1 = dem1;
		this.dem2 = dem2;
	}
	double area() 
	{
		System.out.println("undefined shape");
		return 0;
	}
}