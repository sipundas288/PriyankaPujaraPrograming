package String;

public class CountOdDifferentTypesOfChar {

	public static void main(String[] args) {
		String s="hello@123";
		s.toLowerCase();
		int vowels=0; 
		int consonants=0;
		int	digits=0;
		int	specialChars=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u') {
				vowels++;
			}
			else  if((s.charAt(i)!='a' || s.charAt(i)!='e' || s.charAt(i)!='i' || s.charAt(i)!='o' || s.charAt(i)!='u') && (s.charAt(i)>='a' && s.charAt(i)<='z')){
			consonants++;		
			}
			else if(s.charAt(i)>='0'  && s.charAt(i)<='9'){
				digits++;	
				
			}
			else {
				specialChars++;
			}
		}
		System.out.println("Voewls are = "+vowels);
		System.out.println("Consonants are ="+consonants);
		System.out.println("Digits are = "+digits);
		System.out.println("specialChar are = "+specialChars);
	}

}
