package javaProgrms;

public class AccessModifiers_withInPackage{

	public static void main(String[] args) {
		AccessModifiers_withInClass ac = new AccessModifiers_withInClass();
		
		//ac.welcome(); // private method can't be able to access
		ac.welcome_Default(); // default method accessing
		ac.welcome_Protected(); // Protected method accessing
		ac.welcome_Public(); //public method accessing
		


	}

}
