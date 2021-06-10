package first;

public class LearnGenerics 
{
	//generics (class with type_parameters), these type_parameters are like identifiers 
	//which allows us to declare the type of object that the class, interface, or method
	//will accept
	public static void main(String[] args) 
	{
		Integer num = 9;
		//<> ==> for class type
		//() ==> reference variable
		Generics<Integer> generics = new Generics<>(num);	
		Generics<Double> generics1 = new Generics<>(9.9);
		Generics<String> generics2 = new Generics<>("Anything");	
		System.out.println(generics.getObj());
		
		= new Generics("12a");
		= new Generics(12);
		Generics(Object o){}
		generics.objType();
	}
}
//benefit ==> restricts the user from passing any type of value to the Generics class,
//it only accepts values of type declared during object creation
//I can have many class types inside <>
class Generics<T>
{
	//T ==> an generic keyword which of type Generics, Generic here means that it can accept
	//objects of all reference types
	T obj;
	public Generics(T obj) 
	{
		this.obj = obj;
	}
	public T getObj()
	{
		return obj;
	}
	public void objType() 
	{
		//getClass method returns the class of the object (reference)
		//getName method returns the name of the class (string)
		System.out.println(obj.getClass().getName());
		System.out.println(obj.getClass());
	}
	
}
