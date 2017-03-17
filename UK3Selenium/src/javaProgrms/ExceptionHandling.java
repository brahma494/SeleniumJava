package javaProgrms;

public final class ExceptionHandling {

	public static void main(String[] args) 
	{

		int[] n=new int[4];
		int a=10,b=2;
		try{

			n[3]=10; // invalid statement
			System.out.println(n[3]);
			System.out.println("a/b ="+(a/b)); // divison
			calc();

		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
		
		finally{
			System.out.println("Finally block Executed");
		}
		
		System.out.println("After Divison");


		System.out.println("After array declaration");


	}

	
	static void calc()  throws Exception
	{
		int[] n=new int[2];
		
		n[3]=9;
		
		System.out.println(n[3]);
		
	}
}
