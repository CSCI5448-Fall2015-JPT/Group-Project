
public class Book extends Media {

	//! the International Standard Book Number
	String ISBN;

	//! author first name
	String authorFirstName;

	//! author last name
	String authorLastName;

	/**
	 * Create a new Book object
	 *
	 * @param title The title
	 * @param rating The rating
	 * @param pictureFilename The filename of the picture
	 * @param description The description
	 * @param copies The total number of copies
	 * @param id The identifier
	 * @return An instance of Book
	 */
	Book(String title, Float rating, String pictureFilename, String description, Integer copies, String id) {
		super(title, rating, pictureFilename, description, copies, id);
	}

	/**
	 * Get the ISBN
	 *
	 * @return The ISBN
	 */
	public String getISBN() {
		return ISBN;
	}

	/**
	 * Set the ISBN
	 *
	 * @param ISBN The ISBN to set
	 */
	public void setISBN(String ISBN) {
		this.ISBN = ISBN;
	}

	/**
	 * Get the author's first name
	 *
	 * @return The authorFirstName
	 */
	public String getAuthorFirstName() {
		return authorFirstName;
	}

	/**
	 * Set the author's first name
	 *
	 * @param authorFirstName The authorFirstName to set
	 */
	public void setAuthorFirstName(String authorFirstName) {
		this.authorFirstName = authorFirstName;
	}

	/**
	 * Get the author's last name
	 *
	 * @return The authorLastName
	 */
	public String getAuthorLastName() {
		return authorLastName;
	}

	/**
	 * Set the author's last name
	 *
	 * @param authorLastName The authorLastName to set
	 */
	public void setAuthorLastName(String authorLastName) {
		this.authorLastName = authorLastName;
	}

}
