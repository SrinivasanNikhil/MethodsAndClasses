
public class Painting { //class signature

	private String nameOfPainting; //attributes are private, always
	private String artist;
	private int year;
	private String wing;
	private double height;
	private double width;
	private double depth;
	
	
	public Painting(String pName, String pArtist, int pYear){
		nameOfPainting = pName;
		artist = pArtist;
		year = pYear;
		wing ="";
		
	}

	public static void main(String[] args) {
		
		Painting aP1 = new Painting("","",1981);
		Painting aP2 = new Painting("","",1981);
		
		System.out.print("acacacaaca");
	}
	
	
	/**
	 * @return the nameOfPainting
	 */
	public String getNameOfPainting() {
		return nameOfPainting;
	}


	/**
	 * @param nameOfPainting the nameOfPainting to set
	 */
	public void setNameOfPainting(String nameOfPainting) {
		this.nameOfPainting = nameOfPainting;
	}


	/**
	 * @return the artist
	 */
	public String getArtist() {
		return artist;
	}


	/**
	 * @param artist the artist to set
	 */
	public void setArtist(String artist) {
		this.artist = artist;
	}


	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}


	/**
	 * @param year the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	}


	/**
	 * @return the wing
	 */
	public String getWing() {
		return wing;
	}


	/**
	 * @param wing the wing to set
	 */
	public void setWing(String wing) {
		this.wing = wing;
	}
	
	
	
	
}
