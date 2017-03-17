package javaprograms2;

import javaProgrms.AccessModifiers_withInClass;

public class AccessModifiers_OutsidepackageBySubClassOnly extends AccessModifiers_withInClass{

	public static void main(String[] args) {
		AccessModifiers_OutsidepackageBySubClassOnly ac = new AccessModifiers_OutsidepackageBySubClassOnly();
		//ac.welcome(); // private method can't be able to access
		//ac.welcome_Default(); // default method accessing
		ac.welcome_Protected(); // Protected method accessing
		ac.welcome_Public(); //public method accessing


	}

}
