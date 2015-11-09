
public class Media {

	//! title
	String title;

	//! rating TODO details
	Float rating;

	//! the filename of the picture TODO this doesn't seem necessary
	String pictureFilename;

	//! description
	String description;

	//! number of copies, total
	Integer copies;

	//! unique identifier
	String id;

	/**
	 * Create a new Media object
	 *
	 * @param title The title
	 * @param rating The rating
	 * @param pictureFilename The filename of the picture
	 * @param description The description
	 * @param copies The total number of copies
	 * @param id The identifier
	 * @return An instance of Media
	 */
	Media(String title, Float rating, String pictureFilename, String description, Integer copies, String id) {
		super();
		setTitle(title);
		setRating(rating);
		setPictureFilename(pictureFilename);
		setDescription(description);
		setCopies(copies);
		setId(id);
	}

	/**
	 * Get the title
	 *
	 * @return The title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Set the title
	 *
	 * @param title The title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * Get the rating
	 *
	 * @return The rating
	 */
	public Float getRating() {
		return rating;
	}

	/**
	 * Set the rating
	 *
	 * @param rating The rating to set
	 */
	public void setRating(Float rating) {
		this.rating = rating;
	}

	/**
	 * Get the picture filename
	 *
	 * @return The pictureFilename
	 */
	public String getPictureFilename() {
		return pictureFilename;
	}

	/**
	 * Set the picture filename
	 *
	 * @param pictureFilename The pictureFilename to set
	 */
	public void setPictureFilename(String pictureFilename) {
		this.pictureFilename = pictureFilename;
	}

	/**
	 * Get the description
	 *
	 * @return The description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Set the description
	 *
	 * @param description The description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Get the total number of copies
	 *
	 * @return The total number of copies
	 */
	public Integer getCopies() {
		return copies;
	}

	/**
	 * Set the total number of copies
	 *
	 * @param copies The total number of copies to set
	 */
	public void setCopies(Integer copies) {
		this.copies = copies;
	}

	/**
	 * Get the identifier
	 *
	 * @return The id
	 */
	public String getId() {
		return id;
	}

	/**
	 * Set the identifier
	 *
	 * @param id The id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

}
