import java.util.*;
import java.util.logging.Logger; 

class Compute {
	double principal, interest, timePeriod;
	
	Compute(double principal, double interest, double timePeriod){
		this.principal = principal;
		this.interest = interest;
		this.timePeriod = timePeriod;
	}
	
	double calculateCI() {
		return (principal * (Math.pow(1 + rate_of_interest / 100, timePeriod)));
	}

	double CalculateSI() {
		return (principal * rate_of_interest * timePeriod) / 100;
	}

}

public class Interest {

	static {
		Scanner sc = new Scanner(System.in);
		Logger logger=Logger.getLogger(Interest.class.getName());
		
		System.out.format("%s", "Enter principle amount");
		double principal = sc.nextDouble();
		System.out.format("%s", "Enter rate of interest");
		double interest = sc.nextDouble();
		System.out.format("%s", "Enter number of years");
		double timePeriod = sc.nextDouble();
		
		Compute com = new Compute(principal, interest, timePeriod);
		
		logger.info("1)Select This option for Calculating Simple Interest 2)Select This option for Calculating Compound Interest");
		int choice = sc.nextInt();
		
		switch (choice) {
		case 1:
			logger.info(String.valueOf(com.CalculateSI()));
			break;
		case 2:			
			logger.info(String.valueOf(com.calculateCI()));
			break;
		}
		sc.close();
	}

	public static void main(String[] args) {

	}

}
