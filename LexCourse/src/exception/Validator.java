package exception;

public class Validator {
	
//	Methods
	public boolean validateName( String name ) {
		if( name.isEmpty() ) {
			return false;
		} else {
			return true;
		}
		
	}
	
	public boolean validateJobProfile( String jobProfile ) {
		if( jobProfile.equalsIgnoreCase("Associate") || jobProfile.equalsIgnoreCase("Clerk") || jobProfile.equalsIgnoreCase("Executive") || jobProfile.equalsIgnoreCase("Officer") ) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean validateAge( int age ) {
		if( age >= 18 && age <= 30 ) {
			return true;
		} else {
			return false;
		}
	}
	
	public void validate( Applicant applicant ) throws InvalidNameException, InvalidJobProfileException, InvalidAgeException, Exception  {
		if( !(validateName(applicant.getName()) ) ) {
			throw new InvalidNameException("Invalid name");
		} else if( !(validateJobProfile(applicant.getJobProfile()) ) ) {
			throw new InvalidJobProfileException("Invalid Job profile");
		} else if( !(validateAge(applicant.getAge()) ) ) {
			throw new InvalidAgeException("Invalid age");
		} 
	}

}
