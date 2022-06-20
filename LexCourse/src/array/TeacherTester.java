package array;

public class TeacherTester {

	public static void main(String[] args) {
		
		Teacher obj1 = new Teacher( "Alex", "Java Fundamentals", 1200L );
		Teacher obj2 = new Teacher( "John", "RDBMS", 800L );
		Teacher obj3 = new Teacher( "Sam", "Networking", 900L );
		Teacher obj4 = new Teacher( "Maria", "Python", 900L );
		
		Teacher[] arr = new Teacher[4];
		arr[0] = obj1;
		arr[1] = obj2;
		arr[2] = obj3;
		arr[3] = obj4;
		for ( int i = 0; i < arr.length; i++ ) {
			arr[i].diplayDetails();
		}

	}

}
