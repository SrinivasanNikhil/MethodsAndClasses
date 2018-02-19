
public class Metrics {

	
	public double calculateBMI(double weight, int htFt, int htIn)
	{
		return weight*0.436/Math.pow((htFt*12+htIn)*0.025,2);
	}
	
}
