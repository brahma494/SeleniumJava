package javaProgrms;

public class AccessModifiers_withInClass {

	// Private method
	private void welcome()
	{
		System.out.println("Welcome..! private access Modifier");
	}

	// default method
	void welcome_Default()
	{
		System.out.println("Welcome..! default access Mdifier");
	}

	// Protected method
	protected void welcome_Protected()
	{
		System.out.println("Welcome..! protected access Mdifier");
	}
	
	// Protected method
	public void welcome_Public()
	{
		System.out.println("Welcome..! public  access Mdifier");
	}


	
	public static void main(String[] args) {

		AccessModifiers_withInClass ac = new AccessModifiers_withInClass();
		ac.welcome(); // private
		ac.welcome_Default(); // default method accessing
		ac.welcome_Protected(); // Protected method accessing
		ac.welcome_Public(); //public method accessing

	}

}
