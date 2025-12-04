package String;

public class UpperCase {

	public static void main(String[] args) {
		
		String s="SMITH";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>='A' && s.charAt(i)<='Z'	) {
				System.out.println((char)(s.charAt(i)+32));
			}
		}
		System.out.println("=====================");
		//inbuilt
		System.out.println(s.toLowerCase());
	}		

}
