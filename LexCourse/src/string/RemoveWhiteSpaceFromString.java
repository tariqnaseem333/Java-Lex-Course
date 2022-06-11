package string;

public class RemoveWhiteSpaceFromString {
	
    public static String[] removeWhiteSpaces(String str){
    	 String[] strArr = str.split("");
    	 for( int i = 0; i < strArr.length; i++ ) {
    		 if( strArr[i].equals(" ") ) {
    			 strArr[i] = "";
    		 }
    	 }
        return strArr;
	}

    
	public static void main(String[] args) {
		String str = "J  ava  pro      gramming  ";
		String[] strArr = removeWhiteSpaces(str);
		StringBuffer sb = new StringBuffer("");
		for( int i = 0; i < strArr.length; i++ ) {
			sb.append(strArr[i]);
		}
		System.out.println(sb);

	}

}
