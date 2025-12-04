package String;

public class MethodsOfString {

	public static void main(String[] args) {
	
		String s="text book";
		String s1="Text BooK";
		//it gives number of character present in a given string
		System.out.println(s.length());
		//It gives character based on index
		System.out.println(s.charAt(2));
		//it gives index based on the character
		System.out.println(s.indexOf('b'));
		// this method is used to check whether the string is starting with particular character or word
		System.out.println(s.startsWith("te"));
		
		System.out.println(s.endsWith("ook"));
		//to remove the space b/w the given string in the starting and ending position
		System.out.println(s.trim());
		// this method is used to replace character through entire string
		System.out.println(s.replace(" ", ""));
		//this method replace the particular character
		System.out.println(s.replace('b', 'B'));
		//Substring gives us the part of the string based on the index
		System.out.println(s.substring(5));
		System.out.println(s.substring(7,9));
		//It compare 2 string completely
		System.out.println(s.equals(s1));
		//it compares 2 string value by ignoring cases
		System.out.println(s.equalsIgnoreCase(s1));
		System.out.println(s.contains("book"));
		System.out.println(s.concat(s1));
		//it will combine new string for a already exist string
		System.out.println(s.contains("Available"));
	}

}
