import java.util.*;

public class HealthInfoPortal {

	private Scanner scan;
	private Metrics metric1;
	private Person aPerson;
	
	public HealthInfoPortal()
	{
	
		metric1 = new Metrics();
		getData();
		double bmi = metric1.calculateBMI(aPerson.getWeightLb(),aPerson.getHeightFt(),aPerson.getHeightIn());
		aPerson.printInfoBMI(bmi);
	}
	
	private void getData()
	{
		scan = new Scanner(System.in);
		
		System.out.println("Please enter your first name >");
		String fname = scan.next();
		
		System.out.println("Please enter your last name >");
		String lname = scan.next();
		
		System.out.println("Please enter your weight (lb) >");
		double weight = scan.nextDouble();
		
		System.out.println("Please enter your height (ft) >");
		int heightFt = scan.nextInt();
		
		System.out.println("Please enter your inches(in) >");
		int heightIn = scan.nextInt();
		
		
		aPerson = new Person(fname,lname,weight,heightFt,heightIn);
	}
	
	
	
	
	public static void main(String[] args) 
	{
		 HealthInfoPortal hip = new HealthInfoPortal();
	}
}