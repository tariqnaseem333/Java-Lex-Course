package finalKeyword;

public class Student {
	
//	Instance Variables
	private final int STIPEND = 100;
	private int studentId;
	private int aggregateMarks;
	
//	Method
	public double calculateTotalStipend() {
		int totalStipend;
		if( this.aggregateMarks >= 85 && this.aggregateMarks < 90 ) {
			totalStipend = this.STIPEND + 10;
		} else if( this.aggregateMarks >= 90 && this.aggregateMarks < 95 ) {
			totalStipend = this.STIPEND + 15;
		} else if( this.aggregateMarks >= 95 && this.aggregateMarks <= 100 ) {
			totalStipend = this.STIPEND + 20;
		} else {
			totalStipend = this.STIPEND;
		}
		return totalStipend;
	}
	
//	Getters and Setters
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public int getAggregateMarks() {
		return aggregateMarks;
	}
	public void setAggregateMarks(int aggregateMarks) {
		this.aggregateMarks = aggregateMarks;
	}
	public int getSTIPEND() {
		return STIPEND;
	}
	

}
