import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.InvalidParameterException;
import java.math.BigInteger;

public class GenericUser {

	//! user's e-mail address
	EmailAddress emailAddress;

	//! user's first name
	String firstName;

	//! user's last name
	String lastName;

	//! user's password, stored as an encrypted hash
	String passwordHash;

	/**
	 * Create a new generic user
	 *
	 * @param emailAddress The user's e-mail address
	 * @param firstName The user's first name
	 * @param lastName The user's last name
	 * @return An instance of Generic User
	 */
	public GenericUser(EmailAddress emailAddress, String firstName, String lastName) {
		setEmailAddress(emailAddress);
		setFirstName(firstName);
		setLastName(lastName);
	}

	/**
	 * Get the e-mail address
	 *
	 * @return The e-mail address
	 */
	public EmailAddress getEmailAddress() {
		return emailAddress;
	}

	/**
	 * Set the e-mail address
	 *
	 * @param emailAddress The user's e-mail address
	 * @return None
	 */
	public void setEmailAddress(EmailAddress emailAddress) {
		this.emailAddress = emailAddress;
	}

	/**
	 * Get the first name
	 *
	 * @return The first name
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Set the first name
	 *
	 * @param firstName The user's first name
	 * @return None
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Get the last name
	 *
	 * @return The last name
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Set the last name
	 *
	 * @param lastName The user's last name
	 * @return None
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * Get the password hash
	 *
	 * @return The user's password hash
	 */
	public String getPasswordHash() {
		return passwordHash;
	}

	/**
	 * Set the password hash
	 *
	 * @param passwordHash The new password hash
	 * @return None
	 */
	public void setPasswordHash(String passwordHash) {
		this.passwordHash = passwordHash;
	}

	/**
	 * Validate a password, TBD

	 * @param password The password to be validated
	 * @return True if valid, false otherwise
	 */
	public Boolean validatePassword(String password) {
		//TODO come up with some minimum password requirements
		return true;
	}

	/**
	 * Set the password, it will be hashed first, then the hash will be stored
	 *
	 * @param password The new password
	 * @return None
	 */
	public void setPassword(String password) {
		if(!validatePassword(password)) {
			throw new InvalidParameterException("Invalid password");
		}

		// get a new SHA256 instance, and update the digest with the password given
		MessageDigest md = MessageDigest.getInstance("SHA-256");
		md.update(password.getBytes("UTF-16"));

		// hex format with zero padding, and store the hash
		this.passwordHash = String.format("%064x", new BigInteger(1, md.digest()));
	}

}
