package string;

public class moveSpecialCharacter {
	
    public static String moveSpecialCharacters(String str){
    	int len = str.length();
    	String strNew1 = "";
    	String strNew2 = "";
    	for( int i = 0; i < len; i++ ) {
    		if( (str.charAt(i) >= 97 && str.charAt(i) <= 122) || (str.charAt(i) >= 65 && str.charAt(i) <= 90) ) {
    			strNew1 = strNew1 + str.charAt(i);
    		} else {
    			strNew2 = strNew2 + str.charAt(i);
    		}
    	}
    	String strNew = strNew1 + strNew2;
    	
    	
		//Implement your code here and change the return value accordingly
        return strNew;
	}

	public static void main(String[] args) {
		
	    String str = "He@#$llo!*&";
	    System.out.println(moveSpecialCharacters(str));

	}

}
