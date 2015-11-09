
public class EmailAddress {

	//! username
	private String m_username;

	//! domain name
	private String m_domainName;

	/**
	 * Create a new EmailAddress object with the given username and domainName
	 *
	 * @param username The username
	 * @param domainName The domain name
	 * @return An instance of EmailAddress
	 */
	public EmailAddress(String username, String domainName) {
		setUsername(username);
		setDomainName(domainName);
	}

	/**
	 * Set the username
	 *
	 * @param username The username
	 * @return None
	 */
	public void setUsername(String username) {
		m_username = username;
	}

	/**
	 * Get the username
	 *
	 * @return The username
	 */
	public String getUsername() {
		return m_username;
	}

	/**
	 * Set the domain name
	 *
	 * @param domainName The domain name
	 * @return None
	 */
	public void setDomainName(String domainName) {
		m_domainName = domainName;
	}

	/**
	 * Get the domain name
	 *
	 * @return The domain name
	 */
	public String getDomainName() {
		return m_domainName;
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
