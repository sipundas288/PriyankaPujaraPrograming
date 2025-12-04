package String;

public class EvenIndex {

	public static void main(String[] args) {

		String s="HELLOPRIYA";
		for(int i=0;i<s.length();i++) {
			if(i%2==0 && (s.charAt(i)>='A') && s.charAt(i)<='Z'){
				System.out.println((char)(s.charAt(i)+32));
			}
			else {
				System.out.println(s.charAt(i));
			}
		}
	}

}
