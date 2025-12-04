package String;

public class RemoveAllSpaces {

	public static void main(String[] args) {
		String s=" goo  d  mor  ning   ";
		System.out.println(s.replaceAll(" ",""));
		System.out.println("==============");
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=' ')
				System.out.print(s.charAt(i));
			
		}
				

	}

}
