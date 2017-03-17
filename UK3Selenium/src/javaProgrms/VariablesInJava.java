package javaProgrms;

public class VariablesInJava {
	int a;  // Instance variables
	int y;
	static int b =100; //static variable
	public static void main(String[] args) {
		//new VariablesInJava().a=10;
		//System.out.println(new VariablesInJava().a);
		
		VariablesInJava var = new VariablesInJava();
		var.a=20;
		b=200;
		
		System.out.println("a Value for object var:"+ var.a);
		
		/*int local=10;
		System.out.println(local);
		*/
		num();
		System.out.println(b);
		
		//var.print();
		
	}
	static void num()
	{
		VariablesInJava var1 = new VariablesInJava();
		var1.a=50;
		System.out.println("a Value for object var1:"+ var1.a);
		System.out.println(b);
		var1.print();
		
	}
	void print()
	{
		num();
		System.out.println(b);
	}
	
	
	

}
