
public class Member extends GenericUser {
	/**
	 * Create a new Member
	 *
	 * @param emailAddress The member's e-mail address
	 * @param firstName The member's first name
	 * @param lastName The member's last name
	 * @return An instance of Member
	 */
	public Member(EmailAddress emailAddress, String firstName, String lastName) {
		super(emailAddress, firstName, lastName);
	}
}
