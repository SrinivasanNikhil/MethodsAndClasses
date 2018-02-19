import java.util.*;

public class HealthInfoPortal {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Metrics calc = new Metrics();
		
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
		
		Person aPerson = new Person(fname,lname,weight,heightFt,heightIn);
		double bmi = calc.calculateBMI(weight, heightFt, heightIn);
		
		aPerson.printPersonInfoBMI(bmi);
		
		
		
	}

}
