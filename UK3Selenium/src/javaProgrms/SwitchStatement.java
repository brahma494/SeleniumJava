package javaProgrms;

public class SwitchStatement {

	public static void main(String[] args) {
		// switch statement for integer

		int input=1;

		switch(input)
		{
		case 1:
			System.out.println("ONE");
			break;
		case 2:
			System.out.println("TWO");
			break;
		case 3:
			System.out.println("THREE");
			break;
		default:
			System.out.println("Wrong Input please try to give input (1-3) range");
			break;
		}


		String s="zak";

		
		switch(s)
		{
		case "naresh":
			System.out.println("NARESH");
			break;
		case "giri":
			System.out.println("GIRI");
			break;
		case "mahesh":
			System.out.println("MAHESH");
			break;
		case "zak":
			System.out.println("ZAK");
			break;
		
		default:
			System.out.println("GUNA");
			break;
		}


	}

}
