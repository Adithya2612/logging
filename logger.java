package logger;
import java.util.Scanner;
import java.util.logging.Logger; 
public class ConstructionLogger {
	static
	{
		Logger log=Logger.getLogger(ConstructionLogger.class.getName());
		Scanner sc=new Scanner(System.in);
		int mtrl,area;
		String logMessage;
		log.info("Enter Material Quality\n1.standard\n2.above standard\n3.high standard\n4.high standard and fully automated home");
		mtrl=sc.nextInt();
		if(mtrl==1||mtrl==2||mtrl==3||mtrl==4)
		{
			log.info("Enter the Area of the house in sq.ft");
			area=sc.nextInt();
			Construction con=new Construction(mtrl,area);
			logMessage=con.costCal();
			log.info(logMessage);
		}
		else
		{
			log.info("Invalid input");
			System.exit(0); 
		}
		sc.close();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
