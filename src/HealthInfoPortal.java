import java.util.*;

public class HealthInfoPortal {
	 private Scanner scan;
	 private Person aPerson;
	 private Metrics metric1;
	
	
	 public HealthInfoPortal() {
		 
		 getData();
		 metric1 = new Metrics();
		 double bmi = metric1.calculateBMI(aPerson.getWeightLb(),aPerson.getHeightFt(),aPerson.getHeightIn());
		 aPerson.printInfoBMI(bmi);
	 }
	 
	 public static void main(String[] args)
	 {
		 HealthInfoPortal hip = new HealthInfoPortal();

	 }
	
	
	
	public void getData()
	{
		
		scan = new Scanner(System.in);
		
		System.out.println("Please enter your first name >");
		String fname = scan.next();
		
		System.out.println("Please enter your last name >");
		String lname = scan.next();
		
		System.out.println("Please enter your weight (lb) >");
		double weight;
		weight = scan.nextDouble();
		
		System.out.println("Please enter your height (ft) >");
		int heightFt = scan.nextInt();
		
		System.out.println("Please enter your inches(in) >");
		int heightIn = scan.nextInt();
		
		  new Person(fname,lname,weight,heightFt,heightIn);
		
		
	
	}
	
	
	
	
	}