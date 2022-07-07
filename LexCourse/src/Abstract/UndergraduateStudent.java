package Abstract;

public class UndergraduateStudent extends Student {
	
//	Constructor
	public UndergraduateStudent( String studentName ) {
		super( studentName );
	}

//	Method
	@Override
	public void generateResult() {
		int avgScore;
		int sum = 0;
		for( int score : this.getTestScores() ) {
			sum = sum + score;
		}
		avgScore = sum/this.getTestScores().length;
		if( avgScore >= 60 ) {
			this.setTestResult("Pass");
		} else if( avgScore < 60 ) {
			this.setTestResult("Fail");
		}
	}

}
