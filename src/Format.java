
public class Format {

	//! a description of this format type
	String description;

	//! additional cost associated with this format
	Float additionalCost;

	public Format(String description, Float additionalCost) {
		super();
		setDescription(description);
		setAdditionalCost(additionalCost);
	}

	/**
	 * Get the description
	 *
	 * @return The description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * The description
     *
	 * @param description A description
	 * @return None
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Get the additional cost
	 *
	 * @return The additional cost
	 */
	public Float getAdditionalCost() {
		return additionalCost;
	}

	/**
	 * Set the additional cost
     *
	 * @param additionalCost Any additional cost
	 * @return None
	 */
	public void setAdditionalCost(Float additionalCost) {
		this.additionalCost = additionalCost;
	}

}
