package Abstract;

public class GraduateStudent extends Student {
	
//	Constructor
	public GraduateStudent( String studentName ) {
		super( studentName );
	}

//	Methods
	@Override
	public void generateResult() {
		int avgScore;
		int sum = 0;
		for( int score : this.getTestScores() ) {
			sum = sum + score;
		}
		avgScore = sum/this.getTestScores().length;
		if( avgScore >= 70 ) {
			this.setTestResult("Pass");
		} else if( avgScore < 70 ) {
			this.setTestResult("Fail");
		}
		
	}

}
