
public class AudioBook extends Media{

	//! The format of the audio book
	Format format;

	/**
	 * Create a new AudioBook object
	 *
	 * @param title The title
	 * @param rating The rating
	 * @param pictureFilename The filename of the picture
	 * @param description The description
	 * @param copies The total number of copies
	 * @param id The identifier
	 * @return An instance of AudioBook
	 */
	AudioBook(String title, Float rating, String pictureFilename, String description, Integer copies, String id) {

		super(title, rating, pictureFilename, description, copies, id);
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
