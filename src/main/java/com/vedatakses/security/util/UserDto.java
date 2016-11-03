package com.vedatakses.security.util;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * The Class UserDto.
 */
public class UserDto {

	/** The first name. */
	@NotNull
	@NotEmpty
	private String firstName;

	/** The last name. */
	@NotNull
	@NotEmpty
	private String lastName;

	/** The password. */
	@NotNull
	@NotEmpty
	private String password;

	/** The matching password. */
	@NotNull
	@NotEmpty
	private String matchingPassword;

	/** The email. */
	@NotNull
	@NotEmpty
	private String email;

	/**
	 * Gets the first name.
	 *
	 * @return the first name
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Sets the first name.
	 *
	 * @param firstName the new first name
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Gets the last name.
	 *
	 * @return the last name
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Sets the last name.
	 *
	 * @param lastName the new last name
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * Gets the password.
	 *
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Sets the password.
	 *
	 * @param password the new password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * Gets the matching password.
	 *
	 * @return the matching password
	 */
	public String getMatchingPassword() {
		return matchingPassword;
	}

	/**
	 * Sets the matching password.
	 *
	 * @param matchingPassword the new matching password
	 */
	public void setMatchingPassword(String matchingPassword) {
		this.matchingPassword = matchingPassword;
	}

	/**
	 * Gets the email.
	 *
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Sets the email.
	 *
	 * @param email the new email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

}
