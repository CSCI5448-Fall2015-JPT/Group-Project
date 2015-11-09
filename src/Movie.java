
public class Movie extends Media {

	//! The Internet Movie Database ID of the movie
	String imdbId;

	//! The format of the movie
	Format format;

	/**
	 * Create a new Movie object
	 *
	 * @param title The title
	 * @param rating The rating
	 * @param pictureFilename The filename of the picture
	 * @param description The description
	 * @param copies The total number of copies
	 * @param id The identifier
	 * @return An instance of Movie
	 */
	Movie(String title, Float rating, String pictureFilename, String description, Integer copies, String id) {
		super(title, rating, pictureFilename, description, copies, id);
	}

	/**
	 * Get the IMDB ID
	 *
	 * @return The imdbId
	 */
	public String getImdbId() {
		return imdbId;
	}

	/**
	 * Set the IMDB ID
	 *
	 * @param imdbId The imdbId to set
	 */
	public void setImdbId(String imdbId) {
		this.imdbId = imdbId;
	}

	/**
	 * Get the format
	 *
	 * @return The format
	 */
	public Format getFormat() {
		return format;
	}

	/**
	 * Set the format
	 *
	 * @param format The format to set
	 */
	public void setFormat(Format format) {
		this.format = format;
	}


}
