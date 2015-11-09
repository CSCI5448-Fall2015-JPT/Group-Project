import java.util.Date;

public class WaitListMedia {

	//! media item on the wait list
	Media media;

	//! member that is waiting
	Member member;

	//! status of the wait list item
	String status;

	//! expected availability date
	Date expectedAvailability;

	/**
	 * Create a new WaitListMedia item
	 *
	 * @param media The media item
	 * @param member The member that's waiting
	 * @param status The starting status of the item
	 * @param expectedAvailability The expected availability date
	 */
	public WaitListMedia(Media media, Member member, String status, Date expectedAvailability) {
		super();
		setMedia(media);
		setMember(member);
		setStatus(status);
		setExpectedAvailability(expectedAvailability);
	}

	/**
	 * Get the media item
	 *
	 * @return The media
	 */
	public Media getMedia() {
		return media;
	}

	/**
	 * Set the media item
	 *
	 * @param media The media to set
	 */
	public void setMedia(Media media) {
		this.media = media;
	}

	/**
	 * Get the member
	 *
	 * @return The member
	 */
	public Member getMember() {
		return member;
	}

	/**
	 * Set the member
	 *
	 * @param member The member to set
	 */
	public void setMember(Member member) {
		this.member = member;
	}

	/**
	 * Get the status
	 *
	 * @return The status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the status
	 *
	 * @param status The status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * Get the expected availability date
	 *
	 * @return The expectedAvailability
	 */
	public Date getExpectedAvailability() {
		return expectedAvailability;
	}

	/**
	 * Set the expected availability date
	 *
	 * @param expectedAvailability The expectedAvailability to set
	 */
	public void setExpectedAvailability(Date expectedAvailability) {
		this.expectedAvailability = expectedAvailability;
	}

}
