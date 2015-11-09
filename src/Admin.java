
public class Admin extends GenericUser {
	/**
	 * Create a new Admin
	 *
	 * @param emailAddress The admin's e-mail address
	 * @param firstName The admin's first name
	 * @param lastName The admin's last name
	 * @return An instance of Admin
	 */
	public Admin(EmailAddress emailAddress, String firstName, String lastName) {
		super(emailAddress, firstName, lastName);
	}
}
