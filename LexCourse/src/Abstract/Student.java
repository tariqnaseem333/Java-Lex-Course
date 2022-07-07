package Abstract;

abstract public class Student {
	
//	Instance Variables
	private String studentName;
	private int[] testScores;
	private String testResult;
	
//	Constructor
	public Student( String studentName ) {
		this.studentName = studentName;
		this.testScores = new int[4];
	}  
	
//	Methods
	abstract public void generateResult();
	
//	Getters and Setters
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int[] getTestScores() {
		return testScores;
	}
	public void setTestScores(int testNumber, int testScore) {
		this.testScores[testNumber] = testScore;
	}
	public String getTestResult() {
		return testResult;
	}
	public void setTestResult(String testResult) {
		this.testResult = testResult;
	}
	
	

}
