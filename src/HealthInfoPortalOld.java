import java.util.Scanner;

public class HealthInfoPortalOld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		

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
		
		Metrics metric1 = new Metrics();
		double bmi = metric1.calculateBMI(weight,heightFt,heightIn);
		aPerson.printInfoBMI(bmi);
	}

}
