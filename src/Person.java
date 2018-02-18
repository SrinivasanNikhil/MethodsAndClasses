
public class Person {

	private String fName;
	private String lName;
	private double weightLb;
	private int heightFt;
	private int heightIn;
	
	
	/**
	 * @param fName
	 * @param lName
	 * @param weightLb
	 * @param heightFt
	 * @param heightIn
	 */
	public Person(String fName, String lName, double weightLb, int heightFt, int heightIn) {
		this.fName = fName;
		this.lName = lName;
		this.weightLb = weightLb;
		this.heightFt = heightFt;
		this.heightIn = heightIn;
	}


	/**
	 * @return the fName
	 */
	public String getfName() {
		return fName;
	}


	/**
	 * @param fName the fName to set
	 */
	public void setfName(String fName) {
		this.fName = fName;
	}


	/**
	 * @return the lName
	 */
	public String getlName() {
		return lName;
	}


	/**
	 * @param lName the lName to set
	 */
	public void setlName(String lName) {
		this.lName = lName;
	}


	/**
	 * @return the weightLb
	 */
	public double getWeightLb() {
		return weightLb;
	}


	/**
	 * @param weightLb the weightLb to set
	 */
	public void setWeightLb(double weightLb) {
		this.weightLb = weightLb;
	}


	/**
	 * @return the heightFt
	 */
	public int getHeightFt() {
		return heightFt;
	}


	/**
	 * @param heightFt the heightFt to set
	 */
	public void setHeightFt(int heightFt) {
		this.heightFt = heightFt;
	}


	/**
	 * @return the heightIn
	 */
	public int getHeightIn() {
		return heightIn;
	}


	/**
	 * @param heightIn the heightIn to set
	 */
	public void setHeightIn(int heightIn) {
		this.heightIn = heightIn;
	}
	

	
	
	
	
//	public Person(String pFname, String pLname, double pWeight, int pHeightFt, int pHeightIn)
//	{
//		fName = pFname;
//		lName = pLname;
//		weightLb = pWeight;
//		heightFt = pHeightFt;
//		heightIn = pHeightIn;
//		
//	}
	
	
}
