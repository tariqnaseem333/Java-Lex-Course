package string;

public class checkPalindrome {
	
    public static boolean checkPalindrome(String str){
    	boolean isPalindrome = false;
    	int len = str.length();
    	for( int i = 0; i < len; i++ ) {
    		if( str.charAt(i) == str.charAt(len - i - 1) ) {
    			isPalindrome = true;
    		}
    	}
    	
    	
	    //Implement your code here and change the return value accordingly
        return isPalindrome;
	}

	public static void main(String[] args) {
		
		String str = "radar";
		if(checkPalindrome(str))
			System.out.println("The string is a palindrome!");
		else
			System.out.println("The string is not a palindrome!");

	}

}
