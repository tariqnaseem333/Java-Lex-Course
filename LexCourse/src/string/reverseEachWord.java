package string;

public class reverseEachWord {
	
	public static String reverseEachWord( String str ) {
		String strNew = "";
		char c;
    	for( int i = 0; i < str.length(); i++ ) {
    		strNew = strNew + str.charAt(str.length() - i - 1);	    		
    	}
    	return strNew;
	}
	
    public static String reverseEachWordInSentence(String str){
    	String[] strArr = str.split(" ");
    	String strNew = "";
    	for( int i = 0; i < strArr.length; i++ ) {
    		if( i == strArr.length - 1 ) {
    			strNew = strNew + reverseEachWord(strArr[i]);
    		} else {
    			strNew = strNew + reverseEachWord(strArr[i]) + " ";
    		}
    	}
        return strNew;
	}

	public static void main(String[] args) {
		
	    String str = "all cows eat grass";
	    System.out.println(reverseEachWordInSentence(str));

	}

}
