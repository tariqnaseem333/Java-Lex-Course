package array;

public class findLeapYears {
	
	   public static int[] findLeapYears(int year){
		   int[] arr = new int[15];
		   if( (year%4 == 0 && year%100 != 0) || (year%400 == 0) ) {
			   arr[0] = year;
		   } else {
			   for( int i = 0; i < 4; i++ ) {
				   if( (year%4 == 0 && year%100 != 0) || (year%400 == 0) ) {
					   arr[0] = year;
					   break;
				   }
				   year++;
			   }
		   }
		   for( int i = 0; i < arr.length; i++ ) {
			   if( arr[0] == year && (i+1) < arr.length) {
				   arr[i+1] = arr[i] + 4;
			   }
		   }
		   
	       return arr;
	   }

	public static void main(String[] args) {
		
	       int year = 2021;
		   int[] leapYears;
		   leapYears=findLeapYears(year);
		   for ( int index = 0; index<leapYears.length; index++ ) {
		       System.out.println(leapYears[index]);
		   }

	}

}
