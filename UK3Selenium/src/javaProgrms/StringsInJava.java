package javaProgrms;

public class StringsInJava {

	public static void main(String[] args) {
		String s = "Zak"; // String s = new String("Zak")
		
		String ss = new String("zak");
		String t = "java is good. java is easy . java is healthy.";
		
		System.out.println(s.length());	// length of the string --3
		
		System.out.println(s.charAt(1)); // a
		
		System.out.println(s.equals(ss)); // false
		
		System.out.println(s.equalsIgnoreCase(ss)); // true
		
		System.out.println(t.contains("java")); // true sub-sring search
		
		System.out.println(t.contains("y")); // true, character search 
		
		System.out.println(t.toLowerCase()); // print t in all lowercase letters
		System.out.println(t.toUpperCase()); // print t in all uppercase letters
		
		t= t.replace("java", "c#");
		
		System.out.println(t);
		
		
		
		
		
		
		
		
	}

}
