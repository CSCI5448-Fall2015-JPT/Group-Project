
public class Member extends GenericUser {
	/**
	 * Create a new Member
	 *
	 * @param emailAddress The user's e-mail address
	 * @param firstName The user's first name
	 * @param lastName The user's last name
	 * @return An instance of Member
	 */
	public Member(EmailAddress emailAddress, String firstName, String lastName) {
		super(emailAddress, firstName, lastName);
	}
}
