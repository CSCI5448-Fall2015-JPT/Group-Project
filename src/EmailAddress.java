
public class EmailAddress {

	//! user name
	private String username;

	//! domain name
	private String domainName;

	/**
	 * Create a new EmailAddress object with the given user name and domainName
	 *
	 * @param username The user name
	 * @param domainName The domain name
	 * @return An instance of EmailAddress
	 */
	public EmailAddress(String username, String domainName) {
		setUsername(username);
		setDomainName(domainName);
	}

	/**
	 * Set the user name
	 *
	 * @param username The user name
	 * @return None
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * Get the user name
	 *
	 * @return The user name
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * Set the domain name
	 *
	 * @param domainName The domain name
	 * @return None
	 */
	public void setDomainName(String domainName) {
		this.domainName = domainName;
	}

	/**
	 * Get the domain name
	 *
	 * @return The domain name
	 */
	public String getDomainName() {
		return domainName;
	}

	/**
	 * Validate an e-mail address
	 *
	 * @return true for success, false otherwise
	 */
	public Boolean validate() {
		// TODO
		return true;
	}

}
