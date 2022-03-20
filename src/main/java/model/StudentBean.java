package model;

import java.io.Serializable;

public class StudentBean implements Serializable {

	private String id;
	private String fullName;
	private String address;
	private String telNumber;
	private String email;

	/**
	 * 
	 */
	public StudentBean() {
	}

	/**
	 * @param id
	 * @param fullName
	 * @param address
	 * @param telNumber
	 * @param email
	 */
	public StudentBean(String id, String fullName, String address, String telNumber, String email) {
		this.id = id;
		this.fullName = fullName;
		this.address = address;
		this.telNumber = telNumber;
		this.email = email;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the fullName
	 */
	public String getFullName() {
		return fullName;
	}

	/**
	 * @param fullName the fullName to set
	 */
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the telNumber
	 */
	public String getTelNumber() {
		return telNumber;
	}

	/**
	 * @param telNumber the telNumber to set
	 */
	public void setTelNumber(String telNumber) {
		this.telNumber = telNumber;
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

}
