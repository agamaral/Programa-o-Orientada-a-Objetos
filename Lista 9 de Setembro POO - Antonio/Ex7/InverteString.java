package Ex7;

public class InverteString {
	
	  public static void main(String[] args) {
		  
	    String palindrome = "Antonio Augusto";
	    int len = palindrome.length();
	    
	    char[] tempCharArray = new char[len];
	    char[] charArray = new char[len];
	 
	    for (int i = 0; i < len; i++) {
	      tempCharArray[i] = palindrome.charAt(i);
	    }
	 
	    for (int j = 0; j < len; j++) {
	      charArray[j] = tempCharArray[len - 1 - j];
	    }
	 
	    String reversePalindrome = new String(charArray);
	    System.out.println(reversePalindrome);
	  }
	  
}