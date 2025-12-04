package String;

public class CountNumberOfWords {

	public static void main(String[] args) {

		String s="Java is a programming langauge";
		
		int count =1;
		
		if(s.charAt(0)==' ') {
			count=0;
		}
		for(int i=0; i<s.length()-1;i++) {
			if(s.charAt(i)==' ' && s.charAt(i+1)!=' ') {
				count++;
			}
		}
		System.out.println(count);
	}

}
