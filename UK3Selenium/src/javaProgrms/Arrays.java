package javaProgrms;

public class Arrays {

	public static void main(String[] args) {
		//  Holing values in vriables
		int m1=90,m2=89,m3=78,m4=65,m5=45;
		
		System.out.println(m1+" "+m2+" ");
		
		int[] a = new int[5]; // Declaration
		a[0]=90;a[1]=87; // Initializing the numbers to an array
		
		int[] b={12,45,7,67,89}; // declaring and defining
		
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
	}
}
