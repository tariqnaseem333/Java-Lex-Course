package array;

public class findDetails {
	
    public static double[] findDetails(double[] salary) {
    	double avgSalary = 0;
    	int len = salary.length;
    	for( int i = 0; i < len; i++ ) {
    		avgSalary = avgSalary + salary[i];
    	}
    	avgSalary = avgSalary/salary.length;
    	
    	int countGreaterSalary = 0;
    	int countLessSalary = 0;
    	for( int i = 0; i < len; i++ ) {
    		if( salary[i] > avgSalary ) {
    			countGreaterSalary++;
    		} else if ( salary[i] < avgSalary ) {
    			countLessSalary++;
    		}
    	}
    	
    	double[] details = new double[3];
    	details[0] = avgSalary;
    	details[1] = countGreaterSalary;
    	details[2] = countLessSalary;
        return details;     

    }

	public static void main(String[] args) {
		
        double[] salary = { 23500.0, 25080.0, 28760.0, 22340.0, 19890.0 };
        double[] details = findDetails(salary);
              
        System.out.println("Average salary: "+ details[0]);
        System.out.println("Number of salaries greater than the average salary: "+ details[1]);
        System.out.println("Number of salaries lesser than the average salary: "+ details[2]);

	}

}
