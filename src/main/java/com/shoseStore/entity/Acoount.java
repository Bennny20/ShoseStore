package com.shoseStore.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Accouts")
public class Acoount {
		
	public static final String ROLE_ADMIN = "ADMIN";
	public static final String ROLE_USER = "USER";
	
	@Id 
	@Column(name = "username", length = 30, nullable = false)
	private String username;
	
	@Column(name = "fullname", length = 255, nullable = false)
	private String fullname;
	
	@Column(name ="password", length = 255, nullable = false)
	private String password;
	
	@Column(name = "role", length = 20, nullable = false)
	private String role;
	
	@Column(name = "status", length = 1)
	private boolean status;

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
	 * @return the fullname
	 */
	public String getFullname() {
		return fullname;
	}

	/**
	 * @param fullname the fullname to set
	 */
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the role
	 */
	public String getRole() {
		return role;
	}

	/**
	 * @param role the role to set
	 */
	public void setRole(String role) {
		this.role = role;
	}

	/**
	 * @return the status
	 */
	public boolean isStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
	
}
