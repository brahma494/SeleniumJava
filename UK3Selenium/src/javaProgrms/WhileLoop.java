package javaProgrms;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int num=234;
		int temp = num;
		int n=0, rev=0;
		while(num!=0) // 234  ,23
		{
			n= num%10; //4 3 2
			rev= (rev*10)+n;//(0)+4 = 4 ,(4*10)+3 = 43, (43*10)+2 = 432
			num =num/10; //23, 2,0
			
		}
		System.out.println("The Reverse of a number :"+temp +"is:"+rev);	
		*/	
		
		// printing the even numbers in descending order from given range to 0
		int i=0;
		while(i>0)
		{
			System.out.println(i);
			i=i-2;
		}
	}

}
