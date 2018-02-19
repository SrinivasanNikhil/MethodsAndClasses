
public class Metrics {

	/**
	 * Calculates the BMI of an individual
	 * @param weight
	 * @param htFt
	 * @param htIn
	 * @return
	 */
	public double calculateBMI(double weight, int htFt, int htIn)
	{
		double bmi = (weight*.45)/Math.pow((htFt*.30 + htIn*0.025),2.0);		
		return bmi;
	}
	
}
