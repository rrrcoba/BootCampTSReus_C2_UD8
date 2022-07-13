/**
 * This is the class of the fourth exercise of TA8
 * 
 * @author Roger Rubio Rufaste
 */
public class Serie {

	private String title;
	private int numSeasons = 3;
	private boolean delivered = false;
	private String genre;
	private String creator;
	
	/**
	 * This is the default constructor of the class
	 */
	public Serie() {
		this.title = "";
		this.genre = "";
		this.creator = "";
	}

	/**
	 * This is the constructor for title and creator fields
	 * 
	 * @param title
	 * @param creator
	 */
	public Serie(String title, String creator) {
		this.title = title;
		this.creator = creator;
		this.genre = "";
	}

	/**
	 * This is the constructor with all the fields except "delivered"
	 * 
	 * @param title
	 * @param numSeasons
	 * @param delivered
	 * @param genre
	 * @param creator
	 */
	public Serie(String title, int numSeasons, boolean delivered, String genre, String creator) {
		this.title = title;
		this.numSeasons = numSeasons;
		this.genre = genre;
		this.creator = creator;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the numSeasons
	 */
	public int getNumSeasons() {
		return numSeasons;
	}

	/**
	 * @param numSeasons the numSeasons to set
	 */
	public void setNumSeasons(int numSeasons) {
		this.numSeasons = numSeasons;
	}

	/**
	 * @return the delivered
	 */
	public boolean isDelivered() {
		return delivered;
	}

	/**
	 * @param delivered the delivered to set
	 */
	public void setDelivered(boolean delivered) {
		this.delivered = delivered;
	}

	/**
	 * @return the genre
	 */
	public String getGenre() {
		return genre;
	}

	/**
	 * @param genre the genre to set
	 */
	public void setGenre(String genre) {
		this.genre = genre;
	}

	/**
	 * @return the creator
	 */
	public String getCreator() {
		return creator;
	}

	/**
	 * @param creator the creator to set
	 */
	public void setCreator(String creator) {
		this.creator = creator;
	}
}
