import java.util.Date;

public class CheckedOutMedia {

	//! media item checked out
	Media media;

	//! member that has the item checked out
	Member member;

	// due date of the checked out item
	Date dueDate;

	/**
	 * Create a new CheckedOutMedia object
	 *
	 * @param media The media item
	 * @param member The member
	 * @param dueDate The due date
	 * @return An instance of CheckedOutMedia
	 */
	public CheckedOutMedia(Media media, Member member, Date dueDate) {
		super();
		setMedia(media);
		setMember(member);
		setDueDate(dueDate);
	}

	/**
	 * Get the media
	 *
	 * @return The media
	 */
	public Media getMedia() {
		return media;
	}

	/**
	 * Set the media
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
	 * Get the due date
	 *
	 * @return The due date
	 */
	public Date getDueDate() {
		return dueDate;
	}

	/**
	 * Set the due date
	 *
	 * @param dueDate The due date to set
	 */
	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}


}
