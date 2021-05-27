package first;

class Animal {}
//ANY CLASS THAT HAS A MAIN METHOD DOESN'T LOSE THE PROPERTIES OF A CLASS
class Dog1 extends Animal
{
	//Dog inherits Animal
	public static void main(String args[])
	{ 
		Animal a = new Dog1();
		System.out.println(a instanceof Animal); 
		//Dog1 d=new Dog1();
		//System.out.println(d instanceof Animal); 
		Dog1 d = new Dog1();
		System.out.println(d.AllCaps("labrador"));
	}
	//A non-static member can't be called directly inside a static block of code
	//unless AN OBJECT OF THE CLASS (WHICH CONTAINS THE METHOD) IS CREATED
	//RULE: can call a static code inside a non-static member
	public String AllCaps(String s) 
	{
		return s.toUpperCase();
	}
	
}