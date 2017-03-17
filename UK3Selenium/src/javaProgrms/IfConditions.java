package javaProgrms;

public class IfConditions {

	public static void main(String[] args) {
		// Simple If
		
		int i=11;
		
		/*if(i%2==0)
		{
			System.out.println(i+ "  It's Even Number");
		}*/
		
		//If - else
	
		/*if(i%2==0)
		{
			System.out.println(i+ "  It's Even Number");
			
		}
		else
		{
			System.out.println(i+ "  It's Odd Number");
			
		}
		*/
		
		// else if Ladder
		
		int a=10, b=100,c=10;
		
		if(a>=b && a>c)
		{
	
			
			System.out.println(a+" a is Big ");
		
		}
		else if(b>a && b>=c)
		{
		
			System.out.println(b+" b is Big");
		}
		else if(c>=a && c>b)
		{
			System.out.println(c+" c is Big");
		}
		
		else
		{
			System.out.println(a+","+b+","+c+"a b c are equal ");
		}
		
		
	}

}
