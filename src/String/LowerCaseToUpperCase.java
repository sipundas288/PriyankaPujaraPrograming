package String;

public class LowerCaseToUpperCase {

	public static void main(String[] args) {
		
		String s="independenceday";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>='a' && s.charAt(i)<='z') {
				System.out.println((char)(s.charAt(i)-32));
				
			}
		}
		System.out.println("===================");
		//inbuild
		System.out.println(s.toUpperCase());
	}

}
