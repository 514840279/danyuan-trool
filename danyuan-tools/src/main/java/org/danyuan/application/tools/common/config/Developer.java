package org.danyuan.application.tools.common.config;

import java.util.Arrays;

public class Developer {

	private String username;

	private String webset;

	private String description;

	private String qq;

	private String email;

	private String[] skills;

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the webset
	 */
	public String getWebset() {
		return webset;
	}

	/**
	 * @param webset the webset to set
	 */
	public void setWebset(String webset) {
		this.webset = webset;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the qq
	 */
	public String getQq() {
		return qq;
	}

	/**
	 * @param qq the qq to set
	 */
	public void setQq(String qq) {
		this.qq = qq;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the skills
	 */
	public String[] getSkills() {
		return skills;
	}

	/**
	 * @param skills the skills to set
	 */
	public void setSkills(String[] skills) {
		this.skills = skills;
	}

	@Override
	public String toString() {
		return "Developer [username=" + username + ", webset=" + webset + ", description=" + description + ", qq=" + qq
				+ ", email=" + email + ", skills=" + Arrays.toString(skills) + "]";
	}

}
