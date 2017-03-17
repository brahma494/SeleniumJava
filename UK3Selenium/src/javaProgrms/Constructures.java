package javaProgrms;

public class Constructures {
	int x;
	int y;
	String z="";
	// default constructor 
	Constructures()
	{
		System.out.println("Default Constructor");
	}
	//pameterized constructor
	Constructures(int a, int b)
	{
		x=a;
		y=b;
		System.out.println("sum of a and b:-"+(a+b));
	}
	
	//pameterized constructor
	Constructures(String a, int b)
	{
		z=a;
		System.out.println("sum of a and b:-"+(a+b));
	}
	
	//method 
	void welcome()
	{
		System.out.println("welecome !");
	}

	public static void main(String[] args) {
		
		Constructures c= new Constructures("India",10); // Implicit calling of constructers 
		
		c.welcome(); // explicit calling of a method

	}

}
