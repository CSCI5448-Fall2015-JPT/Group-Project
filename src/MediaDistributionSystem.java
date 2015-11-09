import java.util.Date;
import java.util.ArrayList;

public class MediaDistributionSystem {
	//! list of members
	ArrayList<Member> members;

	//! list of administrators
	ArrayList<Admin> admins;

	//! name of this system
	String name;

	//! inventory list TODO refactor to inventory
	ArrayList<Media> media;

	//! list of wait listed items
	ArrayList<WaitListMedia> waitList;

	//! list of checked out items
	ArrayList<CheckedOutMedia> checkedOut;



	/**
	 * Create a new MediaDistributionSystem
	 *
	 * @param name The name of the system
	 * @return An instance of MediaDistributionSystem
	 */
	public MediaDistributionSystem(String name) {
		super();
		setName(name);
	}

	/**
	 * @return the members
	 */
	public ArrayList<Member> getMembers() {
		return members;
	}

	/**
	 * @param members the members to set
	 */
	public void setMembers(ArrayList<Member> members) {
		this.members = members;
	}

	/**
	 * @return the admins
	 */
	public ArrayList<Admin> getAdmins() {
		return admins;
	}

	/**
	 * @param admins the admins to set
	 */
	public void setAdmins(ArrayList<Admin> admins) {
		this.admins = admins;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the media
	 */
	public ArrayList<Media> getMedia() {
		return media;
	}

	/**
	 * @param media the media to set
	 */
	public void setMedia(ArrayList<Media> media) {
		this.media = media;
	}

	/**
	 * Get the wait list
	 *
	 * @return The waitList
	 */
	public ArrayList<WaitListMedia> getWaitList() {
		return waitList;
	}

	/**
	 * Add a new item to the wait list
	 *
	 * @param media The media item
	 * @param member The member that's waiting
	 * @param status The starting status of the item
	 * @param expectedAvailability The expected availability date
	 * @param None
	 */
	public void addToWaitList(Media media, Member member, String status, Date expectedAvailability) {
		waitList.add(new WaitListMedia(media, member, status, expectedAvailability));
	}

	/**
	 * Remove an item from the wait list
	 *
	 * @param media The media item to remove
	 */
	public void removeFromWaitList(Media media) {
		// TODO
	}

	/**
	 * Get the checked out list
	 *
	 * @return The checkedOut list
	 */
	public ArrayList<CheckedOutMedia> getCheckedOut() {
		return checkedOut;
	}

	/**
	 * Add a new item to the checked out media
	 *
	 * @param media The media item to add
	 * @param member The member
	 * @param due The due date
	 * @return None
	 */
	public void addToCheckedOut(Media media, Member member, Date due) {
		checkedOut.add(new CheckedOutMedia(media, member, due));
	}

	/**
	 * Remove an item from the checked out media
	 *
	 * @param media The media item to remove
	 */
	public void removeFromCheckedOut(Media media) {
		// TODO
	}
}
