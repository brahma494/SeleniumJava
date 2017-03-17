package javaProgrms;

public class Methods {

	public static void main(String[] args) {

		//welcome();
		//add(10,20);

		/*String rtvalue = msg();
		System.out.println(rtvalue);
		 */
		int i= add(100,200,400);
		
		System.out.println(i);
	}

	//Without Arguments and without Returntype
	static void welcome()
	{
		System.out.println("Without ReturnType and WithoutArguments");
	}

	//With Arguments and without returntype
	static void add(int a,int b)
	{
		System.out.println("With Arguments and without returntype: Sum of two numbers-"+(a+b));
	}

	//Withoutout Arguments and with returntype

	static String msg()
	{
		return "bye";
	}

	//With Arguments and with returntype
	static int add(int a,int b,int c)
	{
		return (a+b+c);
	}



}
