package Abstract;

public class StudentTester {
	
    public static void main(String[] args) {
        UndergraduateStudent undergraduateStudent = new UndergraduateStudent("Philip");
        undergraduateStudent.setTestScores(0, 70);
        undergraduateStudent.setTestScores(1, 69);
        undergraduateStudent.setTestScores(2, 71);
        undergraduateStudent.setTestScores(3, 55);
            
        undergraduateStudent.generateResult();
            
        System.out.println("Student name: "+undergraduateStudent.getStudentName());
        System.out.println("Result: "+undergraduateStudent.getTestResult());
            
        System.out.println();
            
        GraduateStudent graduateStudent = new GraduateStudent("Jerry");
        graduateStudent.setTestScores(0, 70);
        graduateStudent.setTestScores(1, 69);
        graduateStudent.setTestScores(2, 71);
        graduateStudent.setTestScores(3, 55);
            
        graduateStudent.generateResult();
            
        System.out.println("Student name: "+graduateStudent.getStudentName());
        System.out.println("Result : "+graduateStudent.getTestResult());
        
        //Create more objects of the classes for testing your code
    }

}
