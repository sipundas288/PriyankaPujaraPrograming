package String;

public class OddIndexValuetOupperCase {

	public static void main(String[] args) {
	
		String s="Engineer";
		for(int i=0;i<s.length();i++) {
			if(i%2!=0 && (s.charAt(i)>='a' && s.charAt(i)<='z')) {
				System.out.println((char)(s.charAt(i)-32));
			
		}
			else {
				System.out.println(s.charAt(i));
			}
		}
		
	}

}

